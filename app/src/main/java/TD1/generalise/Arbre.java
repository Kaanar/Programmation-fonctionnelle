package TD1.generalise;


import java.util.Set;



public interface Arbre<T extends Sommable<T> & Comparable> {
  int taille(); // nombre de valeurs//
  boolean contient(T val); // vrai si val est contenue dans l'arbre,faux sinon//
  Set<T> valeurs(); // ensemble des valeurs diff�rentes dans l'arbre//
  T somme(); //somme des valeurs//
  T min(); // valeur minimale//
  T max(); // valeur maximale//
  boolean estTrie(); // vrai si l'arbre est tri�, faux sinon//
  int compareTo();
}