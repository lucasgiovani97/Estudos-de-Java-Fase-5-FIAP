import java.util.Scanner;

public class SistemaCafe {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //declarar variáveis
        double valorCafe = 0;

        //Solicitar pedido:
        System.out.println("Bem-vindo ao Café Java!");
        System.out.println("Por favor, selecione o tamanho do seu café");
        System.out.println("(P) Pequeno = R$ 2,50");
        System.out.println("(M) Médio = R$ 3,00");
        System.out.println("(G) Grande = R$ 3,50");
        String tamanho = sc.nextLine().toUpperCase();

        System.out.println("Escolha o tipo de café:");
        System.out.println("(E) Expresso = + R$ 1,50");
        System.out.println("(C) Capuccino = + R$ 2,00");
        System.out.println("(L) Latte = + R$ 2,50");
        String tipo = sc.nextLine().toUpperCase();

        switch (tamanho) {
            case "P":
                valorCafe += 2.50;
                break;

            case "M":
                valorCafe += 3.00;
                break;

            case "G":
                valorCafe += 3.50;
                break;

            default:
                System.out.println("Opção de tamanho inválida!");
                return;
        }

        switch (tipo) {
            case "E":
                valorCafe += 1.50;
                break;

            case "C":
                valorCafe += 2.00;
                break;

            case "L":
                valorCafe += 2.50;
                break;

            default:
                System.out.println("Opção de tipo inválida!");
                return;
        }

        System.out.println("Seu pedido foi confirmado");
        System.out.println("O valor total do seu pedido é: R$" + valorCafe);

    }
}
