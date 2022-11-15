import java.time.LocalDate;
import java.time.ZoneId;

public class Animal {
    private String nom;
    private int age;
    private String statut;
    private int photo;
    private Espece espece;
    private String dateArrivee;
    private String dateDepart;
    private String identification;
    private Boolean isVaccine;
    private Personne bienfaiteur;

    public Animal(String nom, int age, String statut, int photo, Espece espece) {
        this.nom = nom;
        this.age = age;
        this.statut = statut;
        this.photo = photo;
        this.espece = espece;

        this.identification = null;
        this.isVaccine = false;
        ZoneId myZone = ZoneId.of( "Europe/Paris" );
        LocalDate today = LocalDate.now(myZone);  
        this.dateArrivee = today.toString();
        this.dateDepart = null;
        this.bienfaiteur = null;
    }

    public String getNom() {
        return nom;
    }
    public int getAge() {
        return age;
    }
    public String getStatut() {
        return statut;
    }
    public int getPhoto() {
        return photo;
    }

    public Espece getEspece() {
        return espece;
    }

    public boolean verifierAdoption(){
        boolean isValid = false;
        if(this.statut.equals("en attente") && this.identification != null && isVaccine == true){
            isValid = true;
        }
        return isValid;
    }

    public void adopter(Personne unePersonne){
        ZoneId myZone = ZoneId.of( "Europe/Paris" );
        LocalDate today = LocalDate.now(myZone);  
        Boolean check = false;
        
        if(verifierAdoption()){
            if(espece.necessiteCertificat()){
                if(unePersonne.getCertificatCapacite()){
                    check = true;
                }
            }
            else{
                check = true;
            }
        }
        if(check){
            bienfaiteur = unePersonne;
            this.dateDepart = today.toString();
        }
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public void setIsVaccine(Boolean isVaccine) {
        this.isVaccine = isVaccine;
    }

    public Personne getBienfaiteur() {
        return bienfaiteur;
    }
    


}
