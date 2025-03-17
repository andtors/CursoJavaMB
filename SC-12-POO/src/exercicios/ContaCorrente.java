package exercicios;

public class ContaCorrente {

    private String titular;
    private double saldo;
    private double limiteSaque;

    public ContaCorrente(String titular, double saldo, double limiteSaque){

        this.titular = titular;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public String exibirSaldo(){
        return "Saldo atual é de: R$" + saldo;
    }

    public String depositar(double deposito){
        this.saldo += deposito;
        return "Valor de " + deposito + " depositado, saldo atual: " + this.exibirSaldo();
    }

    public String saque(double saque){
        if(saque > this.limiteSaque){
            return "Erro, o saque é maior que o limite saque estipulado na conta.";
        }

        saldo -= saque;
        return "Valor de " + saque + " sacado, saldo atual: " + this.exibirSaldo();
    }


}
