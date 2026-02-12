import java.util.Scanner;

public class SwitchCase {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        //Declarar variáveis:
        int opcao;
        double numero1;
        double numero2;
        double resultado;

        //Solicitar informações:
        System.out.println("Bem-vindo à Calculadora!");
        System.out.println("Por favor, escolha uma opção: ");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        //Lendo as informações:
        opcao = sc.nextInt();
        System.out.println("Digite dois números: ");
        numero1 = sc.nextDouble();
        numero2 = sc.nextDouble();

        //Switch Case:
        switch (opcao){
            case 1:
                resultado = numero1 + numero2;
                System.out.println("Resultado da soma: " + resultado);
                break;
            case 2:
                resultado = numero1 - numero2;
                System.out.println("Resultado da subtração: " + resultado);
                break;
            case 3:
                resultado = numero1 * numero2;
                System.out.println("Resultado da multiplicação: " + resultado);
                break;
            case 4:
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("O resultado da divisão é: " + resultado);
                } else {
                    System.out.println("Não é possível dividir por zero!");
                }
                break;
            default:
                System.out.println("Opção inválida!");
                }
        }
    }
