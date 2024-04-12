package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Observador {

    public static void main(String[] args) {

        JFrame janela = new JFrame("Observador");
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // JFrame.DISPOSE_ON_CLOSE é uma constante com o valor que mata a aplicação e estamos definindo ela na operação padrão, quando fechamos a aplicação para ela não ficar executando num loop infinito
        janela.setSize(500, 500);
        janela.setLayout(new FlowLayout());
        janela.setLocationRelativeTo(null); // null centraliza a tela do computador
        
        JButton botao = new JButton("Clicar");

        janela.add(botao);

//        botao.addActionListener(new ActionListener() { // classe anonima que o java criou a partir de uma interface funcional (quando tem apenas um metodo no corpo da interface)
//            public void actionPerformed(ActionEvent e) { // metodo implementado da classe anonima
//                System.out.println("Evento Ocorreu!");
//            }
//        });

        botao.addActionListener(e -> { // usando lambda
            System.out.println("Evento Ocorreu");
        });

        janela.setVisible(true);

    }

}
