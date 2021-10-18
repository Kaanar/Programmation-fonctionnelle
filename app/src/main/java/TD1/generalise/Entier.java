package TD1.generalise;

public class Entier implements Sommable<Entier>{
		private int valeur;
		
		public Entier(int valeur){
			this.valeur=valeur;
		}

		public int getValeur(){
			return this.valeur;
		}

	@Override
	public Entier sommer(Entier value){
			return new Entier(this.valeur + value.getValeur());
	}
}
