def bubbleSort(arr):
    n=len(arr);
    for i in range(n):
        swap=False;
        for j in range(n):
            if (j+1)<n:
                a=arr[j];
                if arr[j]>arr[j+1]:
                    arr[j]=arr[j+1];
                    arr[j+1]=a;
                    swap=True;
        if swap==False:
            break;


arr=[64, 34, 25, 12, 22, 11, 90]
bubbleSort(arr)
print(arr)