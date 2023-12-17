package practicelogics2;

public class rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] rotate= {1,2,3,4,5,6,7,8,9};
		int[] temp=new int[9];
		int index=4;
		int j=0;
		for(int i=index;i<=rotate.length-1;i++) {
			temp[j]=rotate[i];
			j++;
		}
		for(int i=0;i<index;i++) {
			temp[j]=rotate[i];
			j++;
			
		}
		
		for(int k=0;k<=temp.length-1;k++) {
			System.out.print(temp[k]);
		}

	}

}
