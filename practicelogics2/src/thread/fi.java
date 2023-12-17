package thread;

public class fi {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		a a=new a();
		b b =new b();
      a.start();
      a.join();
      b.start();
	
		
		

	}

}

class a extends Thread {

	public void run() {

		for (int i = 0; i <= 50; i++) {
			System.out.println("This is an gaming comunity");
		}
	}

}

class b extends Thread{
	
	public void run() {

		for (int i = 0; i <= 50; i++) {
			System.out.println("This is an gaming");
		}
	}
}
