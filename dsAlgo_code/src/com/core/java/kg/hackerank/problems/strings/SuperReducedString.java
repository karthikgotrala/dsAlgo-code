package com.core.java.kg.hackerank.problems.strings;

import java.util.stream.IntStream;

public class SuperReducedString {

	public static void main(String[] args) {
		// superReducedString("aaabccddd");
		// System.out.println(superReducedString("gfqqiwjdllsutxlpskxlrgmnunpobgvuimnudvtisdilhzaafarzlyjypvdcsvbpxdtsslszevkiclshpzbeuegxdnofgpuneduo"));
		// System.out.println(superReducedString("zztqooauhujtmxnsbzpykwlvpfyqijvdhuhiroodmuxiobyvwwxupqwydkpeebxmfvxhgicuzdealkgxlfmjiucasokrdznmtlwh"));

		System.out.println(superReducedString(
				"ppffccmmssnnhhbbmmggxxaaooeeqqeennffzzaaeeyyaaggggeessvvssggbbccnnrrjjxxuuzzbbjjrruuaaccaaoommkkkkxx"));
		// tqauhujtmxnsbzpykwlvpfyqijvdhuhirdmuxiobyvxupqwydkpbxmfvxhgicuzdealkgxlfmjiucasokrdznmtlwh
		// tqauhujtmxnsbzpykwlvpfyqijvdhuhirdmuxiobyvxupqwydkpbxmfvxhgicuzdealkgxlfmjiucasokrdznmtlwh
	}

	static String superReducedString(String s) {
		String result = "Empty String";
		String reducedString = s;
		reducedString = iterateToFindMatch(reducedString, 0, 1);
		reducedString = (reducedString != null && reducedString.length() > 0) ? reducedString : result;
		return reducedString;

	}

	public static String iterateToFindMatch(String reducedString, int p1, int p2) {
		if (reducedString != null && reducedString.length() > 0 && p1 > -1 && p2 > -1 && p1 < reducedString.length()
				&& p2 < reducedString.length()) {
			System.out.println(reducedString);
			while (p2 <= reducedString.length() - 1) {

				if (checkIfMatches(reducedString, p1, p2)) {
					reducedString = getNewString(reducedString, p1, p2);
					p1 = 0;
					p2 = p1 + 1;
					return iterateToFindMatch(reducedString, p1, p2);
				} else {
					p1 = p2;
					p2 = p2 + 1;
					return iterateToFindMatch(reducedString, p1, p2);

				}

			}
		}
		return reducedString;
	}

	public static boolean checkIfMatches(String s, int p1, int p2) {
		boolean flag = false;
		if (s != null && s.length() > 0 && p1 > -1 && p2 > -1 && p1 != p2) {
			return s.charAt(p1) == s.charAt(p2);
		}
		return flag;
	}

	public static String getNewString(String s, int p1, int p2) {
		StringBuffer returnStr = new StringBuffer();
		int i = 0;
		for (char c : s.toCharArray()) {
			if (i != p1 && i != p2) {
				returnStr.append(c);
			}
			i++;
		}
		return returnStr.toString();
	}

}
