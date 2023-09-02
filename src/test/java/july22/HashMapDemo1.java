package july22;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo1 {

	public static void main(String[] args) {
		
		Map<Integer, String> hMap=new HashMap<Integer, String>();
		
		hMap.put(101, "Ravi");

		hMap.put(102, "Gopi");
		
		hMap.put(103, "Syam");
		
		System.out.println(hMap.get(101));
		
		System.out.println(hMap.get(102));
		
		System.out.println(hMap.get(103));
		
		Set<Entry<Integer, String>>  entries=hMap.entrySet();
		
		for(Entry<Integer, String>entry:entries)
			
		{
			System.out.println(entry.getKey()+"--"+entry.getValue());
		}
	}

}
