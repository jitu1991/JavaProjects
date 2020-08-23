package Data_Structure.mapInterface;

import java.util.*;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String ,Integer> hash = new HashMap<>();
		
		hash.put("Sunil" ,  921121651);
		hash.put("Jitu" ,  783586117);
		hash.put("RAhul" ,  783060240);
		hash.put("Vinay" ,  991150727);
		hash.put("Yas" ,  921121654);
		System.out.println(hash);
//		this mean that dupicate is not allow 
		hash.put("Sunil" ,  921121651);
		hash.put("Jitu" ,  783586117);
		System.out.println(hash);
		
		Map<String ,Integer> hash1 = new HashMap<>();
		
//		hash1.put("Yeshvi" , 921121651);
		hash1.put("Devika" , 783840212);
		hash1.put("Monika" , 454532445);
		hash1.put("muskan" , 563843993);
		hash1.put("Sunil" ,  921121651);
		hash1.put("Jitu" ,  783586117);

		System.out.println(hash1);
//		PutAll Function
		hash.putAll(hash1);
		System.out.println(hash);
//		putIfAbsent Function
		hash.putIfAbsent("Yeshvi", 921121651);
		System.out.println(hash);
//		get(K) function
		System.out.println(hash.get("Jitu"));
//		getOrDefault function
		System.out.println(hash.getOrDefault("Suni", 454));
//		containskey(K) function
		System.out.println(hash.containsKey("Vinay"));
//		containsValue(V) function
		System.out.println(hash.containsValue(92112165));
//		replace(K,V)
		hash.replace("Yeshvi", 7834344);
		System.out.println(hash.get("Yeshvi"));
		
//		Special function
//		replace(K , oldvaue , newvalue) function
		hash.replace("Sunil", 921121651, 67348929);
		System.out.println(hash.get("Sunil"));
//		remove(K) function
		hash.remove("Yeshvi");
		System.out.println(hash);

//		remove(k ,V)
		hash.remove("Sunil", 67348929);
		System.out.println(hash.get("Sunil"));		
		System.out.println(hash);
//		KeySet() Function
		System.out.println(hash.keySet());
//		values() Function
		System.out.println(hash.values());
//		entrySet() Function
		System.out.println(hash.entrySet());
		System.out.println(hash1.entrySet());

 
		

	}

}
