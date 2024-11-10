import java.util.ArrayList;
import java.util.List;

public class BibliotecaMusical {
    private static BibliotecaMusical instancia;
    private List<Música> músicas;
    private List<Álbum> álbuns;
    private List<Observer> observadores;

    private BibliotecaMusical() {
        músicas = new ArrayList<>();
        álbuns = new ArrayList<>();
        observadores = new ArrayList<>();
    }

    public static BibliotecaMusical getInstancia() {
        if (instancia == null) {
            instancia = new BibliotecaMusical();
        }
        return instancia;
    }

    public void adicionarObserver(Observer observer) {
        observadores.add(observer);
    }

    private void notificarObservers(String mensagem) {
        for (Observer observer : observadores) {
            observer.atualizar(mensagem);
        }
    }

    public void adicionarMúsica(Música música) {
        músicas.add(música);
        notificarObservers("Música adicionada: " + música);
    }

    public void adicionarÁlbum(Álbum álbum) {
        álbuns.add(álbum);
        notificarObservers("Álbum adicionado: " + álbum);
    }

    public void listarMúsicas() {
        System.out.println("Lista de Músicas:");
        for (Música música : músicas) {
            System.out.println(música);
        }
    }

    public void listarÁlbuns() {
        System.out.println("Lista de Álbuns:");
        for (Álbum álbum : álbuns) {
            System.out.println(álbum);
        }
    }
}
