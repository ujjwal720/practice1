package collections;

import java.util.HashMap;

public class hash1 {
	int k;
	int v;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 HashMap<Integer,Integer> a=new HashMap<Integer,Integer>();
 a.put(1, 2);
 a.put(2, 3);
 a.put(3, 4);
 a.put(4, 5);
 a.put(5, 6);
 a.put(6, 7);
 System.out.println(a.get(1));
 
a.forEach((k,v)->System.out.println("values"+k+"pair"+v
		));
 
	System.out.print(a.keySet());
 
	}

}
