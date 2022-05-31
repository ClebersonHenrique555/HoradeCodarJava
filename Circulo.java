import java.util.Scanner;

public class Circulo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double raio;
        double pi = 3.14;

        System.out.println("Informe o valor do raio");
        raio = ler.nextDouble();

        double area = pi * raio;

        System.out.println("O valor dá area é " + area);

    }
}
