package abs;

public class  example3 extends example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		example3 gh=new example3();
		gh.salary();
		gh.laptop();
		gh.bonus();
		example2 fd=new example3();
		fd.salary();
		fd.salary();
		
	
		
	}

	@Override
	public void salary() {
		// TODO Auto-generated method stub
		System.out.println("This is salary");
	}
	
	public void bonus() {
		System.out.println("This is an bonus");
	}

}
