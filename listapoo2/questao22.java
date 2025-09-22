package listapoo2;
import java.util.Scanner;

public class questao22 {
     public void run(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o 1º caractere (A-Z): ");
        char c1 = scanner.next().toLowerCase().charAt(0);

        System.out.print("Digite o 2º caractere (A-Z): ");
        char c2 = scanner.next().toLowerCase().charAt(0);

        if (c1 < c2) {
            int distancia = c2 - c1 - 1;
            System.out.println("O número de caracteres entre eles é: " + distancia);
        } else {
            System.out.println("Erro: os caracteres não estão em ordem alfabética.");
        }


        scanner.close();
    }
}
