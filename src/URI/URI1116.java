package URI;

import java.util.Locale;
import java.util.Scanner;

public class URI1116 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			if (y == 0) {
				System.out.println("divisao impossivel");
			} else {
				double div = (double) x / y;
				System.out.printf("%.1f%n", div);
			}
		}

		sc.close();

	}

}
