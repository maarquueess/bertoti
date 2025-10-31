package atividade5;

public class Arco {
		private double peso; 
		private String material; 
		private double tamanho; 
		private Flecha flechaCarregada; 
		
		public Arco(double peso, String material, double tamanho) {
			this.peso = peso; 
			this.material = material; 
			this.tamanho = tamanho; 
		}
		
		
		public double getPeso() { return peso; }
		public void setPeso(double peso) { this.peso = peso; }
		
		public String getMaterial() { return material; }
		public void setMaterial(String material) { this.material = material; }
		
		public double getTamanho() { return tamanho; }
		public void setTamanho(double tamanho) { this.tamanho = tamanho; }
		
		public Flecha getFlechaCarregada() { return flechaCarregada; }
		
		public void puxar() {
			System.out.println("Arco: corda puxada."); 
		}
		
		public void ajustar(double novoTamanho) { 
			setTamanho(novoTamanho); 
			System.out.println("Arco ajustado para tamanho: " + novoTamanho); 
		}
		
		public void carregar(Flecha flecha) {
			this.flechaCarregada = flecha; 
			System.out.println("Arco: flecha carregada (" + flecha + ")."); 
		}
		
		public Flecha soltar(String alvo) {
			if (flechaCarregada == null) {
				System.out.println("Arco: nenhuma flecha carregada!");
				return null; 
			}
			System.out.println("Arco: flecha solta!"); 
			flechaCarregada.mirar(alvo); 
			flechaCarregada.voar();
			flechaCarregada.atingir(alvo);
			return flechaCarregada = null; 
		}
		
		public String toString() {
			return "Arco ->" +
				   "peso = " + peso +
				   ", material = " + material +
				   ", tamanho = " + tamanho; 
			
		}
}