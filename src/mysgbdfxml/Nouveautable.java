package mysgbdfxml;

import java.util.*;

public class Nouveautable {
    String nomTable;
    private List<Champs> champs = new ArrayList<>();
    private List<HashMap<String, String>> donnees = new ArrayList<HashMap<String, String>>();

    public void addEnreg() {
        HashMap<String, String> line = new HashMap<>();

        for (Champs champ: champs ) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Taper le " + champ.nom + " :");
            String valeur = scanner.next();


            line.put(champ.nom, valeur);
        }

        donnees.add(line);
    }

    public Nouveautable(String nomTable) {
        this.nomTable = nomTable;
    }

    public void addChamp(Champs champ) {
        this.champs.add(champ);
    }

    public void addChamp(Champs...ch) {
        Collections.addAll(champs, ch);
    }

    public String getNom() {
        return nomTable;
    }

    public void setNom(String nom) {
        this.nomTable = nom;
    }

}
