package mysgbdfxml;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class ConversionStringToJson {


    private static Gson gson = new GsonBuilder ()
            .setPrettyPrinting ()
            .create ();
//    public  static  void Affiche(Object object, String texte){
//        try (FileReader fileReader = new FileReader(texte)) {
//            JsonObject jsonObject = (JsonObject) fileReader;
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        //return gson.fromJson (fileReader, Nouveautable.class);
//
//    }class
    /*public static String conversionToJson(Nouveautable texte){
        String chaine = gson.toJson (texte);
        return  chaine;
    }*/

    public static void serialisation (Object object,String nomTable) throws IOException {
        FileWriter g = new FileWriter (nomTable);
        String convertir = gson.toJson(object);
        g.write (convertir);
        g.flush ();
    }

    public static Object deserialisation(String table) throws FileNotFoundException {
        FileReader fileReader = new FileReader (table);
        Object nom = gson.fromJson (fileReader, Nouveautable.class);



        return gson.fromJson (fileReader, Nouveautable.class);
    }

}
