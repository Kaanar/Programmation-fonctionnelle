package TD1.First;

public class main {

	public static void main(String[] args) {

			Paire a= new Paire(10,2);
			System.out.println(a.toString(1, "un"));
			System.out.println(a.toString(1.0, "un"));
			System.out.println(a.toString(1.0,a));
	}

}
