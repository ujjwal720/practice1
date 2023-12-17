package practicelogics2;

import java.util.ArrayList;
import java.util.List;

public class half {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Mindtree coding questions
		 */

		int[] x = { 1, 2, 3, 4, 5, 6 };
		List<Integer> fh = new ArrayList<Integer>();
		List<Integer> sh = new ArrayList<Integer>();
		int z = x.length;
		int c = z % 2;
		int count = 0;
		if (c == 0) {
			int d = z / 2;

			for (int i = 0; i <= x.length - 1; i++) {
				count++;
				if (count <= d) {

					fh.add(x[i]);

				} else {
					sh.add(x[i]);
				}

			}

		}

		else {

			System.out.println("The program cannot be split");
		}

		System.out.println(fh);
		System.out.println(sh);

	}

}
