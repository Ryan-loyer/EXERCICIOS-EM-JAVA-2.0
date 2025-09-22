package listapoo2;
import java.util.Scanner;

public class questao5 {
    public void run(){
         Scanner scanner = new Scanner(System.in);
        
         System.out.println("digite a quantidade de números que deseja processar: ");
         int quantidade = scanner.nextInt();

         for(int cont = 1; cont<= quantidade; cont++ ){
            System.out.println("Digite o numero: " + cont + "");
            int numero = scanner.nextInt();

            long fatorial = 1;
            for (int j = 1; j <= numero; j++) {
                fatorial *= j;
         }
            System.out.println(numero + "! = " + fatorial);
        }
         scanner.close();

    }
}