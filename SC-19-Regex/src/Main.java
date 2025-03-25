import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static boolean validarRegex(String texto, String regex){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        return matcher.matches();
    }
    public static void main(String[] args) {

        // 1 - Quantificadores
        // exp. reg, text, ver se no texto há exp. reg
        // *
        String regex = "a*"; // zero ou mais ocorrencias
        String texto = "b aaab aa ba";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Correspondencias para a*");
        while(matcher.find()){

            System.out.println("'" + matcher.group() + "'");
        }
        // +
        regex = "a+"; // uma ou mais ocorrencias
        texto = "b aaab aa ba";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspondencias para a+");
        while(matcher.find()){

            System.out.println("'" + matcher.group() + "'");
        }

        //{2, 4} entre 2 e 4
        regex = "a{2,4}"; // entre 2 a 4 a's
        texto = "b aaab aa ba";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspondencias para a{2, 4}");
        while(matcher.find()){

            System.out.println("'" + matcher.group() + "'");
        }

        // {2} apenas 2
        regex = "a{2}"; // entre 2 a 4 a's
        texto = "b aaab aa ba";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspondencias para a{2}");
        while(matcher.find()){

            System.out.println("'" + matcher.group() + "'");
        }

        // 2 - Âncoras e froteiras
        // ^ no início da ‘string’
        regex = "^c"; // entre 2 a 4 a's
        texto = "carro casa cadeira";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspondencias para ^c");
        while(matcher.find()){

            System.out.println("'" + matcher.group() + "'");
        }
        // $ no fim da cadeira
        regex = "cadeira$"; // entre 2 a 4 a's
        texto = "carro casa cadeira";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspondencias para ^c");
        while(matcher.find()){

            System.out.println("'" + matcher.group() + "'");
        }

        // fronteira \b -> apenas o que tá entre os \b
        regex = "\\bpalavra\\b"; // entre 2 a 4 a's
        texto = "palavra com palavra palavras";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspondencias para \\bpalavra\\b");
        while(matcher.find()){

            System.out.println("'" + matcher.group() + "'");
        }

        // fronteira \b -> string com fronteira com texto a ser procurado
        regex = "\\Bpalavra"; // entre 2 a 4 a's
        texto = "bpalavra compalavra apalavras";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspondencias para \\Bpalavra");
        while(matcher.find()){

            System.out.println("'" + matcher.group() + "'");
        }

        // 3 - Grupos de captura
        regex = "(\\d{2})-(\\d{2})-(\\d{4})"; // (DD)-(MM)-(AA)
        texto = "A data de hoje é 23-09-2024 e a data de ontem foi 22-09-2024";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspondencia de grupo");
        while(matcher.find()){

            System.out.println("Dia " + matcher.group(1));
            System.out.println("Mes " + matcher.group(2));
            System.out.println("Ano " + matcher.group(3));
            System.out.println("Todos os grupos: " + matcher.group(0)); // 0 - todos os grupos
        }

        // Backreference para substituição
        // $1 = grupo1, $2 = grupo 2...
        String textSubstituido = texto.replaceAll("(\\d{2})-(\\d{2})-(\\d{4})","$3/$2/$1");

        System.out.println("Texto após substituição: " + textSubstituido);

        // 4 - Avançando em patter e matcher
        regex = "\\d{3}";
        texto = "123ABC456";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspondencia parciais lookingAt");
        if(matcher.lookingAt()){
            System.out.println("Encontrando: " + matcher.group());
        }

        // Contando grupos com groupCount
        // Além de contar os grupos, a regex precisa estar no texto alvo
        regex = "(\\d{3})-(\\d{3})-(\\d{3})";
        texto = "123-456-712";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Contando os grupos");
        if(matcher.matches()){
            System.out.println("Total de grupos encontrados: " + matcher.groupCount());

            for(int i = 1; i <= matcher.groupCount(); i++){
                System.out.println("O grupo " + i + " tem o valor de " + matcher.group(i));
            }
        }

        // start e end para obter a posição das correspondencias das ‘strings’
        regex = "\\d{3}";
        texto = "O código é 123 e o segundo código é 456";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Posição das correspondencias");
        while(matcher.find()){
            // qnd tiver uma ocorrencia, o start é onde começa e o end onde termina
            System.out.println("Encontrado: " + matcher.group() + ", começa em " + matcher.start() + ", e termina em " + matcher.end());
        }

        // quote para tratar caracteres literais
        String literalRegex = Pattern.quote("1+1=2");
        texto = "A equação correta é 1+1=2 e é o resultado do exercicio";

        pattern = Pattern.compile(literalRegex);
        matcher = pattern.matcher(texto);

        System.out.println("Caracteres literais");
        if(matcher.find()){
            System.out.println("Encontrado: " + matcher.group());
            System.out.println(matcher.start() + " - " + matcher.end());
        }

        // 5 - Exp. Reg avançadas
        // lookahead positivo -> Do que a gente sinalizou atrás
        String regexlookAhead = "\\d+(?=\\$)";
        texto = "Preços: 100$ 200$ 300$ 400$";

        pattern = Pattern.compile(regexlookAhead);
        matcher = pattern.matcher(texto);

        System.out.println("Lookahead positivo");
        while(matcher.find()){
            System.out.println("Encontrou: " + matcher.group());
        }

        // Lookbehind positivo -> do que a gente definiu
        String regexlookBehind = "(?<=\\$)\\d+";
        texto = "Preços: 100$ 200$ $300 $400";

        pattern = Pattern.compile(regexlookBehind);
        matcher = pattern.matcher(texto);

        System.out.println("Lookbehind positivo");
        while(matcher.find()){
            System.out.println("Encontrou: " + matcher.group());
        }

        // lookahead negativo
        // que vai encontrar palavras que não tem (negativo) ponto final
        String regexLookAheadNegativo = "\\b\\w+\\b(?!\\.)";
        texto = "Esta é uma frase. E está é outra";

        pattern = Pattern.compile(regexLookAheadNegativo);
        matcher = pattern.matcher(texto);

        System.out.println("Lookahead negativo");
        while(matcher.find()){
            System.out.println("Encontrou: " + matcher.group());
        }

        // lookbehind negativo
        // Todas as palavras que não são precedidas por #
        String regexLookBehindNegativo = "(?<!#)\\b\\w+\\b";
        texto = "#java #javascript #php python";

        pattern = Pattern.compile(regexLookBehindNegativo);
        matcher = pattern.matcher(texto);

        System.out.println("Lookbehind negativo");
        while(matcher.find()){
            System.out.println("Encontrou: " + matcher.group());
        }

        // 6 - Validação data e horario
        String regexData = "^([0-2][0-9]|3[01])/(0[1-9]|1[0-2])/([0-9]{4})$";
        String[] datas = {"12/09/2010", "30/30/2000", "29/01/1999"};

        System.out.println("Validar data DD/MM/YYYY");
        for(String data : datas){
            if(validarRegex(data, regexData)){
                System.out.println("Data valida: " + data);
            } else {
                System.out.println("Data invalida: " + data);
            }
        }

        // Validação horario HH:MM:SS
        String regexHorario = "^([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]$";
        String[] horarios = {"12:60:12", "10:33:32", "99:01:01"};

        System.out.println("Validar horario HH:MM:SS");
        for(String hora : horarios){
            if(validarRegex(hora, regexHorario)){
                System.out.println("Hora valida: " + hora);
            } else {
                System.out.println("Hora invalida: " + hora);
            }
        }

        // 7 - Flags
        // CASE_SENSITIVE - ignora maiusculasa e minusculas
        regex = "java";
        texto = "Java é muito bom. É legal aprender JAVA e JaVa não é tão dificil.";

        pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        matcher = pattern.matcher(texto);

        while(matcher.find()){
            System.out.println("Encontrou: " + matcher.group());
        }

        // Flag MULTILINE (correspondencia por linha)
        regex = "^\\d+";
        texto = "123 esté é o meu texto \nQue pula linhas \n4321 termina aqui.";

        pattern = Pattern.compile(regex, Pattern.MULTILINE);
        matcher = pattern.matcher(texto);

        while(matcher.find()){
            System.out.println("Encontrou: " + matcher.group());
        }
    }
}