
package imc;

import imcanalize.ImcCalculos;
import modelo.Individuo;



public class layer extends javax.swing.JFrame {

  
    public layer() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pAltura = new javax.swing.JLabel();
        pPeso = new javax.swing.JLabel();
        entrPeso = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        BotaoCalc = new javax.swing.JButton();
        NumeroImc = new javax.swing.JLabel();
        saidaImc = new javax.swing.JLabel();
        SaidaSitua = new javax.swing.JLabel();
        saidaSituacao = new javax.swing.JLabel();
        entrAltura = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculo IMC");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        pAltura.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        pAltura.setForeground(new java.awt.Color(255, 255, 255));
        pAltura.setText("Digite a sua altura: ");

        pPeso.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        pPeso.setForeground(new java.awt.Color(255, 255, 255));
        pPeso.setText("Digite seu peso :");

        entrPeso.setBackground(new java.awt.Color(102, 102, 102));

        BotaoCalc.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BotaoCalc.setText("calcular");
        BotaoCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCalcActionPerformed(evt);
            }
        });

        NumeroImc.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NumeroImc.setText("Numero de seu imc:");

        saidaImc.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        saidaImc.setText("(numero)");

        SaidaSitua.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        SaidaSitua.setText("Saida situação:");

        saidaSituacao.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        saidaSituacao.setText("(situação)");

        entrAltura.setBackground(new java.awt.Color(102, 102, 102));
        entrAltura.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(BotaoCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jSeparator1)
                        .addComponent(pAltura, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                        .addComponent(pPeso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(NumeroImc, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SaidaSitua, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(saidaImc, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(saidaSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(entrPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(entrAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)))
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(pAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(entrAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(entrPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotaoCalc)
                .addGap(33, 33, 33)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumeroImc)
                    .addComponent(saidaImc))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaidaSitua)
                    .addComponent(saidaSituacao))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCalcActionPerformed
        
         
         
        double altura = 
        Double.parseDouble(entrAltura.getText());

        double peso = 
        Double.parseDouble(entrPeso.getText()); 
  
       String situacao =""; 
       Individuo ind = new Individuo();
        
        ind.setAltura(altura);
        ind.setPeso(peso);
        
        ImcCalculos imc = new ImcCalculos(ind); 
        double resultado= peso / (altura * altura);
        ind.setSituacao(resultado);
        
              
        
             
         saidaImc.setText("" + resultado);  
        
        
        saidaSituacao.setText(""+ ind.getSituacao());
    }//GEN-LAST:event_BotaoCalcActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(layer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(layer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(layer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(layer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new layer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCalc;
    private javax.swing.JLabel NumeroImc;
    private javax.swing.JLabel SaidaSitua;
    private javax.swing.JTextField entrAltura;
    private javax.swing.JTextField entrPeso;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel pAltura;
    private javax.swing.JLabel pPeso;
    private javax.swing.JLabel saidaImc;
    private javax.swing.JLabel saidaSituacao;
    // End of variables declaration//GEN-END:variables
}
