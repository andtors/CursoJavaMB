public class Main {
    public static void main(String[] args) {


        // 1 - For
        for(int i = 1; i <= 5; i++){
            System.out.println("For contador: " + i);
        }

        String palavra = "Java";

        for(int i = 0; i < palavra.length();i++){
            System.out.println(palavra.charAt(i));
        }

        for(int i = 5; i > 0; i--){
            System.out.println("For contador descrecente: " + i);
        }

        // 2 - While

        int whileI = 0;
       while(whileI <= 5){
           System.out.println("While contador: " + whileI);
           whileI++;
       }

       int valor = 0;
       int contador = 0;
       while(valor != 7){


           valor = (int)(Math.random() * 10);
           contador++;
           System.out.println("Valor aleatorio: " + valor + " demorou " + contador + " vezes até chegar no número 7");

       }

       // 3 - Loop infinito

        int inifinitoCount = 0;
        /*
        while(true){
            System.out.println(inifinitoCount);
            inifinitoCount++;
        }

        for(int i = 0; i <= 5; i--){
            System.out.println(inifinitoCount);
            inifinitoCount++;
        }
        */
        // 4 - Do while
        int j = 10;

        do {
            System.out.println("DoWhile - O valor de j é:" + j);

            j--;
        } while(j > 0);

        int numDoWhile = 0;
        int contadorDoWhile = 0;

        do {
            numDoWhile = (int)(Math.random() * 10);
            contadorDoWhile++;
            System.out.println("Valor aleatorio: " + numDoWhile + " demorou " + contadorDoWhile + " vezes até chegar no número 1");
        } while(numDoWhile != 1);

        // 5 - Break em loops
        for(int i = 0; i <= 10; i++){

            System.out.println("O valor de i é: " + i);

            if(i == 5){
                System.out.println("Parando loop!");
                break;
            }
        }

        // 6 - Continue
        for(int i = 10; i > 0; i--){
            if(i % 2 == 0){
                System.out.println("Par");
                continue;
            }

            System.out.println("Contador: " + i);
        }

        // 7 - Nested loops
        for(int i = 1; i  <= 3; i++){
            System.out.println("Externo");

            for(int n = 1; n <= 3; n++){

                System.out.println(i + " x " + n + " = " + (i * n));
            }
        }

        for(int  i = 1; i <= 10; i++){
            for(int n = 1; n <= i; n++ ){
                System.out.print("*");
            }
            System.out.println();
        }

        // 8 - Loops com rotulos

        //rotulos externos e internos
        externo:
        for(int i = 0; i < 3; i++){
            for(int g = 0; g < 3; g++){
                if(i == 1 && g == 1){
                    break externo;
                }
                System.out.println("i" + i + ", g " + g);
            }

        }

        for(int i = 0; i < 5; i++){
            System.out.println("Externo: " + i);
            interno:
            for(int g = 0; g < 3; g++){
                    if(g == 2){
                        System.out.println("Parou interno");
                        break interno;

                    }
                    System.out.println("i" + i + ", g " + g);
            }
        }

        // 9 - off by one
        for(int i = 0; i < 5; i++){
            System.out.println("I: " + i);
        }
    }
}