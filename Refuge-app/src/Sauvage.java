import java.util.ArrayList;

public class Sauvage extends Espece{

    public Sauvage(String nom) {
        super(nom);
    }

  
    @Override
    public Boolean necessiteCertificat() {
        return true;
    }


}
