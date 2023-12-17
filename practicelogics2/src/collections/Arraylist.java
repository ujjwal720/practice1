package collections;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> gh=new ArrayList<String>();
		gh.add("Ujjwal");
		gh.add("Shrivastava");
		gh.add("Mohan");
		gh.add("Singh");
		gh.add("Vando");
		gh.add("Hgfd");
		
		for(int i=0;i<=gh.size()-1;i++) {
			System.out.println(gh.get(i));
		}

	}

}

