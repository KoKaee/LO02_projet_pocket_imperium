import java.util.List;

public class Joueur {
    List<Hex> hexControle;
    private PaquetDeCartes ordreDeCommande;
    List<Vaisseau> vaisseaux;
    private boolean marqueurJoueurDebut = false;
    private int phaseDejeu = 0;
    private int score = 0;
    private String nom;
    private Flotte flotte;
    private boolean joueurActif = true;
    private int nbVaisseauActif = 0;

    public Joueur(boolean marqueurJoueurDebut, String nom, int score,) {
        this.marqueurJoueurDebut = marqueurJoueurDebut;
        this.nom = nom;
        this.vaisseaux = new ArrayList<>();
    }

    public void ChoisirHex(Hex hex) {
        // À implémenter
    }

    public void choisirOrdreCommandes(CarteCommande commande1, CarteCommande commande2, CarteCommande commande3) {
        ordreDeCommande = new PaquetDeCarte[commande1, commande2, commande3];
    }

    public Hex[] getHexes() {
        // À implémenter
        return null;
    }

    public void expand(Hex systemHex, int efficacite) {
        // À implémenter
    }

    public void explorerFlotte(Flotte flotte, Hex hex, int efficacite) {
        // À implémenter
    }

    public void exterminer(Hex hexCible, Flotte flotte, int efficacite) {
        // À implémenter
    }

    public void maintenirVaisseaux() {
        // À implémenter
    }

    public void augmenterScore() {
        // À implémenter
    }

    public void initialiserScore() {
        // À implémenter
    }

    public String getNom() {
        return nom;
    }

    public int getScore() {
        return score;
    }

    public CarteCommande[] getOrdreDeCommande() {
        // À implémenter
        return null;
    }

    public boolean getMarqueurJoueurDebut() {
        return marqueurJoueurDebut;
    }

    public void desactiverJoueur() {
        // À implémenter
    }

    public void calculerScore(Hex hexControles) {
        // À implémenter
    }

    public void modifierHexControles(Hex hex) {
        // À implémenter
    }

    public boolean controleTrifPrimeHex() {
        // À implémenter
        return false;
    }

    public Vaisseau[] getVaisseaux() {
        return vaisseaux;
    }
}
