package br.com.dio.pedidos.pagamento;

import java.math.BigDecimal;

public class PagamentoPix implements EstrategiaPagamento {
    @Override
    public String pagar(BigDecimal valor) {
        return "PIX aprovado: R$ " + valor;
    }
}
