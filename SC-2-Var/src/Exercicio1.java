public class Exercicio1 {
    public static void main(String[] args){

        // Ex1
        int num1 = 10;
        int num2 = num1 *= 2;

        System.out.println(num2);

        // Ex2
        char letra1 = 'A';
        int letraInt = (int) letra1;

        System.out.println(letraInt);

        // Ex3
        double double1 = 15.75;
        double double2 = 20.40;

        double doubleRes = double1 + double2;

        System.out.println(doubleRes);

        // Ex4
        long doisBi = 2_000_000_000L;
        int doisBiInt = (int) doisBi;

        System.out.println(doisBiInt);

        // Ex5

        String frase1 = "Olá mundo!";
        String frase2 = frase1 + " Bem vindo ao Java!";

        System.out.println(frase2);


    }
}
