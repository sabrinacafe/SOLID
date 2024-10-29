package DependencyInversionPrinciple;

public class ClienteService {
    public static void main(String[] args) {
        BancoDados bancoDados = new BancoDados();
        //Consulta Receita Federal
        //Consulta SUS
        //Consulta Cartórios
        ClienteRepository clienteRepository = new ClienteRepository(bancoDados);
    }
}
