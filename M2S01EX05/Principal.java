package M2S01EX05;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        // Utilizei variável PI para armazenar o valor de π (3.14)
        final double PI = 3.14;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        // *raio^2 não consegui usando este código, porém,
        // usando o código abaixo, consegui.

        double area = PI * raio * raio;

        double perimetro = 2 * PI * raio;

        System.out.println("Area do circulo: " + area);
        System.out.println("Perimetro do circulo: " + perimetro);

        scanner.close();
    }

}
