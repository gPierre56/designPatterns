package fr.diginamic.composite;

public class TestComposite {

	public static void main(String[] args) {

		ServiceComposite DSIN = new ServiceComposite();
		DSIN.add(new Employe(10000, "machin", "cécile"));
		DSIN.add(new Employe(8000, "truc", "bilel"));

		ServiceComposite bigData = new ServiceComposite();
		bigData.add(new Employe(7500, "ranmey", "jb"));
		bigData.add(new Employe(3500, "doe", "jane"));

		ServiceComposite javaDev = new ServiceComposite();
		javaDev.add(new Employe(7500, "guineau", "kevin"));
		javaDev.add(new Employe(3500, "martin", "paul"));

		System.out.println(DSIN.calculerSalaire());
		System.out.println(bigData.calculerSalaire());
		System.out.println(javaDev.calculerSalaire());

	}

}
