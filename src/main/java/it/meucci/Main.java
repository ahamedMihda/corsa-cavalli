package it.meucci;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Cavallo> cavalli = new ArrayList<>();
        ArrayList<Cavallo> classifica = new ArrayList<>();

        cavalli.add(new Cavallo("Scintilla", classifica));
        cavalli.add(new Cavallo("Golem", classifica));
        cavalli.add(new Cavallo("Fulmine", classifica));
        cavalli.add(new Cavallo("Freccia", classifica));

        for (Cavallo cavallo : cavalli) {
            cavallo.start();
        }

        for (Cavallo cavallo : cavalli) {
            try {
                cavallo.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println();
        System.out.println("CLASSIFICA FINALE");

        for (int i = 0; i < classifica.size(); i++) {
            System.out.println(
                    (i + 1) + "° posto: " +
                    classifica.get(i).getName()
            );
        }
    }
}