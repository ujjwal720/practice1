package practicelogics2;

import java.lang.*;

public class hh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * if i character is there reverse it
		 */
		String s = "poiinter";
		String resultant = "";
		StringBuilder u = new StringBuilder();
		String res1 = "";
		String l="";

		for (int i = 0; i <= s.length() - 1; i++) {
			if (s.charAt(i) != 'i') {
				res1 = res1 + s.charAt(i);
			}

			if (s.charAt(i) != 'i') {

				resultant = resultant + s.charAt(i);

			}

			else {
				l=resultant;
				resultant = "";
				u = new StringBuilder(l);
				String m = u.reverse().toString();
				resultant = resultant + m;

			}

		}
		
		System.out.println(resultant);

	}

};
