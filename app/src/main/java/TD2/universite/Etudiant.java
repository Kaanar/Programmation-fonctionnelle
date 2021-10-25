package TD2.universite;

import java.util.Map;

public class Etudiant {

    private String numero;
    private String prenom;
    private String nom;
    private Map<Matiere,Double> notes;

    public Etudiant(String numero, String prenom, String nom, Annee annee){
        this.numero=numero;
        this.prenom=prenom;
        this.nom=nom;
    }

    public String getPrenom(){
        return this.prenom;
    }
    public String getNumero(){
        return this.numero;
    }
    public String getNom(){
        return this.nom;
    }
    public Map<Matiere,Double> getNotes(){
        return this.notes;
    }

    public void noter(Matiere matiere, Double note){
        this.notes.put(matiere,note);
    }
}
