package fr.diginamic.adapter;

import fr.diginamic.factory.entity.ObjetConnecte;

/**
 * @author Guillaume Adapteur des classes objet connectés pour pouvoir utiliser
 *         correctement la méthode charger
 *
 */
public class ObjetConnecteAdapter implements Chargeable {

	/**
	 * objet : ObjetConnecte prend en attribut un objet connecté
	 */
	private ObjetConnecte objet;

	/**
	 * Constructor
	 * 
	 * @param objet connecté
	 */
	public ObjetConnecteAdapter(ObjetConnecte objet) {

		this.objet = objet;
	}

	/**
	 * cette méthode s'assure que le charge envoyé à l'appreil n'excède pas sa
	 * capacité maximale
	 */
	public void recharger(int volts) {

		int chargeAdapte = volts > objet.getLimiteVolts() ? objet.getLimiteVolts() : volts;
		this.objet.recharger(chargeAdapte);
	}

}
