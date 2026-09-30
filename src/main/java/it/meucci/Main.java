package it.meucci;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        ArrayList<Cavallo> cavalli = new ArrayList<>();
        ArrayList<Cavallo> classifica = new ArrayList<>();

        cavalli.add(new Cavallo("Scintilla", classifica));
        cavalli.add(new Cavallo("Golem", classifica));
        cavalli.add(new Cavallo("gigante elettrico", classifica));
        cavalli.add(new Cavallo("megaknight", classifica));
         cavalli.add(new Cavallo("hog rider", classifica));
          cavalli.add(new Cavallo("baby dragon", classifica));
           cavalli.add(new Cavallo("padilla", classifica));

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

        IntStream.range(0, classifica.size())
                .forEach(i -> {
                    System.out.println(
                            (i + 1) + "° posto: " +
                            classifica.get(i).getNome()
                    );
                });

        }
}