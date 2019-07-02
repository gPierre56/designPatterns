package fr.diginamic.factory.entity;

public class TelephonePortable extends ObjetConnecte {

	@Override
	public void recharger(int volts) {
		if (volts == limiteVolts) {
			System.out.println("Téléphone portable en charge");
		} else if (volts < limiteVolts) {
			System.out.println("Charge insuffisante pour le téléphone portable");
		} else {

			System.out.println("Téléphone portable grillé");
		}

	}

	public TelephonePortable() {
		this.limiteVolts = 5;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + limiteVolts;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TelephonePortable other = (TelephonePortable) obj;
		if (limiteVolts != other.limiteVolts)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TelephonePortable [limiteVolts=" + limiteVolts + "]";
	}

	/**
	 * Getter
	 * 
	 * @return the limiteVolts
	 */
	public int getLimiteVolts() {
		return limiteVolts;
	}

	/**
	 * Setter
	 * 
	 * @param limiteVolts the limiteVolts to set
	 */
	public void setLimiteVolts(int limiteVolts) {
		this.limiteVolts = limiteVolts;
	}

}
