package com.core.java.kg.hackerank.problems.strings;

import java.util.ArrayList;
import java.util.List;

public class CommonChild {

	public static void main(String[] args) {
		System.out.println(commonChild("HARRY","SALLY"));
		System.out.println(commonChild("SHINCHAN","NOHARAAA"));
		System.out.println(commonChild("ABCD","ABDC"));
		System.out.println(commonChild("ABCDEF","FBDAMN"));
	//System.out.println(commonChild("WEWOUCUIDGCGTRMEZEPXZFEJWISRSBBSYXAYDFEJJDLEBVHHKS","FDAGCXGKCTKWNECHMRXZWMLRYUCOCZHJRRJBOAJOQJZZVUYXIC"));//15
	//System.out.println(commonChild("ELGGYJWKTDHLXJRBJLRYEJWVSUFZKYHOIKBGTVUTTOCGMLEXWDSXEBKRZTQUVCJNGKKRMUUBACVOEQKBFFYBUQEMYNENKYYGUZSP"
		//								,"FRVIFOVJYQLVZMFBNRUTIYFBMFFFRZVBYINXLDDSVMPWSQGJZYTKMZIPEGMVOUQBKYEWEYVOLSHCMHPAZYTENRNONTJWDANAMFRX"));//27
	}
	
	
	static int commonChild(String s1, String s2) {

		List<Character> cc=new ArrayList<Character>();
		
		
		for(int i=0;i<s1.length();i++) {
			int idx=s2.indexOf(s1.charAt(i));
			int idx1=s1.indexOf(s2.charAt(i));
			Character c=Character.toUpperCase(s1.charAt(i));
			Character c1=Character.toUpperCase(s2.charAt(i));
			
			if(idx<=i && (idx1<=i||idx1<=idx) && idx>-1 && !cc.contains(c)) {
				//System.out.println(c+", idx="+idx+", i="+i+", flag="+(idx<=i && idx>-1 && !cc.contains(c)));
				//System.out.println(c1+", idx1="+idx+", i="+i+", flag="+(idx1<=i && idx>-1 && !cc.contains(c)));
				cc.add(c);
			}
			
		}
		System.out.println(cc);
		return cc.size();

    }


}
