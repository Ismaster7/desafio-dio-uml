package device;

public interface Phone {
    public void ligar();
    public void adicionarContato();
    public void excluirContato();
    private void manusearContatos(){
        System.out.println("Manuseando todos os contatos");
    };
}

