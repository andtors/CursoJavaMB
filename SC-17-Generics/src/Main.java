import java.util.*;

public class Main {

    //2
    /*  Sintaxe de uma função generica
        O que significa cada T
        1 - Dizer que a função é generic
        2 - é da biblioteca de utils do Java, estamos comparando um generic com outro generic
        3 - O retorno será um generic
        4 e 5 - generics a serem recebidos como argumento
     */
    static <T extends Comparable<T>> T obterMaior(T valor1, T valor2){
        return(valor1.compareTo(valor2) > 0) ? valor1 : valor2;
    }

    static <T> T funcaoGeneric(T num){
        return  num;
    }

    static <T> void imprimirArray(T[] array){
        for (T elemento : array){
            System.out.printf(elemento + ", ");
        }
    }

    static void imprimirListObjGen(List<TesteGeneric> lista){
        for (Object elemento : lista) {
            System.out.println(elemento.toString());
        }
    }

    public  static void imprimirLista(List<?> lista){
        for(Object elemento : lista){
            System.out.println(elemento);
        }
    }

    public static double somarNumeros(List<? extends Number> lista){
        double soma = 0;
        for(Number numero : lista){
            soma += numero.doubleValue();
        }

        return soma;
    }

    public static void adicionarNumeros(List<? super Integer> lista){
        for(int i = 1; i <= 5; i++){
            lista.add(i);
        }
    }

    public static void main(String[] args) {

        // 1 - Classes GENERICS

        // Quando instanciamos o objeto, agora o T é alguma coisa
        Caixa<Integer> caixaInt = new Caixa<>();

        caixaInt.adicionar(100);

        // caixaInt.adicionar("100");

        System.out.println(caixaInt.obter());

        Caixa<String> caixaStr = new Caixa<>();

        caixaStr.adicionar("Teste");

        System.out.println(caixaStr.obter());

        // 2 - metodos genericos
        System.out.println("O maior valor entre 5 e 10: " + obterMaior(5, 10));

        System.out.println("O maior valor entre Java e Python: " + obterMaior("Java", "Python"));

        String[] letras = {"a", "b", "c", "e"};

        Integer[] numeros = {12, 44, 123, 999};

        Boolean[] bools = {true, false, false, true};

        imprimirArray(letras);

        imprimirArray(numeros);

        imprimirArray(bools);

        System.out.println();

        System.out.println(funcaoGeneric("Isto é um generic"));

        List<TesteGeneric> listaGeneric = new ArrayList<>();

        TesteGeneric primeiroGenerico = new TesteGeneric("Primeiro Generico");

        TesteGeneric segundoGenerico = new TesteGeneric("Segundo Generico");

        TesteGeneric terceiroGenerico = new TesteGeneric("Terceiro Generico");

        listaGeneric.add(primeiroGenerico);

        listaGeneric.add(segundoGenerico);

        listaGeneric.add(terceiroGenerico);

        imprimirListObjGen(listaGeneric);


        // 3 - Bounded types
        Comparador<Integer> comparadorInteiros = new Comparador<>();

        System.out.println("O maior numero entre 20 e 10: " + comparadorInteiros.obterMaior(20, 10));

        Comparador<Double> comparadorInteiros2 = new Comparador<>();

        System.out.println("O maior numero entre 1.95 e 4.55: " + comparadorInteiros2.obterMaior(1.95, 4.55));

        // Erro de compilação
        //Comparador<String> comparadorStrings = new Comparador<>();


        // 4 - Wildcard
        List<Integer> numeros2 = List.of(1, 2, 3);
        List<String> palavras2 = List.of("Teste", "Java", "Olá");
        List<Boolean> bool2 = List.of(true, false,true);

        // Aceita qualquer tipo de lista <?>
        imprimirLista(numeros2);
        imprimirLista(palavras2);
        imprimirLista(bool2);

        // Aceita apenas tipos numbers
        System.out.println(somarNumeros(numeros2));
        //somarNumeros(palavras2);

        // aceita apenas tipos numericos especificos
        List<Integer> numeros3 = new ArrayList<>();
        List<Number> numeros4 = new ArrayList<>();
        //List<Double> numeros5 = new ArrayList<>();

        // aceita apenas inteiros
        adicionarNumeros(numeros3);

        adicionarNumeros(numeros4);

        for(Integer numero : numeros3){
            System.out.println(numero);
        }

        for(Number numero : numeros4){
            System.out.println(numero);
        }

        // 5 - Generics com collections
        // List - Cria uma lista de determinado tipo
        List<Integer> listaInteiros = new ArrayList<>();

        listaInteiros.add(10);
        listaInteiros.add(20);
        listaInteiros.add(30);
        //listaInteiros.add(30.1);
        listaInteiros.add(40);

        for(Integer numero : listaInteiros){
            System.out.println(numero);
        }

        // Set - Não repete os dados
        Set<String> conjuntoDePalavras = new HashSet<>();

        conjuntoDePalavras.add("Java");
        conjuntoDePalavras.add("Java");
        conjuntoDePalavras.add("Generics");
        conjuntoDePalavras.add("Generics");
        conjuntoDePalavras.add("Generics");
        conjuntoDePalavras.add("Collections");

        for(String palavras : conjuntoDePalavras){
            System.out.println(palavras);
        }

        // Map -  Cria uma lista com key e data
        Map<String, Integer> mapaDeIdades = new HashMap<>();

        mapaDeIdades.put("Matheus", 33);
        mapaDeIdades.put("Maria", 21);
        mapaDeIdades.put("João", 18);

        for(Map.Entry<String, Integer>entrada : mapaDeIdades.entrySet()){
            System.out.println(entrada.getKey() + " tem " + " anos de idade.");
        }
    }
}