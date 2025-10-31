package state;

public class EntregueState implements OrderState {
    private Order order;

    public EntregueState(Order order) {
        this.order = order;
    }

    @Override
    public void pagar() {
        System.out.println("O pedido já foi pago e entregue.");
    }

    @Override
    public void enviar() {
        System.out.println("O pedido já foi enviado e entregue.");
    }

    @Override
    public void entregar() {
        System.out.println("O pedido já foi entregue.");
    }

    @Override
    public void cancelar() {
        System.out.println("Não é possível cancelar. O pedido já foi entregue.");
    }
}

