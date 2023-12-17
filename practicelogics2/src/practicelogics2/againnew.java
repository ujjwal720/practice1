package practicelogics2;

public class againnew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr= {1,2,3,4,5,6,8,3,4,3,2,1,5,4,9};////between 6 and 9 delete
		int[] ars=new int[2];
		for(int i=0;i<=arr.length-1;i++) {
		if(arr[i]==6 || arr[i]==9) {
			System.out.println(i);
		}
		}
		for(int j=0;j<=arr.length-1;j++) {
			if(j>=5 && j<=14) {
				arr[j]=0;
			}
			
			
		}
		
		System.out.println(arr[14]);
		
		
		

	}

}
