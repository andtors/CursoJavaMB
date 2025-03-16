import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicios {

    // Ex1
    public static ArrayList<String> inverterArray(ArrayList<String> array){

        ArrayList<String> arrayInv = new ArrayList<>();
        for(int i = array.size(); i > 0; i--){
            arrayInv.add(array.get(i - 1));
        }

        return arrayInv;
    }

    public static String numeroFrequencia(ArrayList<Integer> array){

       Integer maisFrequente = array.get(0);
       Integer maxContagem = 1;

       String frase = "";

        for(int x = 0; x < array.size(); x++){
            Integer contagem = 0;

            for(int z = 0; z < array.size(); z++){
                if(array.get(z) == array.get(x)){
                    contagem++;
                }
            }
            if(contagem > maxContagem){
                maxContagem = contagem;
                maisFrequente = array.get(x);
            }
        }

        return "O mais frequente é " + maisFrequente;

    }

    public static void showArray(ArrayList<String> array) {
        for(String nome : array){
            System.out.println(nome);
        }
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        // Ex1
        ArrayList<String> arrayNome = new ArrayList<>();

        boolean exitEx1 = true;

        do{
            System.out.printf("Insira quantos nomes desejar: ");
            String nome = scanner.nextLine();

            System.out.printf("Deseja inserir mais nomes? Sim(s) Não(n): ");
            String escolha = scanner.nextLine();
            arrayNome.add(nome);

            if(escolha.equalsIgnoreCase("n")){
                exitEx1 = false;
            } else {
                exitEx1 = true;
            }

        } while(exitEx1);

        System.out.println(arrayNome);
        System.out.println("Invertendo array...");
        System.out.println("Array invertida: " + inverterArray(arrayNome));

        // Ex2
        ArrayList<Integer> arrayInt = new ArrayList<>();

        boolean exitEx2 = true;

        do{
            System.out.printf("Insira quanto números inteiro desejar: ");
            Integer numero = scanner.nextInt();
            scanner.nextLine();

            System.out.printf("Deseja inserir mais numeros? Sim(s) Não(n): ");
            String escolha = scanner.nextLine();
            arrayInt.add(numero);

            if(escolha.equalsIgnoreCase("n")){
                exitEx1 = false;
            } else {
                exitEx1 = true;
            }

        } while(exitEx1);

        System.out.println(arrayInt);
        System.out.println("Procurando elemento com mais frequencia...");
        System.out.println(numeroFrequencia(arrayInt));

        // Ex3
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] matrizInv = new int[2][3];

        for(int i = 0; i < matriz.length - 1; i++){
            System.out.println("Array: " + i);
            for(int j = 0; j < matriz.length; j++){
                System.out.println("Linha " + j + ": " + Arrays.toString(matriz[j]));
            }
        }

        System.out.println("Invertendo matriz...");
        int[] arrayParaInv = new int[1];
        for(int i = 0; i < matriz.length - 1; i++){
            for(int j = 0; j < matriz.length; j++){
                matrizInv[i] = matriz[j];
                arrayParaInv = matriz[i];
                matrizInv[j] = arrayParaInv;
            }
        }

        for(int[] linha : matrizInv){
            System.out.println(Arrays.toString(linha));
        }

        // Ex4
        int[] arrayComNegativos = {1, -2, 3, -4, 5, -6};

        System.out.println(Arrays.toString(arrayComNegativos));

        for(int i = 0; i < arrayComNegativos.length; i++){
            if(arrayComNegativos[i] < 0){
                arrayComNegativos[i] = 0;
            }
        }

        System.out.println(Arrays.toString(arrayComNegativos));

        // Ex5
        int[] arrayComDuplicados = {1, 2, 2, 2, 3, 4, 4, 5};

        ArrayList<Integer> arraySemDuplicados = new ArrayList<>();

        for(int numero : arrayComDuplicados){
            if(!arraySemDuplicados.contains(numero)){
                arraySemDuplicados.add(numero);
            }
        }

        System.out.println(Arrays.toString(arrayComDuplicados));
        System.out.println(arraySemDuplicados);
    }
}
