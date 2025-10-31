package state;

public class CanceladoState implements OrderState {
    private Order order;

    public CanceladoState(Order order) {
        this.order = order;
    }

    @Override
    public void pagar() {
        System.out.println("Não é possível pagar. O pedido foi cancelado.");
    }

    @Override
    public void enviar() {
        System.out.println("Não é possível enviar. O pedido foi cancelado.");
    }

    @Override
    public void entregar() {
        System.out.println("Não é possível entregar. O pedido foi cancelado.");
    }

    @Override
    public void cancelar() {
        System.out.println("O pedido já está cancelado.");
    }
}

