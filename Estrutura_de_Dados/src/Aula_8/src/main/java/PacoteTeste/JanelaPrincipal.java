/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PacoteTeste;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lena
 */
public class JanelaPrincipal extends javax.swing.JFrame {

    private String t, d, g, p, a;
    Queue filmes = new Queue();
    Queue filmeAcao = new Queue();
    Queue filmeRemovidos = new Queue();

    /**
     * Creates new form JanelaPrincipal
     */
    public JanelaPrincipal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        inputDiretor = new javax.swing.JTextField();
        inputTitulo = new javax.swing.JTextField();
        inputPais = new javax.swing.JTextField();
        inputAno = new javax.swing.JTextField();
        inputGenero = new javax.swing.JTextField();
        cadastrar = new javax.swing.JButton();
        listar = new javax.swing.JButton();
        tirar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        AreaTexto = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrador de Filmes");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(51, 51, 51));
        setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(824, 466));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Titulo:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Diretor:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Gênero:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("País:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Ano:");

        inputDiretor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDiretorActionPerformed(evt);
            }
        });

        inputTitulo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        inputTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTituloActionPerformed(evt);
            }
        });

        inputPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPaisActionPerformed(evt);
            }
        });

        inputAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputAnoActionPerformed(evt);
            }
        });

        inputGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputGeneroActionPerformed(evt);
            }
        });

        cadastrar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cadastrar.setText("Cadastrar");
        cadastrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });

        listar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        listar.setText("Listar");
        listar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarActionPerformed(evt);
            }
        });

        tirar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tirar.setText("Retirar até encontrar um filme do gênero ação");
        tirar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tirarActionPerformed(evt);
            }
        });

        AreaTexto.setEditable(false);
        AreaTexto.setColumns(20);
        AreaTexto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        AreaTexto.setLineWrap(true);
        AreaTexto.setRows(5);
        AreaTexto.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        AreaTexto.setEnabled(false);
        jScrollPane1.setViewportView(AreaTexto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(listar)
                        .addGap(93, 93, 93)
                        .addComponent(tirar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputAno)
                            .addComponent(inputPais)
                            .addComponent(inputGenero)
                            .addComponent(inputTitulo)
                            .addComponent(inputDiretor))))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(inputTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inputDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(inputGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(inputPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(inputAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrar)
                    .addComponent(listar)
                    .addComponent(tirar))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inputDiretorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDiretorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputDiretorActionPerformed

    private void inputTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTituloActionPerformed

    private void inputPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPaisActionPerformed

    private void inputAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputAnoActionPerformed

    private void inputGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputGeneroActionPerformed

    private void tirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tirarActionPerformed
      
        
        
        while ( !filmes.isEmpty() ) {   
            
            Filmes filme = filmes.dequeue();
            
            if (filme.getGenero().equalsIgnoreCase("Ação") || filme.getGenero().equalsIgnoreCase("Acao")) {
                filmeAcao.enqueue(filme);
            } else {
                filmeRemovidos.enqueue(filme);
            }
            
        }
        if ( filmes.isEmpty() ) System.out.println("Impossível retirar da pilha: Pilha vazia.");
        
        System.out.println("Filmes de ação:");
        while (!filmeAcao.isEmpty()) {
            try {
                System.out.println("Titulo " + filmeAcao.peek().getTitulo() + ", diretor " + filmeAcao.peek().getDiretor()+ ", gênero " + filmeAcao.peek().getGenero() + ", país " + filmeAcao.peek().getPais() + ", ano " + filmeAcao.peek().getAno());
                filmeAcao.dequeue();
            } catch (Exception ex) {
                Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        // esse mostra no console
        System.out.println("\nFilmes removidos:");
        while (!filmeRemovidos.isEmpty()) {
            try {
                System.out.println("Titulo " + filmeRemovidos.peek().getTitulo() + ", diretor " + filmeRemovidos.peek().getDiretor()+ ", gênero " + filmeRemovidos.peek().getGenero() + ", país " + filmeRemovidos.peek().getPais() + ", ano " + filmeRemovidos.peek().getAno());
                filmeRemovidos.dequeue();
            } catch (Exception ex) {
                Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
// esse é para mostrar o a fila em si na AreaText, porém não sabia que tinha que ser no formato de fila resolvi jogar no console e foi bem formatado
//        AreaTexto.setText("\nFilmes de Ação: " + filmeAcao.toString() + "\n \n Filmes Removidos: " + filmeRemovidos.toString());
//        
//        while ( !filmeAcao.isEmpty() && filmeRemovidos.isEmpty() ) {
//            filmeAcao.dequeue();
//            filmeRemovidos.dequeue();
//        }
        
    }//GEN-LAST:event_tirarActionPerformed

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
            
            this.t = inputTitulo.getText();
            this.d = inputDiretor.getText();
            this.g = inputGenero.getText();
            this.p = inputPais.getText();
            this.a = inputAno.getText();
            
           filmes.enqueue(new Filmes(t, d, g, p, a));
           
           AreaTexto.setText("Filme Cadastrado");

    }//GEN-LAST:event_cadastrarActionPerformed

    private void listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarActionPerformed
        
     // listar
     AreaTexto.setText(filmes.toString());
         
    }//GEN-LAST:event_listarActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new RunnableImpl());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextArea AreaTexto;
    public javax.swing.JButton cadastrar;
    private javax.swing.JTextField inputAno;
    private javax.swing.JTextField inputDiretor;
    private javax.swing.JTextField inputGenero;
    private javax.swing.JTextField inputPais;
    private javax.swing.JTextField inputTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton listar;
    private javax.swing.JButton tirar;
    // End of variables declaration//GEN-END:variables

    private static class RunnableImpl implements Runnable {

        public RunnableImpl() {
        }

        @Override
        public void run() {
            new JanelaPrincipal().setVisible(true);
        }
    }
}