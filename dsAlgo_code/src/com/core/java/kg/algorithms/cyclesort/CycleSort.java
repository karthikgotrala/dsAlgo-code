package com.core.java.kg.algorithms.cyclesort;

import com.core.java.kg.algorithms.isort.ISort;

public class CycleSort implements ISort {

	@Override
	public int[] sort(int[] input) {

		int n = input.length;
		int writes = 0;

		// step 1: traverse through the input array to put items in sorted order.
		for (int cycle_start = 0; cycle_start <= n - 2; cycle_start++) {
			// Step2: initialize the item and starting position
			int item = input[cycle_start];

			// step 3: for the above identified item, find the number of items less than it
			// which gives us the new position of the above item
			int position = cycle_start;
			for (int i = cycle_start + 1; i <= n - 1; i++) {
				if (item > input[i]) {
					position += 1;
				}
			}
			// step 4: If item is alreadyin position we skip rest of the process
			if (position == cycle_start) {
				continue;
			}

			// Step 5: ingore all duplicate elements and increment the position
			if (input[position] == item) {
				position += 1;
			}

			// step 6: swap the items to keep in sorted order
			if (position != cycle_start) {
				int temp = item;
				item = input[position];
				input[position] = temp;
				writes++;
				printArry(input);
			}

			// step 7: Repeat the rest cycle with newly updated item value i.e, the swappted
			// temp value and repeat they cycle

			while (position != cycle_start) {

				position = cycle_start;
				//find the position
				for (int i = cycle_start + 1; i < n; i++) {
					if ( item>input[i]) {
						position += 1;
					}
				}
				//swap the items
				if (item != input[position]) {
					int temp = item;
					item = input[position];
					input[position] = temp;
					writes++;
					printArry(input);
				}

			}
		}

		System.out.println("\n Number of writes for cycle Sort=" + writes);
		return input;

	}

}
