package listapoo2;
import java.util.Scanner;

public class questao1 {
    public void run(){
         Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a operação:");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Opção: ");

        int operacao = scanner.nextInt();

        System.out.print("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double n2 = scanner.nextDouble();

        if (operacao < 1 || operacao > 4) {
            System.out.println("Opção inválida.");
        } else if (operacao == 4 && n2 == 0) {
            System.out.println("Erro: Divisão por zero.");
        } else {
            double resultado = switch (operacao) {
                case 1 -> n1 + n2;
                case 2 -> n1 - n2;
                case 3 -> n1 * n2;
                case 4 -> n1 / n2;
                default -> 0; 
            };
            System.out.println("Resultado: " + resultado);
        }

        scanner.close();

    }
}
