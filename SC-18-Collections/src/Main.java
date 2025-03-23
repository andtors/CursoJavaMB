import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // 1 - Collections em list
        List<String> listaDeNomes = new ArrayList<>();

        // adicionar
        listaDeNomes.add("Maria");
        listaDeNomes.add("João");
        listaDeNomes.add("Pedro");

        // resgatar
        System.out.println("Primeiro nome: " + listaDeNomes.get(0));

        // alterar
        listaDeNomes.set(1, "Ana");

        System.out.println("Segundo nome: " + listaDeNomes.get(1));

        // Remover elemento
        listaDeNomes.remove(2);

        // Erro de execução, out of bounds
        // System.out.println("Segundo nome: " + listaDeNomes.get(2));

        listaDeNomes.add("Teste");
        listaDeNomes.add("Outro teste");

        // Procura por valor de item
        System.out.println(listaDeNomes.contains("Teste"));

        // 2 - Linked list
        List<Integer> numeros = new LinkedList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);

        System.out.println(numeros.get(3));

        numeros.remove(0);

        // Ver valores facilmente
        System.out.println(numeros.toString());

        numeros.set(0, 23);

        System.out.println(numeros.get(0));

        // As collections tem os mesmos metodos, qualquer uma
        // mas nem todas, podem aplica-los

        /*
        *   ArrayList vs LinkedList
        *
        *   Para leitura/resgate de dados ArrayList é melhor
        *   Para escrita/remoção de dados LinkedList é melhor
        * */

        /*
        *   3 - Set
        *
        *   Não repetem os dados armazenados e não possuem ordem definida
        *   Ideal para armazenar dados unicos quando a ordem não importa
        *
        *   HashSet: Não garante a ordem dos elementos, mas é eficiente
        *   para operações como adicionar e verificar elementos
        *
        *   LinkedHashSet: Mantém a ordem dos elementos
        *
        *   TreeSet: Mantém os elemenentos ordenados conforme a ordem natural ou um Comparator
        *
        *   Quando usar:
        *   Set quando não quiser duplicatas e a ordem não for prioritaria
        *   List quando a ordem for importante e duplicatas permitidas
        * */

        //  HashSet
        Set<String> conjunto = new HashSet<>();

        conjunto.add("Java");
        conjunto.add("Python");
        conjunto.add("PHP");
        conjunto.add("PHP");

        // Nota-se que como a ordem não é importante, quando impresso ele não aparece em ordem conforme adicionados
        System.out.println(conjunto);

        System.out.println(conjunto.contains("PHP"));

        // LinkedHashSet
        Set<Integer> numeros2 = new LinkedHashSet<>();

        numeros2.add(5);
        numeros2.add(10);
        numeros2.add(1);
        numeros2.add(2);
        numeros2.add(55);

        // Manteve a ordem
        System.out.println(numeros2);

        // TreeSet
        Set<String> nomes = new TreeSet<>();

        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Roberto");
        nomes.add("Alan");

        // Reoordena os elementos
        System.out.println(nomes);

        // Set não tem get
        // System.out.println(nomes.get(0));

       /*
       *    4 - Map
       *
       *    Coleção que armazena pares chave-valor onde cada chave é unica
       *    Ideal para dicionários ou catalogos
       *
       *    HashMap: não mantem, a ordem de inserção, eficiente para busca e inserção
       *    LikedHashMap: Mantém a ordem das inserções das chaves
       *    TreeMap: Mantém as chaves ordenadas conforme a ordem natural ou um comparator
       * */

        // HashMap - Chave - valor
        Map<String, Integer> idadeMap = new HashMap<>();

        // Adiciona com put
        idadeMap.put("João", 30);
        idadeMap.put("Matheus", 33);
        idadeMap.put("Alan", 18);

        System.out.println(idadeMap);

        // Map com a chave já existente atualiza o valor
        idadeMap.put("Alan", 24);

        System.out.println(idadeMap);

        System.out.println("Idade de Alan: " + idadeMap.get("Alan"));

        idadeMap.remove("Matheus");

        System.out.println(idadeMap);

        // Procura a chave ou valor
        System.out.println(idadeMap.containsKey("Alan"));
        System.out.println(idadeMap.containsKey(99));

        // Exibe valores
        System.out.println(idadeMap.entrySet());

        // LinkedHashMap
        Map<String, String> capitalMap = new LinkedHashMap<>();

        capitalMap.put("Brasil", "Brasilia");
        capitalMap.put("Argentina", "Buenos Aires");
        capitalMap.put("França", "Paris");

        System.out.println(capitalMap.entrySet());

        System.out.println(capitalMap.containsKey("Brasil"));

        // TreeMap - reordena os itens
        Map<String, Double> produtoPrecoMap = new TreeMap<>();

        produtoPrecoMap.put("Maça", 3.50);
        produtoPrecoMap.put("Pera", 4.50);
        produtoPrecoMap.put("Leite", 5.50);
        produtoPrecoMap.put("Avelã", 11.0);

        System.out.println(produtoPrecoMap);

        System.out.println(produtoPrecoMap.containsValue(11.0));

        // 5 - Iterando

        // for-each
        for(String nome : nomes){
            System.out.println(nome);
        }

        // Iterator
        // Estamos modificando a original(nomes) e não a instanciada
        Iterator<String> nomesIterator = nomes.iterator();

        // remover um elemento
        while(nomesIterator.hasNext()){
            String nome = nomesIterator.next();

            if(nome.equals("João")){
                nomesIterator.remove();
            }
        }

        System.out.println(nomes);

        // ListIterator
        // Estamos modificando a original(nomes) e não a instanciada
        ListIterator<String> listIteratorNomes = listaDeNomes.listIterator();

        while(listIteratorNomes.hasNext()){
            System.out.println("Nome: " + listIteratorNomes.next());
        }

        while(listIteratorNomes.hasPrevious()){
            System.out.println("Nome: " + listIteratorNomes.previous());
        }

        // 6 - Collections imutaveis

        // Criando lista imutavel
        List<String> listaMutavel = new ArrayList<>();

        listaMutavel.add("Teste");
        listaMutavel.add("Testando");

        // Cria a partir de uma lista já existente
        List<String> listaImutavel = Collections.unmodifiableList(listaMutavel);

        System.out.println(listaImutavel);

        // não podemos adicionar novos elementos
        //listaImutavel.add("Teste 2");

        // Criamos a lista e colocamos o dado na sua criação
        List<String> listaImutavel2 = List.of("Item 1", "Item 2", "Item 3");

        // listaImutavel.add("Item 4");

        System.out.println(listaImutavel2);

        Set<Integer> listaImutavelSet = Set.of(1, 2, 3);

        //listaImutavelSet.add(4);

        System.out.println(listaImutavelSet);

        // Stream em collections

        // 7 - filter não modifica a coleção original
        /*
        *   {{Lista}}.stream()
        *            .filter({{l}} -> {{Lógica}})
        *            .collect(Collections.toList());
        *
        * */

        List<Integer> numerosFiltrados = numeros.stream()
                                            .filter(numero -> numero > 3)
                                            .collect(Collectors.toList());

        System.out.println(numeros);

        System.out.println(numerosFiltrados);

        // busca

        // for
        int numeroParaEncontrar = 4;

        boolean encontrou = false;

        for(Integer numero : numeros){
            if(numero == numeroParaEncontrar){
                encontrou = true;
            }
        }

        System.out.println(numeros);

        System.out.println("Encontrou? " + encontrou);

        // contains
        String nomeBuscado = "Maria";
        boolean encontrou2 = nomes.contains(nomeBuscado);

        System.out.println("Encontrou nome? " + encontrou2);

        // findAny

        Optional<Integer> qualquerNumero = numeros.stream().findAny();

        System.out.println(qualquerNumero);

        Optional<Integer> primeiroNumero = numeros.stream().findFirst();

        System.out.println(primeiroNumero);

        Optional<Integer> primeiroPar = numeros.stream().filter(num -> num % 2 == 0).findFirst();

        System.out.println(primeiroPar);

        // 8 - Map

        // Modificam a collection
        List<Integer> quadrados = numeros.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println(numeros);
        System.out.println(quadrados);

        List<String> nomeMaiusculos = nomes.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(nomeMaiusculos);

        // 9 - Modificação

        //add
        numeros.add(50);

        System.out.println(numeros);

        // remove
        numeros.remove(Integer.valueOf(3));

        System.out.println(numeros);

        // alterar todos os elementos
        numeros.replaceAll(numero -> numero * 3);

        System.out.println(numeros);

        numeros.add(201);
        numeros.add(205);
        numeros.add(208);

        System.out.println(numeros);

        // remove baseado em condição
        numeros.removeIf(numero -> numero > 200);

        System.out.println(numeros);

        // 10 - Reduce
        // 0 - número inicial
        int soma = numeros.stream()
                .reduce(0, (acumulador, numero) -> acumulador + numero);

        System.out.println("A soma de todos os numeros: " + soma);

        String frase = nomes.stream()
                .reduce("", (concatenador, nome) -> concatenador + " " + nome);

        System.out.println(frase);

        // 11 - Ordenação com comparator
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Pedro", 33));
        pessoas.add(new Pessoa("Ana", 25));
        pessoas.add(new Pessoa("João", 67));
        pessoas.add(new Pessoa("Maria", 18));
        pessoas.add(new Pessoa("Rodrigo", 40));
        pessoas.add(new Pessoa("Ana", 19));

        // Ordenar pelo nome
        pessoas.sort(Comparator.comparing(Pessoa::getNome));

        for(Pessoa pessoa : pessoas){
            System.out.println(pessoa);
        }

        // Ordenar pelo nome e idade
        pessoas.sort(Comparator.comparing(Pessoa::getNome)
                .thenComparing(Pessoa::getIdade));

        for(Pessoa pessoa : pessoas){
            System.out.println(pessoa);
        }

        // 12 - Uso avançado de streams

        // flatMap - Achatar listas
        List<List<String>> listaDeListas = Arrays.asList(
                Arrays.asList("Maça", "Morango"),
                Arrays.asList("Banana", "Mamão"),
                Arrays.asList("Uva", "Melão")
        );

        List<String> listaUnica = listaDeListas.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(listaUnica);

        // pipeline
        List<Integer> resultado = numeros.stream()
                        .filter(n -> n % 2 == 0) // filtro de numeros pares
                        .map(n ->n * 5) // multiplicação
                        .sorted() // ordenacao
                        .collect(Collectors.toList());

        System.out.println(numeros);
        System.out.println(resultado);
    }
}