
public class Paire<A,B> implements IPaire<A,B>{

	private A fst;
	private B snd;
	public Paire(A fst, B snd){
		this.fst=fst;
		this.snd=snd;
	}
	public A fst(){return this.fst;}
	public B snd(){return this.snd;}

	 public<T> String toString(T x,T y){
		 return "("+x+","+y+") :: Paire["+x.getClass().getSimpleName()+","+y.getClass().getSimpleName()+"]";
	}
	public <C> IPaire<C, B> changeFst(C value) {
		Paire<C,B> a= new Paire(value,snd);
		return a;
	}
	public <C> IPaire<A, C> changeSnd(C value) {
		Paire<A,C> a= new Paire(this.fst,value);
		return a;		
	}
}
