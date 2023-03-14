package personnages;

public class Village {
	
	private String nom;
	private Chef chef;
	private int nbVillageoisMaximum;
	private Gaulois [] village;
	private int nbVillageois = 0;
	
	
	public Village(String nom, int nbVillageoisMaximum) {
	this.nom = nom;
	this.nbVillageoisMaximum = nbVillageoisMaximum;
	this.village = new Gaulois[nbVillageoisMaximum];
	
	}
	public void setChef(Chef chef) {
	this.chef = chef;
	}
	
	public Chef getChef() {
		return chef;
	}
	public String getNom() {
	return nom;
	}
	
//	public void ajouterHabitant(Gaulois gol) {
//		if(nbVillageois < nbVillageoisMaximum) {
//			village[nbVillageois] = gol;
//			nbVillageois ++;
//		}
	
	public void ajouterHabitant(Gaulois gaul) {
		village[nbVillageois] = gaul;
		nbVillageois++;
				
	}
		
		
	public Gaulois trouverHabitant(int numero) {
		return village[numero];		
	}
	
	public void afficherVillageois() {
		System.out.println("Dans le village du chef " + getChef() + "vivent les légendaires gaulois : ");
		
		for(int i = 0; i<nbVillageois; i++) {
			System.out.println(" - " + village[i].getNom());
		}
		
	}
	


	public static void main(String[] args) {
		Village village1 = new Village("Village des Irreductibles", 30);
		/*Gaulois gaulois = village.trouverHabitant(30);
		 * Cette instruction ne fonctionne pas car il dépasse la taille du tableau. Le dernir élement étant 
		 * d'indice 29, le 30 eme est inexistant. */
		 
		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois ob = new Gaulois("Obélix", 25);
		village1.ajouterHabitant(asterix);
		village1.ajouterHabitant(ob);
		
		village1.afficherVillageois();
		
		
//		Gaulois gaulois = village1.trouverHabitant(1);
//		System.out.println(gaulois);
//		Le retour de ces instructions est null car il n'y a pas de gaulois à l'indoice 1
//	

	}

}
