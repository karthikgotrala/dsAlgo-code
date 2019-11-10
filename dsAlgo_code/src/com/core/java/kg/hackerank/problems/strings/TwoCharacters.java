package com.core.java.kg.hackerank.problems.strings;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TwoCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(alternate("beabeefeab"));
		//System.out.println(alternate("a"));
		//System.out.println(alternate("ab"));
		System.out.println(alternate("ezfnjymgqtjnmstbadgdsrxvntnacwljnkgchtjeaoivfcindgxipmrjuqmmcpntpotplodjhijxqpogjmzipygacfdjgmewechuebxvcbnakszzcxkozxwavzgmesrvysonomhvufezislfntgncspthcpneyminpbjildobozfirvcgdratdpmmpkujcywvtzkdytzyfejbytsobvudvutfueveevgrqnxjiwpkrvllsjxmqhotlnpgjxkjnobxfqodlyiqsisdeuwqmntxouzdtisgutdafostmwticvncjwldpknuodmfksusaqpsoosgpiveyxipfklmhypdxpdncpgaswpycoxsuxasqduojpblctcyvyxldcgzevedvxiwinfppkjbtifuuapickknwxxjmjmtxlpfalxdgepmekaxijuphqfafrnezyldokwcnzenhpibktlfuxjfmeqajmvopbhuslnnnlmkmoteceiwbytjhhxqnkuazevswrkaofggfrnapciuoexqogscugzspwuvzkyrdfkhixcaqctfwadewpqksxxvqiigvjjpagvqikuojlwhfyztu"));
		//System.out.println(alternate("asdcbsdcagfsdbgdfanfghbsfdab"));
		//System.out.println(alternate("asvkugfiugsalddlasguifgukvsa"));
	}
	
	
	 static int alternate(String s) {
	        
	        
	        String temp=s;
	        Map<Character,Long> map=new HashMap<Character,Long>();
	        map=s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	        System.out.println(map);
	        Long initCount=map.get(s.charAt(0));
	        
	        Set<Character> keySet=map.keySet();
	        Map<Character, Long> secondMap=new HashMap<Character,Long>();
	        for(Character key:keySet) {
	        	Long count=map.get(key);
	            if(!key.equals(s.charAt(0)) && count>1) {
	                Long diff=initCount-count;
	                if(diff!=0 && diff!=1) {
	                    temp=temp.replace(key.charValue()+"","");
	                   
	                    System.out.println(temp);
	                }else {
	                	secondMap.put(key, map.get(key));
	                }
	            }
	        }
	        System.out.println(secondMap);
	        
	        List<Long> distinctList=secondMap.values().stream().distinct().collect(Collectors.toList());
	        if(distinctList!=null && distinctList.size()==0) {
	        	return 0;
	        }else if(distinctList!=null && distinctList.size()==1) {
	        	return (initCount==distinctList.get(0).intValue())?0:(initCount.intValue()+distinctList.get(0).intValue());
	        }else if(distinctList!=null && distinctList.size()>1) {
	        	for(Long count:distinctList) {
	        		if(count==initCount) {
	        			initCount+=count;
	        			break;
	        		}
	        	}
	        }
	        
	        return initCount.intValue();
	        
	    }

}
