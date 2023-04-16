import br.com.alura.audiomatch.control.MinhasPreferidas;
import br.com.alura.audiomatch.models.Musica;
import br.com.alura.audiomatch.models.Podcast;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Podcast aluraCast = new Podcast();
        Musica lala = new Musica();

        for (int i = 0; i < 100; i++) {
            aluraCast.reproduzir();
        }

        aluraCast.setTitulo("AluraCast");
        aluraCast.setDescricao("Podcast Malucão");
        aluraCast.setHost("Paulo");
        aluraCast.setDuracao(20);
        aluraCast.curtir();
        aluraCast.curtir();
        aluraCast.curtir();

        System.out.println("###################################");
        System.out.println(aluraCast.getTitulo());
        System.out.println(aluraCast.getHost());
        System.out.println(aluraCast.getDescricao());
        System.out.println(aluraCast.getCurtidas());
        System.out.println(aluraCast.getTotalReproducaoes());
        System.out.println("###################################");

        for (int i = 0; i < 1200; i++) {
            lala.reproduzir();
        }

        lala.setTitulo("laia laia");
        lala.setArtista("Tom laia");
        lala.setAlbum("Tom laia laia");
        lala.setGerero("Gospel");
        lala.curtir();
        lala.curtir();
        lala.curtir();
        lala.curtir();

        System.out.println("###################################");
        System.out.println(lala.getTitulo());
        System.out.println(lala.getArtista());
        System.out.println(lala.getAlbum());
        System.out.println(lala.getCurtidas());
        System.out.println(lala.getTotalReproducaoes());
        System.out.println("###################################");

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(aluraCast);
        preferidas.inclui(lala);

    }
}