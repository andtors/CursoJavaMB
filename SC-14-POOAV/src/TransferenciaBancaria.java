public class TransferenciaBancaria implements Pagamento{

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + ", via transferencia bancaria.");
    }

    @Override
    public void exibirRecibo(double valor){
        System.out.println("O valor R$" + valor + ", foi transferido para o banco.");
    }
}
