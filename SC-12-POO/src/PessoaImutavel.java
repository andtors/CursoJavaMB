public class PessoaImutavel {

    private final String nome;
    private final int idade;

    public PessoaImutavel(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public String getNome(){
        //this.nome = nome;
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

//    public String setNome() {
//        return this.nome = nome;
//    }

    // 3 - Encapsulamento de arrays
}
