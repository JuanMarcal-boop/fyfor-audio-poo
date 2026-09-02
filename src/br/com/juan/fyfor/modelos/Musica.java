package br.com.juan.fyfor.modelos;

public class Musica extends Audio implements Curtir, Reproduzir {
    private String artista;
    private String album;
    private String genero;

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public void curtir() {
        setCurtidas(getCurtidas() + 1);
    }

    @Override
    public void reproduzir() {
        setTotalDeReproducoes(getTotalDeReproducoes() + 1);
    }

    public void exibirMusica() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Artista: " + getArtista());
        System.out.println("Álbum: " + getAlbum());
        System.out.println("Gênero: " + getGenero());
        System.out.println("Duração: " + getDuracao() + " segundos");
        System.out.println("Curtidas: " + getCurtidas());
        System.out.println("Total de reproduções: " + getTotalDeReproducoes());
        System.out.println("Classificação: " + this.getClassificacao());
    }
}
