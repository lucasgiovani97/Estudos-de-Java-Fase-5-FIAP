import java.util.Scanner;

public class OperadoresRelacionais {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Criando as variáveis:
        boolean ensolarado;
        boolean finalDeSemana;

        //Solicitando informações ao usuário:
        System.out.println("O dia está ensolarado hoje? (true para sim / false para não) ");
        ensolarado = sc.nextBoolean();

        System.out.println("Hoje é final de semana? (true para sim / false para não) ");
        finalDeSemana = sc.nextBoolean();

        //Verificar informações para decidir onde ir:
        if (ensolarado && finalDeSemana) {
            System.out.println("Vamos para a praia, aproveitar o sol no final de semana");
        }
        else {
            System.out.println("Hoje o passeio será no parque!");
        }
    }

}
