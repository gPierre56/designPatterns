package fr.diginamic.adapter;

import fr.diginamic.factory.ObjetConnecteFactory;
import fr.diginamic.factory.entity.ObjetConnecte;
import fr.diginamic.factory.entity.TypeObjet;

/**
 * @author Guillaume Point d'entrée de l'application
 *
 */
public class TestChargeur {

	public static void main(String[] args) {

		Chargeur chargeur = new Chargeur();

		ObjetConnecte enceinte = ObjetConnecteFactory.getObjetConnecte(TypeObjet.ENCEINTE_CONNECTEE);
		ObjetConnecte telephone = ObjetConnecteFactory.getObjetConnecte(TypeObjet.TELEPHONE_PORTABLE);
		ObjetConnecte tablette = ObjetConnecteFactory.getObjetConnecte(TypeObjet.TABLETTE);

		chargeur.brancher(new ObjetConnecteAdapter(enceinte));
		chargeur.brancher(new ObjetConnecteAdapter(tablette));
		chargeur.brancher(new ObjetConnecteAdapter(telephone));

	}

}
