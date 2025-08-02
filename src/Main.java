import br.com.vibebox.model.Favorites;
import br.com.vibebox.model.Podcast;
import br.com.vibebox.model.Song;

public class Main {
    public static void main(String[] args) {
        Song musica = new Song();
        musica.setTitulo("Bohemian Rhapsody");
        musica.setArtista("Queen");

        for (int i = 0; i < 1000; i++) {
            musica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            musica.curte();
        }

        Podcast podcast = new Podcast();
        podcast.setTitulo("VibeBox");
        podcast.setApresentador("Marcos Rocha");

        for (int i = 0; i < 500; i++) {
            podcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            podcast.curte();
        }

        Favorites minhasPreferidas = new Favorites();
        minhasPreferidas.inclui(musica);
        minhasPreferidas.inclui(podcast);
    }
}