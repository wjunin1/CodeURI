package URI;

import java.util.Locale;
import java.util.Scanner;

public class URI1078 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " x " + N + " = " + (i * N));
		}

		sc.close();

	}

}
