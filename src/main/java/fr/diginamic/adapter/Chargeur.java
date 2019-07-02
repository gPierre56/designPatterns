package fr.diginamic.adapter;

/**
 * @author Guillaume classe avec une méthode charger qui prend en parametre un
 *         objet connecté pour le charger
 *
 */
public class Chargeur {

	/**
	 * volts : int charge par défaut
	 */

	private int volts = 220;

	/**
	 * @param chargeable : n'importe quel objet connecté iplémentant l'interface
	 *                   chargeable cette méthode branche un appareil pour le
	 *                   charger avec la charge en volts par défaut de 220 volts
	 */
	public void brancher(Chargeable chargeable) {

		chargeable.recharger(volts);

	}

}
