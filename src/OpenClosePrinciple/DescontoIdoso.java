package OpenClosePrinciple;

public class DescontoIdoso extends Desconto {
    @Override
    public double apply(double preco) {
        return preco * 0.4;
    }
}
