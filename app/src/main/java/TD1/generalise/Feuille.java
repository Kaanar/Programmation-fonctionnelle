package TD1.generalise;

import java.util.Set;

public class Feuille<T> implements Arbre {
	
	private T value;
	public Feuille(T i) {                                                                                                                                                   
		this.value=i;
	}

	public int taille() {
		// TODO Auto-generated method stub
		return 1;
	}

	public boolean contient(Integer val) {
		// TODO Auto-generated method stub
		return false;
	}

	public Set<Integer> valeurs() {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer somme() {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer min() {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer max() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean estTrie() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean contient(Object val) {
		// TODO Auto-generated method stub
		return false;
	}

}
