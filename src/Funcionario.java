import java.util.ArrayList;
import java.util.List;

public class Funcionario<T> {
    private List<T> funcionarios = new ArrayList<>();

    public void adicionarFuncionario(T funcionario) {
        funcionarios.add(funcionario);
    }

    public void removerFuncionario(T funcionario) {
        funcionarios.remove(funcionario);
    }

    public List<T> listarFuncionarios() {
        return new ArrayList<>(funcionarios);
    }
}
