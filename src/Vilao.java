public class Vilao implements Personagem{
    private String nome;
    private String habilidade;

    public Vilao(String nome, String habilidade) {
        this.nome = nome;
        this.habilidade = habilidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHabilidade() {
        return habilidade;
    }

    @Override
    public String toString() {
        return "Vilao{" +
                "nome='" + nome + '\'' +
                ", habilidade='" + habilidade + '\'' +
                '}';
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

    @Override
    public void acao() {

    }
}
