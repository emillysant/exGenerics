import java.util.ArrayList;
import java.util.List;

public class Familia<T> {
    private List<T> membros = new ArrayList<>();

    public Familia() {
    }

    public void adicionarMembro(T membro) {
        membros.add(membro);
    }

    public void removerMembro(T membro) {
        membros.remove(membro);
    }

    public List<T> listarMembros() {
        return new ArrayList<>(membros);
    }
}
