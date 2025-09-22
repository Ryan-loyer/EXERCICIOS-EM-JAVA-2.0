package listapoo2;

import java.util.Scanner;

public class questao14 {
    public void run() {
        Scanner scanner = new Scanner(System.in);

        int numero;

        while (true) {
            System.out.print("Digite o número 1: ");
            numero = scanner.nextInt();
            if (numero >= 0) break;
            System.out.println("Apenas números positivos são aceitos.");
        }

        int maior = numero;
        int menor = numero;
        int soma = numero;

        for (int i = 2; i <= 10; i++) {
            while (true) {
                System.out.print("Digite o número " + i + ": ");
                numero = scanner.nextInt();
                if (numero >= 0) break;
                System.out.println("Apenas números positivos são aceitos.");
            }

            soma += numero;

            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        double media = soma / 10.0;

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Média dos números: " + media);

        scanner.close();
    }
}
