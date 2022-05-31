import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double x, y;

        System.out.println("Digite um numero");
        x = ler.nextDouble();

        System.out.println("Digite um numero");
        y = ler.nextDouble();

        if(y== 0 || y<0){
        System.out.println("Digite um numero");
        y = ler.nextDouble();
        }else{
        System.out.println(x/y);
        }
    }
}
