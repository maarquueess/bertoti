package atividade5;

public class Relogio {
	private String fonte; 
	private String formato; 
	private String cor; 
	
	public Relogio(String fonte, String formato, String cor) {
		this.fonte = fonte; 
		this.formato = formato; 
		this.cor = cor; 
	}
	
	public String getFonte() { return fonte; }
	public void setFonte(String fonte) { this.fonte = fonte; }
	
	public String getFormato() { return formato; }
	public void setFormato(String formato) { this.formato = formato; }
	
	public String getCor() { return cor; }
	public void setCor(String cor) { this.cor = cor; }
	
	public void contar () {
	System.out.println("Relogio: contando...");
	}

	public void despertar(String horario) {
		System.out.println("Relogio: despertando às " + horario);
	}
	
	public void marcar(String evento) {
		System.out.println("Relogio: marcando " + evento); 
	}
	
	public String toString() {
		return "Relogio ->" +
			   "fonte = " + fonte +
			   ", formato = " + formato + 
			   ", cor = " + cor;
	}
}

	

	
