public class Exercicios {
    
public static void main(String[] args) {

    /* EXERCÍCIO 1 - Crie uma variável int para armazenar o valor 10.
    Crie uma segunda variável int para armazenar o dobro do valor da primeira variável 
    usando operadores aritméticos. */

    int idade = 10;
    int dobro = idade * 2;
    
    System.out.println(dobro);

    /* EXERCÍCIO 2 - Declare uma variável Char que armazene a letra 'B'.
    Faça o casting explícito dessa variável para o tipo int e exiba o valor numérico correspondente.*/

    char letra = 'B';
    int codigoAscii = (int) letra;
    System.out.println(codigoAscii);

    /* EXERCÍCIO 3 - Declare duas variáveis double para armazenar os valores 15.75 e 20.40.
    Some os valores dessas variáveis e armazene o resultado em uma nova váriavel double. */

    double valor1 = 15.75;
    double valor2 = 20.40;
    double soma = valor1 + valor2;
    System.out.println(soma);

    /* EXERCÍCIO 4 -Declare uma variável long para armazenar o numero 2 bilhões (2_000_000_000). 
    Em seguida, declarre uma variável int e faça o casting explícito do valor long para int.*/

    long numero = 2_000_000_000L;
    int numeroInt = (int) numero;
    System.out.println(numeroInt);
    
    /* EXERCÍCIO 5 - Escreva um programa que crie uma variável String com o valor "Olá, Mundo!."
    Em seguida, crie outra variável que contatene a primeira variável com o texto " Bem-vindo ao Java!". */

    String ola = "Olá, Mundo!";
    String mensagem = ola + " Bem-vindo ao Java!";
    System.out.println(mensagem);





    
}





}
