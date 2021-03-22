import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class StringArrayToArrayList {
	public static ArrayList<String> stringArrayToArrayList(String arr[]) {
		/*Solution for 2nd Question in Assignment
		  Using List.of() method.*/
		ArrayList<String> array_list = new ArrayList<String>(List.of(arr));
		
		//printing ArrayList after converting StringArray to AtrrayList
		System.out.println("ArrayList Before removing duplicates: " + array_list);
		
		//solution for 3rd question in assignment
		ArrayList<String> new_array_list = new ArrayList<String>();
		for (String element : array_list) {
			if (!new_array_list.contains(element)) {

				new_array_list.add(element);
			}
		}

		//returning ArrayList after removing duplicate strings
		return new_array_list;
	}
	
	public static ArrayList<java.lang.String> switchIt(List<String> aOne, int a, int b) {
	    String e = aOne.get(a);
	    aOne.set(a, aOne.get(b));
	    aOne.set(b, e);
	    return (ArrayList<String>) aOne;
	}

	public static void main(String[] args) {
		String array[] = { "ABC", "GHI", "DEF", "JKL", "ABC" };
		
		ArrayList<String> newList = stringArrayToArrayList(array);
		System.out.println("ArrayList Aftre removing duplicates: " + newList);
		/*
		 * Collections.swap(newList,1,2);
		 * System.out.println("ArrayList Aftre Swapping:"+newList);
		 */
		ArrayList<String> newList1 = switchIt(newList,1,2);
		System.out.println("ArrayList Aftre swapping: " + newList1);
		

	}
}
