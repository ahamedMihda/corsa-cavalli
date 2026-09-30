package it.meucci;

import java.util.Random;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
@ToString
@RequiredArgsConstructor

public final class Cavallo extends Thread{
    private final String nome;
    private int distanza_percorsa = 0;
    private static final int DISTANZA_DA_PERCORRERE = 2000;

    @Override
    public void run(){
        Random r = new Random();
        while(distanza_percorsa < DISTANZA_DA_PERCORRERE){
            distanza_percorsa+=200;
                    System.out.println(
                nome + " ha percorso " +
                distanza_percorsa + " metri"
            );

            try {
                int sleepToken = r.nextInt(400) + 400;
                Thread.sleep(sleepToken);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }


    }

}
