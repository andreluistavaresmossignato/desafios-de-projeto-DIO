package br.com.dio.pedidos.pagamento;

import java.math.BigDecimal;

public class PagamentoCartao implements EstrategiaPagamento {
    @Override
    public String pagar(BigDecimal valor) {
        return "Cartão aprovado: R$ " + valor;
    }
}
