
package Cluster;

import javax.swing.JOptionPane;

public class Cluster extends javax.swing.JDialog {
  
    public Cluster(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
          jLabelValorUmbral.setVisible(false);
          jLabelNumeroClusters.setVisible(false);
          jTextFieldNumeroClusters.setVisible(false);
          jTextFieldValorUmbral.setVisible(false);
          
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxCondicionGeneracion = new javax.swing.JComboBox();
        jLabelValorUmbral = new javax.swing.JLabel();
        jComboBoxCondicionParada = new javax.swing.JComboBox();
        jSeparator2 = new javax.swing.JSeparator();
        jTextFieldValorUmbral = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabelNumeroClusters = new javax.swing.JLabel();
        jTextFieldNumeroClusters = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanelBotones = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jButtonGuardar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Codigo conjunto de puntos:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 12, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 258, -1));

        jLabel2.setText("Condición de Generación:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jComboBoxCondicionGeneracion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Menor distancia centroides", "Distancia minima entre clusters", "Distancia promedio entre clusters ", "Radio del clústers", "Diámetro del clúster" }));
        jComboBoxCondicionGeneracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCondicionGeneracionActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBoxCondicionGeneracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 258, -1));

        jLabelValorUmbral.setText("Valor del umbral:");
        jPanel2.add(jLabelValorUmbral, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 100, -1));

        jComboBoxCondicionParada.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Alcanza numero de clusters especificados", "Cluster inadecuado", "Hasta que halla un clúster", "Diámetro excede el umbral", "Siguiente par de puntos mal agrupados" }));
        jComboBoxCondicionParada.setToolTipText("");
        jComboBoxCondicionParada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCondicionParadaActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBoxCondicionParada, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 258, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 280, -1));

        jTextFieldValorUmbral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValorUmbralActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldValorUmbral, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 30, 20));

        jLabel4.setText("Condición de Parada");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabelNumeroClusters.setText("Número de clústers:");
        jPanel2.add(jLabelNumeroClusters, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 120, -1));

        jTextFieldNumeroClusters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroClustersActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldNumeroClusters, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 30, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 280, 480));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 11, 490, 480));

        jPanelBotones.setPreferredSize(new java.awt.Dimension(400, 35));
        jPanelBotones.setLayout(new java.awt.BorderLayout());

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanelBotones.add(jSeparator1, java.awt.BorderLayout.PAGE_START);

        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 5, 3));

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.setPreferredSize(new java.awt.Dimension(80, 23));
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonGuardar);

        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 5, 3));

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setPreferredSize(new java.awt.Dimension(80, 23));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonCancelar);

        jPanel4.add(jPanel5);

        jPanelBotones.add(jPanel4, java.awt.BorderLayout.LINE_END);

        getContentPane().add(jPanelBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 800, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
         float ncluster, umbral;
        //Control de ingreso para los valores en los jtextfield
        try{

            ncluster=Float.parseFloat(jTextFieldNumeroClusters.getText());
            umbral=Float.parseFloat(jTextFieldValorUmbral.getText());
            /*validar también que el número de clústers no supere  el número de puntos
             Acá sólo se valida que no sean ambos menor que 0*/
            if(ncluster<0 ||umbral<0)
            {
                JOptionPane.showMessageDialog(this, "Debes ingesar un valor válido (mayr a)");
            }
        }

        catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(this, "Ingresa por favor valores numéricos");
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jComboBoxCondicionGeneracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCondicionGeneracionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCondicionGeneracionActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
            
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextFieldValorUmbralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorUmbralActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldValorUmbralActionPerformed

    private void jTextFieldNumeroClustersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroClustersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumeroClustersActionPerformed

    private void jComboBoxCondicionParadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCondicionParadaActionPerformed

      if (jComboBoxCondicionParada.getSelectedItem().equals("Alcanza numero de clusters especificados"))    
      {
          jLabelNumeroClusters.setVisible(true);
          jTextFieldNumeroClusters.setVisible(true);
             jLabelValorUmbral.setVisible(false);
          jTextFieldValorUmbral.setVisible(false);
      }
      else if (jComboBoxCondicionParada.getSelectedItem().equals("Diámetro excede el umbral"))    
      {
          jLabelValorUmbral.setVisible(true);
          jTextFieldValorUmbral.setVisible(true);
          jLabelNumeroClusters.setVisible(false);
          jTextFieldNumeroClusters.setVisible(false);
      } 
    }//GEN-LAST:event_jComboBoxCondicionParadaActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Cluster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cluster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cluster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cluster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Cluster dialog = new Cluster(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JComboBox jComboBoxCondicionGeneracion;
    private javax.swing.JComboBox jComboBoxCondicionParada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelNumeroClusters;
    private javax.swing.JLabel jLabelValorUmbral;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldNumeroClusters;
    private javax.swing.JTextField jTextFieldValorUmbral;
    // End of variables declaration//GEN-END:variables
}
