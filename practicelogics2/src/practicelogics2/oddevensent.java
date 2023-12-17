package practicelogics2;

public class oddevensent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sd="Java is an good Langguage";
		String[] ms=sd.split(" ");
		
	for(int i=0;i<=ms.length-1;i++) {
		int sf=ms[i].length();
		if(sf%2==0) {
			System.out.println(ms[i]);
		}
		
		
	}
	
			
	}

}
