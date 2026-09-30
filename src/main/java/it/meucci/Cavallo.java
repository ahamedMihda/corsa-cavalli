package it.meucci;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
@ToString
@RequiredArgsConstructor

public final class Cavallo extends Thread{
    private final String nome;
    private int distanza_percorsa;
    private static final int DISTANZA_DA_PERCORRERE = 2000;

    
    public void run(){
        
    }

}
