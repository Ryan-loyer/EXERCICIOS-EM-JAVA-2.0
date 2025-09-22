package listapoo2;
import java.util.Scanner;

public class questao11 {
     public void run(){
         Scanner scanner = new Scanner(System.in);

        int totalAlunos = 0;
        double somaNotas = 0;

        while (true) {
            System.out.print("Digite a matrícula do aluno (negativo para sair): ");
            int matricula = scanner.nextInt();

            if (matricula < 0) {
                break; 
            }

            System.out.print("Digite a nota do aluno: ");
            double nota = scanner.nextDouble();

            somaNotas += nota;
            totalAlunos++;
        }

        if (totalAlunos > 0) {
            double media = somaNotas / totalAlunos;
            System.out.println("Média da turma: " + media);
        } else {
            System.out.println("Nenhum aluno foi cadastrado.");
        }

        scanner.close();
    }
}
