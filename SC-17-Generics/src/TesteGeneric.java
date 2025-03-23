import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class TesteGeneric <T> {

    private T nome;

    public TesteGeneric(T nome) {
        this.nome = nome;
    }

    public T getNome() {
        return nome;
    }

    public void setNome(T nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "TesteGeneric - " +
                "nome: " + nome;
    }
}
