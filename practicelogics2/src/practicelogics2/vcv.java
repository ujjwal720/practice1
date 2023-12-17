package practicelogics2;

import java.util.ArrayList;
import java.util.List;

public class vcv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] l = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
				"t", "u", "v", "w", "x", "y", "z" };

		String s = "a1c1e1";

		List<Integer> lm = new ArrayList<Integer>();

		List<String> lme = new ArrayList<String>();

		String resultant = "";

		int x = 0;

		for (int i = 0; i <= s.length() - 1; i++) {

			if (Character.isDigit(s.charAt(i))) {

				lm.add(Integer.parseInt(Character.toString(s.charAt(i))));

			}

			else {

				lme.add(Character.toString(s.charAt(i)));

			}

		}

		for (int i = 0; i <= lme.size() - 1; i++) {

			try {
				x = lm.get(i);
			} catch (Exception e) {

			}

			if (i <= lm.size() - 1) {
				for (int j = 0; j <= l.length - 1; j++) {

					if (i <= lm.size() - 1) {
						if (lme.get(i).equals(l[j])) {

							resultant = resultant + lme.get(i);
							resultant = resultant + l[x + j];

						}
					}

				}
			}

			else {
				
				resultant=resultant+lme.get(i);

			}

		}

		System.out.println(resultant);

	}

}
