import java.util.Scanner;
import java.util.Random;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        //Gerando número aleatório:
        int numeroSecreto = random.nextInt(20)+1;
        System.out.println("Bem-vindo ao jogo de adivinhação");
        System.out.println("Tente adivinhar o número que vai de 1 a 20");

        int tentativas = 0;
        boolean adivinhou = false;

        while (!adivinhou) {
            System.out.println("Digite seu número de tentativa: ");
            int tentativa = sc.nextInt();
            tentativas++;

            if (tentativa == numeroSecreto) {
                System.out.println("Parabéns, você acertou o número secreto em: " + tentativas + " tentativas");
                adivinhou = true;
            } else if (tentativa < numeroSecreto) {
                System.out.println("Tente um número maior");
            } else {
                System.out.println("Tente um número menor");
            }
        }
        sc.close();
    }
}
