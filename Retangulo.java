import java.util.Scanner;
public class Retangulo {

  public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);

    int base, altura;

    System.out.println("Informe o valor da base:\n");
    base = ler.nextInt(); 

    System.out.println("Informe o valor da altura:\n");
    altura = ler.nextInt();

    int area = base * altura;
    System.out.println("O valor da area é " + area);

}
}