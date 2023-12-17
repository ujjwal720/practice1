package practicelogics2;

public class pyramif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=3;
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=4;j++) {
		if(i<=4) {
			if(i>=j) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
			}
			
			for(int k=1;k<=4;k++) {
				
				if(i>4) {
				if(k>=1 && k<=m ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
					
				}
				
			}
			
			if(i<=4) {
				System.out.println();
			}
			
			if(i>4) {
				m--;
				System.out.println();
			}
			
		}
		
		
			}
		
	

	}


