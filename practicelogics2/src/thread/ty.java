package thread;

public class ty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			int a = 5 / 0;
			System.out.println(a);
		}

		catch (ArithmeticException e) {

			System.out.println("This is an arithemetoc");

		}

		catch (Exception e) {

			System.out.println("Hello this is an exception");

		}

		finally {

		System.out.println("THOS OA AN FINAL");}

	}

}
