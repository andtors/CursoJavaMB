import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Insira um ano: ");
        int ano = scanner.nextInt();

        scanner.nextLine();

        if(ano % 4 == 0 || ano % 400 == 1){
            System.out.println("Ano bissexto");
        } else {
            System.out.println("Ano não bissexto");
        }
    }
}

