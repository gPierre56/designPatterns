package fr.diginamic.factory.entity;

public class EnceinteConnectee extends ObjetConnecte {

	public EnceinteConnectee() {
		this.limiteVolts = 15;
	}

	@Override
	public String toString() {
		return "EnceinteConnectee [limiteVolts=" + limiteVolts + "]";
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}

	public void recharger(int volts) {
		if (volts == limiteVolts) {
			System.out.println("Enceinte connectée en charge");
		}

		else if (volts < limiteVolts) {
			System.out.println("Tension insuffisante pour l'enceinte connectée");

		}

		else {
			System.out.println("Enceinte grillée");
		}
	}

}
