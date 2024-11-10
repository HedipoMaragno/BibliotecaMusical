public class TesteBibliotecaMusical {
    public static void main(String[] args) {
        // Instanciando a fachada
        BibliotecaFacade facade = new BibliotecaFacade();

        // Criando e adicionando músicas internacionais
        facade.adicionarMúsica("Bohemian Rhapsody", "Queen");
        facade.adicionarMúsica("We Will Rock You", "Queen");
        facade.adicionarMúsica("Imagine", "John Lennon");
        facade.adicionarMúsica("Hey Jude", "The Beatles");
        facade.adicionarMúsica("Like a Rolling Stone", "Bob Dylan");
        facade.adicionarMúsica("Blinding Lights", "The Weeknd");
        facade.adicionarMúsica("Billie Jean", "Michael Jackson");
        facade.adicionarMúsica("Smells Like Teen Spirit", "Nirvana");

        // Criando e adicionando músicas brasileiras
        facade.adicionarMúsica("Aquarela do Brasil", "Ary Barroso");
        facade.adicionarMúsica("Chega de Saudade", "João Gilberto");
        facade.adicionarMúsica("Mas Que Nada", "Jorge Ben Jor");
        facade.adicionarMúsica("O Mundo é um Moinho", "Cartola");
        facade.adicionarMúsica("Construção", "Chico Buarque");
        facade.adicionarMúsica("Águas de Março", "Tom Jobim e Elis Regina");
        facade.adicionarMúsica("Cais", "Milton Nascimento");
        facade.adicionarMúsica("Detalhes", "Roberto Carlos");

        // Criando e adicionando álbuns internacionais
        Álbum album1 = new Álbum("A Night at the Opera", "Queen");
        album1.adicionarMúsica(new Música("Bohemian Rhapsody", "Queen"));
        album1.adicionarMúsica(new Música("We Will Rock You", "Queen"));
        facade.adicionarÁlbum(album1);

        Álbum album2 = new Álbum("Imagine", "John Lennon");
        album2.adicionarMúsica(new Música("Imagine", "John Lennon"));
        facade.adicionarÁlbum(album2);

        Álbum album3 = new Álbum("Abbey Road", "The Beatles");
        album3.adicionarMúsica(new Música("Hey Jude", "The Beatles"));
        facade.adicionarÁlbum(album3);

        Álbum album4 = new Álbum("Highway 61 Revisited", "Bob Dylan");
        album4.adicionarMúsica(new Música("Like a Rolling Stone", "Bob Dylan"));
        facade.adicionarÁlbum(album4);

        Álbum album5 = new Álbum("After Hours", "The Weeknd");
        album5.adicionarMúsica(new Música("Blinding Lights", "The Weeknd"));
        facade.adicionarÁlbum(album5);

        Álbum album6 = new Álbum("Thriller", "Michael Jackson");
        album6.adicionarMúsica(new Música("Billie Jean", "Michael Jackson"));
        facade.adicionarÁlbum(album6);

        Álbum album7 = new Álbum("Nevermind", "Nirvana");
        album7.adicionarMúsica(new Música("Smells Like Teen Spirit", "Nirvana"));
        facade.adicionarÁlbum(album7);

        // Criando e adicionando álbuns brasileiros
        Álbum album8 = new Álbum("Brasil, O Melhor de Ary Barroso", "Ary Barroso");
        album8.adicionarMúsica(new Música("Aquarela do Brasil", "Ary Barroso"));
        facade.adicionarÁlbum(album8);

        Álbum album9 = new Álbum("Chega de Saudade", "João Gilberto");
        album9.adicionarMúsica(new Música("Chega de Saudade", "João Gilberto"));
        facade.adicionarÁlbum(album9);

        Álbum album10 = new Álbum("Samba Esquema Novo", "Jorge Ben Jor");
        album10.adicionarMúsica(new Música("Mas Que Nada", "Jorge Ben Jor"));
        facade.adicionarÁlbum(album10);

        Álbum album11 = new Álbum("Cartola – O Mundo é um Moinho", "Cartola");
        album11.adicionarMúsica(new Música("O Mundo é um Moinho", "Cartola"));
        facade.adicionarÁlbum(album11);

        Álbum album12 = new Álbum("Construção", "Chico Buarque");
        album12.adicionarMúsica(new Música("Construção", "Chico Buarque"));
        facade.adicionarÁlbum(album12);

        Álbum album13 = new Álbum("Águas de Março", "Tom Jobim e Elis Regina");
        album13.adicionarMúsica(new Música("Águas de Março", "Tom Jobim e Elis Regina"));
        facade.adicionarÁlbum(album13);

        Álbum album14 = new Álbum("Minas", "Milton Nascimento");
        album14.adicionarMúsica(new Música("Cais", "Milton Nascimento"));
        facade.adicionarÁlbum(album14);

        Álbum album15 = new Álbum("Roberto Carlos", "Roberto Carlos");
        album15.adicionarMúsica(new Música("Detalhes", "Roberto Carlos"));
        facade.adicionarÁlbum(album15);

        // Criando e adicionando observadores
        BibliotecaMusical biblioteca = BibliotecaMusical.getInstancia();
        biblioteca.adicionarObserver(new Notificador("Notificador 1"));
        biblioteca.adicionarObserver(new Notificador("Notificador 2"));

        // Exibindo conteúdo da biblioteca
        facade.exibirConteúdo();
    }
}
