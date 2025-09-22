package listapoo2;
import java.util.Scanner;

public class questao19 {
     public void run(){
        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[20];
        int[] idades = new int[20];

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o nome da candidata " + (i + 1) + ": ");
            nomes[i] = scanner.next();

            System.out.print("Digite a idade da candidata " + (i + 1) + ": ");
            idades[i] = scanner.nextInt();
        }

        System.out.println("\nCandidatas aptas (idade entre 18 e 20 anos):");
        boolean encontrou = false;

        for (int i = 0; i < 20; i++) {
            if (idades[i] >= 18 && idades[i] <= 20) {
                System.out.println(nomes[i]);
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhuma candidata apta.");
        }

        scanner.close();
    }
}
