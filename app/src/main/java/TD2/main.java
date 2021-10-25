package TD2;

import java.util.HashMap;
import java.util.List;

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
        Supplier possède la capacité de retourner une valeur donc T comme retour et ne prend pas d'arguments
        Prédicat prend un T commee entrée et retourne un boolean. C'est souvent utilisé pour tester.
        Function prend un T vers U
        *
        * */
    }
}
