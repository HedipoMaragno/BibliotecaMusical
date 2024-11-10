interface Observer {
    void atualizar(String mensagem);
}

class Notificador implements Observer {
    private String nome;

    public Notificador(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String mensagem) {
        System.out.println(nome + " recebeu a notificação: " + mensagem);
    }
}
