package com.example.Car_App;

import android.app.Application;

import java.util.ArrayList;

public class Global extends Application {
    static ArrayList<Information> record;








    @Override
    public void onCreate() {
        super.onCreate();

        record=new ArrayList<>();

        record.add(new Information("Ahmad Raza","MERCEDES","03424018762","BE24"));
        record.add(new Information("Ali Raza","NISSAN","03424018762","N24"));
        record.add(new Information("Abdul Rehman","VOLKSWAGEN","03424018762","W22V8"));
        record.add(new Information("Husnain Arain","MERCEDES","03424018762","BE24"));
        record.add(new Information("Junaid Arain","VOLKSWAGEN","03424018762","W22V8"));
        record.add(new Information("Hamza","NISSAN","03424018762","N24"));
        record.add(new Information("Rana Waqas","MERCEDES","03424018762","BE24"));
        record.add(new Information("Ronaldo","VOLKSWAGEN","03424018762","W22V8"));
        record.add(new Information("Messi","NISSAN","03424018762","N24"));




}



}
