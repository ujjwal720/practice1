package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class dupli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a=new ArrayList<String>(Arrays.asList("Java","Python","JS"));
		ArrayList<String> b=new ArrayList<String>(Arrays.asList("Java","Python","C#"));
       a.retainAll(b);
       System.out.println(a);
	}

}
