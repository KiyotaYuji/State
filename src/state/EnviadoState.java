package state;

public class EnviadoState implements OrderState {
    private Order order;

    public EnviadoState(Order order) {
        this.order = order;
    }

    @Override
    public void pagar() {
        System.out.println("O pedido já foi pago.");
    }

    @Override
    public void enviar() {
        System.out.println("O pedido já foi enviado.");
    }

    @Override
    public void entregar() {
        System.out.println("Pedido entregue ao cliente com sucesso!");
        this.order.setEstado(new EntregueState(order));
    }

    @Override
    public void cancelar() {
        System.out.println("Não é possível cancelar. O pedido já foi enviado.");
    }
}

