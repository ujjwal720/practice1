package practicelogics2;

public class stard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=6;
		int m=9;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=9;j++) {
			if(j>=k && j<=m) {
				System.out.print("*");
			}	
			else {
				System.out.print(" ");
			}	
				
				
			}
			k--;
			m--;
			System.out.println();
			
			
			
		}

	}

}
