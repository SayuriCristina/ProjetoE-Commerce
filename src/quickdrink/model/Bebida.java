package quickdrink.model;

public abstract class Bebida {
	
	private int id, nome, tamanho;
	private float preco;
	
	public Bebida(int id, int nome, int tamanho, float preco) {
		this.id = id;
		this.nome = nome;
		this.tamanho = tamanho;
		this.preco = preco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNome() {
		return nome;
	}

	public void setNome(int nome) {
		this.nome = nome;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public void visualizar() {
		
		System.out.println("Nº do pedido: " + this.id);
		System.out.println("Tamanho: " + this.tamanho);
		System.out.println("Preco: " + this.preco);
	}
	
	
		
	

}
