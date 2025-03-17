package exercicios;

public class Celular {

    private String marca;
    private String modelo;
    private int bateria = 100;
    private boolean status = false;

    public Celular(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        System.out.println("Celular marca: " + this.marca + ", modelo: " + this.modelo + " criado, celular está deligado.");
    }

    public void ligar(){
      if(status){
          System.out.println("Celular do modelo " + this.modelo + " já ligado.");
      } else{
          this.status = true;
          System.out.println("Celular do modelo " + this.modelo + " ligado, bateria em: " + this.bateria + "%");
      }
    }

    public void desligar(){
        if(!status){
            System.out.println("Celular do modelo " + this.modelo + " já desligado.");
        } else {
            this.status = false;
            System.out.println("Celular do modelo " + this.modelo + " desligando...");
        }
    }


    public void ligacao(){
        int custoLigacao = 40;
        if(custoLigacao < this.bateria  && status){
            this.bateria -= 40;
            System.out.println("Ligação realizada do celular modelo " + this.modelo + ", bateria em: " + bateria + "%");
        } else if(!status){
            System.out.println("Celular do modelo: " + this.modelo + " está desligado.");
        } else {
            System.out.println("Celular do celular modelo " + this.modelo + " sem bateria.");
            this.desligar();
        }
    }
}
