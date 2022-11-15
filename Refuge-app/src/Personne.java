import java.util.ArrayList;

public class Personne {
    private String nom;
    private String prenom;
    private String tel;
    private String mail;
    private Boolean certificatCapacite;
    
    public Personne(String nom, String prenom, String tel, String mail) {
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.mail = mail;
        this.certificatCapacite = false;
    }
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public String getTel() {
        return tel;
    }
    public String getMail() {
        return mail;
    }
    public Boolean getCertificatCapacite() {
        return certificatCapacite;
    }
    public void setCertificatCapacite(Boolean certificatCapacite) {
        this.certificatCapacite = certificatCapacite;
    }
    
}
