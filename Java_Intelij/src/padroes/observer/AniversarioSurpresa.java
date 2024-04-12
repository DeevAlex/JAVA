package padroes.observer;

public class AniversarioSurpresa {

    public static void main(String[] args) {

        Namorada namorada = new Namorada();
        Porteiro porteiro = new Porteiro();

        porteiro.addChegadaAniversarianteObserver(namorada);

        porteiro.addChegadaAniversarianteObserver(e -> {
            System.out.println("Surpresa via lambda");
            System.out.println("Ocorreu em: " + e.getHoraDaChegada());
        });

        porteiro.start(); // começar a monitorar os eventos

    }

}
