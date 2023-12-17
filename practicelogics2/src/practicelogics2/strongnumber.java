package practicelogics2;

public class strongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String number="145";
		int sum=0;
		int[] ng=new int[3];
		String[] hg=number.split("");
		for(int i=0;i<=hg.length-1;i++) {
			int fs=1;
			int j=Integer.parseInt(hg[i]);
			for(int k=j;k>=1;k--) {
				fs=fs*k;
		
		
			
		}
	
           ng[i]=fs;
		
		

		
		
		
	}
		
		for(int i=0;i<=ng.length-1;i++) {
			sum=sum+ng[i];
		}
	System.out.println(sum);
	int gf=Integer.parseInt(number);
	if(gf==sum) {
		System.out.println("Strong number");
	}
	else {
		System.out.println("No strong");
	}

}
}
