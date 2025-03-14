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

    }


}