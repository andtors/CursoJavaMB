package exercicios;

public class Aluno {

    private String nome;
    private int matricula;
    private int notaFinal;

    public Aluno(String nome, int matricula, int notaFinal){

        if(!nome.isEmpty() && notaFinal >= 0 && notaFinal <= 100){
            this.nome = nome;
            this.matricula = matricula;
            this.notaFinal = notaFinal;
        } else {
            System.out.println("Erro: não deixe o nome vazio e a nota deve estar entre 0 - 100");
        }
    }

    @Override
    public String toString() {
        return "Aluno " +
                "nome: " + nome +
                ", matricula: " + matricula +
                ", nota final: " + notaFinal;
    }
}
