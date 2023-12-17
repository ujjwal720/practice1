package practicelogics2;

public class codingbat2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Repeat end in characters and strings
		 */
		
		String s=codingbat2.repeatEnd("Hello", 3);
		System.out.println(s);

	}

	public static String repeatEnd(String str, int n) {

		int o = str.length()-n;

		String k = "";

		String result3 = "";

		for (int i = str.length() - 1; i >= o; i--) {

			k = k + str.charAt(i);

		}

		StringBuilder result = new StringBuilder(k);

		String result1 = result.reverse().toString();
		for (int i = 1; i <= n; i++) {
			
			
			result3=result3+result1;

		}
		
		return result3;

	}

}
