package condicionais;

public class condicionais {

    public static void main(String[] args) {

        // 1 - O que é boolean?

        boolean isTrue = true;
        boolean isFalse = false;

        System.out.println(isTrue);
        System.out.println(isFalse);

        // 2 -  Operadores de comparação;

        int x = 10;
        System.out.println(x == 10);
        System.out.println(x == 9);
        System.out.println(x > 9);
        System.out.println(x < 9);
        System.out.println(x >= 10);
        System.out.println(x <= 10);
        System.out.println(x != 1);


        // 3 - Atribuição e comparação:

        int n = 5;
        int m = 10;

        System.out.println(n = 12);
        System.out.println(n);

        System.out.println(n );

        // 4 - Comparação de strings

        String str1 = "Java";
        String str2 = new String("Java");

        System.out.println(str1);
        System.out.println(str2);

        System.out.println(str1 == str2);
        System.out.println(str1 == "Java");

        System.out.println(str1.equals(str2));
        
        // 5 - If

        int numero = 10;

        if (numero > 5 ) {
            System.out.println(" O numero é maior que 5. ");
        }

        // Se a função retorna um booleano, eu posso usar o IF

        String texto = "Teste";
         if(texto.equals("Teste")) {

            System.out.println("O texto é: Teste ");
        
         }

        // declaração do if (comparação ou retorno de booleano) { o que sera executado...}
    



    // 6 - Else

        int q = 17;

        if(q > 10) {
            System.out.println("Q é maior que 10");
        } else { 

            System.out.println("Insira um número maior que 10");

        }

        // Todo else precisa de um IF, mas nem todo IF precisa de um else.

        // 7 - Else If

        double nota = 8.5;

        if (nota == 10) {
            System.out.println("Você tirou a nota máxima, parabéns!");
        }
        else if(nota >= 9) {
            System.out.println(" Sua nota foi muito boa.");
        } else if(nota >= 7 ) {
            System.out.println(" Você foi aprovado!");
        } else { 
            System.out.println(" Sua nota foi abaixo da média.");
        }
    }
}