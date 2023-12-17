package practicelogics2;

public class codingque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Shuffle string
		 */

		String s = "codeleet";
		String l = "";
		int[] indices = { 4, 5, 6, 7, 0, 2, 1, 3 };
		String[] result = new String[s.length()];

		for (int i = 0; i <= s.length() - 1; i++) {

			int y = indices[i];

			result[y] = Character.toString(s.charAt(i));

		}

		for (int j = 0; j <= s.length() - 1; j++) {

			l = l + result[j];

		}

		System.out.println(l);

	}

}
