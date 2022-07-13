package kz.bitlab.chapter1.task7.db;

import kz.bitlab.chapter1.task7.model.Footballer;

import java.util.ArrayList;

public class DBManager {
    private static ArrayList <Footballer> footballers = new ArrayList<>();
    private static Long id = 4L;
    static {
        footballers.add(new Footballer(1L, "Marco", "Reus", "Borussia Dortmund",
                11000000,13000000));
        footballers.add(new Footballer(2L, "Mohamed", "Salah", "Liverpool",
                12000000,100000000));
        footballers.add(new Footballer(3L, "Sadio", "Mane", "Liverpool",
                6000000,80000000));

    }

    public static void addFootballer(Footballer footballer){

        footballer.setId(id);
        footballers.add(footballer);
        id++;

    }
    public static ArrayList<Footballer> getAllFootballers(){
        return footballers;
    }
}
