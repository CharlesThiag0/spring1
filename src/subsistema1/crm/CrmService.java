package subsistema1.crm;

public class CrmService {

    private CrmService() {
        super();
    }

    public static void gravarClient(String nome, String cep, String cidade, String estado){
        System.out.printf("Cliente %s salvo no sistema", nome);
    }
}
