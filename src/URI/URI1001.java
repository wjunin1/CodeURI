package URI;
import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
 */
public class URI1001 {
 
    public static void main(String[] args) throws IOException {
 
    	Scanner sc = new Scanner(System.in);	
    	
        int A = sc.nextInt();
        int B = sc.nextInt();
        int SOMA;
        
        SOMA = A + B;
        
        System.out.println("SOMA = " + SOMA);
        
        sc.close();

 
    }
 
}