package practicelogics2;

public class staticandnonstatic {
	
	static int age=25;//globol
	String gh="Ujjwal";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sendmail();
		staticandnonstatic obj1=new staticandnonstatic();
		obj1.sum();
		System.out.println(obj1.gh);
	
		

	}
	
	public void sum() {
		System.out.println("This is a good sum");
		//System.out.println(gh);
	}
	public static void sendmail() {
		System.out.println("This is send mail");
		System.out.println(age);
	}

}
