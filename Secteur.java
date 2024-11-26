public class Secteur {

	private int numero;
	private Hex[] hex;
	
	public Secteur(int numero, Hex[] hex) {
		this.numero = numero;
		this.hex = hex;
	}
	
	public int getNumero() {
		return numero;
	}
}
