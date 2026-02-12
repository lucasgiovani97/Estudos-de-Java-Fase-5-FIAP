import java.util.Scanner;

public class SistemaDePremiosLojaIfElse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Criando as variáveis:
        double valorCompras;
        int qtdCompras;

        //Solicitando informações:
        System.out.println("Digite o valor gasto em compras esse ano: ");
        valorCompras = sc.nextDouble();

        System.out.println("Quantas vezes você realizou compras na loja esse ano? ");
        qtdCompras = sc.nextInt();

        //Verificação da premiação:
        if (valorCompras >= 2000 && qtdCompras >= 10){
            System.out.println("Parabéns, você é da categoria VIP e ganhou um voucher de desconto!");
        } else if (valorCompras >= 1000) {
            System.out.println("Você está na categoria OURO e ganhou pontos extras no programa de fidelidade!");
        } else if (valorCompras >= 500 || qtdCompras >= 5) {
            System.out.println("Você está na categoria PRATA e ganhou um brinde especial!");
        } else {
            System.out.println("Você está na categoria BRONZE e não recebeu nenhuma premiação especial.");
        }
        }

    }
