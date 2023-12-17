package practicelogics2;

public class arraysum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int[] sum= {1,2,3,4,5,6};
	int[] sum1= {1,2,3,4,5,6,};
	int[] sum2=new int[6];
	int l=0;
	
	for(int i=0;i<=sum.length-1;i++) {
		sum2[i]=sum[i]+sum1[i];
	}
	
for(int j=0;j<=sum2.length-1;j++) {
	
	l=l+sum2[j];
	}
System.out.println(l);
}

}
