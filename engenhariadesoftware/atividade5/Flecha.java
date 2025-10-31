package atividade5;

public class Flecha {
	private double comprimento;  
	private String material; 
	private String cor; 
	
	public Flecha(double comprimento, String material, String cor) {
		this.comprimento = comprimento; 
		this.material = material; 
		this.cor = cor; 
	}
	
	public double getComprimento() { return comprimento; }
	public void setComprimento(double comprimento) { this.comprimento = comprimento; }
	
	public String getMaterial() { return material; } 
	public void setMaterial(String material) { this.material = material; }
	
	public String getCor() { return cor; }
	public void setCor(String cor) { this.cor = cor; }
	
	public void mirar(String alvo) {
		System.out.println("Flecha: mirando no alvo" + alvo); 
		}
	
	public void voar () {
		System.out.println("Flecha: voando"); 
	}
	
	public void atingir(String alvo) { 
		System.out.println("Flecha: atingiu o alvo" + alvo); 
	}
	
	public String toString() {
		return "Flecha ->" +
			   "comprimento = " + comprimento + 
			   ", material = " + material +
			   ", cor = " + cor; 
	}
}
