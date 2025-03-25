import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TesteRegex {

    public static void main(String[] args) {

        int caractAtual = 0;
        String regex = "a*"; // Imprime quando há ou não uma ocorrencia do regex inputado
        String texto = "O sol se põe lentamente no horizonte, " +
                "tingindo o céu de tons dourados. " +
                "O vento suave toca a pele, enquanto o som distante das ondas traz uma sensação de paz e tranquilidade.";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Correspondencias letra a*");
        while(matcher.find()){

            caractAtual++;
            System.out.println("'" + matcher.group() + "' - " + caractAtual);
        }
        caractAtual = 0;
        // --------------------------------------------------------------------------------------------------------
        regex = "a+"; // Imprime apenas quando há uma ocorrencia do regex inputado
        texto = "O sol se põe lentamente no horizonte, " +
                "tingindo o céu de tons dourados. " +
                "O vento suave toca a pele, enquanto o som distante das ondas traz uma sensação de paz e tranquilidade.";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspondencias para a letra a+");
        while(matcher.find()){

            caractAtual++;
            System.out.println("'" + matcher.group() + "' - " + caractAtual);
        }
        caractAtual = 0;
        // --------------------------------------------------------------------------------------------------------
        regex = "a{3,5}"; // Imprime apenas quando há uma ocorrencia do regex inputado exatamente igual
        texto = "O sol se põe lentamente no horizonte, a" +
                "tingindo o céu de tons dourados. aaa"  +
                "O vento suave toca a pele, enquanto o som distante das ondas traz uma sensação de paz e tranquilidade.aaaaa";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspondencias para frase a{3,5}");
        while(matcher.find()){

            caractAtual++;
            System.out.println("'" + matcher.group() + "' - " + caractAtual);
        }
        caractAtual = 0;
        // --------------------------------------------------------------------------------------------------------
        regex = "a{5}"; // Imprime apenas quando há uma ocorrencia do regex
        texto = "O sol se põe lentamente no horizonte, a" +
                "tingindo o céu de tons dourados. aaa"  +
                "O vento suave toca a pele, enquanto o som distante das ondas traz uma sensação de paz e tranquilidade.aaaaa";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspondencias para frase a{5}");
        while(matcher.find()){

            caractAtual++;
            System.out.println("'" + matcher.group() + "' - " + caractAtual);
        }
        caractAtual = 0;
        // --------------------------------------------------------------------------------------------------------
        regex = "^A"; // Imprime apenas quando há uma ocorrencia do regex que começa com ele
        texto = "Absoluto o sol se põe lentamente no horizonte agora" +
                "tingindo o céu de tons dourados adiante"  +
                "o vento suave toca a pele, enquanto o som distante das ondas traz uma sensação de paz e tranquilidade acachapante.";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspondencias para frase ^a");
        while(matcher.find()){

            caractAtual++;
            System.out.println("'" + matcher.group() + "' - " + caractAtual);
        }
        caractAtual = 0;
        // --------------------------------------------------------------------------------------------------------
        regex = "o.$"; // Imprime apenas quando há uma ocorrencia do regex que termina com ele
        texto = "Calado o sol se põe lentamente no horizonte agora" +
                "tingindo o céu de tons dourados adiante"  +
                "o vento suave toca a pele, enquanto o som distante das ondas traz uma sensação de paz e tranquilidade glorioso.";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspondencias para frase o.$");
        while(matcher.find()){

            caractAtual++;
            System.out.println("'" + matcher.group() + "' - " + caractAtual);
        }
        caractAtual = 0;
        // --------------------------------------------------------------------------------------------------------
        regex = "\\bvento\\b"; // Imprime apenas quando há uma ocorrencia do regex que está entre as fronteiras
        texto = "Calado o sol se põe lentamente no horizonte agora" +
                "tingindo o céu de tons dourados adiante"  +
                "o vento suave toca a pele, enquanto o som distante das ondas traz uma sensação de paz e vento tranquilo.";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspondencias para frase \\bvento");
        while(matcher.find()){

            caractAtual++;
            System.out.println("'" + matcher.group() + "' - " + caractAtual);
        }
        caractAtual = 0;

        // --------------------------------------------------------------------------------------------------------
        regex = "\\Btingindo"; // String com fronteira com o texto a ser procurado
        texto = "Calado o sol se põe lentamente no horizonte agora" +
                "tingindo o céu de tons dourados adiante"  +
                "o vento suave toca a pele, enquanto o som distante das ondas traz uma sensação de paz e vento tranquilo.";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspondencias para frase \\Ba");
        while(matcher.find()){

            caractAtual++;
            System.out.println("'" + matcher.group() + "' - " + caractAtual);
        }
        caractAtual = 0;




    }
}
