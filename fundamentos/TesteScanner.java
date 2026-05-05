import java.util.Scanner;


public class TesteScanner {

    public static void main(String[] args) {

        // 1 - Testando scanner.
        Scanner scanner = new Scanner(System.in);

        // Mensagem para o usuario entender o que precisa digitar.
        System.out.println("Digite o seu nome:");

        // Resgata o valor no terminal.
        String nome = scanner.nextLine();

        // Exibe o valor.
        System.out.println("Olá " + nome + ", seja bem vindo!");

        // nextInt lê um valor inteiro.
        System.out.println("Qual a sua idade " +nome+ "?");
        int idade = scanner.nextInt();
        System.out.println("Sua idade é:" +idade);

        // nextDouble lê um valor decimal.
        System.out.println("Qual a sua altura ");
        double altura = scanner.nextDouble();
        System.out.println("Sua altura é: " +altura);

        // next lê uma unica palavra.
        System.out.println("Qual o seu primeiro nome? ");
        String primeiroNome = scanner.next();
        System.out.println("Seu primeiro nome é: " +primeiroNome);

        // Problema do nextline

        System.out.println("Digite um número:");
        int num = scanner.nextInt();

        scanner.nextLine(); // Evitar bug do nextLine. Sempre que estiver um nextInt.

        System.out.println("Digite um texto:");
        String txt = scanner.nextLine();

        System.out.println("Os dados são, num = " + num + " e texto = " + txt);

         // Fechar o scanner, para evitar o memory leak ( vazamento de memória. )
        scanner.close();

          }
        
    }
    

