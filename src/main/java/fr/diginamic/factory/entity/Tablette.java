package fr.diginamic.factory.entity;

public class Tablette extends ObjetConnecte {

	public Tablette() {
		this.limiteVolts = 10;
	}

	@Override
	public String toString() {
		return "Tablette []";
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
			System.out.println("Tablette en charge");
		} else if (volts < limiteVolts) {
			System.out.println("Tension insuffisante pour la tablette");
		}

		else {
			System.out.println("Tablette grillée");
		}

	}

}
