package listapoo2;
import java.util.Scanner;

public class questao12 {
     public void run(){
         Scanner scanner = new Scanner(System.in);

          System.out.print("Digite um número positivo (ou negativo para sair): ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Nenhum número positivo foi informado.");
            scanner.close();
            return;
        }

        int menor = numero;
        int maior = numero;

        while (true) {
            System.out.print("Digite um número positivo (ou negativo para sair): ");
            numero = scanner.nextInt();

            if (numero < 0) {
                break;
            }

            if (numero < menor) {
                menor = numero;
            }
            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println("Menor número: " + menor);
        System.out.println("Maior número: " + maior);


        scanner.close();
    }
}
