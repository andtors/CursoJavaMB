import java.util.Scanner;

public class TesteScanner {
    public static void main(String[] args){

        // 1 - Testando Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");

        String nome = scanner.nextLine();

        System.out.println("Olá " + nome + " Seja bem vindo!");

        System.out.println("Digite sua idade:");

        int idade = scanner.nextInt();

        System.out.println(nome + " sua idade é: " + idade + " anos");

        // 2 - Problema do nextLine
        System.out.println("Digite um numero:");
        int n = scanner.nextInt();

        // Sempre após inserir um numero inserir:
        scanner.nextLine();

        System.out.println("Digite um texto:");
        String texto = scanner.nextLine();

        System.out.println("Os dados são: n = " + n + " e texto = " + texto );


        scanner.close();
    }
}
