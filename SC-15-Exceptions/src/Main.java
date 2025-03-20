import java.io.*;
import java.util.concurrent.ExecutionException;

public class Main {

    // 3 - Throw
    public static void validarIdade(int idade){
        if(idade < 18){
            throw new IllegalArgumentException("Idade deve ser maior que 18");
        }

        System.out.println("Idade valida: " + idade);
    }

    // 6 - throws em metodos
    public static void processarArquivo(String caminho) throws FileNotFoundException, IOException {
        if(caminho == null || caminho.isEmpty()){
            throw new IOException("Caminho invalido!");
        }

        File arquivo = new File(caminho);

        if(!arquivo.exists()){
            throw new FileNotFoundException("Arquivo não encontrado!");
        }

        System.out.println("Arquivo encontrado com sucesso!");
    }

    // 7 - Encadeamento de erros
    public static void abrirArquivos(String caminho){
        try {

            if(caminho == null){
                throw new NullPointerException();
            }

            throw new FileNotFoundException("Arquivo não encontrado!");

        }catch (FileNotFoundException e){
            NullPointerException npe = new NullPointerException("Erro ao processar o arquivo!");

            npe.initCause(e);

            throw npe;
        }
    }

    // 8 - Relançando exceções

    public static void processarDados(String dados) throws Exception{
        try {
            if(dados == null){
                throw new NullPointerException("Os dados são nulos!");
            }
        } catch (Exception e) {
            System.out.println("Tratamento, criação de log, etc...");

            throw e;
        }
    }

    public static void main(String[] args) {

        // 1 - try catch
        try {
            int a = 0;
            int b = 10;

            int resultado = b /a;

        } catch (ArithmeticException e) {
            System.out.println("Divisão por zero não é possivel");
        }

        try {
            int[] numeros = {1, 2, 3};

            System.out.println(numeros[3]);
        } catch (Exception e) {
            System.out.println("Erro generico");
            System.out.println("Msg: " + e.getMessage());
        }

        // 2 - Finally
        try {
            int[] numeros = {1, 2, 3};

            System.out.println(numeros[3]);

        }catch (ArrayIndexOutOfBoundsException error){
            System.out.println("Erro generico - finally");
            System.out.println("Msg: " + error.getMessage());
        } finally {
            System.out.println("Executou o finally");
        }

        try {
            int[] numeros = {1, 2, 3,4 };

            System.out.println("Acessando indice existente: " + numeros[3]);

        }catch (ArrayIndexOutOfBoundsException error){
            System.out.println("Erro generico - finally");
            System.out.println("Msg: " + error.getMessage());
        } finally {
            System.out.println("Executou o finally");
        }

        try {
            int[] numeros = {1, 2, 3,4 };

            System.out.println("Acessando indice existente sem catch: " + numeros[3]);

        } finally {
            System.out.println("Executou o finally");
        }

        // 3
        try {
            validarIdade(20);
            validarIdade(10);
        }catch (Exception e){
            System.out.println("Erro: " + e.getMessage());
        }

        // 4 - Exceções customizadas
        Banco minhaConta = new Banco(5000);

        try{
            minhaConta.sacar(1000.00);
            minhaConta.sacar(6000.00);
        }catch (SaldoInsuficienteException e){
            System.out.println("Erro: " + e.getMessage());
        }

        // 5 - Verificas e não verificadas

        // verificada
        try {
            BufferedReader reader = new BufferedReader(new FileReader("arquivo.txt"));
            String linha = reader.readLine();
            System.out.println(linha);
        }catch (Exception e){
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        // não verificadas
        String texto = null;

        // System.out.println(texto.length());

        // 6 - Throws em metodos
        try {
            processarArquivo("");
        }catch (FileNotFoundException e){
            System.out.println("Erro: " + e.getMessage());
        }catch (IOException e){
            System.out.println("Erro: " + e.getMessage());
        }

        // 7 - Encadeamento de exceptions
        try {
            abrirArquivos(null);
        }catch (Exception e){
            System.out.println("Erro: " + e.getMessage());

            System.out.println("Causa original: " + e.getCause());
        }

        // 8 - Relançando exceptions

        try {
            processarDados(null);
        } catch (Exception e){
            System.out.println("Outra coisa...");
            System.out.println("MSG: " + e.getMessage());
            System.out.println("Pilha de execução: " + e.getStackTrace());
        }
    }
}