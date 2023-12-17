package practicelogics2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class logicalprograms1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 534, 789, 990, 12, 2, 1, 34, 78, 96, 78, 86, 9 };
		List<Integer> b = new ArrayList<Integer>();
		for (int i = 0; i <= a.length - 1; i++) {
			int c = a[i];
			String d = Integer.toString(c);
			if (d.length() == 3) {

				int x = Integer.parseInt(d);
				b.add(x);

			}

		}
		
		Collections.sort(b);
		System.out.println(b);

	}

}
