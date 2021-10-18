package TD1.First;

import java.util.Set;

public class Feuille<T> implements Arbre<T> {
	
	private T value;
	public Feuille(int i) {
		this.value=i;
	}

	public int taille() {
		return 0;
	}

	public boolean contient(Integer val) {
		// TODO Auto-generated method stub
		return false;
	}

	public Set<Integer> valeurs() {
		// TODO Auto-generated method stub
		return null;
	}

	public T somme() {
		return value;
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

}
