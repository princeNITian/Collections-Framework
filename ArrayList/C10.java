import java.util.*;
public class C10  {

	public static void main(String args[]){
	   ArrayList<String> arraylist = new ArrayList<String>();
	   arraylist.add("AA");
	   arraylist.add("ZZ");
	   arraylist.add("CC");
	   arraylist.add("FF");

	   /*Unsorted List: ArrayList content before sorting*/
	   System.out.println("Before Sorting:");
	   for(String str: arraylist){
			System.out.println(str);
		}

	   /* Sorting in decreasing order*/
	   Collections.sort(arraylist, Collections.reverseOrder());

	   /* Sorted List in reverse order*/
	   System.out.println("ArrayList in descending order:");
	   for(String str: arraylist){
			System.out.println(str);
		}
	}
}