package state;

public class Order {
    private OrderState estado;

    public Order() {
        this.estado = new NovoState(this);
    }

    public void setEstado(OrderState novoEstado) {
        this.estado = novoEstado;
    }

    public void pagar() {
        this.estado.pagar();
    }

    public void enviar() {
        this.estado.enviar();
    }

    public void entregar() {
        this.estado.entregar();
    }

    public void cancelar() {
        this.estado.cancelar();
    }
}

