package quickdrink.model;

public class Cafe extends Bebida {
	private int decaf, acucar, leite;
	
	public Cafe(int id, int nome, int tamanho, float preco, int decaf, int acucar, int leite) {
		super(id, nome, tamanho, preco);
		this.acucar = acucar;
		this.leite = leite;
		this.decaf = decaf;
	}

	public int getDecaf() {
		return decaf;
	}

	public void setDecaf(int decaf) {
		this.decaf = decaf;
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
		
		if (decaf == 1) {
			System.out.println("Descafeínado");
		}
		
		if (acucar == 1) {
			System.out.println("Adoçado");
		}
		
		if (leite == 1) {
			System.out.println("Com leite");
		}
		
		super.visualizar();
		
		
	}
}
