package practicelogics2;

import java.util.ArrayList;
import java.util.List;

public class gre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * x should not be rmoved from start and end
		 */

		String y=gre.uio("abxxxcd");
		System.out.println(y);

	}

	public static String uio(String s) {

		List<String> l = new ArrayList<String>();

		String result = "";

		String[] lm = s.split("");

		for (int i = 0; i <= lm.length - 1; i++) {

			l.add(lm[i]);
		}

		for (int i = 0; i <= l.size() - 1; i++) {

			if (i == 0 || i == l.size() - 1) {

				if (l.get(i).equals("x")) {

					result = result + l.get(i);

				}

				else {

					result = result + l.get(i);

				}

			}

			else {

				if (!l.get(i).equals("x")) {

					result = result + l.get(i);

				}
			}
			
			

		}
		
	  return result;

	}

}
