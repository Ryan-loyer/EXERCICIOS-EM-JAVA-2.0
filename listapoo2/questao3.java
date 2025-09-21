package listapoo2;
import java.util.Scanner;

public class questao3 {
    public void run(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite sua altura (em metros): ");
        double altura = scanner.nextDouble();

        System.out.print("Digite seu sexo (M para homem / F para mulher): ");
        char sexo = scanner.next().charAt(0);

        if (sexo == 'M') {
            double pesoIdeal = (72.7 * altura) - 58;
            System.out.println("Peso ideal (homem): " + pesoIdeal);
        } else if (sexo == 'F') {
            double pesoIdeal = (62.1 * altura) - 44;
            System.out.println("Peso ideal (mulher): " + pesoIdeal);
        } else {
            System.out.println("Sexo inválido. Digite M ou F.");
        }

        scanner.close();
    }    
}
