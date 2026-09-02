package br.com.juan.fyfor.modelos;

public class Podcast extends Audio implements Curtir, Reproduzir {
    private String apresentador;
    private String descricao;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public void curtir() {
        setCurtidas(getCurtidas() + 1);
    }

    @Override
    public void reproduzir() {
        setTotalDeReproducoes(getTotalDeReproducoes() + 1);
    }

    public void exibirPodcast() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Apresentador: " + getApresentador());
        System.out.println("Duração: " + getDuracao() + " segundos");
        System.out.println("Curtidas: " + getCurtidas());
        System.out.println("Total de reproduções: " + getTotalDeReproducoes());
        System.out.println("Classificação: " + this.getClassificacao());
    }
}
