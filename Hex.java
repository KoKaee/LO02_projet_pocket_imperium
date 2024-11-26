public class Hex {
	private int niveau;
	private int nombreDeVaisseau;
	private int numeroSystem;
	private boolean Occupe;
	
	public Hex(int niveau, int nombreDeVaisseau, int numeroSystem, boolean Occupe) {
		this.niveau = niveau;
		this.nombreDeVaisseau = nombreDeVaisseau;
		this.numeroSystem = numeroSystem;
		this.Occupe = Occupe;
	}
	
	public int getNiveau() {
		return niveau;
	}
	
	public int getNombreDeVaisseau() {
        return this.nombreDeVaisseau;
    }

    public int getNumeroSystem() {
        return this.numeroSystem;
    }

    public boolean isOccupe() {
        return this.Occupe;
    }
	
	public void rendreOccupe() {
		this.Occupe = true;
	}
	
	public void rendreLibre() {
		this.Occupe = false;
	}
	
}
