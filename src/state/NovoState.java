package state;

public class NovoState implements OrderState {
    private Order order;

    public NovoState(Order order) {
        this.order = order;
    }

    @Override
    public void pagar() {
        System.out.println("Pagamento confirmado! Pedido aguardando envio.");
        this.order.setEstado(new PagoState(order));
    }

    @Override
    public void enviar() {
        System.out.println("Não é possível enviar. O pedido ainda não foi pago.");
    }

    @Override
    public void entregar() {
        System.out.println("Não é possível entregar. O pedido ainda não foi pago.");
    }

    @Override
    public void cancelar() {
        System.out.println("Pedido cancelado com sucesso.");
        this.order.setEstado(new CanceladoState(order));
    }
}

