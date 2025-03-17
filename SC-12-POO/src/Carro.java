public class Carro {

    // 1 - Criando a classe
    String marca;
    String modelo;
    int ano;

    double velocidadeAtual = 0;
    boolean motorLigado = false;

    public Carro() {

    }

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    void acelerar(){
        System.out.println("Estamos acelerando o carro!");
    }

    void exibirInfo(){
        System.out.println("Marca: " + marca + ", modelo: "  + modelo + ", ano: " + ano);
    }

    void ligarMotor(){
        if(!motorLigado){
            motorLigado = true;
            System.out.println("Ligando motor...");
        } else {
            System.out.println("Motor já ligado!");
        }
    }

    void aumentarVelocidade(double incremento){
        if(motorLigado){
            velocidadeAtual += incremento;

            System.out.println("A velocidad atual é: " + velocidadeAtual);
        } else {
            System.out.println("Primeiro precisa ligar o motor...");
        }


    }


}
