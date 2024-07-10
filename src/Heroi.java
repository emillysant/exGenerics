public class Heroi implements Personagem{
    private String nome;
    private String habilidae;

    public Heroi(String nome, String habilidae) {
        this.nome = nome;
        this.habilidae = habilidae;
    }

    @Override
    public void acao() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHabilidae() {
        return habilidae;
    }

    public void setHabilidae(String habilidae) {
        this.habilidae = habilidae;
    }

    @Override
    public String toString() {
        return "Heroi{" +
                "nome='" + nome + '\'' +
                ", habilidae='" + habilidae + '\'' +
                '}';
    }
}
