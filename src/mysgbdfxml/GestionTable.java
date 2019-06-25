package mysgbdfxml;

import java.io.File;
import java.io.IOException;

import static mysgbdfxml.ConversionStringToJson.serialisation;

public class GestionTable {
    
    public static boolean verifierBaseDesdonnees (String mon_base){
        String bd="C:\\Users\\Blackpyramide\\Documents\\NetBeansProjects\\mySGBDfxml\\bd\\"+mon_base+".json";
        boolean bool= false;
        File f1 = new File (bd);
        if(f1.exists()) bool = true;
        return bool;
    }
    public static  boolean creationBaseDesDonnees( String mon_base) throws IOException {
        String bd="C:\\Users\\Blackpyramide\\Documents\\NetBeansProjects\\mySGBDfxml\\bd\\"+mon_base+".json";
        
        
        boolean bool= false;
        File fichier = new File(bd) ;
        if (fichier.createNewFile())bool=true;
        return bool;
    }
    public static  boolean renomerBaseDesDonnes( String nom_Actuel, String nouveauNom) throws IOException {

        boolean bool= false;
        File fichier = new File(nom_Actuel) ;
        if(fichier.renameTo (new File (nouveauNom)))bool=true;
        return bool;
    }
    public static  boolean supprimerBaseDesDonnes( String nom_base) throws IOException {
        boolean bool= false;
        File fichier = new File(nom_base) ;
        if (fichier.delete ())bool=true;
        return bool;
    }
    public static void afficheListeBasse(String repectoire1) {
        File repertoire = new File(repectoire1);
        String liste[] = repertoire.list();

        if (liste != null) {
            for (int i = 0; i < liste.length; i++) {
                System.out.println(liste[i]);
            }
        } else {
            System.err.println("A Liste est vide");
        }
    }
    /*public static  boolean modifiercontenuetable( String nom_table, String nouveauNom) throws IOException {
        boolean bool= false;
        Nouveautable table = ConversionStringToJson.deserialisation(nom_table);
        //table.professeur[0].nom=nouveauNom;
        serialisation (ConversionStringToJson.conversionToJson (table));
        return bool;
    }*/

}
