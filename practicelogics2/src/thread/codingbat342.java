package thread;

public class codingbat342 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * String contains the bob or not
		 */

		codingbat342.bobThere("abcbob");

	}

	public static void bobThere(String s) {

		int count = 0;

		for (int i = 0; i <= s.length() - 1; i++) {

			int x = i + 1 + 1;

			if (x <= s.length() - 1 && s.charAt(i) == 'b') {

				char u = s.charAt(i);
				char m = s.charAt(x);

				if (u == m) {

					count++;

				}

			}

		}

		if (count != 0) {

			System.out.println("Bob is there");
		}

		else {
			
			System.out.println("bob is not there");

		}

	}

}
