import java.util.Scanner;
public class Atividade7 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int menor;
        int num1, num2, num3;

        System.out.println("Digite um numero");
        num1 = ler.nextInt();

        System.out.println("Digite um numero");
        num2 = ler.nextInt();

        System.out.println("Digite um numero");
        num3 = ler.nextInt();

       if(num1<num2){
           menor = num1;
       }else{
           menor = num2;
       }if(menor<num3){
           menor = menor;
       }else{
           menor = num3;
       }
       System.out.println((num1+num2+num3) - menor);
}
}

