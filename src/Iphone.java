import device.InternetComunicator;
import device.Ipod;
import device.Phone;

public class Iphone implements Phone, Ipod, InternetComunicator {

    

    @Override
    public void ligar() {
        System.out.println("Dispositivo ligado");
    }

    @Override
    public void adicionarContato() {
        System.out.println("Adicionando contato");
    }

    @Override
    public void excluirContato() {
        System.out.println("Excluindo contato..");
    }

    

    @Override
    public void ouvirMusica() {
        System.out.println("Reproduzindo musica");
    }

    @Override
    public void trocarMusica() {
        System.out.println("Trocando musica");
    }

    @Override
    public void adicionarMusica() {
        System.out.println("Adicionando musica");
    }

    @Override
    public void abrirTelaMusicas() {
        System.out.println("Listando todas as musicas");
    }

    

    @Override
    public void acessarInternet() {
        System.out.println("Entrando na World Wide Web");;
    }

    @Override
    public void buscarSites() {
        System.out.println("Pesquisando site");;
    }

    @Override
    public void salvarSiteFavoritos() {
        System.out.println("Salvnado site em favoritos");
    }

    
    
}
