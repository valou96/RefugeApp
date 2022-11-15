import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {

        Map<String, Double> dictionnaireContribution = new HashMap<String, Double>();
        dictionnaireContribution.put("Chat", 130.00);
        dictionnaireContribution.put("Chien", 220.00);
        dictionnaireContribution.put("Bison", 875.90);
        dictionnaireContribution.put("Serpent", 330.00);

        Double contributionChien = dictionnaireContribution.get("Chien"); // Récupération de la valeur de la
                                                                          // contribution financière pour la clé Chien.

    }
}
