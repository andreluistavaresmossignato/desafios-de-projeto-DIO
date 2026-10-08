package br.com.dio.pedidos.infra;

import br.com.dio.pedidos.pagamento.EstrategiaPagamento;
import br.com.dio.pedidos.pedido.Pedido;
import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class FacadePedidos {
    private final RegistroPedidos registro = RegistroPedidos.getInstancia();
    private final AtomicLong sequencia = new AtomicLong(1);

    public Pedido criarPedido(String cliente, String produto, double valor, EstrategiaPagamento pagamento) {
        validar(cliente, "cliente");
        validar(produto, "produto");
        if (!Double.isFinite(valor) || valor <= 0) {
            throw new IllegalArgumentException("O valor do pedido deve ser maior que zero.");
        }
        if (pagamento == null) {
            throw new IllegalArgumentException("A forma de pagamento é obrigatória.");
        }

        BigDecimal total = BigDecimal.valueOf(valor).setScale(2);
        String confirmacao = pagamento.pagar(total);
        Pedido pedido = new Pedido(sequencia.getAndIncrement(), cliente.trim(), produto.trim(), total, confirmacao);
        registro.adicionar(pedido);
        System.out.println(pedido);
        return pedido;
    }

    public List<Pedido> listarPedidos() {
        return registro.listar();
    }

    public String resumo() {
        BigDecimal total = listarPedidos().stream().map(Pedido::valor).reduce(BigDecimal.ZERO, BigDecimal::add);
        return "R$ " + total.setScale(2) + " em vendas";
    }

    private static void validar(String texto, String campo) {
        if (texto == null || texto.isBlank()) {
            throw new IllegalArgumentException("O campo " + campo + " é obrigatório.");
        }
    }
}
