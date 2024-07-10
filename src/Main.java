//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static <T> void main(String[] args) {

//      1)
        GerenciadorFila gerenciador = new GerenciadorFila();

        Fila<String> filaFrutas = (Fila<String>) gerenciador.gerarListaDeFrutas();
        System.out.println(filaFrutas);
        System.out.println("Removendo primeiro elemento: "+filaFrutas.desenfileirar());
        System.out.println("Nova lista: "+filaFrutas);
        System.out.println("Verificando se está vazia: " +filaFrutas.estaVazia());

//      2)
        Familia<String> familia = new Familia<>();
        familia.adicionarMembro("Pai");
        familia.adicionarMembro("Mãe");

//      3)
        Funcionario<String> funcionario = new Funcionario<>();
        funcionario.adicionarFuncionario("Jõao");
        funcionario.adicionarFuncionario("Maria");

//      4)

        Rede<T> rede = new Rede<>();
        RedeLocal redeLocal = new RedeLocal();
        RedeWAN redeWAN = new RedeWAN();
        RedeSemFio redeSemFio = new RedeSemFio();

        rede.adicionarComponente((T) redeLocal);
        rede.adicionarComponente((T) redeWAN);
        rede.adicionarComponente((T) redeSemFio);

//        5)
        GerenciadorPersonagens<Heroi> repoSuperHerois = new GerenciadorPersonagens<>();
        GerenciadorPersonagens<Vilao> repoViloes = new GerenciadorPersonagens<>();
        GerenciadorPersonagens<Ajudante> repoAjudantes = new GerenciadorPersonagens<>();

        Heroi superman = new Heroi("Superman", "Super Força");
        Vilao lexLuthor = new Vilao("Lex Luthor", "identidade secreta");
        Ajudante robin = new Ajudante("Robin", "Combate Corpo a Corpo");

        repoSuperHerois.adicionarPersonagem(superman);
        repoViloes.adicionarPersonagem(lexLuthor);
        repoAjudantes.adicionarPersonagem(robin);

//        Desafio



    }
}