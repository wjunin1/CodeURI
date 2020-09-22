package URI;

import java.util.Scanner;

public class URI2717 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();

		if (A + B > N) {
			System.out.println("Deixa para amanha!");
		} else {
			System.out.println("Farei hoje!");
		}

		sc.close();

	}

}
