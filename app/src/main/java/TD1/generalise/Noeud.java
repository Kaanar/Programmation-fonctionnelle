package TD1.generalise;

import TD1.generalise.Sommable;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Noeud<T extends Sommable<T>> implements Arbre<T> {

	private final List<Arbre<T>> fils;

	public Noeud(List<Arbre<T>> fils){
		this.fils= fils;
	}

	public int taille() {
		int rtr = 0;
		for(final Arbre<T> a:fils){
			rtr+=a.taille();
		}
		return rtr;
	}

	@Override
	public boolean contient(T val) {
		return false;
	}


	public boolean contient(Integer val) {
		boolean rtr= false;
		for(final Arbre<T> a:fils){
			if(a.contient(val)) return true;
		}
		return rtr;
	}

	public Set<Integer> valeurs() {
		TreeSet<Integer> rtr=new TreeSet();
		for(final Arbre<T> a:fils){
			rtr.addAll(a.valeurs());
		}
		return rtr;
	}

	@Override
	public T somme() {
		if(fils==null) return null;
		else if(fils.size()==0) return null;
		else{
			T v= (T) fils.get(0).somme();
			for(int i=1;i< fils.size();i++){
				v=v.sommer(fils.get(i).somme());
			}
			return v;
		}
	}

	public T min() {
		if(fils==null) return null;
		else if(fils.size()==0) return null;
		else{
			T v= (T) fils.get(0).min();
			for(int i=1;i< fils.size();i++){
				if(fils.get(i).min().compareTo(v){
					v=v.sommer(fils.get(i).somme());
				}
			}
			return v;
		}
	}

	public T max() {
		TreeSet<Integer> rtr=new TreeSet();
		for(final Arbre<T> a:fils){
			rtr.add(a.max());
		}
		return rtr.last();
	}

	public boolean estTrie() {
		boolean rtr=false;

		return rtr;
	}

}
