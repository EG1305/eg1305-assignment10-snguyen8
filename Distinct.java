import java.util.Scanner;

public class Distinct {
	public static void main(String[] args) {
		int[] array = new int[10];
		array = userInput(array);

		System.out.println("Distinct numbers are: ");
		distinct(array);
	}

	public static int[] userInput(int[] array) {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter integer " + (i + 1) + ": ");
			array[i] = input.nextInt();
		}
		input.close();
		return array;
	}

	public static void distinct(int[] array) {
		for (int i = 0; i < array.length; i++) {
			boolean distinct = false;
			for (int t = 0; t < i; t++) {
				if (array[i] == array[t]) {
					distinct = true;
					break;
				}
			}

			if (!distinct) {
				System.out.print(array[i] + " ");
			}
		}
	}
}
