package state;

public class PagoState implements OrderState {
    private Order order;

    public PagoState(Order order) {
        this.order = order;
    }

    @Override
    public void pagar() {
        System.out.println("O pedido já foi pago.");
    }

    @Override
    public void enviar() {
        System.out.println("Pedido despachado para o cliente!");
        this.order.setEstado(new EnviadoState(order));
    }

    @Override
    public void entregar() {
        System.out.println("Não é possível entregar. O pedido ainda não foi enviado.");
    }

    @Override
    public void cancelar() {
        System.out.println("Pedido cancelado. O reembolso será processado.");
        this.order.setEstado(new CanceladoState(order));
    }
}

