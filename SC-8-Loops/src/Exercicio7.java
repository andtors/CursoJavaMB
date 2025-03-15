import java.util.Scanner;

public class Exercicio7 {

    public static int calcularFatorial(int num){

        int resFat = 1;
        for(int i = 1; i <= num; i++){
            resFat *= i;
        }

        return resFat;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Insira o numero inteiro a ser fatorado: ");
        int numFat = scanner.nextInt();

        scanner.nextLine();

        int resultado = calcularFatorial(numFat);

        System.out.println("O resultado da fatoração de " + numFat + " é " + resultado);
    }
}
