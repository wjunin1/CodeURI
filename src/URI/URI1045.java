package URI;

import java.util.Scanner;

public class URI1045 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		double A = leitor.nextDouble();
		double B = leitor.nextDouble();
		double C = leitor.nextDouble();
		double aux;

		if (B > A && B > C) {
			aux = A;
			A = B;
			B = aux;
		} else if (C > A) {
			aux = A;
			A = C;
			C = aux;
		}

		if (A >= (B + C)) {
			System.out.println("NAO FORMA TRIANGULO");
		} else {
			if (A * A == (B * B) + (C * C))
				System.out.println("TRIANGULO RETANGULO");
			if (A * A > (B * B) + (C * C))
				System.out.println("TRIANGULO OBTUSANGULO");
			if (A * A < (B * B) + (C * C))
				System.out.println("TRIANGULO ACUTANGULO");
			if (A == B && A == C)
				System.out.println("TRIANGULO EQUILATERO");
			if ((A == B && A != C) || (A == C && A != B) || (B == C && B != A))
				System.out.println("TRIANGULO ISOSCELES");
		}
		leitor.close();

	}

}
