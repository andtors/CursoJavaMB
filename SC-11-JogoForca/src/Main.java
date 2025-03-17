import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String palavraSecreta = "JAVA";

        char[] palavraOculta = new char[palavraSecreta.length()];

        for(int i = 0; i < palavraSecreta.length(); i++){
            palavraOculta[i] = '_';
        }

        int tentativas = 6;
        boolean venceu = false;

        while(tentativas >  0){
            System.out.println("Palavra: " + String.valueOf(palavraOculta));
            System.out.println("Tentativas restantes: " + tentativas);
            System.out.printf("Digite uma letra: ");

            char letra = scanner.next().toUpperCase().charAt(0);

            boolean acertou = false;

            for(int i = 0; i < palavraSecreta.length(); i++){
                if(palavraSecreta.charAt(i) == letra){
                    palavraOculta[i] = letra;
                    acertou = true;
                }
            }

            if(!acertou){
                tentativas--;
                System.out.println("Letra incorreta!");

            } else {
                System.out.println("Letra correta!");
            }

            if(String.valueOf(palavraOculta).equals(palavraSecreta)){
                venceu = true;
                break;
            }
        }

        if(venceu){
            System.out.println("Você venceu em " + tentativas + " tentativas!");
            System.out.println("A palavra era: " + palavraSecreta);
        } else {
            System.out.println("Você perdeu! a palavra era: " + palavraSecreta);
        }

        scanner.close();
    }
}