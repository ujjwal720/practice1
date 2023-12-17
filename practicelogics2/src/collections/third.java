package collections;

import java.util.Arrays;
import java.util.List;

public class third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> a=Arrays.asList("Java","Sam");
		System.out.println(a);
		int[] ujjwal= {400,5,6,7,80};
         Arrays.sort(ujjwal);
         for(int i=0;i<=ujjwal.length-1;i++) {
        	 System.out.println(ujjwal[i]);
         }
        int key=400;
        System.out.println(Arrays.binarySearch(ujjwal, key));
	}

}
