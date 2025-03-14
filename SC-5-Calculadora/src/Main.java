import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Insira seu peso:");
        double peso = scanner.nextDouble();

        System.out.printf("Insira sua altura:");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        if(imc < 18.5){
            System.out.println("IMC:" + imc + " Abaixo do peso");
        } else if(imc >= 18.5 && imc <= 24.9){
            System.out.println("IMC:" + imc + " Peso normal");
        } else if(imc >= 25 && imc < 29.99){
            System.out.println("IMC:" + imc + " Sobrepeso");
        } else {
            System.out.println("IMC:" + imc + " Obesidade");
        }
    }
}