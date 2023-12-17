package practicelogics2;

public class geeeks {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub

		String ujjwal = "geeksforgeeks";
		char[] gh = ujjwal.toCharArray();
		for (int i = 0; i < gh.length - 1; i++) {
			if (i != 13) {
				if (gh[i] == gh[i + 1]) {
					gh[i + 1] = 'c';

				}
			}

		}

		for (int i = 0; i <= gh.length - 1; i++) {
			if (gh[i] != 'c') {
				System.out.print(gh[i]);
			}

		}

	}

}
