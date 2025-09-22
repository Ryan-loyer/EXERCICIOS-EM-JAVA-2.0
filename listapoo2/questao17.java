package listapoo2;
import java.util.Scanner;

public class questao17 {
     public void run(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tamanho dos vetores: ");
        int n = scanner.nextInt();

        int[] x = new int[n];
        int[] y = new int[n];

        System.out.println("Digite os elementos do vetor X:");
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
        }

        System.out.println("Digite os elementos do vetor Y:");
        for (int i = 0; i < n; i++) {
            y[i] = scanner.nextInt();
        }

        int produtoEscalar = 0;
        for (int i = 0; i < n; i++) {
            produtoEscalar += x[i] * y[i];
        }

        System.out.println("Produto escalar: " + produtoEscalar);

        scanner.close();
    }
}
