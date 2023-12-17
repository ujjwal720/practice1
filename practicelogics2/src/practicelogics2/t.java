package practicelogics2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class t {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "canadafa";

		List<String> hl = new ArrayList<String>();
		List<String> l = new ArrayList<String>();
		for (int i = 0; i <= s.length() - 1; i++) {

			l.add(Character.toString(s.charAt(i)));

		}

		Set<String> io = new LinkedHashSet<String>(l);
		List<String> opl = new ArrayList<String>(io);

		for (int i = 0; i <= l.size() - 1; i++) {

			hl.add("?");

		}

		for (int i = 0; i <= opl.size() - 1; i++) {

			int count = 0;

			for (int j = 0; j <= l.size() - 1; j++) {

				String resultant = "";

				if (opl.get(i).equals(l.get(j))) {

					count++;

					for (int k = 1; k <= count; k++) {

						resultant = resultant + opl.get(i);

					}

					hl.set(j, resultant);

				}

			}

		}

		String actual = "";

		for (int i = 0; i <= hl.size() - 1; i++) {

			actual = actual + hl.get(i);

		}
		
		System.out.println(actual);

	}

}
