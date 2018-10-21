package checkpoint;

import java.util.Random;

public class Checkpoint {
	public static void main(String[] args) {
		Random rng = new Random();
		int r = rng.nextInt(5);
		switch (r) {
		case 0:
			System.out.println("ZERO");
			break;
		case 1:
			System.out.println("ONE");
			break;
		case 2:
			System.out.println("TWO");
			break;
		case 3:
			System.out.println("THREE");
			break;
		case 4:
			System.out.println("FOUR");
			break;
		default:
			System.out.println("error");
		}
	}
}
