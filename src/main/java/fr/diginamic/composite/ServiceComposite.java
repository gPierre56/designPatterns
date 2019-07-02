package fr.diginamic.composite;

import java.util.ArrayList;
import java.util.List;

public class ServiceComposite implements IElement {

	private List<IElement> children;

	public ServiceComposite() {
		children = new ArrayList<IElement>();
	}

	public void add(IElement element) {
		children.add(element);
	}

	public void remove(IElement element) {
		children.remove(element);
	}

	public double calculerSalaire() {
		int salaire = 0;
		for (int i = 0; i < children.size(); i++) {
			salaire += children.get(i).calculerSalaire();
		}
		return salaire;
	}

}
