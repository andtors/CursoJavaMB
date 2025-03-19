package exercicios;

public class Hidroavio extends Barco implements Navegavel, Pilotavel{

    @Override
    public void pilotar() {
        System.out.println("O hidroavião está voando e depois vai navegar.");
    }
}
