package state;

public interface OrderState {
    void pagar();
    void enviar();
    void entregar();
    void cancelar();
}

