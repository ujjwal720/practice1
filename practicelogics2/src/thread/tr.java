package thread;

public class tr extends ui {

	int a;

	public static void main(String[] args) {

		System.out.println("hello");
		tr a = new tr();

	}

	public tr(String s) {

		System.out.println("This is an tr");

	}

	public tr() {
		this("s");
		System.out.println("This is default constructor");

	}

	public void mu() {

		this.a = 15;
	}

}
