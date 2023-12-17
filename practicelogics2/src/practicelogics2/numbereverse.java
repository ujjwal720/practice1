package practicelogics2;

import java.util.ArrayList;

public class numbereverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String number="Apple123";
int j=0;
ArrayList<Character> gj=new ArrayList<Character>();
char[] gds=new char[8];
char[] f=new char[3];
char[] gh=number.toCharArray();
for(int i=0;i<=gds.length-1;i++) {
	if(Character.isLetter(gh[i])) {
		gj.add(gh[i]);
	          
}
	if(Character.isDigit(gh[i])) {
		       f[j]=gh[i];
		       j++;
	}
	
}

for(int i=f.length-1;i>=0;i--) {
	gj.add(f[i]);
	
	
}

for(int i=0;i<=gj.size()-1;i++) {
	System.out.print(gj.get(i));
}	

	}

}
