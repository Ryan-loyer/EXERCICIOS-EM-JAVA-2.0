package listapoo2;
import java.util.Scanner;

public class questao16 {
     public void run(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade de números: ");
        int n = scanner.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextInt();
        }

        for (int i = n - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        scanner.close();
    }
}
