package TD1.generalise;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class AppTest {
	
	@Test
	public void testFeuilleInt(){
		Arbre<Integer> v= new Feuille<>(1);
		Assert.assertEquals(v.taille(),1);
	}
	
	@Test
	public void testFeuilleString(){
		Arbre<String> v= new Feuille<>("un");
		Assert.assertEquals(v.taille(),1);
	}
}
