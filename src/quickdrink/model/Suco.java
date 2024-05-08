package quickdrink.model;

public class Suco extends Bebida {
	
	private String sabor;
	private int acucar, leite;
	
	public Suco(int id, int nome, int tamanho, float preco, String sabor, int acucar, int leite) {
		super(id, nome, tamanho, preco);
		this.acucar = acucar;
		this.leite = leite;
		this.sabor = sabor;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public int getAcucar() {
		return acucar;
	}

	public void setAcucar(int acucar) {
		this.acucar = acucar;
	}

	public int getLeite() {
		return leite;
	}

	public void setLeite(int leite) {
		this.leite = leite;
	}
	
	@Override
	public void visualizar() {
		if (leite == 1) {
			System.out.println("Vitamina");
		}
		
		System.out.println("Sabor: " + this.sabor);
		
		if (acucar == 1) {
			System.out.println("Adoçado");
		
		super.visualizar();
		
		}
		
		
	}
}
