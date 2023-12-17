package practicelogics2;

public class ty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] f_s = { "apple", "banana", "cherry", "blueberry", "apricot" };

		for (int i = 0; i <= f_s.length - 1; i++) {

			int count = 0;

			String o_p = f_s[0];

			for (int j = 0; j <= f_s.length - 1; i++) {

				String l = f_s[j];
				String temp = "";

				if (o_p.charAt(count) > l.charAt(count)) {
					
					temp=l;
					
					f_s[j]=o_p;
					
					

				}

			}

			if (count < 5) {

				count++;

			}

		}

	}

}
