package personnages;


public class Gaulois  { 
	private String nom; 
	private int force; 
	private int effetPotion = 1;
	
	
	public Gaulois(String nom, int force) { 
	this.nom = nom; 
	this.force = force; 
	
	} 
	public String getNom() { 
		return nom; 
	} 
	
	public void setEffetPotion(int effetPotion) {
		this.effetPotion = effetPotion;
	}
	public void parler(String texte) { 
		System.out.println(prendreParole() + "<<" + texte + ">>"); 
	} 
	private String prendreParole() { 
		return "Le gaulois " + nom + " : "; 
	} 
	public void frapper(Romain romain) { 
		System.out.println(nom + " envoie un grand coup dans la m�choire de " + romain.getNom()); 
		romain.recevoirCoup((force / 3)*effetPotion); 
	}
	
	@Override 
	public String toString() { 
	return "Gaulois [nom=" + nom + ", force=" + force 
	+ ", effetPotion=" + effetPotion + "]"; 
	} 
	
	public void boirePotion(int forcePotion){
		this.effetPotion = forcePotion;	
		
		if(forcePotion == 3) {
			parler("Merci Druide, je sens que ma force est 3 fois décuplée");
		}
	}
	
	public static void main(String[] args) { 
	
		 Gaulois asterix = new Gaulois ("Astérix", 8);
		 System.out.println(asterix.getNom());
		 System.out.println(asterix);
	} 
}