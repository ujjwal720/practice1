package practicelogics2;

import java.util.Scanner;

public class codingquestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your number");
		Scanner a = new Scanner(System.in);
		String[] b = new String[5];
		for (int i = 0; i <= b.length - 1; i++) {

			String x = a.next();
			b[i] = x;

		}

		for (int j = 0; j <= b.length - 1; j++) {

			String result = b[j];

			if (result.charAt(0) == 'A' || result.charAt(0) == 'a') {

				System.out.println(b[j]);

			}

		}

	}

}
