public class TypeCasting {

    public static void main(String[] args) {

    // implicito - Converte tipos menores para maiores. (widening)
    int numero = 30;
    int numero1 = 40;

    long numeroLong = numero;
    System.out.println(numeroLong);
    
    double numero1Double = numero1;
    System.out.println(numero1Double);

    // explicito - Converte tipos maiores para menores. (narrowing)

    double valorDouble = 9.70;
    int valorInt = (int) valorDouble;
    System.out.println(valorInt);

    // Casting de Char para Int.

    char letra = 'A';
    int codigoAscii = (int) letra;
    System.out.println(codigoAscii);

    }
}
