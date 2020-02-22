package tech.barny.sda;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Mapy {
    public static void main(String[] args) {
        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("Adam", 34);
        Integer wartośćAdam = mapa.get("Adam");
        System.out.println(wartośćAdam);
        Integer wartośćBorys = mapa.get("Borys");
        System.out.println(wartośćBorys);
        Integer wartośćBorys2 = mapa.getOrDefault("Borys", 0);
        System.out.println(wartośćBorys2);

        mapa.put("Adam", 40);
        mapa.put("Stach", 27);

//        mapa.putIfAbsent("Adam", 40);
//        te dwa dają wynik tego wyżej
//        mapa.replace("Adam", 40);

//        System.out.println(mapa.get("Adam"));
//        mapa.remove("Adam");
//        System.out.println(mapa.containsKey("Adam"));

        Map<String, List<Integer>> mapa2 = new HashMap<>();
        Map<String, Map<String, Integer>> mapa3 = new HashMap<>();

        final Set<Map.Entry<String, Integer>> entries = mapa.entrySet();
        System.out.println(entries);
        for (Map.Entry<String, Integer> wpis: entries){
            System.out.println("Mój kolega/moja koleżanka %s ma %d lat%n" + " " + wpis.getKey() + " " + wpis.getValue());

        }
        Set<String> klucze = mapa.keySet();
        System.out.println(klucze);

    }
}
