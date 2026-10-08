package br.com.dio.pedidos.pagamento;

import java.math.BigDecimal;

public interface EstrategiaPagamento {
    String pagar(BigDecimal valor);
}
