import java.util.Arrays;
import java.util.ArrayList;

public class BasicList {
	public static void main(String[] args) {
		ArrayList myList = new ArrayList(10);

		for (int i = 10; i <= 100; i += 10) {
			myList.add(i);
		}

		System.out.println(myList);
		System.out.println("Size of the list is " + myList.size());

		myList.add(5, 200); // at the index of 5, add element 200

		System.out.println(myList);
		System.out.println("Size of the list is " + myList.size());
		System.out.println("Value " + myList.get(5) + " is located at index " + myList.indexOf(200));

	}
}
