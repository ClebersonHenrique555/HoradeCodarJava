import java.util.Scanner;

public class Losango{

  public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);

    int diagonal_menor, diagonal_maior;

    System.out.println("Informe o valor da diagonal menor:\n");
    diagonal_menor = ler.nextInt(); 

    System.out.println("Informe o valor da diagonal maior:\n");
    diagonal_maior = ler.nextInt(); 

    int area = (diagonal_maior * diagonal_menor)/2;
    System.out.println("O valor da area é " + area);

}
}