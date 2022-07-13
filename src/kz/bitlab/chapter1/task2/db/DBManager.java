package kz.bitlab.chapter1.task2.db;

import kz.bitlab.chapter1.task2.model.User;

import java.util.ArrayList;

public class DBManager {

    private static ArrayList <User> allUsers = new ArrayList<>();

    static {
        allUsers.add( new User("Ilyas", "Zhuanyshev","IT", 550000));
        allUsers.add( new User("Aybek", "Bagit","Management", 650000));
        allUsers.add( new User("Alibek", "Serikov","HR", 350000));
        allUsers.add( new User("Serzhan", "Berikov","IT", 450000));
        allUsers.add( new User("Madina", "Assetova","PR", 350000));
        allUsers.add( new User("Anel", "Muhammedzhanova","Management", 400000));
    }

    public static ArrayList<User> getAllUsers(){
        return allUsers;
    }
}
