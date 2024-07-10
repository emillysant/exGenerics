import java.util.ArrayList;
import java.util.List;

public class Rede<T> {
    private List<T> componentes = new ArrayList<>();

    public void adicionarComponente(T componente) {
        componentes.add(componente);
    }

    public void removerComponente(T componente) {
        componentes.remove(componente);
    }

    public List<T> listarComponentes() {
        return new ArrayList<>(componentes);
    }
}
