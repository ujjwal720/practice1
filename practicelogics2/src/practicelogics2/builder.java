package practicelogics2;

public class builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String gq="";
String gh="1234Apple1234Swiggy";
int count=0;
StringBuilder t=new StringBuilder();
for(int i=0;i<=gh.length()-1;i++) {
if(Character.isLetter(gh.charAt(i))) {
	t.append(gh.charAt(i));
}
else {
	if(Character.isDigit(gh.charAt(i))) {
		for(int j=i;j<=gh.length()-1;j++) {
			if(Character.isDigit(gh.charAt(j))) {
				gq=gq+gh.charAt(j);
			}
			else {
			if(Character.isLetter(gh.charAt(j))) {
				i=j-1;
				StringBuilder fd=new StringBuilder(gq);
				t.append(fd.reverse());
				gq="";
				break;}
		     }
			
			if(j==gh.length()-1) {
				i=gh.length()-1;
				StringBuilder fd=new StringBuilder(gq);
				t.append(fd.reverse());
				gq="";
				break;
			
			}
			}
			
			
		}
		
	
	

}
}
	




System.out.print(t);
		
		
}	
	
}