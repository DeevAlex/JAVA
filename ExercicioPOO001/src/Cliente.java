
public class Cliente {

    String nome;
    String endereco;
    int idade;
    boolean desconto;

    public boolean PossuiDesconto() {

        if (desconto) {
            return desconto;
        } else {
            return false;
        }

    }

    public void ComprarCurso() {

        if (desconto) {
            System.out.println("Voce acaba de comprar um produto com desconto");
        } else {
            System.out.println("Voce acaba de comprar um produto sem desconto");
        }
    }

    public boolean AtivarDesconto() {
        System.out.println("Desconto ativado para esse cliente");
        return desconto = true;
    }

    public boolean DesativarDesconto() {
        System.out.println("Desconto desativado para esse cliente");
        return desconto = false;
    }

}
