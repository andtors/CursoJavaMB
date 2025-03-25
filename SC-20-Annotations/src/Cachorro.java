public class Cachorro extends Animal{

    // Warnings não param a compilação
    // erro (vermelho) não compila
    @Override
    public void emitirSom(){
        System.out.println("O cachorro está latindo");
    }

    @SuppressWarnings("deprecation")
    public void testeMover(){
        mover();
    }
}
