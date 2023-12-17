package practicelogics2;

public class pro9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * exclude the number which has 9
		 */

		String s = "This is alpha 5057 and 97";
        int num=0;
		int x = 9;
		int flag = 0;
		String x_m = Integer.toString(x);

		String[] l_m = s.split(" ");

		for (int i = 0; i <= l_m.length - 1; i++) {
			try {
				
				flag=0;

			     num = Integer.parseInt(l_m[i]);

				String l = Integer.toString(num);

				for (int j = 0; j <= l.length() - 1; j++) {

					if (l.charAt(j) == x_m.charAt(0) && num!=0) {

						flag = 1;

						break;

					}

				}
			}

			catch (Exception e) {
				
				flag=2;

			}

			if (flag == 0) {
				
				System.out.println(num);

			}

		}

	}

}
