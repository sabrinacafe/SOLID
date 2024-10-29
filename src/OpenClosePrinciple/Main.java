package OpenClosePrinciple;

public class Main {
    public static void main(String[] args) {
        Ticket studentTicket = new Ticket(20.0, new DescontoEstudante());
        System.out.println("Preço com desconto para estudante: " + studentTicket.getFinalPrice());

        Ticket seniorTicket = new Ticket(20.0, new DescontoIdoso());
        System.out.println("Preço com desconto para idoso: " + seniorTicket.getFinalPrice());
    }
}

