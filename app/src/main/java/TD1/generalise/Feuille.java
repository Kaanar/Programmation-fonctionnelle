package TD1.generalise;

import java.util.Set;

public class Feuille<T extends Sommable<T> & Comparable> implements Arbre<T> {
	
	private T value;
	public Feuille(T i) {                                                                                                                                                   
		this.value=i;
	}

	public T getValue(){
		return this.value;
	}


	public int taille() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public boolean contient(T val) {
		if (val.equals(this.getValue())){
			return true;
		}
		else return false;
	}

	@Override
	public Set<T> valeurs() {
		// TODO Auto-generated method stub
		return null;
	}

	public T somme() {
		return value;
	}

	public T min() {
		// TODO Auto-generated method stub
		return null;
	}

	public T max() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean estTrie() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int compareTo() {
		return 0;
	}

	public boolean contient(Object val) {
		// TODO Auto-generated method stub
		return false;
	}

}
