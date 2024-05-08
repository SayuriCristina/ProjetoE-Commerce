package quickdrink.repository;

import quickdrink.model.Bebida;

public interface QuickDrinkRepository {
	
	public void procurarPorPedido();
	public void listarPedidos();
	public void fazerPedido(Bebida bebida);

}
