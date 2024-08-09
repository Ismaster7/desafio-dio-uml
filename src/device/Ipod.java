package device;

public interface  Ipod {
    int volumeMusica = 0;

    public void ouvirMusica();
    public void trocarMusica();
    public void adicionarMusica();
    public void abrirTelaMusicas();
    private void configurarMusica(){
        System.out.println("Configurando Musicas");
    }
    private  void prepararInterfaceGráfica(){
        System.out.println("Preparando interface gráfica para ser exibida");
    }

}
