package padroes.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro extends Thread {

    private List<ChegadaAniversarianteObserver> Observers = new ArrayList<ChegadaAniversarianteObserver>();

    public void addChegadaAniversarianteObserver(ChegadaAniversarianteObserver observer) {
        this.Observers.add(observer);
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            int valor = scanner.nextInt();

            if (valor == 1) {
                ChegadaAniversarianteEvent event = new ChegadaAniversarianteEvent(new Date());

                // Notifcar os observers

                for (ChegadaAniversarianteObserver observer : this.Observers) {
                    observer.Chegou(event);
                }

            } else {
                System.out.println("Alarme falso");
            }


        }

    }

}
