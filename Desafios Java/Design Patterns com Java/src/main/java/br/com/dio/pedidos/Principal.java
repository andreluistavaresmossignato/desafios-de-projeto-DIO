package br.com.dio.pedidos;

import br.com.dio.pedidos.infra.FacadePedidos;
import br.com.dio.pedidos.pedido.Pedido;
import br.com.dio.pedidos.pagamento.PagamentoCartao;
import br.com.dio.pedidos.pagamento.PagamentoPix;

public class Principal {
    public static void main(String[] args) {
        FacadePedidos pedidos = new FacadePedidos();

        Pedido pedidoPix = pedidos.criarPedido("Ana", "Livro de Java", 89.90, new PagamentoPix());
        Pedido pedidoCartao = pedidos.criarPedido("Bruno", "Teclado", 219.00, new PagamentoCartao());

        System.out.println("\nResumo da loja: " + pedidos.resumo());
        System.out.println("Pedidos registrados: " + pedidos.listarPedidos().size());
    }
}
