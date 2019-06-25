package mysgbdfxml;


import com.google.gson.*;
import jdk.nashorn.internal.parser.JSONParser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class LectureJson {
    private static Gson gson = new GsonBuilder ()
            .setPrettyPrinting ()
            .create ();



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


    public static void lireId (String nomfichier, int id) throws Exception {
        JsonParser jsonParser = new JsonParser();

        Scanner scanner = new Scanner(new File(nomfichier));
        StringBuilder contentFile = new StringBuilder();

        while (scanner.hasNext()) {
            contentFile.append(scanner.next());
        }

        JsonElement jsonElement = jsonParser.parse(contentFile.toString());
        JsonObject jsonObject = jsonElement.getAsJsonObject();

        JsonArray data = jsonObject.get("donnees").getAsJsonArray();

        for (JsonElement jsele: data) {
            if (jsele.getAsJsonObject().get("Id").getAsInt()==id){

                System.out.println(jsele.getAsJsonObject().get("telephone").getAsString());
            }
            //System.out.println(jsele.getAsJsonObject().get("Id").getAsInt());
        }
    }
//    public static void lireConte (String nomfichier) throws Exception {
//        JsonParser jsonParser = new JsonParser();
//
//        Scanner scanner = new Scanner(new File(nomfichier));
//        StringBuilder contentFile = new StringBuilder();
//
//        while (scanner.hasNext()) {
//            contentFile.append(scanner.next());
//        }
//
//        JsonElement jsonElement = jsonParser.parse(contentFile.toString());
//        JsonObject jsonObject = jsonElement.getAsJsonObject();
//
//        JsonArray data = jsonObject.get("donnees").getAsJsonArray();
//
//        for (JsonElement jsele: data) {
//            System.out.println(jsele.getAsJsonObject().get("Id"));
//            System.out.println(jsele.getAsJsonObject().get("Postnom"));
//        }
//
////        for (JsonElement jsele: data) {
////            if (jsele.getAsJsonObject().get("Id").getAsInt()==1){
////                //jsele.getAsJsonObject().get("Postnom").getAsString()="Gaetan";
////                System.out.println(jsele.getAsJsonObject().get("telephone").getAsString());
////            }
////            //System.out.println(jsele.getAsJsonObject().get("Id").getAsInt());
////        }
//    }
//

    public static void main(String[] args) throws Exception{
        lireId("fichier.json", 1);
    }
}
