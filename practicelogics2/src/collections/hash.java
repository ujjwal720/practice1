package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;

public class hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
       ArrayList<Integer> a=new ArrayList<Integer>(Arrays.asList(1,2,3,4,1,1));
       LinkedHashSet<Integer> b= new  LinkedHashSet<Integer>(a);
       ArrayList<Integer> c=new ArrayList<Integer>(b);
       System.out.println(c.size());
	}

}
