package histoire;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;

public class Scénario {

	public static void main(String[] args) {
		Gaulois Asterix = new Gaulois ("Astérix",8);
		Gaulois Obélix = new Gaulois ("Obélix",15);
		Druide Panoramix = new Druide ("Panoramix",5,10);
		Romain Minus = new Romain ("Minus",6);
		Panoramix.parler("« Je vais aller préparer une petite potion...»");
		Panoramix.booster(Obélix);
		Obélix.parler("« Par Bélénos, ce n'est pas juste !»");
		Panoramix.booster(Asterix);
		Asterix.parler("Bonjour à tous");
		Minus.parler("UN GAU... UN GAUGAU...");
		Asterix.frapper(Minus);
		Asterix.frapper(Minus);
		Asterix.frapper(Minus);
	}
}