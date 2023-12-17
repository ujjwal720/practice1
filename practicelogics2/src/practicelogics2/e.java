package practicelogics2;

import java.util.ArrayList;
import java.util.List;

public class e {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "India is my country";
		char[] l = s.toCharArray();
		String resultant = "";
		int count = 0;
		List<Character> m_m = new ArrayList<Character>();

		for (int i = l.length - 1; i >= 0; i--) {

			if (Character.isLetter(l[i])) {

				m_m.add(l[i]);

			}

		}

		for (int i = 0; i <= m_m.size()-1; i++) {

			if (Character.isSpaceChar(l[count])) {

				resultant = resultant + " ";
				i=i-1;
				
			}

			else {
				
				resultant=resultant+m_m.get(i);

			}
			
			count++;
		

		}
		
		System.out.println(resultant);

	}

}
