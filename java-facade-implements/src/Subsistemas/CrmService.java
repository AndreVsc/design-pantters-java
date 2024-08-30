package Subsistemas;

public class CrmService {

    private CrmService(){
        super();
    }

    public static void migrarCliente(String nome, String cep , String cidade , String estado) {
        System.out.println("Cliente " + nome + " migrado com sucesso!\n");
        System.out.println("Cep: " + cep);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado + "\n");
    }
}
