package practicelogics2;

import java.util.ArrayList;
import java.util.List;

public class tr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hello-Learners-Happy-Learning";
		String[] resul = s.split("");
		String resultant = "";

		for (int i = 0; i <= s.length() - 1; i++) {

			if (resul[i].equals("-")) {

				resultant = resultant + "-";

			}

		}

		for (int i = 0; i <= s.length() - 1; i++) {

			if (Character.isLetter(s.charAt(i))) {
				
				resultant=resultant+s.charAt(i);

			}

		}
		
		
		System.out.println(resultant);

	}

}
