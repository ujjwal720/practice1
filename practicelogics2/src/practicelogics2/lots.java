package practicelogics2;

public class lots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * decrement pattern matching mindtree
		 */
		int sum = 1;
		int x = 0;
		for (int i = 1; i <= 5; i++) {
			if (i > 1) {
				sum = sum + i;
				x = sum;
			}

			for (int j = 1; j <= 5; j++) {
				if (i == 1) {
					if (j >= 1 && j <= 1) {
						System.out.print(j);

					} else {
						System.out.print(" ");
					}
				}
				if (i > 1) {

					if (j >= 1 && j <= i) {
						if (j == 1) {
							System.out.print(x);
							x--;
						}
						if (j > 1) {
							System.out.print("$" + x);
							x--;

						}

					} else {
						System.out.print(" ");
					}

				}

			}
			System.out.println();

		}

	}

}
