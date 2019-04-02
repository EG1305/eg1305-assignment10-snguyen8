import java.util.Arrays;
import java.util.Scanner;

public class Lottery {
	public static void main(String[] args) {
		int[] array = new int[5];
		int[] lottery = new int[array.length];
		int same = 0;
		System.out.println("Enter a series of 5 numbers.");

		array = userInput(array);
		lottery = lottery(array);
		same = compare(array, lottery);
		match(array, lottery, same);

	}

	public static int[] userInput(int[] array) {
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter number " + (i + 1) + ": ");
			array[i] = input.nextInt();
		}
		input.close();
		return array;
	}

	public static int[] lottery(int[] array) {
		int[] lottery = new int[array.length];
		System.out.println("The lottery numbers are: ");
		for (int i = 0; i < array.length; i++) {
			int n = (int) (Math.random() * 9);
			lottery[i] = n;
			System.out.print(n + " ");
		}
		return lottery;
	}

	public static int compare(int[] array, int[] lottery) {
		int same = 0;
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == lottery[i]) {
				same++;
			}
		}
		System.out.println("\nYou matched " + same + " numbers");
		return same;
	}

	public static void match(int[] array, int[] lottery, int same) {
		if (same > 0) {
			System.out.println("The matching numbers are: ");
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] == lottery[i]) {
					System.out.print(array[i + 1] + " ");
				}
			}

		}
	}

}
