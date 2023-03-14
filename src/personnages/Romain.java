package personnages;


public class Romain  { 
	private String nom; 
	private int force; 
	private Equipement [] eq ;
	private int nbEquipements = 0;
	
	
	public Romain(String nom, int force) { 
	this.nom = nom; 
	this.force = force;
	this.eq = new Equipement[2];
	} 
	public String getNom() { 
		return nom; 
	} 
	public void parler(String texte) { 
		System.out.println(prendreParole() + "<<" + texte + ">>"); 
	} 
	private String prendreParole() { 
		return "Le romain " + nom + " : "; 
	} 
	public void recevoirCoup(int forceCoup) { 
		force -= forceCoup; 
		if (force > 0) { 
		parler("Aie"); 
		} else { 
		parler("J'abandonne..."); 
		} 
	}
	
	public void sEquiper(Equipement e) {
		
		switch(nbEquipements) {
			
		case 2 : System.out.println("Le soldat " + getNom() + " est déjà bien équipé");
			break;
		
		case 0 : 
			eq[0] = e;
			System.out.println("Le soldat " + getNom()  + " s'équipe avec un " + e);
			nbEquipements ++;
			break;
			
		case 1 :
			if(eq[0] == e)
				System.out.println("Le soldat " + getNom() + " possède déjà un " + e);
			else {
				eq[1] = e;
				nbEquipements ++;
				System.out.println("Le soldat " + getNom() + " s'équipe avec un " + e);
			}
			break;
		}
	}
	
	public static void main(String[] args) {
		Romain rom = new Romain("Minus", 25);
		rom.sEquiper(Equipement.CASQUE);
		rom.sEquiper(Equipement.CASQUE);
		rom.sEquiper(Equipement.BOUCLIER);
		rom.sEquiper(Equipement.CASQUE);
		
	}
} 