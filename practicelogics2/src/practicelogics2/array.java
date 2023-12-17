package practicelogics2;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int counter=1;
for(int i=1;i<=7;i++) {
	System.out.print("[");
	for(int j=1;j<=4;j++) {
		if(j<=3) {
		System.out.print(counter+",");	
		}
		if(j==4) {
			System.out.print(counter);
		}
		if(counter>=6) {
			counter=0;
			
		}
		
	if(counter<=6) {
		counter++;
	}}
	System.out.print("]");
	System.out.println();
}


		
		
	}

}
