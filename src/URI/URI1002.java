package URI;

import java.util.Locale;
import java.util.Scanner;

public class URI1002 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double n = 3.14159, raio, area;

		raio = sc.nextDouble();

		area = n * raio * raio;

		System.out.printf("A=%.4f\n", area);

		sc.close();

	}

}
