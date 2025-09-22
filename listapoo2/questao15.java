package listapoo2;
import java.util.Scanner;

public class questao15 {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        String resposta = "";

        while (true) {
            System.out.print("Digite o índice de poluição: ");
            double indice = scanner.nextDouble();
            scanner.nextLine();

            if (indice == 0.0) {
                System.out.println("Programa encerrado por índice 0.0.");
                break;
            }

            if (indice >= 0.05 && indice <= 0.25) {
                System.out.println("Índice aceitável. Nenhuma ação necessária.");
            } else if (indice >= 0.3 && indice < 0.4) {
                System.out.println("Notificação: Grupo 1 deve suspender atividades.");
            } else if (indice >= 0.4 && indice < 0.5) {
                System.out.println("Notificação: Grupo 1 e Grupo 2 devem suspender atividades.");
            } else if (indice >= 0.5) {
                System.out.println("Notificação: Todos os grupos devem paralisar atividades.");
            } else {
                System.out.println("Índice fora da faixa aceitável, mas sem ação definida.");
            }

            System.out.print("Deseja encerrar o programa? (S para sim): ");
            resposta = scanner.nextLine().trim().toUpperCase();
            if (resposta.equals("S")) {
                System.out.println("Programa encerrado pelo usuário.");
                break;
            }
        }

        scanner.close();
    }
}
