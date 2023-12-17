package practicelogics2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 131, 231, 99, 543, 432 };

		int sum = 0;

		for (int i = 0; i <= a.length - 1; i++) {

			List<Integer> lm = new ArrayList<Integer>();

			String l = Integer.toString(a[i]);

			String[] o = l.split("");

			for (int j = 0; j <= o.length - 1; j++) {

				int act = Integer.parseInt(o[j]);

				lm.add(act);

			}
			;

			Collections.sort(lm);

			sum = sum + lm.get(0);

		}
		
		System.out.println(sum);

	}

}
