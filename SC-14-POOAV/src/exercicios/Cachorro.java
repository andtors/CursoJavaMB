package exercicios;

public class Cachorro extends Animal{

    private String raca;

    public Cachorro(String nome, String som, String raca) {
        super(nome, som);
        this.raca = raca;
    }

    public void exibirDetalhes(){
        System.out.println("Cachorro da raça " + raca + ", de nome " + super.getNome() + ", emitindo o som: " + super.getSom());
    }


}
