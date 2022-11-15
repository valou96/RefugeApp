import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class RefugeTest {
    public static final String STATUT_ATTENTE = "en attente";

    @Test
    public void testConstructeurRefugeWith2Parameters(){
        Refuge refugeTest = new Refuge("SPA Annecy", "20 route des Oiseaux");
        assertEquals("SPA Annecy", refugeTest.getNom());
        assertEquals("20 route des Oiseaux", refugeTest.getAdresse());
    }

    @Test
    public void testFiltreAnimauxParEspece() {
        Refuge refugeTest = new Refuge("SPA Annecy", "20 route des Oiseaux");
        Espece chienTest = new Domestique("Chien");
        Espece chatTest = new Domestique("Chat");

        refugeTest.ajouterAnimal(new Animal("Dede", 2, STATUT_ATTENTE, 0, chienTest ));
        refugeTest.ajouterAnimal(new Animal("Titi", 4, STATUT_ATTENTE, 0, chienTest ));
        refugeTest.ajouterAnimal(new Animal("Coco", 8, STATUT_ATTENTE, 0, chatTest ));
        refugeTest.ajouterAnimal(new Animal("Zuzu", 1, STATUT_ATTENTE, 0, chatTest ));
        refugeTest.ajouterAnimal(new Animal("Kiki", 2, STATUT_ATTENTE, 0, chienTest ));

        ArrayList<Animal> animauxFiltreParEspeceChien = refugeTest.filtreEspece(chienTest);
        ArrayList<Animal> animauxFiltreParEspeceChat = refugeTest.filtreEspece(chatTest);

        assertEquals(3, animauxFiltreParEspeceChien.size());
        assertEquals(2, animauxFiltreParEspeceChat.size());

    }
}
