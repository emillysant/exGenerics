import java.util.ArrayList;
import java.util.List;

public class GerenciadorPersonagens<T> {

    private List<T> personagens = new ArrayList<>();

    public void adicionarPersonagem(T personagem) {
        personagens.add(personagem);
    }

    public void removerPersonagem(T personagem) {
        personagens.remove(personagem);
    }

    public List<T> listarPersonagens() {
        return new ArrayList<>(personagens);
    }

}
