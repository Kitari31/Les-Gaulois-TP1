package histoire;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois ("Astérix",8);
		Druide panoramix = new Druide ("Druide",5,10);
		Romain Minus = new Romain ("romain",6);
		asterix.parler("Bonjour à tous");
		Minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(Minus);
		asterix.frapper(Minus);
		asterix.frapper(Minus);
	}
}
