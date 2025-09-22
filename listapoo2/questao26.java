package listapoo2;
import java.util.Scanner;

public class questao26 {

     public boolean equilatero(int a, int b, int c) {
        return a == b && b == c;
    }

    public boolean isosceles(int a, int b, int c) {
        return (a == b || b == c || a == c) && !equilatero(a, b, c);
    }

    public boolean escaleno(int a, int b, int c) {
        return a != b && b != c && a != c;
    }

     public void run(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o lado A: ");
        int a = scanner.nextInt();

        System.out.print("Digite o lado B: ");
        int b = scanner.nextInt();

        System.out.print("Digite o lado C: ");
        int c = scanner.nextInt();

        if (a + b > c && a + c > b && b + c > a) { 
            if (equilatero(a, b, c)) {
                System.out.println("Triângulo Equilátero");
            } else if (isosceles(a, b, c)) {
                System.out.println("Triângulo Isósceles");
            } else if (escaleno(a, b, c)) {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Os lados informados não formam um triângulo válido.");
        }

        scanner.close();
    }
}
