package oo.heranca.desafio;

// implements faz com que você implemente tal interface
public class Ferrari extends Carro implements Esportivo, Luxo {

    private boolean ligarTurbo;
    private boolean ligarAr;

    Ferrari() {
        this(400);
    }

    public Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
        setVelocidade(15);
    }

    // na hora de sobreescrever um metodo devemos manter a mesma visibilidade ou aumentar a visibilidade (nunca diminuir)
    @Override // só serve como uma validação que você está sobreescrevendo um metodo que existe na classe pai
    public void Acelerar() {
        if (velocidadeAtual >= super.VELOCIDADE_MAXIMA) {
            velocidadeAtual = super.VELOCIDADE_MAXIMA;
        } else {
            velocidadeAtual += getVelocidade();
        }
    }

    // quando usamos o implements e tal interface, somos obrigados a colocar os metodos que estão lá, aqui.
    @Override
    public void ligarTurbo() {
        ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;
    }

    @Override
    public void ligarAr() {
        ligarAr = true;
    }

    @Override
    public void desligarAr() {
        ligarAr = false;
    }

    @Override
    public int getVelocidade() {
        if (ligarTurbo && !ligarAr) {
            return 35;
        } else if (ligarTurbo && ligarAr) {
            return 30;
        } else if (!ligarTurbo && !ligarAr) {
            return 20;
        }
        return 15;
    }
}
