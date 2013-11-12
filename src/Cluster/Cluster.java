package Cluster;

import javax.swing.JOptionPane;
import java.awt.Component;
import java.awt.*;
import javax.swing.JScrollPane;
import javax.swing.JViewport;

public class Cluster extends javax.swing.JDialog {

    public Cluster(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jLabelNumeroClusters.setVisible(false);
        jTextFieldNumeroCluster.setVisible(false);
        jLabelValorUmbral.setVisible(false);
        jTextFieldValorUmbral.setVisible(false);
        jComboBoxCondicionGeneracion.setSelectedItem("Selecciona una opción");
        agegarTododosComponentes();
        this.setResizable(false);
        jComboBoxCondicionGeneracion.setSelectedIndex(0);
        agegarTododosComponentes();
      }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxCondicionGeneracion = new javax.swing.JComboBox();
        jComboBoxCondicionParada = new javax.swing.JComboBox();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabelNumeroClusters = new javax.swing.JLabel();
        jLabelValorUmbral = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextFieldValorUmbral = new javax.swing.JTextField();
        jTextFieldNumeroCluster = new javax.swing.JTextField();
        jPanelBotones = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jButtonGenerar = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jScrollPaneGrafica = new javax.swing.JScrollPane();
        jPanelGrafica = new javax.swing.JPanel();

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

        jComboBoxCondicionGeneracion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Menor distancia entre clústers", "Distancia promedio entre clústers", "Radio del clúster es la máxima distancia", "Diámetro del clúster es la máxima distancia" }));
        jComboBoxCondicionGeneracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCondicionGeneracionActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBoxCondicionGeneracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 258, -1));

        jComboBoxCondicionParada.setToolTipText("");
        jComboBoxCondicionParada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCondicionParadaActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBoxCondicionParada, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 258, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 280, -1));

        jLabel4.setText("Condición de Parada");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabelNumeroClusters.setText("Número de clústers:");
        jPanel2.add(jLabelNumeroClusters, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 120, -1));

        jLabelValorUmbral.setText("Valor del umbral:");
        jPanel2.add(jLabelValorUmbral, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 130, -1));
        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));
        jPanel2.add(jTextFieldValorUmbral, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 70, -1));
        jPanel2.add(jTextFieldNumeroCluster, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 70, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 280, 480));

        jPanelBotones.setPreferredSize(new java.awt.Dimension(400, 35));
        jPanelBotones.setLayout(new java.awt.BorderLayout());

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanelBotones.add(jSeparator1, java.awt.BorderLayout.PAGE_START);

        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 5, 3));

        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 5, 3));

        jButtonGenerar.setText("Generar");
        jButtonGenerar.setPreferredSize(new java.awt.Dimension(80, 23));
        jButtonGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenerarActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonGenerar);

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.setPreferredSize(new java.awt.Dimension(80, 23));
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonGuardar);

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

        jScrollPaneGrafica.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPaneGrafica.setToolTipText("");
        jScrollPaneGrafica.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPaneGrafica.setAutoscrolls(true);
        jScrollPaneGrafica.setMaximumSize(new java.awt.Dimension(490, 490));
        jScrollPaneGrafica.setMinimumSize(new java.awt.Dimension(490, 490));
        jScrollPaneGrafica.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jScrollPaneGraficaMouseWheelMoved(evt);
            }
        });
        jScrollPaneGrafica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jScrollPaneGraficaMouseEntered(evt);
            }
        });
        jScrollPaneGrafica.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                jScrollPaneGraficaComponentMoved(evt);
            }
            public void componentResized(java.awt.event.ComponentEvent evt) {
                jScrollPaneGraficaComponentResized(evt);
            }
        });
        jScrollPaneGrafica.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jScrollPaneGraficaMouseDragged(evt);
            }
        });
        jScrollPaneGrafica.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                jScrollPaneGraficaCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jScrollPaneGrafica.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jScrollPaneGraficaPropertyChange(evt);
            }
        });
        jScrollPaneGrafica.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                jScrollPaneGraficaVetoableChange(evt);
            }
        });

        jPanelGrafica.setAutoscrolls(true);
        jPanelGrafica.setMinimumSize(new java.awt.Dimension(9990, 9990));
        jPanelGrafica.setPreferredSize(new java.awt.Dimension(9990, 9990));
        jPanelGrafica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelGraficaMouseEntered(evt);
            }
        });
        jPanelGrafica.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                jPanelGraficaComponentMoved(evt);
            }
        });
        jPanelGrafica.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                jPanelGraficaVetoableChange(evt);
            }
        });
        jPanelGrafica.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jScrollPaneGrafica.setViewportView(jPanelGrafica);

        getContentPane().add(jScrollPaneGrafica, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 490, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGenerarActionPerformed
        double ncluster, umbral;
        //Control de ingreso para los valores en los jtextfield
        if (jTextFieldValorUmbral.isVisible()==true) {      
            if(!jTextFieldNumeroCluster.getText().isEmpty()||!jTextFieldValorUmbral.getText().isEmpty())
            {
            //Control de ingreso para los valores en los jtextfield para las coordenadas x y y
            try{

               umbral = Double.parseDouble(jTextFieldValorUmbral.getText());

               if (umbral < 0) {
                    JOptionPane.showMessageDialog(this, "Debes ingesar un valor válido (mayor a 0)");
                }
                else{
                     SquaredPaper DrawWindow = new SquaredPaper();
                     DrawWindow.paint(jPanelGrafica);
                    }
                }

                    catch(NumberFormatException ex)
                    {
                        JOptionPane.showMessageDialog(this, "Ingresa por favor valores numéricos");
                    }
                   
           }
                else
            {
                JOptionPane.showMessageDialog(this, "Ingresa un valor por favor");
            }
        }
        else if(jTextFieldNumeroCluster.isVisible()==true){      
            if(!jTextFieldNumeroCluster.getText().isEmpty())
            {
            //Control de ingreso para los valores en los jtextfield 
            try{
                     ncluster = Double.parseDouble(jTextFieldNumeroCluster.getText());
                        if (ncluster < 0) {
                    JOptionPane.showMessageDialog(this, "Debes ingesar un valor válido (mayor a 0)");
                }
                else{
                     SquaredPaper DrawWindow = new SquaredPaper();
                     DrawWindow.paint(jPanelGrafica);
                    }
                }
                    catch(NumberFormatException ex)
                    {
                        JOptionPane.showMessageDialog(this, "Ingresa por favor valores numéricos");
                    }
                }
                else
            {
                JOptionPane.showMessageDialog(this, "Ingresa un valor por favor");
            }
        }

            else
            {   SquaredPaper DrawWindow = new SquaredPaper();
                DrawWindow.paint(jPanelGrafica);
            }
    //pq dice eso?
    }//GEN-LAST:event_jButtonGenerarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jComboBoxCondicionGeneracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCondicionGeneracionActionPerformed
//
//        if ((jComboBoxCondicionGeneracion.getSelectedItem().equals("Menor distancia entre clústers"))
//                || jComboBoxCondicionGeneracion.getSelectedItem().equals("Distancia promedio entre clústers"))
//        {
//            jComboBoxCondicionParada.removeAllItems();
//            agegarRadioODiametro();
//            jComboBoxCondicionParada.setEnabled(true);
//
//        } 
//        else 
//        {
//            jComboBoxCondicionParada.removeAllItems();
//            agegarTododosComponentes();
//            jComboBoxCondicionParada.setEnabled(true);
//        }
//

    }//GEN-LAST:event_jComboBoxCondicionGeneracionActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBoxCondicionParadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCondicionParadaActionPerformed
        jLabelValorUmbral.setVisible(false);
        jTextFieldNumeroCluster.setVisible(false);
        jLabelNumeroClusters.setVisible(false);
        jTextFieldValorUmbral.setVisible(false);
        if(jComboBoxCondicionParada.getSelectedIndex()==0)
        {
            jLabelNumeroClusters.setVisible(true);
            jTextFieldNumeroCluster.setVisible(true);
            jLabelValorUmbral.setVisible(false);
            jTextFieldValorUmbral.setVisible(false);
        }
       
          else if(jComboBoxCondicionParada.getSelectedIndex()==1||jComboBoxCondicionParada.getSelectedIndex()==2)
        {
            jLabelNumeroClusters.setVisible(false);
            jTextFieldValorUmbral.setVisible(false);
            jLabelValorUmbral.setVisible(true);
            jTextFieldValorUmbral.setVisible(true);
        }
//            else if(jComboBoxCondicionParada.getSelectedIndex()==4)
//        {
//            jLabelNumeroClusters.setVisible(false);
//            jTextFieldNumeroCluster.setVisible(false);
//            jLabelValorUmbral.setVisible(true);
//            jTextFieldValorUmbral.setVisible(true);
//        }
//        
//        jLabelValorUmbral.setVisible(false);
//        jTextFieldValorUmbral.setVisible(false);
//        jLabelNumeroClusters.setVisible(false);
//        jTextFieldNumeroClusters.setVisible(false);
//
//        if (jComboBoxCondicionParada.getSelectedItem().equals("Alcanza número de clusters especificados")) {
//            jLabelNumeroClusters.setVisible(true);
//            jTextFieldNumeroClusters.setVisible(true);
//            jLabelValorUmbral.setVisible(false);
//            jTextFieldValorUmbral.setVisible(false);
//
//        } else if (jComboBoxCondicionParada.getSelectedItem().equals("Diámetro excede el umbral")) {
//            jLabelValorUmbral.setVisible(true);
//            jTextFieldValorUmbral.setVisible(true);
//            jLabelNumeroClusters.setVisible(false);
//            jTextFieldNumeroClusters.setVisible(false);
//
//        } else if (jComboBoxCondicionParada.getSelectedItem().equals("Radio excede el umbral")) {
//            jLabelValorUmbral.setVisible(true);
//            jTextFieldValorUmbral.setVisible(true);
//            jLabelNumeroClusters.setVisible(false);
//            jTextFieldNumeroClusters.setVisible(false);
//        }
    }//GEN-LAST:event_jComboBoxCondicionParadaActionPerformed

    private void jScrollPaneGraficaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jScrollPaneGraficaPropertyChange
    }//GEN-LAST:event_jScrollPaneGraficaPropertyChange
    private void jScrollPaneGraficaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPaneGraficaMouseDragged
    }//GEN-LAST:event_jScrollPaneGraficaMouseDragged
    private void jScrollPaneGraficaMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jScrollPaneGraficaMouseWheelMoved
    }//GEN-LAST:event_jScrollPaneGraficaMouseWheelMoved
    private void jScrollPaneGraficaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPaneGraficaMouseEntered
    }//GEN-LAST:event_jScrollPaneGraficaMouseEntered
    private void jPanelGraficaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelGraficaMouseEntered
    }//GEN-LAST:event_jPanelGraficaMouseEntered
    private void jPanelGraficaVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_jPanelGraficaVetoableChange
    }//GEN-LAST:event_jPanelGraficaVetoableChange
    private void jScrollPaneGraficaCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jScrollPaneGraficaCaretPositionChanged
    }//GEN-LAST:event_jScrollPaneGraficaCaretPositionChanged
    private void jScrollPaneGraficaVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_jScrollPaneGraficaVetoableChange
    }//GEN-LAST:event_jScrollPaneGraficaVetoableChange
    private void jScrollPaneGraficaComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jScrollPaneGraficaComponentMoved
    }//GEN-LAST:event_jScrollPaneGraficaComponentMoved
    private void jScrollPaneGraficaComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jScrollPaneGraficaComponentResized
    }//GEN-LAST:event_jScrollPaneGraficaComponentResized

    private void jPanelGraficaComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelGraficaComponentMoved
        // TODO add your handling code here:
        SquaredPaper DrawWindow = new SquaredPaper();
        DrawWindow.paint(jPanelGrafica);         
    }//GEN-LAST:event_jPanelGraficaComponentMoved

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    public void agegarTododosComponentes() 
    {
        jComboBoxCondicionParada.addItem("Alcanza número de clusters especificados");
        jComboBoxCondicionParada.addItem("Diámetro excede el umbral");
        jComboBoxCondicionParada.addItem("Radio excede el umbral");
    }

    public void agegarRadioODiametro() {
        jComboBoxCondicionParada.addItem("Alcanza número de clusters especificados");
        jComboBoxCondicionParada.removeItem("Diámetro excede el umbral");
        jComboBoxCondicionParada.removeItem("Radio excede el umbral");

    }

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
    private javax.swing.JButton jButtonGenerar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JComboBox jComboBoxCondicionGeneracion;
    private javax.swing.JComboBox jComboBoxCondicionParada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelNumeroClusters;
    private javax.swing.JLabel jLabelValorUmbral;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JPanel jPanelGrafica;
    private javax.swing.JScrollPane jScrollPaneGrafica;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldNumeroCluster;
    private javax.swing.JTextField jTextFieldValorUmbral;
    // End of variables declaration//GEN-END:variables
}
