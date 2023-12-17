package practicelogics2;

public class code78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Maximum Number of Words You Can Type
		 */

		String l = "ad";

		String resultant = "helo world";
		String[] m = resultant.split(" ");
		for (int i = 0; i <= m.length - 1; i++) {
			int x = 0;
			String o = m[i];

			for (int j = 0; j <= l.length() - 1; j++) {

				if (o.contains(Character.toString(l.charAt(j)))) {

					x = 1;

					break;

				}

			}

			if (x == 0) {

				System.out.println("The words which can be written are" + " " + m[i]);

			}

		}

	}

}
