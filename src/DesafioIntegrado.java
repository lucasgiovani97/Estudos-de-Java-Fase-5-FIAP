import java.util.Scanner;

public class DesafioIntegrado {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor para X: ");
        double numero1 = sc.nextDouble();

        System.out.println("Digite um valor para Y: ");
        double numero2 = sc.nextDouble();

        double soma = numero1 + numero2;
        double subtracao = numero1 - numero2;
        double multiplicacao = numero1 * numero2;
        double divisao = numero1/numero2;

        System.out.println("Soma = " + soma);
        System.out.println("Subtração = " + subtracao);
        System.out.println("Multiplicação = " + multiplicacao);
        System.out.println("Divisão = " + divisao);

        sc.close();
    }

}
