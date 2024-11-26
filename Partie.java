import java.util.*;

public class Partie {

	List<Joueur> joueur;
	List<PaquetDeCartes> ordreCarteSecteur;
	private int tour;
	private int nombreDeJoueursReels;
	private PaquetDeCartes cartesCommandes;
	
	public Partie(PaquetDeCartes ordreCarteSecteur,int tour, int nombreDeJoueursReels, PaquetDeCartes cartesCommandes) {
		this.tour = tour;
		this.nombreDeJoueursReels = nombreDeJoueursReels;
		this.cartesCommandes = cartesCommandes;
	}
	
	public static void main(String[] args) {
	}
	
}
