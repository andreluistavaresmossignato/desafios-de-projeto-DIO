package br.com.dio.pedidos.pedido;

import java.math.BigDecimal;

public record Pedido(long numero, String cliente, String produto, BigDecimal valor, String pagamento) {
    @Override
    public String toString() {
        return "Pedido #" + numero + " | " + cliente + " | " + produto + " | R$ " + valor + " | " + pagamento;
    }
}
