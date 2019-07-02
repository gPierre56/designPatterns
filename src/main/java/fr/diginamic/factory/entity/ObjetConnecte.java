package fr.diginamic.factory.entity;

public abstract class ObjetConnecte {

	protected int limiteVolts;

	public abstract void recharger(int volts);

	public ObjetConnecte() {
		super();
	}

	@Override
	public String toString() {
		return "ObjetConnecte [limiteVolts=" + limiteVolts + "]";
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
		ObjetConnecte other = (ObjetConnecte) obj;
		if (limiteVolts != other.limiteVolts)
			return false;
		return true;
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