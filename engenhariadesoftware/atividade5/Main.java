package atividade5;

public class Main {
	public static void main(String [] args) {
	Arco arco = new Arco(2.5, "Compósito", 1.2);
	Flecha flecha = new Flecha(0.75, "Carbono", "Vermelha");
	Relogio relogio = new Relogio("Bateria", "24h", "Preto"); 
	
	arco.puxar();
	arco.carregar(flecha); 
	arco.ajustar(1.1);
	arco.soltar(" torre do rei");
	
	relogio.contar(); 
	relogio.marcar("último segundo");
	relogio.despertar("00:59");
	}
}
