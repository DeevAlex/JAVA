package Lambdas;

public class Threads {

    public static void main(String[] args) {

        // Thread é um processo que pode ser executado paralelamente, ele tem duas formas de ser feito, pode ser feito por um unico processador e o processador vai escalona-lo

        Runnable trabalho1 = new Trabalho1(); // classe que implementa uma interface e que tem um pouco mais trabalho
        Runnable trabalho2 = new Runnable() { // definição de uma classe anonima
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        System.out.println("Tarefa #2");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }

        };

        // usando lambda
        Runnable trabalho3 = Threads::trabalho3;

        Thread t1 = new Thread(trabalho1);
        Thread t2 = new Thread(trabalho2);
        Thread t3 = new Thread(trabalho3);

        t1.start();
        t2.start();
        t3.start();

    }

    static void trabalho3() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Tarefa #3");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
