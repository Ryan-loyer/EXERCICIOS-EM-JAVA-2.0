package listapoo2;
import java.util.Scanner;

public class questao10 {
     public void run(){
         Scanner scanner = new Scanner(System.in);

          System.out.print("Digite um número entre 1 e 9: ");
        int numero = scanner.nextInt();

        if (numero <= 0 || numero >= 10) {
            System.out.println("Número inválido. Deve ser maior que 0 e menor que 10.");
        } else {
            int contador = 0;
            int atual = numero;
            int soma = 0;

            while (contador < 20) {
                if (atual % 2 != 0) { 
                    soma += atual * atual; 
                    contador++;
                }
                atual++;
            }

            System.out.println("Soma dos quadrados dos 20 primeiros ímpares a partir de " 
                               + numero + " = " + soma);
        }
        

        scanner.close();
    }
}
