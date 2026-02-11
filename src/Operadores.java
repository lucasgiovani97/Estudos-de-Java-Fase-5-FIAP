public class Operadores {
    public static void main(String[] args){
        //Operadores aritmeticos:
        //+: soma;
        //-: subtração;
        //*: multiplicação;
        // /: divisão;
        //%: resto;
        //++: acrescenta 1;
        //--: diminui 1;

        int x = 10;
        int y = 5;
        int soma = x + y;
        System.out.println("x + y = " + soma);

        int subtracao = x - y;
        System.out.println("x - y = " + subtracao);

        int multiplicacao = x * y;
        System.out.println("x * y = " + multiplicacao);

        int divisao = y / 2;
        System.out.println("y / 2 = " + divisao);
        //IMPORTANTE: a divisão não aparece 2.5 que é o resultado correto porque a variável y está declarada como int. Para aparecer as casas decimais precisa declarar como float

        float z = 5;
        System.out.println("z / 2 = " + z / 2);

        int resto = y % 2;
        System.out.println("O resto de y / 2 é = " + resto);

        x++;
        System.out.println("O incremento de x é = " + x);

        y--;
        System.out.println("O decremento de y é = " + y);




    }
}
