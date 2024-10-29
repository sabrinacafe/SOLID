package InterfaceSegregationPrinciple;

public class FuncaoAvancada implements Imprimir, Digitalizar {

    @Override
    public void digitalizarDocumento() {
        System.out.println("Digitalizando documento");
    }

    @Override
    public void imprimirDocumento() {
        System.out.println("Imprimindo documento");
    }
}
