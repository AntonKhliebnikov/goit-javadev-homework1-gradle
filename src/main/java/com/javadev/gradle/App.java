package com.javadev.gradle;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class App {
    public static void main(String[] args) {
        Person person = new Person();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String myName = gson.toJson(person);
        System.out.println(myName);
    }
}
