package TD1.generalise;

public class Chaine implements Sommable<Chaine> {

    private String valeur;
    public Chaine(String valeur){
        this.valeur=valeur;
    }
    public String getValeur(){
        return this.valeur;
    }

    @Override
    public Chaine sommer(Chaine valeur){
        StringBuffer sb= new StringBuffer();
        sb.append(String.format("%s%s",this,valeur.getValeur()));
        return new Chaine(sb.toString());
    }

    @Override
    public int compareTo(final Chaine e){
        return this.valeur.compareTo(e.getValeur());
    }

}
