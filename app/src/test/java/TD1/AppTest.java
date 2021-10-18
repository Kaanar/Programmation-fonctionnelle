import TD1.generalise.Arbre;
import TD1.generalise.Entier;
import TD1.generalise.Feuille;
import TD1.generalise.Noeud;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


@SuppressWarnings("unchecked")
public class AppTest {


    public static final Arbre arbre0() {
        return new Noeud(new ArrayList<Arbre>());
    }

    public static final Arbre arbre1() {
        final Arbre<Integer> f1 = new Feuille<>(1);
        final Arbre<Integer> f2 = new Feuille<>(2);
        final Arbre<Integer> n1 = new Noeud(List.of(f1,f2));
        final Arbre<Integer> f3 = new Feuille<>(3);
        final Arbre<Integer> n2 = new Noeud(List.of(n1,f3));
        return n2;
    }

    public static final Arbre arbre2() {
        final Arbre<String> f1 = new Feuille<>("2");
        final Arbre<String> f2 = new Feuille<>("3");
        final Arbre<String> n1 = new Noeud(List.of(f1,f2));
        final Arbre<String> f3 = new Feuille<>(1);
        final Arbre<String> n2 = new Noeud(List.of(n1,f3));
        return n2;
    }

    public static final Arbre arbre3() {
        final Arbre f1 = new Feuille(2);
        final Arbre f2 = new Feuille(1);
        final Arbre n1 = new Noeud(List.of(f1,f2));
        final Arbre f3 = new Feuille(3);
        final Arbre n2 = new Noeud(List.of(n1,f3));
        return n2;
    }

    @Test
    @SuppressWarnings("unchecked")
    public void FeuilleInt(){
        Arbre<Integer> v= new Feuille<>(1);
        Assert.assertEquals(v.taille(),1);
    }

    @Test
    public void FeuilleString(){
        Arbre<String> v= new Feuille<>("un");
        Assert.assertEquals(v.taille(),1);
    }

    @Test public void testSize() {
        assertEquals(0, arbre0().taille());
        assertEquals(3, arbre1().taille());
        assertEquals(3, arbre2().taille());
        assertEquals(3, arbre3().taille());
    }

    @Test public void testContient() {
        assertFalse(arbre0().contient(1));
        assertFalse(arbre0().contient(2));
        assertFalse(arbre0().contient(3));
        assertFalse(arbre0().contient(4));
        assertTrue(arbre1().contient(1));
        assertTrue(arbre2().contient(1));
        assertTrue(arbre3().contient(1));
        assertTrue(arbre1().contient(2));
        assertTrue(arbre2().contient(2));
        assertTrue(arbre3().contient(2));
        assertTrue(arbre1().contient(3));
        assertTrue(arbre2().contient(3));
        assertTrue(arbre3().contient(3));
        assertFalse(arbre1().contient(4));
        assertFalse(arbre2().contient(4));
        assertFalse(arbre3().contient(4));
    }

    @Test public void testValeurs() {
        final Set<Integer> contenu = Set.of(1,2,3);
        assertEquals(Set.of(), arbre0().valeurs());
        assertEquals(contenu, arbre1().valeurs());
        assertEquals(contenu, arbre2().valeurs());
        assertEquals(contenu, arbre3().valeurs());
    }


    @Test public void testSommable(){
        final Set<Entier> contenu=Set.of(new Entier(1),new Entier(2),new Entier(3));
        assertEquals(Set.of(), arbre0().valeurs());
        assertEquals(contenu, arbre1().valeurs());
        assertEquals(contenu, arbre2().valeurs());
        assertEquals(contenu, arbre3().valeurs());
    }
}
