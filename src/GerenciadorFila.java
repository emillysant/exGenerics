import java.util.LinkedList;

public class GerenciadorFila<T> {
    private Fila<T> fila = new Fila<>();

    public T gerarListaDeFrutas(){
        fila.enfileirar((T) "Banana");
        fila.enfileirar((T) "Maça");
        fila.enfileirar((T) "Goiaba");
        fila.enfileirar((T) "Mamão");
        return (T) fila;
    }

}
