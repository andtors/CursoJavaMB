public class Livro {

    private String titulo;
    private String autor;
    private double preco;

    public Livro(String titulo, String autor, double preco){
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public void exibirInfo(){
        System.out.println("Livro: " + this.titulo + ", autor: " + this.autor + ", preço: R$ " + this.preco);
    }

}
