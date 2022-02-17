package Quiz;

import static org.mockito.ArgumentMatchers.intThat;

public class Question1 {

	public static void main(String[] args) {

		int num = 5;
		int val = 0, c = 0;
		while (num > 0) {

			for (int i = 1; i <= num; i++) {
				if (val > 1 && c > 1) {
					val = 0;
					c = 0;

				}
				System.out.print(" " + val++ + " ");
				c++;

			}
			System.out.print("\n");
			num--;
		}
	}

}
