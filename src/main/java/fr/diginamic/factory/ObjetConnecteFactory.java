package fr.diginamic.factory;

import fr.diginamic.factory.entity.EnceinteConnectee;
import fr.diginamic.factory.entity.ObjetConnecte;
import fr.diginamic.factory.entity.Tablette;
import fr.diginamic.factory.entity.TelephonePortable;
import fr.diginamic.factory.entity.TypeObjet;

public class ObjetConnecteFactory {

	public static ObjetConnecte getObjetConnecte(TypeObjet type) {
		if (type.equals(TypeObjet.TABLETTE)) {
			return new Tablette();
		}

		else if (type.equals(TypeObjet.ENCEINTE_CONNECTEE)) {
			return new EnceinteConnectee();
		}

		else if (type.equals(TypeObjet.TELEPHONE_PORTABLE)) {
			return new TelephonePortable();
		}
		return null;
	}

}
