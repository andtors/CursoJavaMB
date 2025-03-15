import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // 1 - sintaxe
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println("Acessando primeiro elemento: " + numeros[0]);

        // Tamanho fixo porem vazio

        String[] frutas = new String[3];

        frutas[0]  = "Maça";
        frutas[1]  = "Banana";
        frutas[2]  = "Mamão";

        System.out.println(frutas[1]);

        //frutas[4] = "Teste";

        double[] precos = {1.99, 2.45, 4.97};

        precos[2] = 5;

        System.out.println(precos[2]);

        //precos[2] = "1";

        // 2 - Loops em arrays

        int soma = 0;

        for(int i = 0; i < numeros.length; i++){
            soma += numeros[i];
        }

        System.out.println("Soma dos elementos: " + soma);

        // for each
        for(String fruta : frutas){
            System.out.println("A fruta da vez é: " + fruta);
        }

        int[] valores = {10, 25, 881, 22, 1};

        int maiorValor = valores[0];

        int j = 0;

        while(j < valores.length){
            if(valores[j] > maiorValor){
                maiorValor = valores[j];
            }
            j++;
        }
        System.out.println("O maior valor é: " + maiorValor);

        // 3 - Foreach
        for(int numero : numeros){
            System.out.println("O numero é : " + numero);
        }

        String[] palavras = {"Java", "é", "bom"};

        String frase = "";

        for(String palavra : palavras){
            frase += palavra + " ";
        }

        System.out.println(frase);

        char[] letras = {'a', 'e', 'i', 'o', 'u'};

        char letrasProcurada = 'i';

        for(char letra : letras){
            if(letra == letrasProcurada){
                System.out.println("Encontramos a letra: " + letra);
                break;
            }
        }

        // 4 - Loops com if
        int somaPares = 0;

        for(int numero : numeros){
            if(numero % 2 == 0){
                somaPares += numero;
            }
        }

        System.out.println(somaPares);

        int[] nums = {12, 6, 18, 24, 48, 5};

        int limite = 10;

        for(int i = 0; i <  nums.length;i++){
            if(nums[i] > limite){
                System.out.println("Numero maior encontrado: " + nums[i]);
            }
        }

        String[] linguagens = {"Java", "C", "Python", "PHP"};

        String linguagemAlvo = "Python";

        for(String linguagem : linguagens){
            if(linguagem.equalsIgnoreCase(linguagemAlvo)){
                System.out.println("Linguagem encontrada! Parando loop!");
                break;
            } else{
                System.out.println("Linguagem não encontrada!");
            }
        }

        // 5 - Atualizar valores
        for(int i = 0; i < numeros.length; i++){
            numeros[i] *= 2;
        }

        System.out.println(numeros[1]);

        for (int numero : numeros){
            System.out.println("Numero dobrado: " + numero);
        }

        numeros[5] = 1;

        System.out.println(numeros[5]);

        for(int i = 0; i < frutas.length; i++){
            if(frutas[i].equals("Maça")){
                frutas[i] = "Abacate";
            }
        }

        System.out.println(frutas[0]);

        // não é possivel fazer atribuição com foreach
        for(int numero : numeros){
            numero *= 2;
        }

        for (int numero : numeros ){
            System.out.println("Numero dobrado: " + numeros);
        }

        // 6 - Metodo toString
        String dadosNumericos = Arrays.toString(numeros);

        System.out.println(dadosNumericos);
        System.out.println(numeros);

        String dadosFrutas = Arrays.toString(frutas);

        System.out.println(dadosFrutas);

        int[] teste = new int[3];

        System.out.println(Arrays.toString(teste));

        // 7 - Adicionando novos elementos a arrays

        // ex 1:
        int[] novoArray = new int[numeros.length + 1];

        System.out.println(Arrays.toString(novoArray));
        for(int i = 0; i < numeros.length; i++){
            novoArray[i] = numeros[i];
        }

        System.out.println(Arrays.toString(novoArray));

        novoArray[novoArray.length - 1] = 4;

        System.out.println(Arrays.toString(novoArray));

        // ex2: utilizando arraycopy

        String[] novoFrutas = new String[frutas.length + 1];

        // array original, posição inicial, novo array, posição inicial, tamanho do array
        System.arraycopy(frutas, 0, novoFrutas, 0, frutas.length);

        novoFrutas[novoFrutas.length - 1] = "Jaca";

        System.out.println(Arrays.toString(novoFrutas));

        // ex3: usando ArrayList
        ArrayList<String> listaFrutas = new ArrayList<>(Arrays.asList("Maça", "Banana", "Laranja"));

        System.out.println(listaFrutas);

        listaFrutas.add("Manga");

        System.out.println(listaFrutas);

        // 8 - Reference Trap
        int[] arrayOriginal = {1, 2, 3};

        int[] arrayCopia = arrayOriginal;

        arrayCopia[0] = 10;

        System.out.println(Arrays.toString(arrayOriginal));
        System.out.println(Arrays.toString(arrayCopia));

        // como evitar
        int[] arrayClone = arrayOriginal.clone();

        arrayClone[0] = 999;

        System.out.println(Arrays.toString(arrayOriginal));
        System.out.println(Arrays.toString(arrayClone));

        // 9 - Matrizes
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(matriz[1][2]);
        System.out.println(matriz[2][0]);

        int [][] tabela = new int[3][3];

        tabela[0][0] = 10;
        tabela[1][1] = 20;
        tabela[2][2] = 30;

        for(int[] linha : tabela){
            System.out.println(Arrays.toString(linha));
        }

        int[][] grade = new int[4][5];

        for(int m = 0; m < grade.length; m++){
            for(int n = 0; n < grade[m].length; n++){
                grade[m][n] = m * n;
            }
        }

        for(int[] linha : grade){
            System.out.println(Arrays.toString(linha));
        }

    }
}