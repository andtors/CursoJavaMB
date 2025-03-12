public class Variaveis {
    public static void main(String[] args) {

        // 1 - O que são variaveis
        // shortcut = sout
        String nome = "André";

        System.out.println(nome);

        // 2 - Atribuição com outra variavel
        String teste = "teste";

        String testando = teste;

        System.out.println(testando);

        long numeroGrande = 9999999999999999L;

        //int numeroGrande2 = numeroGrande;

        System.out.println(numeroGrande);

        // 3 - Comentários

        /*
        Comenatario Linha 1
        Linha 2
        Linha 3
        */

        // 4 - Strings
        String firstName  = "Matheus";

        String lastName = "Battisti";

        System.out.println(firstName + " " + lastName);

        System.out.println("O nome dele é " + firstName);

        String fullName = firstName + " " + lastName;

        System.out.println(fullName);

        // 5 - Char
        char letra = 'A';

        System.out.println(letra);

        char simbolo = '$';

        System.out.println(simbolo);

        // 6 - Int
        int n = 42;

        System.out.println(n);

        System.out.println(n + 5);

        System.out.println(n * 10);

        System.out.println(n / 5);

        int soma = n + 12;

        System.out.println(soma);

        // 7 - Long
        long populacaoMundial = 7800000000L;

        System.out.println(populacaoMundial);

        long grandeNumero = 1_000_000L;

        System.out.println(grandeNumero + 1);

        // 8 - Double
        double preco = 19.99;

        System.out.println(preco);

        System.out.println(preco - 12);

        System.out.println(preco / 2);

        double pi = 3.141_592_123;

        System.out.println(pi);

        double valorComD = 12.1D;

        System.out.println(valorComD);

        // 9 -  Operadores aritmeticos
        int soma2 = 12 + 5;

        System.out.println(soma2);

        System.out.println(22 + 4);

        System.out.println(10 - 5);

        System.out.println(10 * 5);

        System.out.println(10 / 2.5);

        System.out.println(10.0 / 2.5);

        // para ter um resultado quebrado, pelo menos um número deve ser double
        System.out.println(10 / 3);

        System.out.println(10.0 / 3);

        System.out.println(10 % 3);

        System.out.println(10 % 2);

        // 10 - Operadores aritmeticos 2
        int x = 5;

        x++;
        x++;
        x++;

        System.out.println(x);

        int y = 5;

        y--;
        y--;
        y--;

        System.out.println(y);

        int a = 10;

        a += 5;

        System.out.println(a);

        int b = 10;

        b -= 5;

        System.out.println(b);

        // 11 - Casting

        // implicito
        int numero2 =  42;

        long numeroLong = numero2;

        double numeroDouble = numero2;

        System.out.println(numeroLong);

        System.out.println(numeroDouble);

        // explicito
        double valorDouble = 9.78;

        int valorInt  = (int) valorDouble;

        System.out.println(valorInt);

        // casting de char para int
        char letra2 = 'A';

        int condigoAscii = (int) letra2;

        System.out.println(condigoAscii);

        // 12 - Constantes
        final int DIAS_DA_SEMANA = 7;

        // DIAS_DA_SEMANA + 1;

        System.out.println("Dias da semana " + DIAS_DA_SEMANA);

        // 13 - var
        var z = 10;

        System.out.println(z);

        //z = "teste";

        z = 5;

        var texto2 = "teste";

        var doubleTeste = 2.0;

        System.out.println(texto2);

        System.out.println(doubleTeste);


    }
}