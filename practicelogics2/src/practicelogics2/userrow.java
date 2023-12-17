package practicelogics2;

public class userrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=5;
		int b=5;
		int c=5;
		int d=5;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=9;j++) {
				if(j==a||j==b||(i>2)&&(j==c||j==d)||i==5 && j==5) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
				
				
			}
			a--;
			b++;
			System.out.println();
			if(i>2) {
				c--;
				d++;
				System.out.println();
			}
		}

	}

}
