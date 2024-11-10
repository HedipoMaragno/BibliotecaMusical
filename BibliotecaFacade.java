public class BibliotecaFacade {
    private BibliotecaMusical biblioteca;

    public BibliotecaFacade() {
        biblioteca = BibliotecaMusical.getInstancia();
    }

    // Alterando o método para aceitar um objeto Álbum
    public void adicionarÁlbum(Álbum álbum) {
        biblioteca.adicionarÁlbum(álbum);
    }

    public void adicionarMúsica(String nome, String artista) {
        Música música = new Música(nome, artista);
        biblioteca.adicionarMúsica(música);
    }

    public void exibirConteúdo() {
        biblioteca.listarMúsicas();
        biblioteca.listarÁlbuns();
    }
}
