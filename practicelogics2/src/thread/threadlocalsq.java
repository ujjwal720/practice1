package thread;

public class threadlocalsq {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		i a=new i();
		Thread b=new Thread(a);
		b.start();
		b.join();
		Thread c=new Thread(a);
		c.start();

	}

}

class i implements Runnable {

	ThreadLocal<Integer> k=new ThreadLocal<Integer>() {
		
		protected Integer initialValue() {

		return 0;
	}
	
	
	
	
	
	
	
};


	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<=5;i++) {
			
			System.out.println(k.get()+1);
			System.out.println(Thread.currentThread().getName());
		}
		
	}}