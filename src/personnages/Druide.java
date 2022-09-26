package personnages;

import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à "
				+ effetPotionMax + ".");
	}
	
	public void preparerPotion() {
		Random rand = new Random();
		this.forcePotion = rand.nextInt(effetPotionMin,effetPotionMax);
		if (forcePotion > 7) {
			System.out.println(prendreParole() + "« J'ai préparé une super potion de force »");
		}
		else {
			System.out.println(prendreParole() + "« Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force "
					+ forcePotion +" »");
		}
			
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
}
