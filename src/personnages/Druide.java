package personnages;
import java.util.*;

public class Druide  { 
	private String nom; 
	private int effetPotionMin; 
	private int effetPotionMax; 
	private int forcePotion = 1;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) { 
	this.nom = nom; 
	this.effetPotionMin = effetPotionMin; 
	this.effetPotionMax = effetPotionMax; 
	parler("Bonjour,  je  suis  le  druide  "  +  nom  +  "  et  ma  potion  peut  aller d'une force " + effetPotionMin + " � " + effetPotionMax + "."); 
	} 
	
public String getNom() { 
	return nom; 
} 
public void parler(String texte) { 
	System.out.println(prendreParole() + "� " + texte + "�"); 
} 
private String prendreParole() { 
	return "Le druide " + nom + " : "; 
} 

public int preparerPotion() {
    Random valeur = new Random();
    forcePotion = valeur.nextInt(effetPotionMax - effetPotionMin) + effetPotionMin;
    
    if(forcePotion > 7) {
    	this.parler(" J'ai  pr�par� une super potion de force "+ forcePotion + " ");
    } else {
    	this.parler("Je n'ai pas trouv� les ingr�dients, ma potion est seulement de force " + forcePotion + " ");
    }
    return forcePotion;
}

public void booster(Gaulois gol) {
	if(gol.getNom() == "Obelix") {
		parler("Non Obelix, tu n'auras pas de potion magique");
		gol.parler("Par Belenos, ce n'est pas juste :");
	}
	else
		gol.setEffetPotion(forcePotion);
	
}

public static void main(String[] args) {
	Druide pano = new Druide("Panoramix", 5, 10);
	pano.preparerPotion();
}
} 