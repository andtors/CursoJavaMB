import java.util.Scanner;

public class Main {

    public static String calculo(String operacao, double num1, double num2){
        double resultado = 0;
        if(operacao.equals("+")){
            resultado = num1 + num2;
            return "O resultado da operação " + num1 + " " + operacao + " " + num2 + " = " + resultado;
        } else if (operacao.equals("-")) {
            resultado = num1 - num2;
            return "O resultado da operação " + num1 + " " + operacao + " " + num2 + " = " + resultado;
        } else if(operacao.equals("*")){
            resultado = num1 * num2;
            return "O resultado da operação " + num1 + " " + operacao + " " + num2 + " = " + resultado;
        } else if(operacao.equals("/")){
            resultado = num1 / num2;
            return "O resultado da operação " + num1 + " " + operacao + " " + num2 + " = " + resultado;
        } else {
            return "Operação invalida";
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Qual operação deseja realizar? Soma(+), Subtração(-), Multiplicação(*) ou Divisão(/): ");
        String operacao = scanner.next();

        System.out.printf("Insira o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.printf("Insira o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.printf(calculo(operacao, num1, num2));


    }
}