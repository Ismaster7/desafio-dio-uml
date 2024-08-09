package device;

public interface InternetComunicator {

    public void acessarInternet();
    public void buscarSites() ;
    public void salvarSiteFavoritos();
    
    private void resolverDns(){
        System.out.println("Resolvendo DNS");
    }
} 
