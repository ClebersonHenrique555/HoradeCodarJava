import java.util.Scanner;

public class Quadrado {

  public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);

    int lado;

    System.out.println("Informe o valor do lado:\n");
    lado = ler.nextInt(); 

    int area = lado * lado;
    
    System.out.println("O valor da area é " + area);

}
}