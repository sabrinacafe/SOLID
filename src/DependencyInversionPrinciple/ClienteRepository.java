package DependencyInversionPrinciple;

public class ClienteRepository {
    BancoDados bancoDados;
    ClienteRepository (BancoDados bancoDados){
        this.bancoDados = bancoDados;
    }
}
