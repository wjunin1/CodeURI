package URI;

import java.util.Scanner;

public class URI1172 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] X = new int[10];

		for (int i = 0; i < X.length; i++) {
			X[i] = sc.nextInt();

		}

		for (int i = 0; i < X.length; i++) {
			if (X[i] <= 0) {
				X[i] = 1;
			}
			System.out.printf("X[%d] = ", i);
			System.out.println(X[i]);
		}

		sc.close();

	}

}
