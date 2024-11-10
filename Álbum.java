import java.util.ArrayList;
import java.util.List;

public class Álbum {
    private String título;
    private String artista;
    private List<Música> músicas;

    public Álbum(String título, String artista) {
        this.título = título;
        this.artista = artista;
        this.músicas = new ArrayList<>();
    }

    public void adicionarMúsica(Música música) {
        músicas.add(música);
    }

    public String getArtista() {
        return artista;
    }

    @Override
    public String toString() {
        return "Álbum: " + título + " - Artista: " + artista + " - Músicas: " + músicas.size();
    }
}
