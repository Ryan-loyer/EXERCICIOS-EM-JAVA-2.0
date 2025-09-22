package listapoo2;
import java.util.Scanner;

public class questao25 {

    private int[] vetor;
    private Scanner scanner = new Scanner(System.in);

    public void carregarVetor() {
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();
        vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }
        System.out.println("Vetor carregado!");
    }

    public void listarVetor() {
        if (vetor == null) { System.out.println("Vetor não carregado."); return; }
        for (int num : vetor) System.out.print(num + " ");
        System.out.println();
    }

    public void exibirPares() {
        if (vetor == null) { System.out.println("Vetor não carregado."); return; }
        for (int num : vetor) if (num % 2 == 0) System.out.print(num + " ");
        System.out.println();
    }

    public void exibirImpares() {
        if (vetor == null) { System.out.println("Vetor não carregado."); return; }
        for (int num : vetor) if (num % 2 != 0) System.out.print(num + " ");
        System.out.println();
    }

    public void contarParesPosicoesImpares() {
        if (vetor == null) { System.out.println("Vetor não carregado."); return; }
        int count = 0;
        for (int i = 1; i < vetor.length; i += 2) if (vetor[i] % 2 == 0) count++;
        System.out.println("Pares em posições ímpares: " + count);
    }

    public void contarImparesPosicoesPares() {
        if (vetor == null) { System.out.println("Vetor não carregado."); return; }
        int count = 0;
        for (int i = 0; i < vetor.length; i += 2) if (vetor[i] % 2 != 0) count++;
        System.out.println("Ímpares em posições pares: " + count);
    }


     public void run(){
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Carregar Vetor");
            System.out.println("2 - Listar Vetor");
            System.out.println("3 - Exibir pares");
            System.out.println("4 - Exibir ímpares");
            System.out.println("5 - Pares em posições ímpares");
            System.out.println("6 - Ímpares em posições pares");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> carregarVetor();
                case 2 -> listarVetor();
                case 3 -> exibirPares();
                case 4 -> exibirImpares();
                case 5 -> contarParesPosicoesImpares();
                case 6 -> contarImparesPosicoesPares();
                case 0 -> System.out.println("Programa encerrado.");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);


        scanner.close();
    }
}
