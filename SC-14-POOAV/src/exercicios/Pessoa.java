package exercicios;

public class Pessoa {

    private String nome;
    private int idade;
    private Endereco endereco;

    public Pessoa(String nome, int idade, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public void exibirInformacoes(){
        System.out.println(nome + ", de " + idade + " anos, residente na rua " + endereco.getRua() + ", número: " + endereco.getNumero() + ", cidade " + endereco.getCidade());
    }
}
