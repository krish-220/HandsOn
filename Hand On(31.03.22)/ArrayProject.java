//import java.util.*;
public class ArrayProject {

	public static void main(String[] args) {
		int [] array1 = {1,3,5,7,9};
		int [] array2 = {1,2,4,7,9};
		
		for(int i=0; i<array1.length;i++) {
			for(int j=0; j<array2.length;j++) {
				if(array1[i]==array2[j]) {
					System.out.println(array1[i]);
				}
			}
		}

	}

}
