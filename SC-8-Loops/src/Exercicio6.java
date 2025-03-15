import java.util.Scanner;

public class Exercicio6 {

    public static int somarNumerosPares(int num1, int num2){
        int maiorNum = 0;
        int menorNum = 0;

        if(num1 > num2){
            maiorNum = num1;
            menorNum = num2;
        } else {
            maiorNum = num2;
            menorNum = num1;
        }

        int somaPares = 0;

        for(int i = menorNum; i <= maiorNum; i++){
            if(i % 2 == 0){

                somaPares += i;

            }
        }

        return somaPares;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Insira o primeiro número: ");
        int num1 = scanner.nextInt();
        scanner.nextLine();
        System.out.printf("Insira o segundo número: ");
        int num2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println(somarNumerosPares(num1, num2));

    }
}
