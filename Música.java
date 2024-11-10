public class Música {
    private String título;
    private String artista;

    public Música(String título, String artista) {
        this.título = título;
        this.artista = artista;
    }

    public String getArtista() {
        return artista;
    }

    @Override
    public String toString() {
        return "Música: " + título + " - Artista: " + artista;
    }
}
