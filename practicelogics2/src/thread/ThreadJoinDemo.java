package thread;

class MyThread extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Sita Thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
		}
	}
}

class ThreadJoinDemo {
	public static void main(String[] args) throws InterruptedException {
		MyThread t = new MyThread();
		t.start();
        t.join();
		for (int i = 0; i < 5; i++) {
			System.out.println("Rama Thread");
		}
	}
}