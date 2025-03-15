import java.util.ArrayList;
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
    }


}
