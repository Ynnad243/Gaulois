package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Ast�rix", 3);
		Gaulois obel = new Gaulois("Obelix", 8);
		Romain minus = new Romain("Minus", 6);
		Druide pano = new Druide("Panoramix", 5, 10);
		pano.preparerPotion();
		pano.booster(obel);
		pano.booster(asterix);
		
		asterix.parler("Bonjour � tous");
		minus.parler("UN GAU...GAU...  UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
		
	}

}
