package practicelogics2;

import java.util.ArrayList;
import java.util.List;

public class digitlast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sm="123d455";
		ArrayList<Character> mf=new ArrayList<Character>();
		char[] gf=sm.toCharArray();
		for(int i=0;i<=gf.length-1;i++) {
			if(Character.isLetter(gf[i])) {
				mf.add(gf[i]);
			}
		}
		
		for(int i=0;i<=gf.length-1;i++) {
			if(Character.isDigit(gf[i])) {
				mf.add(gf[i]);
			}
		}
		
		for(Character i:mf) {
		System.out.print(i);
		}
	}

}
