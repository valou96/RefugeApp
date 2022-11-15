import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AnimalTest {
    public static final String STATUT_ATTENTE = "en attente";

    @Test
    public void testVerifierAdoptionNonValidee() {
        Espece chienTest = new Domestique("Chien");
        Animal animalTest = new Animal("Dede", 2, STATUT_ATTENTE, 0, chienTest );

        assertFalse(animalTest.verifierAdoption());
    }

    @Test
    public void testVerifierAdoptionValidee() {
        Espece chienTest = new Domestique("Chien");
        Animal animalTest = new Animal("Dede", 2, STATUT_ATTENTE, 0, chienTest );
        animalTest.setIdentification("ID10221");
        animalTest.setIsVaccine(true);

        assertTrue(animalTest.verifierAdoption());
    }

    @Test
    public void testAdopterValide() {
        Espece chienTest = new Domestique("Chien");
        Animal animalTest = new Animal("Dede", 2, STATUT_ATTENTE, 0, chienTest );
        animalTest.setIdentification("ID10221");
        animalTest.setIsVaccine(true);
        Personne personneTest = new Personne("Dupuis", "Fabrice", "0660600606", "fab.dupuis@test.com");
        animalTest.adopter(personneTest);
        assertEquals(personneTest, animalTest.getBienfaiteur());
    }

    @Test
    public void testAdopterNonValide() {
        Espece chienTest = new Domestique("Chien");
        Animal animalTest = new Animal("Dede", 2, STATUT_ATTENTE, 0, chienTest );
        animalTest.setIdentification("ID10221");
        animalTest.setIsVaccine(false);
        Personne personneTest = new Personne("Dupuis", "Fabrice", "0660600606", "fab.dupuis@test.com");
        animalTest.adopter(personneTest);
        assertEquals(null, animalTest.getBienfaiteur());
    }

    @Test
    public void testAdopterSauvageNonValide() {
        Espece bisonTest = new Sauvage("Bison");
        Animal animalTest = new Animal("Bibi", 4, STATUT_ATTENTE, 0, bisonTest );
        animalTest.setIdentification("ID10221");
        animalTest.setIsVaccine(true);
        Personne personneTest = new Personne("Dupuis", "Fabrice", "0660600606", "fab.dupuis@test.com");
        animalTest.adopter(personneTest);
        assertEquals(null, animalTest.getBienfaiteur());
    }

    @Test
    public void testAdopterSauvageValide() {
        Espece bisonTest = new Sauvage("Bison");
        Animal animalTest = new Animal("Bibi", 4, STATUT_ATTENTE, 0, bisonTest );
        animalTest.setIdentification("ID10221");
        animalTest.setIsVaccine(true);
        Personne personneTest = new Personne("Dupuis", "Fabrice", "0660600606", "fab.dupuis@test.com");
        personneTest.setCertificatCapacite(true);
        animalTest.adopter(personneTest);
        assertEquals(personneTest, animalTest.getBienfaiteur());
    }





}
