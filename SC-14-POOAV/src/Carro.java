public class Carro {

    private String marca;
    private String modelo;
    public Motor motor;

    public Carro(String marca, String modelo, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        // Object composition
        this.motor = motor;
    }

    public void exibirInfo(){
        System.out.println("Carro marca: " + marca + ", modelo: " + modelo);
        motor.exibirInfo();
    }
}

