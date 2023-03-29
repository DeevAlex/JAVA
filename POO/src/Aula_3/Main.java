package Aula_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String marca, fabricante, codigoBarras, nome, rg, endereco, telefone, dataNascimento, profissao;
        float preco;

        Scanner e1 = new Scanner(System.in);

        System.out.println("Digite o nome da marca: ");
        marca = e1.nextLine();

        System.out.println("Digite o fabricante: ");
        fabricante = e1.nextLine();

        System.out.println("Digite o codigo de barras: ");
        codigoBarras = e1.nextLine();

        System.out.println("Digite o preco: ");
        preco = e1.nextFloat();

        Produto p = new Produto(marca, fabricante, codigoBarras, preco);

        System.out.println("\nMarca do Produto: " + p.marca);
        System.out.println("Fabricante do Produto: " + p.fabricante);
        System.out.println("Codigo de Barras: " + p.cod_barras);
        System.out.println("Preço: " + p.preco);

        System.out.println("\n--------------------------------------------------------\n");

        Scanner e2 = new Scanner(System.in);

        System.out.println("Digite o seu nome:");
        nome = e2.nextLine();

        Paciente pa = new Paciente(nome);

        System.out.println("Digite o seu rg:");
        pa.rg = e2.nextLine();

        System.out.println("Digite o seu endereco:");
        pa.endereco = e2.nextLine();

        System.out.println("Digite o seu telefone:");
        pa.telefone = e2.nextLine();

        System.out.println("Digite a sua data de nascimento:");
        pa.dataNascimento = e2.nextLine();

        System.out.println("Digite a sua profissao:");
        pa.profissao = e2.nextLine();

        System.out.println("\nnome: " + pa.nome);
        System.out.println("rg: " + pa.rg);
        System.out.println("endereco: " + pa.endereco);
        System.out.println("telefone: " + pa.telefone);
        System.out.println("data de nascimento: " + pa.dataNascimento);
        System.out.println("profissão: " + pa.profissao);

        e2.close();

    }
}