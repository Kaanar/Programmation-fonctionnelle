package TD1.generalise;


import java.util.Set;



public interface Arbre<T> {
  int taille(); // nombre de valeurs//
  boolean contient(T val); // vrai si val est contenue dans l'arbre,faux sinon//
  Set<T> valeurs(); // ensemble des valeurs différentes dans l'arbre//
  Integer somme(); // somme des valeurs//
  Integer min(); // valeur minimale//
  Integer max(); // valeur maximale//
  boolean estTrie(); // vrai si l'arbre est trié, faux sinon//
}