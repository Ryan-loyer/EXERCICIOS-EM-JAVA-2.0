package listapoo2;
import java.util.Scanner;

public class questao18 {
     public void run(){
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];

        System.out.println("Digite 10 números positivos:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextInt();
        }

        System.out.print("Digite o número X: ");
        int x = scanner.nextInt();

        int maiores = 0, menores = 0, iguais = 0;

        for (int i = 0; i < 10; i++) {
            if (vetor[i] > x) {
                maiores++;
            } else if (vetor[i] < x) {
                menores++;
            } else {
                iguais++;
            }
        }

        System.out.println("Maiores que X: " + maiores);
        System.out.println("Menores que X: " + menores);
        System.out.println("Iguais a X: " + iguais);


        scanner.close();
    }
}
