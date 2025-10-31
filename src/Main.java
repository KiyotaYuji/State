import state.Order;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Cenário 1: Fluxo completo (Novo -> Pago -> Enviado -> Entregue) ===");
        Order pedido1 = new Order();
        pedido1.pagar();
        pedido1.enviar();
        pedido1.entregar();

        System.out.println("\n=== Cenário 2: Cancelamento antes do pagamento ===");
        Order pedido2 = new Order();
        pedido2.cancelar();
        pedido2.pagar(); // Tentativa de pagar após cancelar

        System.out.println("\n=== Cenário 3: Cancelamento após pagamento ===");
        Order pedido3 = new Order();
        pedido3.pagar();
        pedido3.cancelar();
        pedido3.enviar(); // Tentativa de enviar após cancelar

        System.out.println("\n=== Cenário 4: Tentativa de ações inválidas ===");
        Order pedido4 = new Order();
        pedido4.enviar(); // Tentar enviar sem pagar
        pedido4.entregar(); // Tentar entregar sem pagar
        pedido4.pagar();
        pedido4.pagar(); // Tentar pagar novamente
        pedido4.entregar(); // Tentar entregar sem enviar
        pedido4.enviar();
        pedido4.cancelar(); // Tentar cancelar após enviar
        pedido4.entregar();
        pedido4.cancelar(); // Tentar cancelar após entregar
    }
}