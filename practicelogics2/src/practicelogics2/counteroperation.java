package practicelogics2;

import java.util.ArrayList;
import java.util.List;

public class counteroperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		int p = count;
		String[] calls = { "increment", "increment", "decrement", "reset", "reset" };
		List<Integer> o_p = new ArrayList<Integer>();
		for (int i = 0; i <= calls.length - 1; i++) {
			if (calls[i].equals("increment")) {

				count++;
				o_p.add(count);

			}
			if (calls[i].equals("reset")) {

				count = p;
				o_p.add(count);

			}
			if (calls[i].equals("decrement")) {

				count--;
				o_p.add(count);

			}

		}

		System.out.println(o_p);

	}

}
