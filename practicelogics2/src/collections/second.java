package collections;

import java.util.ArrayList;

public class second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> j=new ArrayList<String>();
		j.add("element1");
		j.add("element2");
		System.out.println(j);
		System.out.println(j.get(0));
		System.out.println(j.isEmpty());
		System.out.println(j.size());
		for(String g:j) {
			System.out.println(g);
		}
	}

}
