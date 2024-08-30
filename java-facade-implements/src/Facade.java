import Subsistemas.CepApi;
import Subsistemas.CrmService;

public class Facade {
    public void migrarCliente(String nome, String cep) {
        CepApi cepApi = CepApi.getInstance();
        String cidade = cepApi.recuperarCidade(cep);
        String estado = cepApi.recuperarEstado(cep);
        CrmService.migrarCliente(nome, cep, cidade, estado);
        
    }
}