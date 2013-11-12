package Cluster;

import javax.swing.JOptionPane;
import Conexion.*;
import Punto.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VerInterfazCluster extends javax.swing.JDialog {

    public Conexion ccon = new Conexion();
    public int idConjunto;

    public VerInterfazCluster(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        agegarTododosComponentes();
        //this.setResizable(false);
        jScrollPaneGrafica.setEnabled(true);
        jScrollPaneGrafica.getVerticalScrollBar().setEnabled(true);
        jScrollPaneGrafica.getHorizontalScrollBar().setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCG = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxIdDibujo = new javax.swing.JComboBox();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabelNumeroClusters = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextFieldCP = new javax.swing.JTextField();
        jTextFieldIdConP = new javax.swing.JTextField();
        jPanelBotones = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jButtonVer = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jScrollPaneGrafica = new javax.swing.JScrollPane();
        jPanelGrafica = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Id Dibujo");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 12, -1, -1));

        jTextFieldCG.setEditable(false);
        jPanel2.add(jTextFieldCG, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 258, -1));

        jLabel2.setText("Condición de Generación:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 250, -1));

        jPanel2.add(jComboBoxIdDibujo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 258, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 280, 20));

        jLabel4.setText("Condición de Parada:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 260, -1));

        jLabelNumeroClusters.setText("Codigo conjunto de puntos");
        jPanel2.add(jLabelNumeroClusters, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 250, -1));
        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jTextFieldCP.setEditable(false);
        jPanel2.add(jTextFieldCP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 260, 20));

        jTextFieldIdConP.setEditable(false);
        jPanel2.add(jTextFieldIdConP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 260, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 280, 480));

        jPanelBotones.setPreferredSize(new java.awt.Dimension(400, 35));
        jPanelBotones.setLayout(new java.awt.BorderLayout());

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanelBotones.add(jSeparator1, java.awt.BorderLayout.PAGE_START);

        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 5, 3));

        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 5, 3));

        jButtonVer.setText("Ver");
        jButtonVer.setPreferredSize(new java.awt.Dimension(80, 23));
        jButtonVer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonVerMouseClicked(evt);
            }
        });
        jButtonVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonVer);

        jButtonSalir.setText("Salir");
        jButtonSalir.setPreferredSize(new java.awt.Dimension(80, 23));
        jButtonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSalirMouseClicked(evt);
            }
        });
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonSalir);

        jPanel4.add(jPanel5);

        jPanelBotones.add(jPanel4, java.awt.BorderLayout.LINE_END);

        getContentPane().add(jPanelBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 800, -1));

        jScrollPaneGrafica.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPaneGrafica.setToolTipText("");
        jScrollPaneGrafica.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPaneGrafica.setAutoscrolls(true);
        jScrollPaneGrafica.setMaximumSize(new java.awt.Dimension(490, 490));
        jScrollPaneGrafica.setMinimumSize(new java.awt.Dimension(490, 490));

        jPanelGrafica.setAutoscrolls(true);
        jPanelGrafica.setMinimumSize(new java.awt.Dimension(9990, 9990));
        jPanelGrafica.setPreferredSize(new java.awt.Dimension(9990, 9990));
        jPanelGrafica.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                jPanelGraficaComponentMoved(evt);
            }
        });
        jPanelGrafica.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jScrollPaneGrafica.setViewportView(jPanelGrafica);

        getContentPane().add(jScrollPaneGrafica, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 490, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jPanelGraficaComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelGraficaComponentMoved
        Graficar DrawWindow = new Graficar();
        DrawWindow.paint2(jPanelGrafica, idConjunto);
        //DrawWindow.paint(jPanelGrafica, idConjunto, xmin, xmax, ymin, ymax);
    }//GEN-LAST:event_jPanelGraficaComponentMoved

    private void jButtonVerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVerMouseClicked
        
            idConjunto = Integer.parseInt(jComboBoxIdDibujo.getSelectedItem().toString());
            jScrollPaneGrafica.getVerticalScrollBar().setValue(9990);


            jTextFieldIdConP.setText("" + ccon.devolverID_con());
            jTextFieldCG.setText("" + ccon. devolverID_gene());
            jTextFieldCP.setText("" + ccon. devolverID_para());


            Graficar DrawWindow = new Graficar();
            DrawWindow.paint2(jPanelGrafica, idConjunto);
      
    }//GEN-LAST:event_jButtonVerMouseClicked

    private void jButtonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalirMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSalirMouseClicked

    private void jButtonVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonVerActionPerformed
    public void agegarTododosComponentes() {
        ccon.selectIdDibuo();
        int A[] = ccon.getIdDibujo();
        for (int f : A) {
            jComboBoxIdDibujo.addItem("" + f);
        }

    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VerInterfazCluster dialog = new VerInterfazCluster(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonVer;
    private javax.swing.JComboBox jComboBoxIdDibujo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelNumeroClusters;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JPanel jPanelGrafica;
    private javax.swing.JScrollPane jScrollPaneGrafica;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextFieldCG;
    private javax.swing.JTextField jTextFieldCP;
    private javax.swing.JTextField jTextFieldIdConP;
    // End of variables declaration//GEN-END:variables
}
