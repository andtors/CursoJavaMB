import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Ex1
        int somaLoop = 0;
        for(int i = 1; i <= 100; i++){
            somaLoop += i;
            System.out.println(i + " - " + somaLoop);
        }
        System.out.println(somaLoop);

        // Ex2
        int doWhile = 1;
        do{
            if(doWhile % 2 == 0){
                System.out.println(doWhile);
            }
            doWhile++;
        } while(doWhile <= 20);

        // Ex3
        System.out.printf("Insira um valor inteiro para verificarmos se é inteiro: ");
        int numInput = scanner.nextInt();
        scanner.nextLine();

        boolean ePrimo = true;
        for(int i = 2; i < numInput; i++) {
            if(numInput % i == 0){
                ePrimo = false;
               break;
            }
        }

        if(ePrimo){
            System.out.println("O numero " + numInput + " é primo!");
        } else {
            System.out.println("O numero " + numInput + " não é primo!");
        }

        // Ex4

        boolean exit = true;
        do{
            System.out.printf("Deseja permanecer no menu? Sim(s) - Não(n): ");
            String escolha = scanner.next();

            if(escolha.equalsIgnoreCase("n")){
                exit = false;
            }

        } while(exit);

        // Ex5

        System.out.printf("Insira um numero inteiro para ser fatorado: ");
        int numFat = scanner.nextInt();

        scanner.nextLine();

        int resFat = 1;

        for(int i = 1; i <= numFat; i++){
            resFat *=  i;
        }

        System.out.println(resFat);

        // Ex6
        System.out.printf("Insira um numero inteiro: ");
        String numString = scanner.next();

        int count = 0;

        while(count < numString.length()){
            count++;
        }

        System.out.println("O número " + numString + " possui " + count + " digitos!");
    }
}
