package quickdrink.model;

public class Milkshake extends Bebida {
	
	private String sabor, cobertura;
	
	public Milkshake (int id, int nome, int tamanho, float preco, String sabor, String cobertura) {
		super(id, nome, tamanho, preco);
		this.cobertura = cobertura;
		this.sabor = sabor;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getCobertura() {
		return cobertura;
	}

	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}
	
	@Override
	public void visualizar() {
		
		System.out.println("Sabor: " + this.sabor);
		System.out.println("Cobertura: " + this.cobertura);
		
		super.visualizar();
		
	}
}
