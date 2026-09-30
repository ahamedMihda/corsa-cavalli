package it.meucci;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
@ToString(exclude = "classifica")
@RequiredArgsConstructor

public final class Cavallo extends Thread{
    List<Cavallo> classifica = new ArrayList<>();
    private final String nome;
    private int distanza_percorsa = 0;
    private static final int DISTANZA_DA_PERCORRERE = 2000;

    @Override
    public void run(){
        Random r = new Random();
        while(distanza_percorsa < DISTANZA_DA_PERCORRERE){
            distanza_percorsa+=r.nextInt(1,200);
                    System.out.println(
                nome + " ha percorso " +
                distanza_percorsa + " metri"
            );

            try {
                int sleepToken = r.nextInt(r.nextInt(10,200));
                if(sleepToken >= 179) System.out.println(nome + " : ha sbattuto un'altro cavallo");
                Thread.sleep(sleepToken);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }

            if (distanza_percorsa >= DISTANZA_DA_PERCORRERE) {
                distanza_percorsa = DISTANZA_DA_PERCORRERE;

                synchronized (classifica) {
                    classifica.add(this);
                }

                System.out.println(nome + " ha finito la corsa");
                return;
            }
        }


    }

}
