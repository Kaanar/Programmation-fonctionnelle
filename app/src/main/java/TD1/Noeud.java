package TD1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Noeud implements Arbre {

	private final List<Arbre> fils;
	
	public Noeud(List<Arbre> fils){
		this.fils= fils;
	}
	
	public int taille() {
		int rtr = 0;
		for(final Arbre a:fils){
			rtr+=a.taille();
		}
		return rtr;
	}
	

	public boolean contient(Integer val) {
		boolean rtr= false;
		for(final Arbre a:fils){
			if(a.contient(val)) return true;
			}
		return rtr;
	}

	public Set<Integer> valeurs() {
		TreeSet<Integer> rtr=new TreeSet();		
		for(final Arbre a:fils){
			rtr.addAll(a.valeurs());
		}
		return rtr;
	}

	public Integer somme() {
		int rtr=0;
		for(final Arbre a:fils){
			rtr+=a.somme();
		}
		return rtr;
	}

	public Integer min() {
		TreeSet<Integer> rtr=new TreeSet();
		for(final Arbre a:fils){
			rtr.add(a.max());
		}
		return rtr.first();
	}

	public Integer max() {
		TreeSet<Integer> rtr=new TreeSet();
		for(final Arbre a:fils){
			rtr.add(a.max());
		}
		return rtr.last();
	}

	public boolean estTrie() {
		boolean rtr=false;
		
		return rtr;
	}

}
