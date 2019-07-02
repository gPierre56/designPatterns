package fr.diginamic.adapter;

/**
 * @author Guillaume interface utilisée par les objets connectés pour se
 *         recharger
 *
 */
public interface Chargeable {

	/**
	 * @param volts : la charge envoyée à l'appareil pour le recharger Cette méthode
	 *              recharge un appareil connecté
	 */
	void recharger(int volts);

}
