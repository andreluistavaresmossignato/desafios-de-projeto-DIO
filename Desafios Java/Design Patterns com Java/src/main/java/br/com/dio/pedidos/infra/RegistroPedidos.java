package br.com.dio.pedidos.infra;

import br.com.dio.pedidos.pedido.Pedido;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class RegistroPedidos {
    private final List<Pedido> pedidos = new CopyOnWriteArrayList<>();

    private RegistroPedidos() { }

    private static class Holder {
        private static final RegistroPedidos INSTANCIA = new RegistroPedidos();
    }

    public static RegistroPedidos getInstancia() {
        return Holder.INSTANCIA;
    }

    public void adicionar(Pedido pedido) {
        pedidos.add(pedido);
    }

    public List<Pedido> listar() {
        return List.copyOf(pedidos);
    }
}
