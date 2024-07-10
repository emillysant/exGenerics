public class Ajudante implements Personagem{
    private String nome;
    private String habilidade;

    public Ajudante(String nome, String habilidade) {
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

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

    @Override
    public void acao() {

    }

    @Override
    public String toString() {
        return "Ajudante{" +
                "nome='" + nome + '\'' +
                ", habilidade='" + habilidade + '\'' +
                '}';
    }
}
