package practicelogics2;

public class patternq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a=3;
		int b=3;
		for(int i=1;i<=5;i++) {
			if(i>=2&&i<=3) {
				a--;
				b++;
			}
			if(i>3) {
				a++;
				b--;
			}
			for(int j=1;j<=5;j++) {
				if((i==1&&j==3)||(i>=1&&(j==a||j==b))||i==3&&j==3) {
					System.out.print("*");
					
				}
				else {
					System.out.print(" ");
				}
			}
			
			
			System.out.println();

	}

}
}
