package practicelogics2;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String num="159";
String[] gh=num.split("");
int[] f=new int[3];
int sum=0;
for(int i=0;i<=gh.length-1;i++) {
	
	int s=Integer.parseInt(gh[i]);
	int d=s*s*s;
	f[i]=d;
	
	
}
for(int j=0;j<=f.length-1;j++) {
	sum=sum+f[j];
}

if(Integer.parseInt(num)==sum) {
	System.out.println("The number is armstrong");
}
		
else {
	System.out.println("The number is not armstrong");
}	
		
	}

}
