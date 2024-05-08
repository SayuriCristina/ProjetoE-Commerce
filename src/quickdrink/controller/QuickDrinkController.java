package quickdrink.controller;

import java.util.ArrayList;

import quickdrink.model.Bebida;
import quickdrink.repository.QuickDrinkRepository;

public class QuickDrinkController implements QuickDrinkRepository {
	
	private ArrayList<Bebida> pedidos = new ArrayList<Bebida>();
	
	@Override
	public void procurarPorPedido() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarPedidos() {
		for (var pedido : pedidos) {
			pedido.visualizar();
		}
		
	}
	int id = 0;
	int tamanho = 0;
	
	@Override
	public void fazerPedido(Bebida bebida) {
		pedidos.add(bebida);
		System.out.println("\nO pedido nº " + bebida.getId() + " foi registrado e já está sendo preparado!");
		
	}
	
	public int gerarId() {
		return ++ id ;
	}
		
	
}
