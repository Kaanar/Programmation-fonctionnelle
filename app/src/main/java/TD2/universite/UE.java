package TD2.universite;

import java.util.Map;

public class UE {

    public String nom;
    public Map<Matiere,Integer> ects;

    public UE(String nom, Map<Matiere,Integer> ects){
        this.nom=nom;
        this.ects=ects;
    }
}
