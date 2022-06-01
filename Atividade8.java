import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double x, y;

        System.out.println("Digite um numero");
        x = ler.nextDouble();

        System.out.println("Digite um numero");
        y = ler.nextDouble();

       while(y <= 0){
            System.out.println("Por favor informe outro valor: ");
            // System.out.print("Informe o segundo valor: ");
            y = in.nextDouble();
        }

         System.out.println(x/y);
    }
}
