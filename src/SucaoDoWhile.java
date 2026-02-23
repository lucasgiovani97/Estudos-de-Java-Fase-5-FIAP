import java.util.Scanner;

public class SucaoDoWhile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem-vindo ao Sucão Do-While");

        double valorTotal = 0;
        int quantidadeSucos = 0;
        boolean continuar = true;

        do {
            System.out.println("Escolha o tamanho do seu suco: (P) pequeno, (M) médio, (G) grande ou (F) para encerrar");
            String tamanhoSuco = sc.next().toUpperCase();

            if (tamanhoSuco.equals("F")) {
                continuar = false;
            } else {
                System.out.println("Escolha o sabor do suco: (L) laranja, (M) morango, (U) uva");
                String saborSuco = sc.next().toUpperCase();

                double preco = 0;

            switch (tamanhoSuco) {
                case "P":
                    preco += 10.00;
                    break;
                case "M":
                    preco += 12.00;
                    break;
                case "G":
                    preco += 15.00;
                    break;
                default:
                    System.out.println("Opção de tamanho inválida");
                    continue;
            }

            switch (saborSuco) {
                case "L":
                    preco += 3.00;
                    break;
                case "M":
                    preco += 7.00;
                    break;
                case "U":
                    preco += 5.00;
                    break;
                default:
                    System.out.println("Opção de sabor inválida");
                    continue;
            }

            valorTotal += preco;
            quantidadeSucos++;

            System.out.println("O suco foi adicionado ao pedido");
            }
        } while (continuar);

        System.out.println("Seu pedido foi finalizado, total R$ " + valorTotal);
        System.out.println("Quantidade de sucos do pedido: " + quantidadeSucos);
        sc.close();
    }
}
