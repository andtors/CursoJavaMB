package exercicios;
abstract class Funcionario {

    private String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    abstract int calcularSalario(int salario);

    public String getNome() {
        return nome;
    }
}
