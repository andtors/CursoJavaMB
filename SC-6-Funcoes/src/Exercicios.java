import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicios {

    // Ex1
    public static double convertCelToFar(double temp){
        double tempFarh = (temp * 1.8) + 32;
        return tempFarh;
    }

    // Ex2
    public static int calcFato(int numFat){
        int resFat = numFat;
        for(int i = 1; i < numFat; i++){
            resFat *=  i;
            System.out.println(i + " - " + resFat);
        }
        return resFat;
    }

    // Ex3
    public static void checkEvenOrOdd(int num){
        if(num % 2 == 0){
            System.out.println("O número " + num + " é par");
        } else {
            System.out.println("O número " + num + " é impar");
        }
    }

    // Ex4
    public static void checkGrade(int num){

       if(num < 0 || num > 10){
           System.out.println("Número invalido");
           System.exit(1);
       }

        switch (num){
            case 10:
                System.out.println("A");
                break;
            case 8, 9:
                System.out.println("B");
                break;
            case 7, 6:
                System.out.println("C");
                break;
            case 5, 4:
                System.out.println("D");
                break;
            case 3, 2:
                System.out.println("E");
                break;
            case 1, 0:
                System.out.println("F");
                break;
        }
    }

    // Ex5
    public static void checkAge(int age){
        if(age < 18){
            System.out.println("Acesso negado!");
            System.exit(1);
        } else {
            System.out.println("Aceso permitido!");
        }
    }

    // Ex6
    public static int checkMax(List<Integer> array){
        int maxNumber = 0;
        for(int i = 0; i < array.size(); i++){
            if(maxNumber < array.get(i)){
                maxNumber = array.get(i);
            }
        }

        return maxNumber;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ex1
        System.out.printf("Insira a temperatura em Celsius: ");
        double tempCel = scanner.nextDouble();

        System.out.println(convertCelToFar(tempCel));

        // Ex2
        System.out.printf("Insira um número inteiro para o calculo fatorial do mesmo: ");
        int numFat = scanner.nextInt();

        scanner.nextLine();

        System.out.println("O resultado do fatorial de " + numFat + " é: " + calcFato(numFat));

        // Ex3
        System.out.printf("Insira um número para verificar se é par ou impar: ");
        int parOuImpar = scanner.nextInt();

        scanner.nextLine();

        checkEvenOrOdd(parOuImpar);

        // Ex4
        System.out.printf("Insira a nota de 0 a 10: ");
        int nota = scanner.nextInt();

        scanner.nextLine();
        checkGrade(nota);

        // Ex5
        System.out.printf("Insira sua idade: ");
        int idade = scanner.nextInt();

        scanner.nextLine();

        checkAge(idade);

        // Ex6

        System.out.printf("Quantidade de números dentro da array desejado: ");
        int qntdArray = scanner.nextInt();

        scanner.nextLine();

        List<Integer> array = new ArrayList<Integer>();

        for(int i = 0; i < qntdArray; i++){
            System.out.printf("Insira os valores até a quantidade maxima " + "(" + qntdArray + ") :");
            int number = scanner.nextInt();
            scanner.nextLine();
            array.add(number);
        }

        System.out.println(checkMax(array));
    }
}
