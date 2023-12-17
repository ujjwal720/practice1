package OOPS;

import java.util.HashMap;
import java.util.Map;

public class tr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] a = { "a", "b", "c", "a", "a" };
		Map<String, Integer> l = new HashMap<String, Integer>();
		for (int i = 0; i <= a.length - 1; i++) {

			if (l.containsKey(a[i])) {

				l.put(a[i], l.get(a[i]) + 1);

			}

			else {
				
				l.put(a[i], 1);

			}

		}
		
		System.out.println(l);

	}

}
