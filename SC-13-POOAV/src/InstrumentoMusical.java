abstract class InstrumentoMusical {

    protected String nome;

    public InstrumentoMusical(String nome) {
        this.nome = nome;
    }

    // Abtrasct - obrigatorio, precisa ser implementado
    public abstract void tocar();

    // Concret - não obrigatorio, ele é herdado
    public void exibirDetalhes(){
        System.out.println("Instrumento: " + nome);
    }

}
