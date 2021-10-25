package TD2;

import TD2.universite.Annee;
import TD2.universite.Etudiant;
import TD2.universite.Matiere;
import TD2.universite.UE;

import java.util.*;
import java.util.function.Predicate;

public class main {
    //Exercice 2 question 2//
    public static <T> Predicate <T> predGen(List<Predicate<T>> pred)
    {
        int i;
        Predicate<T> p = pred.get(0);
        for(i=1; i >= pred.size();i++)
        {
            p=p.and(pred.get(i));
        }
        return p;
    }

    public <T> List<T> g(List<Predicate<T>> ps , List<T> es )
    {
        Predicate<T> global = predGen(ps);
        List<T> rtr = new ArrayList<>();
        for(T e : es)
        {
            if(global.test(e))
            {
                rtr.add(e);
            }
        }
        return rtr;
    }

    //Exercice 3 question 1//
    public void afficheSi(String entete, Predicate<Etudiant> etudiantPredicate, Annee annee){
        /*
        System.out.println(entete,);*/
    }


    public static void main(String[] args) {

       //Exercice 1 question 1//
        Somme<Integer> sommeInt = (x,y) -> x+y;
        Somme<Double> sommeDouble = (x,y) -> x+y;
        Somme<Long> sommeLong = (x,y) -> x+y;
        Somme<String> sommeString = (x,y) -> x+y;

        //Exercice 1 question 2//
        ToString<List<String>> Listconvert = x-> {
            String response = "";
            response+=x.get(0);
            for(int i=1;i<x.size();i++){
                response=response+", "+x.get(i).toString();
            }
            return response;
        };


        ToString<HashMap<String,Integer>> Mapconvert = x-> {
            String response = "";
            for(int i=0;i<x.size();i++){
                response=response+", "+x.keySet()+": "+x.get(x.keySet());
            }
            return response;
        };

        //Exercice 1 question 3//
        /*Consume prend un T comme argument et ne retourne rien
        Supplier possède la capacité de retourner une valeur donc T comme retour et ne prend pas d'arguments
        Prédicat prend un T commee entrée et retourne un boolean. C'est souvent utilisé pour tester.
        Function prend un T vers U
        *
        * */

        //Exercice 2 Question 1
        Predicate<Paire<Integer,Double>> TropPetit = x -> x.fst < 100;
        Predicate<Paire<Integer,Double>> TropGrand = x -> x.fst > 200;
        Predicate<Paire<Integer,Double>> TailleIncorrecte = x->(TropPetit.test(x) || TropGrand.test(x));
        Predicate<Paire<Integer,Double>> TailleCorrecte = x->!TailleIncorrecte.test(x);
        Predicate<Paire<Integer,Double>> TropLourd = x -> x.snd > 150.0;
        Predicate<Paire<Integer,Double>> PoidsCorrect = x -> !TropLourd.test(x);
        Predicate<Paire<Integer,Double>> AccesAutorise = x -> TailleCorrecte.test(x) && PoidsCorrect.test(x);

        Paire<Integer,Double> Alex= new Paire<>(95,65.0);
        Paire<Integer,Double> Bob= new Paire<>(167,75.0);
        Paire<Integer,Double> Coraline= new Paire<>(152,167.0);

        System.out.println(AccesAutorise.test(Alex));
        System.out.println(AccesAutorise.test(Bob));
        System.out.println(AccesAutorise.test(Coraline));



        //Exercice 2 question 2 -> Voir classe main//

        //Exercice 3 question 1
        Matiere m1 = new Matiere("MAT1");
        Matiere m2 = new Matiere("MAT2");
        UE ue1 = new UE("UE1", Map.of(m1, 2, m2, 2));
        Matiere m3 = new Matiere("MAT3");
        UE ue2 = new UE("UE2", Map.of(m3, 1));
        Annee a1 = new Annee(Set.of(ue1, ue2));
        Etudiant e1 = new Etudiant("39001", "Alice", "Merveille", a1);
        e1.noter(m1, 12.0);
        e1.noter(m2, 14.0);
        e1.noter(m3, 10.0);
        System.out.println(e1);
        Etudiant e2 = new Etudiant("39002", "Bob", "Eponge", a1);
        e2.noter(m1, 14.0);
        e2.noter(m3, 14.0);
        Etudiant e3 = new Etudiant("39003", "Charles", "Chaplin", a1);
        e3.noter(m1, 18.0);
        e3.noter(m2, 5.0);
        e3.noter(m3, 14.0);


        //Exercice 3 question 2//
        Predicate<Etudiant> aDEF = x->{
            for(int i=0; i<x.getNotes().size();i++){
                if (x.getNotes().get(x.getNotes().keySet())==null){
                    return false;
                }
            }
            return true;
        };

        //Exercice 3 question 3//
        Predicate<Etudiant> aNoteEliminatoire = x->{
            for(int i=0;i<x.getNotes().size();i++){
                if(x.getNotes().get(x.getNotes().keySet())<6){
                    return false;
                }
            }
            return true;
        };
    }
    //

}
