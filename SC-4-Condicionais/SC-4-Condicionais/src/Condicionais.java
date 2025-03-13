public class Condicionais {
    public static void main(String[] args) {

        // 1 - Boolean
        boolean isTrue = true;
        boolean isFalse = false;

        System.out.println(isTrue);
        System.out.println(isFalse);

        // 2 - Operadores de comparação

        int x = 10;

        System.out.println(x == 10);

        System.out.println(x == 9);

        System.out.println(x != 5);

        System.out.println(x != 10);

        System.out.println(x > 10);

        System.out.println(x >= 10);

        System.out.println(x < 10);

        System.out.println(x <= 10);

        // 3 - Diferença entre comparação e atribuição
        int n = 5;
        int m = 10;

        //System.out.println(n = 12);

        System.out.println(n == 12);

        System.out.println(n);

        System.out.println(n == m);


        // 4 - Comparação de strings
        String str1 = "Java";

        String str2 = "Java";

        System.out.println(str1 == str2);

        System.out.println(str1 == "Java");

        System.out.println(str1.equals(str2));

        System.out.println(str2.equals("Java"));

        String str3 = "JAVA";

        System.out.println(str1.equalsIgnoreCase(str3));

        // 5 - Condição if
        int numero = 10;

        if(numero > 12){
            System.out.println("O numero é maior que 5");
        }

        String texto = "Teste";

        if(texto.equals("Teste")){
            System.out.println("O texto é: Teste");
        }

        // 6 - Condição else
        int q = 7;

        if(q > 10){
            System.out.println("Q é maior que 10!");
        } else {
            System.out.println("Q é menor que 10!");
        }

        String texto2 = "Teste2";

        if(texto.equals("Teste2")){
            System.out.println("O texto é: Teste2");
        } else {
            System.out.println("O texto não é: Teste2");
        }

        // 7 - Condição else if
        double nota = 5;

        if(nota == 10){
            System.out.println("Você tirou a nota maxima!");
        } else if(nota >= 9){
            System.out.println("Acima da média!");
        } else if(nota >= 7){
            System.out.println("Acima da média!");
        } else {
            System.out.println("Abaixo da média!");
        }

        int num = 5;

        if(num > 3 && num < 5){
            System.out.println("Alguma coisa");
        } else if(num == 5){
            System.out.println("Outra coisa aqui!");
        }

        // 8 - Operador lógico AND &&
        int idade = 18;
        boolean temCarteiraDeMotorista = true;

        System.out.println(idade >= 18 && temCarteiraDeMotorista);
        System.out.println(idade >= 18 && temCarteiraDeMotorista == true);

        boolean carteiraVencida = true;

        System.out.println(idade >= 18 && temCarteiraDeMotorista && carteiraVencida == false);

        int a = 10;
        int b = 20;

        if(a > 5 && b > 10){
            System.out.println("Deu certo!");
        }

        if(a > 55 && b > 10){
            System.out.println("Deu certo 2!");
        }

        // 9 - Operador lógico OR ||
        boolean estaChovendo = false;
        boolean temGuardaChuva = true;

        System.out.println(estaChovendo || temGuardaChuva);

        System.out.println(false || false);

        System.out.println(10 > 20 || 100 == idade);

        int idade2 = 16;
        boolean ehMembro = true;

        if (idade2 > 16 || ehMembro){
            System.out.println("Você pode entrar!");
        } else {
            System.out.println("Entrada negada!");
        }

        // 10 - Operador lógica NOT !
        System.out.println(!estaChovendo);

        System.out.println(estaChovendo || !temGuardaChuva);

        System.out.println(!(estaChovendo || !temGuardaChuva));

        // 11 - Switch
        int diaSemana = 1;

        switch (diaSemana){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Número invalido");
        }

        // 12 - Default
        int number = 10;

        switch (number){
            case 1:
                System.out.println("É 1");
                break;
            case 2:
                System.out.println("É 2");
                break;
            default:
                System.out.println("Número não encontrado");
        }

        // 13 - Switch sem break
        switch (1){
            case 1:
                System.out.println("Executou 1");
            case 2:
                System.out.println("Executou 2");
            case 3:
                System.out.println("Executou 3");
            default:
                System.out.println("Executou 4");
        }

        // 14 - Condicionais ternarias
        int numero3 = 10;

        String resultado = (numero3 % 2 == 0) ? "Par" : "Impar";

        System.out.println(resultado);

        // 15 - if e else aninhado
        int idade3 = 25;
        boolean temCarteira = true;

        if(idade >= 18){

            if(temCarteira){
                System.out.println("Pode dirigir!");
            } else {
                System.out.println("Precisa de habilitação!");
            }

        } else {
            System.out.println("Você não tem idade para dirigir!");
        }

        // 16 - Precedencia
        boolean w = true;
        boolean y = false;
        boolean z = true;

        boolean resultado2 = w && y || z;

        System.out.println(resultado2);

        boolean resultado3 = w || y && z;

        System.out.println(resultado3);

        boolean resultado4 = !(w || y) && z;

        System.out.println(resultado4);



    }
}