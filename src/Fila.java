import java.util.LinkedList;

public class Fila<T> {
    private LinkedList<T> elementos = new LinkedList<>();

    public Fila() {} // criando uma lista vazia

    public void enfileirar(T elemento) {
       elementos.addLast(elemento);
    }

    public T desenfileirar() {
        if (!elementos.isEmpty()){
            return elementos.removeFirst();
        }
        throw new IllegalStateException("Fila vazia");
    }

    public boolean estaVazia(){
        return  elementos.isEmpty();
    }

    @Override
    public String toString() {
        return "Fila{" +
                "elementos=" + elementos +
                '}';
    }
}
