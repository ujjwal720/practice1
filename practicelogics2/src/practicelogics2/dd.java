package practicelogics2;

public class dd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Decript the string with number
		 */

		String s = "10#11#12";
		String resultant = "";

		for (int i = 0; i <= s.length() - 1; i++) {

			try {

				if (s.charAt(i + 2) == '#') {

					for (int j = i; j <= i + 1; j++) {
						
						resultant=resultant+s.charAt(j);

					}

				}
			}

			catch (Exception e) {

			}

		}
		
		System.out.println(resultant);

	}

}
