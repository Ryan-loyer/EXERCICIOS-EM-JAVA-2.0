package listapoo2;
import java.util.Scanner;

public class questao2 {
    public void run(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        
        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("\nEscolha a opção:");
        System.out.println("1 - Verificar se um número é múltiplo do outro");
        System.out.println("2 - Verificar se os dois números são pares");
        System.out.println("3 - Verificar se a média é maior ou igual a 7");
        System.out.println("4 - Sair");
        System.out.print("Opção: ");
        
        int opcao = scanner.nextInt();

        if (opcao < 1 || opcao > 4) {
            System.out.println("Opção inválida.");
             } else {
                 switch (opcao) {
                    case 1:
                    if (num1 % num2 == 0 || num2 % num1 == 0) {
                        System.out.println("Um número é múltiplo do outro.");
                    } else {
                        System.out.println("Nenhum número é múltiplo do outro.");
                    }
                    break;

                    case 2:
                    if (num1 % 2 == 0 && num2 % 2 == 0) {
                        System.out.println("Os dois números são pares.");
                    } else {
                        System.out.println("Pelo menos um número não é par.");
                    }
                    break;

                     case 3:
                    double media = (num1 + num2) / 2.0;
                    if (media >= 7) {
                        System.out.println("A média (" + media + ") é maior ou igual a 7.");
                    } else {
                        System.out.println("A média (" + media + ") é menor que 7.");
                    }
                    break;

                     case 4:
                    System.out.println("Saindo...");
                    break;
            }
        }
        scanner.close();
    }
}
