package abs;

import java.io.FileNotFoundException;

public class excep {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		try {
			int a = 10 / 0;
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Hello");
		}
		
		int[] a= {1,2,3};
		System.out.println("It has skip the following");

	}

}
