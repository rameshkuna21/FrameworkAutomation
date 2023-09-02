package july22;

import java.util.HashMap;
import java.util.Map;

public class StringDemo {

	public static void main(String[] args) {
		
		
		 findNoOfEachCharacterInString("Has been developed with known defects.");
;		
		

	}

	private static void findNoOfEachCharacterInString(String str) {
		
		Map<Character, Integer>hMap=new HashMap<Character, Integer>();
		
		char[] allChars=str.toCharArray();
		
		for(int i=0;i<allChars.length;i++)
		{
			if(hMap.containsKey(allChars[i]))
			{
				hMap.put(allChars[i],hMap.get(allChars[i])+1);	
		
			}
			else
			{
				hMap.put(allChars[i], 1);
			}
		}
		
		System.out.println(hMap);
	}

}
