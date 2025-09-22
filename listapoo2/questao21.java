package listapoo2;
import java.util.Scanner;
import java.util.Random;

public class questao21 {
     public void run(){
        Scanner scanner = new Scanner(System.in);

        Random rand = new Random();

        int sorteado = rand.nextInt(101);
        int tentativas = 0;
        int chute;

        System.out.println("Tente adivinhar o número entre 0 e 100!");

        do {
            System.out.print("Digite seu palpite: ");
            chute = scanner.nextInt();
            tentativas++;

            if (chute < sorteado) {
                System.out.println("O número sorteado é MAIOR!");
            } else if (chute > sorteado) {
                System.out.println("O número sorteado é MENOR!");
            } else {
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");
            }
        } while (chute != sorteado);

        scanner.close();
    }
}
