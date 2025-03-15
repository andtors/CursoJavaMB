import java.util.Scanner;

public class Main {

    public static String conversao(String escolha, double temp){

        if(escolha.equalsIgnoreCase("f")){

            double tempConvert = (temp - 32) / 1.8;
            return "A temperatura convertida para fahrenheit é: " + tempConvert;


        } else if(escolha.equalsIgnoreCase(("c"))){

            double tempConvert = (temp * 1.8) + 32;
            return "A temperatura convertida para fahrenheit é: " + tempConvert;

        } else {
            return "Erro, insira uma temperatura valida.";
        }
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Deseja converter Celsius para  Fahrenheit(F) ou Fahrenheit para Celsius(C)?: ");
        String escolha = scanner.next();

        System.out.printf("Insira a temperatura a ser convertida: ");
        double temp = scanner.nextDouble();

        System.out.println(conversao(escolha, temp));



    }
}