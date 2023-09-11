package oo.polimorfismo;

public class Pessoa {

    private double peso;

    public Pessoa(double peso) {
        setPeso(peso);
    }

    // sobrecarga de metodos (polimorfismo estatico):
//    public void Comer(Arroz arroz) {
//        this.peso += arroz.getPeso();
//    }
//
//    public void Comer(Feijao feijao) {
//        this.peso += feijao.getPeso();
//    }
//
//    public void Comer(Sorvete sorvete) {
//        this.peso += sorvete.getPeso();
//    }
    //

    // polimorfismo dinamico
    public void Comer(Comida comida) {
        this.peso += comida.getPeso();
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso >= 0) {
            this.peso = peso;
        }
    }

}
