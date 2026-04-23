public class Operadores {
    
    public static void main(String[] args) {

        int soma = 10 + 10;
        int subtracao = 10 - 10;
        int multiplicacao = 10 * 10;
        int divisao = 10 / 10;
        int resto = 10 % 3;

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);
        System.out.println(resto);

        int x = 5;
        x++; // Incrementa um valor de uma váriavel em 1.
        x++;
        x--; // Subtrai o valor de uma váriavel em 1. 
        
        // loops -> for, while

        System.out.println(x);

        int a = 10;
        a += 5; // Soma e atribui um valor a uma váriavel.
        System.out.println(a);

        int b = 10;
        b -= 5; // Subtrai e atribui um valor a uma váriavel.
        System.out.println(b);

        b -= a;
        System.out.println(b);



    }

}
