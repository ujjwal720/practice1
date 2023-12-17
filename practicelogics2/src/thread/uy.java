package thread;

public class uy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 */
		
		uy.msk("Ujj", "xyz");

	}

	public static void msk(String s, String y) {

		String result = "";

		if (s.length() == y.length()) {

			for (int i = 0; i <= s.length() - 1; i++) {

				String lo = "";
				lo = lo + s.charAt(i) + y.charAt(i);
				result = result + lo;

			}

			System.out.println(result);

		}

		else {
			
			System.out.println("As the length is not same we cant do anything");
			
			

		}

	}

}
