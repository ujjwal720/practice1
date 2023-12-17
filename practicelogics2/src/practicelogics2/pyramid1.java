package practicelogics2;

public class pyramid1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int c=121;
      int count =0;
      String ds=Integer.toString(c);
      char[] m=ds.toCharArray();
      char[] mf=new char[3];
      int n=0;
      for(int i=m.length-1;i>=0;i--) {
    	  
    	  mf[n]=m[i];
    	  n++;
    	  }
      
      for(int j=0;j<=m.length-1;j++) {
    	  if(m[j]==mf[j]) {
    		  count++;
    	  }
    	  
    	 
    	  
    	  
      }
      if(count==mf.length) {
		  System.out.println("The string is palindrome");
	  }
	  else {
		  System.out.println("The string is not palindrome");
	  }
      
      
     
		
		
	}

}
