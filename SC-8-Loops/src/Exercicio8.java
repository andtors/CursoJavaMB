import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio8 {

    public static List<Integer> gerarFibonacci(int qntd){

        List<Integer> arrayFibo = new ArrayList<Integer>();
        arrayFibo.add(0, 0);
        arrayFibo.add(1, 1);

        for(int i = 1; i <= qntd; i++){
            int fiboAnt = i - 1;
            int fiboAtual = arrayFibo.get(fiboAnt) + arrayFibo.get(i);
            arrayFibo.add(fiboAtual);
        }

        return arrayFibo;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Insira quantas vezes deseja o Fibonacci: ");
        int numQntd = scanner.nextInt();

        scanner.nextLine();

        System.out.println(gerarFibonacci(numQntd));
    }
}
