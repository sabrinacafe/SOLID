package LiskovSubstitutionPrinciple;

public class Pinguin extends Passaro{
    @Override
    public void voar() {
        throw new UnsupportedOperationException("Pinguins não voam.");
    }
}
