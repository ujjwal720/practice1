
public class supe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		gh j=new gh();
		j.rd();
		
	}

}

class gh extends mobile{
	public gh() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void rd() {
		System.out.println("This is an rd");
	}
	
	public void rm() {
		System.out.println("This is an rm");
	}
}



class mobile{
	public void sam() {
		System.out.println("This is sam");
	}
	
	public void samd() {
		System.out.println("This is samd");
	}
	
	public mobile() {
		System.out.println("This is mobile");
	}
	public mobile(int a) {
		System.out.println(a);
		
	}
}