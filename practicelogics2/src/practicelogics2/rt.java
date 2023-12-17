package practicelogics2;

public class rt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		lion a=new animal();
		a.m2();
		a.ml();

	}

}

class lion {

	public String ml() {

		return "woof";
	}

	public void m2() {
		
		System.out.println("The following is an m2 method for the follwoijng");

	}

}

class animal extends lion {

	@Override
	public String ml() {

		return "jam";
	}
}