package practicelogics2;

public class trye {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * check if all a appears berfore b
		 */

		String s = "aabb";
		char[] m = s.toCharArray();
		int x = 0;
		int flag = 0;

		for (int i = 0; i <= s.length() - 1; i++) {

			if (m[i] == 'a' && x == 0) {

				flag = 1;

			}

			if (m[i] == 'b') {

				x = 1;
			}

			if (m[i] == 'a' && x == 1) {

				flag = 2;
				break;

			}

		}

		if (flag == 1 || flag==0) {

			System.out.println("You are correct all a come before b");

		}

		else {
			
			System.out.println("You are not correct all a not come before b");

		}

	}

}
