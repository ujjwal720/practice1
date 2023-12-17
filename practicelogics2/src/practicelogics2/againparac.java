package practicelogics2;

import java.util.ArrayList;

public class againparac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

String hf="123ab12";
int[] js=new int[5];
ArrayList<Integer> mf=new ArrayList<Integer>();
char[] gh=hf.toCharArray();
for(int i=0;i<=gh.length-1;i++) {
	if(Character.isDigit(gh[i])) {
		String gm=Character.toString(gh[i]);
		int d=Integer.parseInt(gm);
		mf.add(d);
		
	}
	
}

	System.out.println(mf.get(1));	
		
		
	}

}
