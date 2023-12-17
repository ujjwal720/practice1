package practicelogics2;

public class program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "A";
		String c = "B";
		System.out.println(s);
		System.out.println(c);

		for (int i = 0; i <= 10; i++) {
			String d = "";
			d = s + c;
			System.out.println(d);
			s = c;
			c = d;
			

		}

	}

}
