package listapoo2;
import java.util.Scanner;

public class questao24 {

    public String verifica(int n) {
        if (n % 2 == 0) {
            return "PAR";
        } else {
            return "ÍMPAR";
        }
    }

     public void run(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        String resultado = verifica(numero);

        System.out.println("O número " + numero + " é " + resultado);

        scanner.close();
    }
}
