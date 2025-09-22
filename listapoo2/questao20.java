package listapoo2;
import java.util.Scanner;

public class questao20 {
     public void run(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho dos vetores (máximo 50): ");
        int n = scanner.nextInt();

        int[] v1 = new int[n];
        int[] v2 = new int[n];

        System.out.println("Digite os elementos do vetor V1:");
        for (int i = 0; i < n; i++) {
            v1[i] = scanner.nextInt();
        }

        System.out.println("Digite os elementos do vetor V2:");
        for (int i = 0; i < n; i++) {
            v2[i] = scanner.nextInt();
        }

        int iguais = 0;
        for (int i = 0; i < n; i++) {
            if (v1[i] == v2[i]) {
                iguais++;
            }
        }

        System.out.println("Quantidade de valores idênticos na mesma posição: " + iguais);

        scanner.close();
    }
}
