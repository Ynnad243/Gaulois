package personnages;

public class Village {
	
	private String nom;
	private Chef chef;
	private int nbVillageoisMaximum;
	private Gaulois village [] = new Gaulois[nbVillageoisMaximum];
	private int nbVillageois = 0;
	
	
	public Village(String nom, int nbVillageoisMaximum) {
	this.nom = nom;
	this.nbVillageoisMaximum = nbVillageoisMaximum;
	}
	public void setChef(Chef chef) {
	this.chef = chef;
	}
	public String getNom() {
	return nom;
	}
	
	public void ajouterHabitant(Gaulois gol) {
		if(nbVillageois < nbVillageoisMaximum) {
			village[nbVillageois] = gol;
			nbVillageois ++;
		}
		
	}
	
	public Gaulois trouverHabitant(int numero) {
		return village[numero];		
	}
	
	


	public static void main(String[] args) {
		Village village = new Village("Village des Irreductibles", 30);
		Gaulois gaulois = village.trouverHabitant(30);

	}

}
