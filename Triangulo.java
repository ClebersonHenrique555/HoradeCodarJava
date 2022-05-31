import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double altura, base;

        System.out.println("Digite o valor da altura");
        altura = ler.nextDouble();

        System.out.println("Digite o valor da base");
        base = ler.nextDouble();

        double area = (base * altura)/ 2;

        System.out.println("O valor da area é " + area);
    }
}
