package listapoo2;
import java.util.Scanner;

public class questao23 {

    public double reajuste(double salario, double indice) {
        return salario + (salario * indice);
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Digite o salário atual: ");
        double salario = scanner.nextDouble();

        System.out.print("Digite o índice de reajuste (ex: 0.1 para 10%): ");
        double indice = scanner.nextDouble();

        double salarioAtualizado = reajuste(salario, indice);

        System.out.println("Salário atualizado: " + salarioAtualizado);

        scanner.close();
    }
}
