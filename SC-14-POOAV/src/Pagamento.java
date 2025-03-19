public interface Pagamento {

    // metodo abstrato - é obrigatorio
    void processarPagamento(double valor);

    // metodo default - é herdada
    default void exibirRecibo(double valor){
        System.out.println("Recibo do pagamento, com o valor de R$" + valor);
    }
}
