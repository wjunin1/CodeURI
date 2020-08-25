package URI;

import java.util.Locale;
import java.util.Scanner;

public class URI1118 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner leitor = new Scanner(System.in);
		double nota1, nota2, flag = 1;
		while (flag == 1) {

			nota1 = leitor.nextDouble();
			while (nota1 > 10 || nota1 < 0) {
				System.out.println("nota invalida");
				nota1 = leitor.nextDouble();
			}

			nota2 = leitor.nextDouble();
			while (nota2 > 10 || nota2 < 0) {
				System.out.println("nota invalida");
				nota2 = leitor.nextDouble();
			}

			double media = (nota1 + nota2) / 2;
			System.out.println(String.format("media = %.2f", media));

			System.out.println("novo calculo (1-sim 2-nao)");
			flag = leitor.nextInt();
			while (flag != 1 && flag != 2) {
				System.out.println("novo calculo (1-sim 2-nao)");
				flag = leitor.nextInt();

			}

		}
		leitor.close();
	}
}
