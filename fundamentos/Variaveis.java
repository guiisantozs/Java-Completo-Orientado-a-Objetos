public class Variaveis {

    public static void main(String[] args) {

         // 1 - O que são váriaveis.
        // tipo -> nome -> atribuir um valor;
        String nome = "Guilherme";
        int idade = 20;
        String jogo = "GTA";


        // nome => 'Guilherme'
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(jogo);

        // 2 - Atribuição de uma variável com outra
        String teste = "Teste";

        String testando = teste;

        System.out.println(testando);

        long numeroGrande = 99999999999L;
        // int numeroGrandeDois = numeroGrande;

        System.out.println(numeroGrande);

        // 3 - Comentários

        /* 

        Comentario linha 1
        linha 2
        linha 3

        */

        /**
         * Funçao para somar numeros
         * param1:
         * param2:
         * param 3
         */


        // 4 - Strings

        String firstName = "Guilherme";
        String lastName = "Santos";

        // System.out.println("Guilherme Santos");
        //System.out.println(firstName +" "+ lastName);

        System.out.println("O nome dele é: " + firstName);

        String fullname = firstName + " " + lastName;

        // concatenação = operador + nas strings, para uni-las.
        System.out.println(fullname);

        // Char

        char letra = 'A';
        System.out.println(letra);

        // Int

        int numero = 18;
        System.out.println(numero + 5);
        System.out.println(numero * 5);
        System.out.println(numero / 5);
        System.out.println(numero - 5);

        int soma = numero + 5;
        System.out.println(soma);

        // Long

        long populacaoMundial = 7800000000L;
        System.out.println(populacaoMundial);

        long grandeNumero = 1_000_000_000L; // L é para declar o long. O _ É para legibilidade do código.
        System.out.println(grandeNumero);


        // Double

        double preco = 19.99;
        System.out.println(preco);

        System.out.println(preco + 10);
        System.out.println(preco / 2);

        double pi = 3.141_592_123;
        System.out.println(pi);

        // VAR

         var z = 10;
        System.out.println(z);

        var nome1 = "Guilherme";
        System.out.println(nome1);

        var i = 2.0;
        System.out.println(i);

        // Identifica o tipo de váriavel automaticamente.
    }
}
