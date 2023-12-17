package practicelogics2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class trtt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * first non repaeated character
		 */

		String s = "swiss";
		char[] t = s.toCharArray();
		List<Character> y_t = new ArrayList<Character>();
		for (int i = 0; i <= t.length - 1; i++) {

			y_t.add(t[i]);

		}

		Set<Character> op = new LinkedHashSet<Character>(y_t);
		List<Character> b_c = new ArrayList<Character>(op);

		for (int i = 0; i <= b_c.size() - 1; i++) {

			int count = 0;

			for (int j = 0; j <= y_t.size() - 1; j++) {

				if (b_c.get(i) == y_t.get(j)) {

					count++;

				}

			}

			if (count == 1) {

				System.out.println("This first non repeating character is" + " " + b_c.get(i));
				break;

			}

		}

	}

}
