package practicelogics2;

import java.util.ArrayList;
import java.util.List;

public class tocheckifsystenispanfram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Rearange the arrya and retaiun all positions
		 */

		int[] a = { 1, -2, 5, 2, -7, 4, -1, 3 };
		List<Integer> o = new ArrayList<Integer>();
		for (int i = 0; i <= a.length - 1; i++) {

			if (a[i] < 0) {

				o.add(a[i]);

			}

		}
		for (int i = 0; i <= a.length - 1; i++) {

			if (a[i] > 0) {

				o.add(a[i]);

			}

		}
		
		System.out.println(o);

	}

}
