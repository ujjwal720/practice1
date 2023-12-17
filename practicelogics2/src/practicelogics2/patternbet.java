package practicelogics2;

public class patternbet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k=3;
		int n=3;
		int t=1;
		int p=5;
		for(int i=1;i<=5;i++) {
     for(int j=1;j<=5;j++) {
    	 if(i==1 && j==3||i<3&&(j==k||j==n)||i>3&&(j==t||j==p)) {
    		 System.out.print("*");
    	 }
    	 else {
    		 System.out.print(" ");
    	 }
    	 
      
     }
     if(i<3) {
    	 k--;
    	 n++;
    	 System.out.println();
    	 }
    
     if(i>3) {
    t++;
    p--;
    System.out.println();
   

	}

}
}
}