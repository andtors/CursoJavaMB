public class ContaBancaria {

    private String titular;
    private double saldo;

    public void setTitular(String titular){


        if(titular != null && !titular.isEmpty()){
            this.titular = titular;
        } else {
            System.out.println("Nome do titular invalido!");
        }
    }

    public void setSaldo(double saldo){
        if(saldo >= 0){
            this.saldo = saldo;
        } else {
            System.out.println("O valor precisa ser positivo!");
        }
    }

    public void getTitular(){
        System.out.println(this.titular);
    }

    public String getSaldo(){
        return "R$ " + this.saldo;
    }

    @Override
    public String toString() {
        return "Conta bancaria de " +
                "titularidade do/da " + titular +
                ", e saldo de " + saldo +
                ' ';
    }
}
