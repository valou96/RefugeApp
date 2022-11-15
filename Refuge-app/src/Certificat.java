import java.sql.Date;
import java.time.LocalDate;

public class Certificat {
    
    private Date dateDelivrance;
    private Date dateExpiration;
    private Espece espece;

    public Certificat(Date dateDelivrance, Date dateExpiration, Espece espece) {
        this.dateDelivrance = dateDelivrance;
        this.dateExpiration = dateExpiration;
        this.espece = espece;
    }

    
    public Date getDateDelivrance() {
        return dateDelivrance;
    }


    public Date getDateExpiration() {
        return dateExpiration;
    }


    public Espece getEspece() {
        return espece;
    }

    public boolean CertifValid(){
        Boolean result = false;
        LocalDate todayDate = LocalDate.now();
        if (dateDelivrance + dateExpiration > todayDate){
            result = false;
        else
            result = true;
        }
        return result;
    }


    
}
