package OpenClosePrinciple;

public class Ticket {
    private double preco;
    private Desconto desconto;

    public Ticket(double preco, Desconto desconto) {
        this.preco = preco;
        this.desconto = desconto;
    }

    public double getFinalPrice() {
        return desconto.apply(preco);
    }
}

