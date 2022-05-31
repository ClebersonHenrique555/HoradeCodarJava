import java.util.Scanner;
public class Atividade5 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double numero;

        System.out.println("Digite um numero");
        numero = ler.nextDouble();

        if (numero>0){
            System.out.println("É positivo");
        }else if (numero<0){
            System.out.println("É negativo");
        }else if (numero==0){
            System.out.println("O valor é zero");
        }

    }
    
}
