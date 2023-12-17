package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class fifth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ArrayList<Integer> g=new ArrayList<Integer>(Arrays.asList(1,2,3,1,1));
	LinkedHashSet<Integer> gh=new LinkedHashSet<Integer>(g);
	ArrayList<Integer> fd=new ArrayList<Integer>(gh);
	System.out.println(fd);
	
		
		
		
	}

}
