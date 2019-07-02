package fr.diginamic.designPatterns;

import fr.diginamic.factory.ObjetConnecteFactory;
import fr.diginamic.factory.entity.ObjetConnecte;
import fr.diginamic.factory.entity.TypeObjet;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ObjetConnecte enceinte = ObjetConnecteFactory.getObjetConnecte(TypeObjet.ENCEINTE_CONNECTEE);
		enceinte.recharger(15);
		enceinte.recharger(5);
		enceinte.recharger(20);

		ObjetConnecte telephone = ObjetConnecteFactory.getObjetConnecte(TypeObjet.TELEPHONE_PORTABLE);
		telephone.recharger(5);
		telephone.recharger(0);
		telephone.recharger(10);

		ObjetConnecte tablette = ObjetConnecteFactory.getObjetConnecte(TypeObjet.TABLETTE);
		tablette.recharger(10);
		tablette.recharger(5);
		tablette.recharger(55);
	}
}
