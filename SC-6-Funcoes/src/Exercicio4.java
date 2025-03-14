import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Insira um valor inteiro: ");
        int num = scanner.nextInt();

        scanner.nextLine();

        if(num % 2 == 0){
            System.out.println("Numero par");
        } else {
            System.out.println("Numero impar");
        }

    }
}
