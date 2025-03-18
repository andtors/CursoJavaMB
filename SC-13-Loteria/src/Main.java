import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Bilhete> bilhetes = new ArrayList<>();


        while(true){
            System.out.println("Digite 6 números para bilhete (entre 1 e 60)");
            int[] numerosEscolhidos = new int[6];

            for(int i = 0; i < numerosEscolhidos.length;i++){
                System.out.println("Digite o número " + (i + 1) + ": ");
                numerosEscolhidos[i] = sc.nextInt();
            }

            Bilhete bilhete = new Bilhete(numerosEscolhidos);

            bilhetes.add(bilhete);

            System.out.println("Desejha registrar outro bilhete? (s/n)");

            String resposta = sc.next();
            if(resposta.equals("n")){
                break;
            }

        }

        System.out.println("Realizando sorteio...");

        for(Bilhete bilhete : bilhetes){
            bilhete.realizarSorteio();
            bilhete.exibirResultado();
        }

        sc.close();
    }
}