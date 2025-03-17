package exercicios;

public class LivroBiblioteca {

    private String titulo;
    private String autor;
    private boolean disponivel = true;

    public LivroBiblioteca(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    public void pegarEmprestado(){
        if(!disponivel){
            System.out.println("Livro já emprestado!");
        } else {
            disponivel = false;
            System.out.println("Livro " + titulo + " pego!");
        }
    }

    public void devolverLivro(){
        if(disponivel){
            System.out.println("Livro está disponivel!");
        } else {
            disponivel = true;
            System.out.println("Livro " + titulo + " devolvido!");
        }
    }



}

