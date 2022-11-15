import java.util.ArrayList;

public class Refuge {
    private String nom;
    private String adresse;
    private ArrayList<Animal> animaux;
    private ArrayList<Espece> especes;

    public Refuge(String nom, String adresse) {
        this.nom = nom;
        this.adresse = adresse;
        this.animaux = new ArrayList<Animal>();
        this.especes = new ArrayList<Espece>();
    }

    public void ajouterAnimal(Animal unAnimal){
        animaux.add(unAnimal);
    }

    public ArrayList<Animal> filtreEspece(Espece uneEspece){
        ArrayList<Animal> animauxSelonEspece = new ArrayList<Animal>();
        for (Animal currentAnimal : animaux) {
            if(currentAnimal.getEspece().getNom().equals(uneEspece.getNom())){
                animauxSelonEspece.add(currentAnimal);
            }
        }
        return animauxSelonEspece;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

}
