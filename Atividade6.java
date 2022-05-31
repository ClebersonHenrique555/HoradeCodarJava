import java.util.Scanner;
public class Atividade6 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double maior;

        double num1, num2, num3;

        System.out.println("Digite um numero");
        num1 = ler.nextDouble();

        System.out.println("Digite um numero");
        num2 = ler.nextDouble();

        System.out.println("Digite um numero");
        num3 = ler.nextDouble();

        if (num1>num2){
            maior = num1;
        }else{
            maior = num2;
        }
        if (maior>num3){
            maior = maior;
        }else{
            maior = num3;
        }
        System.out.println(maior);

}
}
