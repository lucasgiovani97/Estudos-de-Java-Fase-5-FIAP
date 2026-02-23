import java.util.Scanner;

public class DesafioSuco {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem-vindo ao Sucão");

        double valorTotal = 0;
        int quantidadeSucos = 0;
        boolean continuar = true;

        while (continuar){
            System.out.println("Escolha o tamanho do seu suco: ");
            System.out.println("P = pequeno");
            System.out.println("M = médio");
            System.out.println("G = grande");
            System.out.println("F para encerrar o pedido");
            String tamanhoSuco = sc.next().toUpperCase();

            if (tamanhoSuco.equals("F")) {
                continuar = false;
            } else {
                System.out.println("Escolha o sabor do suco");
                System.out.println("Laranja");
                System.out.println("Morango");
                System.out.println("Uva");
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
                        System.out.println("Opção de tamanho inválida!");
                        continue;
                }

                switch (saborSuco) {
                    case "LARANJA":
                        preco += 5.00;
                        break;
                    case "MORANGO":
                        preco += 7.00;
                        break;
                    case "UVA":
                        preco += 6.00;
                        break;
                    default:
                        System.out.println("Opção de sabor inválida!");
                        continue;
                }

                valorTotal += preco;
                quantidadeSucos++;

                System.out.println("Suco adicionado ao pedido!");
            }
        }

        System.out.println("Seu pedido foi finalizado, o total a pagar é de R$ " + valorTotal);
        System.out.println("A quantidade de sucos do seu pedido é " + quantidadeSucos);
        sc.close();
    }
}
