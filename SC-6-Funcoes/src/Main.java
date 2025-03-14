import java.util.Arrays;
import java.util.List;

public class Main {

    // 1 - Criando primeira função
    public static void saudacao(){
        System.out.println("Olá está minha primeira função!");
    }

    // 2 - Argumentos em função
    public static void soma(int a, int b){
        int res = a + b;
        System.out.println("O resultado da soma é: " + res);
    }

    public static void saudar(String nome){
        System.out.println("Olá, " + nome + ", tudo bem?");
    }

    // 3 - Função com return
    public static int dobrar(int n){
        return n + 2;
    }

    // 4 - Encapsulando retorno em variavel
    public static String verificarPar(int n){
        if(n % 2 == 0){
            return "O número " + n +  " é par";
        } else {
            return "O número " + n +  " é impar";
        }
    }

    public static int soma2(int a, int b){
        return a + b;
    }

    // 5 - Funções com condicionais
    public static String verificarAcesso(int idade, boolean temCarteira, boolean temHistoricoNegativo){
        if(idade >= 18 && temCarteira && !temHistoricoNegativo){
            return "Acesso permitido: todos os criterios atendidos!";
        } else if (idade >= 18 && temCarteira && temHistoricoNegativo){
            return "Acesso negado: Historico negativo detectado";
        } else {
            return "Acesso negado: Criterios não atendidos";
        }
    }

    // 6 - Função com switch
    public static String obterDiaDaSemana(int dia){
        switch (dia){
            case 1:
                return "Segunda-feira";
            case 2:
                return "Terça-feira";
            case 3:
                return "Quarta-feira";
            case 4:
                return "Quinta-feira";
            case 5:
                return "Sexta-feira";
            case 6:
                return "Sábado";  // Corrigido o acento
            case 7:
                return "Domingo";
            default:
                return "Dia invalido";
        }
    }

    // 7 - Exit em função
    public static void verificarAutenticacao(String usuario, String senha){
        if(!usuario.equals("admin") && !senha.equals("SenhaSegura")){
            System.out.println("Autenticação falhou!");
            System.exit(1);
        }

        System.out.println("Autenticação bem sucedida!");
    }

    // 8 - Documentação função
    /*
    *
    * Calcula a media de três numeros inteiros
    *
    * @param num1
    * @param num2
    * @param num3'
    * @return
    *
    * */
    public static double calcularMedia(int num1, int num2, int num3){
        return (num1 + num2 + num3) / 3;
    }

    // 9 - Escopo

    // Escopo global
    static int globalVar = 20;

    public static int escopoLocal(int e){
        System.out.println(globalVar);
        System.out.println(e);

        int testeFuncao = 1;

        return testeFuncao;
    }

    // 12 - Função recursiva
    public static int  somaRecursiva(int n){
        if(n == 1){
            return 1;
        } else {
            return n + somaRecursiva(n - 1);
        }
    }

    // 13 - Sobrecarga de funções
    public static int soma3 (int a, int b){
        return a + b;
    }

    public static int soma3 (int a, int b, int c){
        return a + b + c;
    }

    public static double soma3 (double a, double b){
        return a + b;
    }




    public static void main(String[] args) {

        // 1
        saudacao();

        // 2
        soma(2, 4);
        soma(8, 12);

        saudar("André");

        // 3
        dobrar(4);

        int numero = 10;

        int numeroDobrado = dobrar(numero);

        System.out.println("O numero dobrado é: " + numeroDobrado);

        System.out.println(dobrar(12));

        // 4
        String r1 = verificarPar(numero);

        String r2 = verificarPar(3);

        System.out.println(r1);

        System.out.println(r2);

        int x = dobrar(soma2(2, 4));

        System.out.println(x);

        // 5
        String s1 = verificarAcesso(19, true, true);

        System.out.println(s1);

        String s2 = verificarAcesso(23, false, true);

        System.out.println(s2);

        // 6
        System.out.println(obterDiaDaSemana(2));

        // 7
        verificarAutenticacao("admin", "SenhaSegura");

        // 8
        System.out.println(calcularMedia(5,6,7));

        // 9 - Escopos

        // escopo local
        int localVar = 10;

        if(true) {
            System.out.println(localVar);
        }

        System.out.println(globalVar);

        escopoLocal(localVar);

        int testeFuncao = escopoLocal(localVar);

        System.out.println(testeFuncao);

        // 10 - Funções built-in
        // Strings
        String frase = "Java é muito bom!";

        System.out.println(frase.length());
        System.out.println(frase.substring(0, 4));
        System.out.println(frase.toUpperCase());
        System.out.println(frase.replace("a", "e"));

        String fraseModificada = frase.toUpperCase();
        System.out.println(fraseModificada);
        System.out.println(fraseModificada.toLowerCase());

        // 11 - Funções de Math
        System.out.println(Math.sqrt(26));
        System.out.println(Math.sqrt(9));

        System.out.println(Math.pow(2,3));

        System.out.println(Math.abs(-10));
        System.out.println(Math.abs(10));

        System.out.println(Math.max(100,10));

        double raizQuadrada = Math.sqrt(99);

        System.out.println("A raiz quadrada de 99 é: " + raizQuadrada);

        // 12
        int soma = somaRecursiva(6);

        System.out.println(soma);

        // 13
        System.out.println(soma3(2,4));
        System.out.println(soma3(2,4, 6));
        System.out.println(soma3(2.2,4.4));

        // 14 - Função anonimas
        Runnable tarefa = () -> System.out.println("Minha função anonima!");

        tarefa.run();

        List<String> nomes = Arrays.asList("Ana", "Pedro", "Paulo");

        nomes.forEach(nome -> System.out.println(nome));
    }
}