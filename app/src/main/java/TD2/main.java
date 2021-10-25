package TD2;

import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;

public class main {
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
        Supplier poss�de la capacit� de retourner une valeur donc T comme retour et ne prend pas d'arguments
        Pr�dicat prend un T commee entr�e et retourne un boolean. C'est souvent utilis� pour tester.
        Function prend un T vers U
        *
        * */

        //Exercice 2 Question 1
        Predicate<Paire<Integer,Double>> TropPetit = x -> x.fst < 100;
        Predicate<Paire<Integer,Double>> TropGrand = x -> x.fst > 200;
        Predicate<Paire<Integer,Double>> TailleIncorrecte = x->(TropPetit.test(x) || TropGrand.test(x));
        Predicate<Paire<Integer,Double>> TailleCorrecte = x->(!TailleIncorrecte.test(x));
        Predicate<Paire<Integer,Double>> TropLourd = x -> x.snd > 150.0;
        Predicate<Paire<Integer,Double>> PoidsCorrect = x -> !TropLourd.test(x);
        Predicate<Paire<Integer,Double>> AccesAutorise = x -> TailleCorrecte.test(x) && PoidsCorrect.test(x);

        List<Paire<Integer,Double>> test;



    }

}
