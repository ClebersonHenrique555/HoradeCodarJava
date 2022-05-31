import java.util.Scanner;
public class Trapezio{
  public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);

    int base_menor;
    int base_maior;
    int h;

    System.out.println("Informe o valor da base menor:");
    base_menor = ler.nextInt(); 

    System.out.println("Informe o valor da base maior:");
    base_maior = ler.nextInt();

    System.out.println("Informe o valor da altura:");
    h = ler.nextInt();

    int area = ((base_maior+base_menor)*h)/2;
    System.out.println("O valor da area é " + area);

}
}