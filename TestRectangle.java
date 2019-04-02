import java.util.Scanner;

public class TestRectangle {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();

		double[][] array = r.getLandW(r.getRect());
		System.out.println("Here are the rectangles that you created");
		r.getAandP(array);

	}
}
