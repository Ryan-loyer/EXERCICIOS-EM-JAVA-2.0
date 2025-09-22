package listapoo2;

public class questao13 {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i);
            if (i % 10 == 0) {
                System.out.print(" - Múltiplo de 10");
            }
            System.out.println();
        }
    }
}