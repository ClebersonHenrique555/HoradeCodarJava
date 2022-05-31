import java.util.Scanner;
public class Atividade7 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double maior;
        int num1, num2, num3;

        System.out.println("Digite um numero");
        num1 = ler.nextInt();

        System.out.println("Digite um numero");
        num2 = ler.nextInt();

        System.out.println("Digite um numero");
        num3 = ler.nextInt();

        if (num3 < num1 && (num1 < num2)) {
            System.out.print(num1 + num2);
            
            } else if (num2 < num1 && num1 < num3) {
            System.out.print(num1 + num3);
            
            if (num2 < num1 && (num1 < num3)) {
            System.out.print(num1 + num3);
            } else {
            System.out.print(num2 + num3);
            }
        }
    }
}
            

