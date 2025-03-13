import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ex 1
        System.out.printf("Insira o valor do produto: ");
        int preco = scanner.nextInt();
        scanner.nextLine();
        if(preco > 100){
            System.out.println("Caro");
        } else if (preco >= 50 && preco <= 100){
            System.out.println("Médio");
        } else if (preco < 50){
            System.out.println("Barato");
        }

        //Ex 2
        System.out.printf("Insira nome do usuario: ");
        String nome = scanner.next();
        System.out.printf("Insira a senha do usuario: ");
        String senha = scanner.next();

        if(nome.equals("admin") && senha.equals("1234")){
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado!");
        }

        // Ex 3
        System.out.printf("Insira um número inteiro: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        if(number % 2 == 0){
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }

        // Ex 4
        System.out.printf("Insira um número de 1 a 7: ");
        int number2 = scanner.nextInt();
        scanner.nextLine();

        switch (number2){
            case 1, 7:
                System.out.println("Final de semana");
                break;
            case 2, 3, 4, 5, 6:
                System.out.println("Dia util");

            default:
                System.out.println("Insira um número valido");

        }

        // Ex 5
        System.out.printf("Insira um número inteiro: ");
        int number3 = scanner.nextInt();
        scanner.nextLine();

        if(number3 >= 10 && number3 <= 20){
            System.out.println("Dentro do intervalo");
        } else {
            System.out.println("Fora do intervalo");
        }

        System.out.printf("Insira uma letra: ");
        String letra = scanner.next();

        if(
            letra.equalsIgnoreCase("a") ||
            letra.equalsIgnoreCase("b") ||
            letra.equalsIgnoreCase("c") ||
            letra.equalsIgnoreCase("d") ||
            letra.equalsIgnoreCase("e")
        ){
            System.out.println("Vogal");
        } else {
            System.out.println("Consoante");
        }
        scanner.close();
    }
}
