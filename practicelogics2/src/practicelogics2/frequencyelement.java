package practicelogics2;

public class frequencyelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr1= {"Ajay","Mohan","Ajay","Ajay","Singh"};
		System.out.println(arr1.length);
		for(int i=0;i<=arr1.length-1;i++) {
			if(arr1[i]!="o") {
			int count=1;
			for(int j=i+1;j<=arr1.length-1;j++) {
				if(arr1[i]==arr1[j]) {
				count++;
				arr1[j]="o";
				}
			}
			System.out.println(arr1[i]+count+"Times");
			}
			
			
		}

	}

}
