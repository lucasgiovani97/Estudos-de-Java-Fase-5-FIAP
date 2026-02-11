import java.util.Scanner;

public class Media {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nomeAluno = sc.nextLine();

        System.out.println("Digite a nota do primeiro semestre: ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a nota do segundo semestre: ");
        double nota2 = sc.nextDouble();

        double media = (nota1+nota2)/2;

        System.out.println("A média do aluno " + nomeAluno + " foi de: " + media);

        sc.close();
    }
}
