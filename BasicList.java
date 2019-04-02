import java.util.Arrays;
import java.util.ArrayList;

public class BasicList {
	public static void main(String[] args) {
		ArrayList myList = new ArrayList(10);

		myList.add(10); // unsure how to use a for loop to reduce this
		myList.add(20);
		myList.add(30);
		myList.add(40);
		myList.add(50);
		myList.add(60);
		myList.add(70);
		myList.add(80);
		myList.add(90);
		myList.add(100);

		System.out.println(myList);
		System.out.println("Size of the list is " + myList.size());

		myList.add(5, 200); // at the index of 5, add element 200

		System.out.println(myList);
		System.out.println("Size of the list is " + myList.size());
		System.out.println("Value " + myList.get(5) + " is located at index " + myList.indexOf(200));

	}
}
