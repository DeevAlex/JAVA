
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);
        Pessoa p = new Pessoa();
        Banco b = new Banco();
        ArrayList<Banco> contas = new ArrayList<Banco>();
        ArrayList<Pessoa> clientes = new ArrayList<Pessoa>();
        String resp = "";
        String titular = null;
        int opcoes;
        int numeroConta;
        double saldoInicial;


        while(!resp.equalsIgnoreCase("Sair")) {

            System.out.println("\n1 - Cadastrar Cliente");
            System.out.println("2 - Cadastrar Conta");
            System.out.println("3 - Consultar Saldo");
            System.out.println("4 - Exibir Todas as Contas Cadastradas");
            System.out.println("5 - Sacar Dinheiro");
            System.out.println("6 - Depositar Dinheiro");
            System.out.println("7 - Sair\n");
            opcoes = e.nextInt();

            switch(opcoes) {
                case 1:
                    System.out.println("Digite o seu nome: ");
                    p.nome = e.next();
                    System.out.println("Digite o seu cpf: ");
                    p.cpf = e.next();

                    clientes.add(new Pessoa(p.nome, p.cpf));

                    break;
                case 2:
                    System.out.println("Digite o numero da sua conta");
                    b.numeroConta = e.nextInt();

                    if (b.numeroConta == 0) {
                        System.out.println("Digite o numero da conta acima de 0");
                        return;
                    }

                    System.out.println("Digite o saldo inicial da sua conta");
                    b.saldo = e.nextDouble();

                    System.out.println("Digite o cpf do titular dessa conta");
                    titular = e.next();

                    if (!titular.equals(p.getCpf())) {
                        System.out.println("Erro: o cpf do titular deve ser igual ao cadastrado no cliente");
                        return;
                    }

                    contas.add(new Banco(b.numeroConta, b.saldo, p.getCpf()));

                    break;
                case 3:

                    System.out.println("Informe o numero da conta a ser consultada: ");
                    int contaConsultada = e.nextInt();

                    if (contaConsultada == b.numeroConta) {
                        System.out.println("Você Possuí: R$" + b.getSaldo() + " de saldo");
                    } else {
                        System.out.println("A conta informada não existe");
                        return;
                    }

                    break;
                case 4:
                    for(Banco c : contas) {
                        System.out.println("");
                        System.out.println("Numero da Conta: " + c.numeroConta);
                        System.out.println("Voce Possuí de Saldo: R$" + c.saldo);
                        System.out.println("Cpf do Titular: " + c.cliente);
                        System.out.println("");
                    }
                    break;
                case 5:

                    System.out.println("Informe o numero da conta para saque: ");
                    int contaSaque = e.nextInt();

                    if (contaSaque == b.numeroConta) {
                        System.out.println("Você Possuí: " + b.getSaldo());
                    } else {
                        System.out.println("A conta informada não existe");
                        return;
                    }

                    System.out.println("digite o quanto deseja sacar:");
                    int qtdSacar = e.nextInt();

                    if (qtdSacar > b.getSaldo()) {
                        System.out.println("Saldo insuficiente");
                        return;
                    }

                    b.sacarDinheiro(qtdSacar);
                    System.out.println("Foi sacado: -R$" + qtdSacar + " e agora restam R$" + b.saldo);
                    break;
                case 6:

                    System.out.println("Informe o numero da conta o deposito: ");
                    int contaDeposito = e.nextInt();

                    if (contaDeposito == b.numeroConta) {
                        System.out.println("digite o quanto deseja depositar:");
                        double qtddepositar = e.nextDouble();

                        b.depositar(qtddepositar);
                        System.out.println("Foi depositado: +R$" + qtddepositar + " e agora voce possuí R$" + b.saldo);
                    } else {
                        System.out.println("A conta informada não existe");
                        return;
                    }
                    break;
                case 7:
                    resp = "Sair";
                    System.out.println("Obrigado por utilizar nosso sistema\n");
                    break;
            }
        }


    }
}