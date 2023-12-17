package practicelogics2;

public class angram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String a="Canada";
		String b="nadaCan";
		int count =0;
		char[] c=a.toCharArray();
		char[] d=b.toCharArray();
		for(int i=0;i<=c.length-1;i++) {
			for(int j=0;j<c.length-1;j++) {
				if(c[i]==d[j]) {
					d[j]='z';
					count++;
				}
			}
		}
		
		if(count==a.length()-1) {
			System.out.println("The string is angram");
		}
		else {
			System.out.println("The string is not angram");
		}
		System.out.println(count);
	}

}
