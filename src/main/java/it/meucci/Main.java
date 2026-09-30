package it.meucci;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Cavallo scintilla = new Cavallo("scintilla");
        Cavallo golem = new Cavallo("golem");

        scintilla.start();
        golem.start();
    }
}