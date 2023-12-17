package practicelogics2;

public class PYRAMID2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=4;
		int n=6;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=9;j++) {
				if(i==1 && (j>=1 && j<=7)||j>=1 && j<=m || j>=n && j<=9) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			if(i>1) {
				m--;
				n++;
			}
			System.out.println();
		}

	}

}
