package OpenClosePrinciple;

public class DescontoEstudante extends Desconto {
    @Override
    public double apply(double preco) {
        return preco * 0.5;
    }
}
