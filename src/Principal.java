import br.com.juan.fyfor.modelos.Musica;
import br.com.juan.fyfor.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica inLove = new Musica();
        inLove.setTitulo("In Love");
        inLove.setAlbum("Macross Plus");
        inLove.setGenero("Jazz");
        inLove.setDuracao(6.36);
        inLove.setArtista("Mai Yamane");
        inLove.curtir();
        inLove.reproduzir();
        inLove.exibirMusica();

        System.out.println("\n-----------------------------\n");

        Podcast flow = new Podcast();
        flow.setTitulo("Flow Podcast");
        flow.setDescricao("Flow Podcast é um podcast brasileiro");
        flow.setDuracao(120.0);
        flow.setApresentador("Monark");
        flow.curtir();
        flow.reproduzir();
        flow.exibirPodcast();
    }
}
