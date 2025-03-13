import java.util.Scanner;

public class Exercicio3 {

    static void faixaEtaria(int idade){
        if(idade < 18){
            System.out.println("Menor de idade");
        } else if(idade >= 18 && idade <= 64){
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }
    }

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Insira sua idade!");
        int idade = scanner.nextInt();

        faixaEtaria(idade);


    }
}
