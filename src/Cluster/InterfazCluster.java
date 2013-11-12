package Cluster;

import javax.swing.JOptionPane;
import Conexion.*;
import Punto.*;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class InterfazCluster extends javax.swing.JDialog {

    public final int INF = Integer.MAX_VALUE;
    public ArrayList<Cluster> C;
    public PriorityQueue<Cluster> pq;
    public Conexion ccon = new Conexion();
    public Punto[] PuntosB;
    public Punto p1, p2, cent;
    public float dist;
    public ArrayList<Punto> al;
    public Cluster c, cMenor;

    public InterfazCluster(java.awt.Frame parent, boolean modal) {
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
        jScrollPaneGrafica.setEnabled(false);
        jScrollPaneGrafica.getVerticalScrollBar().setEnabled(false);
        jScrollPaneGrafica.getHorizontalScrollBar().setEnabled(false);
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
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 258, -1));

        jLabel2.setText("Condición de Generación:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jComboBoxCondicionGeneracion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Menor distancia entre clústers", "Distancia promedio entre clústers", "Radio del clúster es la máxima distancia", "Diámetro del clúster es la máxima distancia" }));
        jPanel2.add(jComboBoxCondicionGeneracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 258, -1));

        jComboBoxCondicionParada.setToolTipText("");
        jComboBoxCondicionParada.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxCondicionParadaItemStateChanged(evt);
            }
        });
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

    private void jButtonGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGenerarActionPerformed
        float umbral;
        int idConjunto, ncluster;
        jScrollPaneGrafica.setVisible(true);
        jPanelGrafica.setEnabled(true);
        //Control de ingreso para los valores en los jtextfield
        if (!jTextField1.getText().isEmpty()) {
            try {
                idConjunto = Integer.parseInt(jTextField1.getText());
                if (jTextFieldValorUmbral.isVisible() == true) {
                    if (!jTextFieldValorUmbral.getText().isEmpty()) {
                        //Control de ingreso para los valores en los jtextfield para las coordenadas x y y
                        try {
                            umbral = Float.parseFloat(jTextFieldValorUmbral.getText());
                            if (umbral < 0) {
                                JOptionPane.showMessageDialog(this, "Debes ingesar un valor válido (mayor a 0)");
                            } else {
                                jTextField1.setEditable(false);
                                jTextFieldValorUmbral.setEditable(false);
                                jScrollPaneGrafica.getVerticalScrollBar().setEnabled(true);
                                jScrollPaneGrafica.getHorizontalScrollBar().setEnabled(true);
                                jScrollPaneGrafica.getVerticalScrollBar().setValue(9990);
                                
                                ccon.selectCoordenada(idConjunto);
                                PuntosB = ccon.getCoordenada();

                                // Converion del vector de Puntos al vector de Clusters
                                C = puntosAClusters(PuntosB);
                                if(jComboBoxCondicionGeneracion.getSelectedIndex() == 0){
                                    
                                }else if(jComboBoxCondicionGeneracion.getSelectedIndex() == 1){
                                    
                                }else if(jComboBoxCondicionGeneracion.getSelectedIndex() == 2){
                                    
                                }else if(jComboBoxCondicionGeneracion.getSelectedIndex() == 3){
                                    
                                }


//                                SquaredPaper DrawWindow = new SquaredPaper();
//                                DrawWindow.paint(jPanelGrafica);
                            }
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(this, "Ingresa por favor valores numéricos");
                        }

                    } else {
                        JOptionPane.showMessageDialog(this, "Ingresa un valor de umbral por favor");
                    }
                } else if (jTextFieldNumeroCluster.isVisible() == true) {
                    if (!jTextFieldNumeroCluster.getText().isEmpty()) {
                        //Control de ingreso para los valores en los jtextfield 
                        try {
                            ncluster = Integer.parseInt(jTextFieldNumeroCluster.getText());
                            if (ncluster < 0) {
                                JOptionPane.showMessageDialog(this, "Debes ingesar un valor válido (mayor a 0)");
                            } else {
                                jTextField1.setEditable(false);
                                jTextFieldNumeroCluster.setEditable(false);
                                jScrollPaneGrafica.getVerticalScrollBar().setEnabled(true);
                                jScrollPaneGrafica.getHorizontalScrollBar().setEnabled(true);
                                jScrollPaneGrafica.getVerticalScrollBar().setValue(9990);
                                
                                ccon.selectCoordenada(idConjunto);
                                PuntosB = ccon.getCoordenada();

                                // Converion del vector de Puntos al vector de Clusters
                                C = puntosAClusters(PuntosB);
                                
                                if(jComboBoxCondicionGeneracion.getSelectedIndex() == 0){
                                    puntoCercanoKclusters(ncluster);
                                }else if(jComboBoxCondicionGeneracion.getSelectedIndex() == 1){
                                    porPromedioKclusters(ncluster);
                                }else if(jComboBoxCondicionGeneracion.getSelectedIndex() == 2){
                                    porRadioKclusters(ncluster);
                                }else if(jComboBoxCondicionGeneracion.getSelectedIndex() == 3){
                                    porDiametroKclusters(ncluster);
                                }
                                
                                //SquaredPaper DrawWindow = new SquaredPaper();
                                //DrawWindow.paint(jPanelGrafica);
                            }
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(this, "Ingresa por favor valores numéricos");
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Ingresa un numero de clusters por favor");
                    }
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Ingresa por favor valores numéricos");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Ingresa un id de conjunto");
        }

    }//GEN-LAST:event_jButtonGenerarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        jTextFieldNumeroCluster.setText("");
        jTextFieldValorUmbral.setText("");
        jTextField1.setText("");
        jTextFieldValorUmbral.setEditable(true);
        jTextField1.setEditable(true);
        jTextFieldNumeroCluster.setEditable(true);
        jScrollPaneGrafica.setVisible(false);
        jScrollPaneGrafica.getVerticalScrollBar().setEnabled(false);
        jScrollPaneGrafica.getHorizontalScrollBar().setEnabled(false);

    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jComboBoxCondicionParadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCondicionParadaActionPerformed
        jLabelValorUmbral.setVisible(false);
        jTextFieldNumeroCluster.setVisible(false);
        jLabelNumeroClusters.setVisible(false);
        jTextFieldValorUmbral.setVisible(false);
        if (jComboBoxCondicionParada.getSelectedIndex() == 0) {
            jLabelNumeroClusters.setVisible(true);
            jTextFieldNumeroCluster.setVisible(true);
            jLabelValorUmbral.setVisible(false);
            jTextFieldValorUmbral.setVisible(false);
        } else if (jComboBoxCondicionParada.getSelectedIndex() == 1) {
            jLabelNumeroClusters.setVisible(false);
            jTextFieldValorUmbral.setVisible(false);
            jLabelValorUmbral.setVisible(true);
            jTextFieldValorUmbral.setVisible(true);
        }

    }//GEN-LAST:event_jComboBoxCondicionParadaActionPerformed

    private void jPanelGraficaComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelGraficaComponentMoved
        // TODO add your handling code here:

        SquaredPaper DrawWindow = new SquaredPaper();
        DrawWindow.paint(jPanelGrafica);
    }//GEN-LAST:event_jPanelGraficaComponentMoved

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jComboBoxCondicionParadaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxCondicionParadaItemStateChanged
        jTextFieldNumeroCluster.setText(null);
        jTextFieldValorUmbral.setText(null);
    }//GEN-LAST:event_jComboBoxCondicionParadaItemStateChanged

    public void agegarTododosComponentes() {
        jComboBoxCondicionParada.addItem("Alcanza número de clusters especificados");
        jComboBoxCondicionParada.addItem("Excede el umbral");
    }

    public void removercluster(ArrayList<Punto> pp) {
        for (int i = 0; i < pp.size(); i++) {
            for (int k = 0; k < C.size(); k++) {
                if (C.get(k).listaP.contains(pp.get(i))) {
                    C.remove(k);
                }
            }
        }
    }

    public ArrayList<Cluster> puntosAClusters(Punto[] pp) {
        ArrayList<Cluster> cc = new ArrayList<Cluster>();
        for (int i = 0; i < pp.length; i++) {
            ArrayList<Punto> ll = new ArrayList<Punto>();
            ll.add(pp[i]);
            cc.add(new Cluster(pp[i], INF, ll));// verificar el constructor
        }
        return cc;
    }

    public void puntoCercanoUmbral(float umbral) {
        // Iteracion Inicial donde se realizan el todo contra todos
        pq = new PriorityQueue<Cluster>();
        for (int i = 0; i < C.size(); i++) {
            for (int k = i + 1; k < C.size(); k++) {
                p1 = C.get(i).centroide;
                p2 = C.get(k).centroide;
                al = new ArrayList<Punto>();

                al.addAll(C.get(i).listaP);
                al.addAll(C.get(k).listaP);

                dist = p1.distancia(p2);
                cent = new Punto((p1.x + p2.x) / 2, (p1.y + p2.y) / 2);
                c = new Cluster(cent, dist, al); // cambiar constructor
                pq.add(c);
            }
        }
        // Saco el cluster menor
        cMenor = pq.poll();

        // Eliminar los cluster que se unieron a cluster menor
        removercluster(cMenor.listaP);

        // Agrego cMenor al arraylist de clusters
        C.add(cMenor);

    }

    public void porRadioUmbral(float umbral) {
        // Iteracion Inicial donde se realizan el todo contra todos
        pq = new PriorityQueue<Cluster>();
        for (int i = 0; i < C.size(); i++) {
            for (int k = i + 1; k < C.size(); k++) {
                p1 = C.get(i).centroide;
                p2 = C.get(k).centroide;
                al = new ArrayList<Punto>();

                al.addAll(C.get(i).listaP);
                al.addAll(C.get(k).listaP);

                cent = new Punto((p1.x + p2.x) / 2, (p1.y + p2.y) / 2);
                c = new Cluster(cent, al); // cambiar constructor
                c.maxRadio();
                pq.add(c);
            }
        }
        // Saco el cluster menor
        cMenor = pq.poll();

        // Eliminar los cluster que se unieron a cluster menor
        removercluster(cMenor.listaP);

        // Agrego cMenor al arraylist de clusters
        C.add(cMenor);

    }

    public void porDiametroUmbral(float umbral) {
        // Iteracion Inicial donde se realizan el todo contra todos
        pq = new PriorityQueue<Cluster>();
        for (int i = 0; i < C.size(); i++) {
            for (int k = i + 1; k < C.size(); k++) {
                p1 = C.get(i).centroide;
                p2 = C.get(k).centroide;
                al = new ArrayList<Punto>();

                al.addAll(C.get(i).listaP);
                al.addAll(C.get(k).listaP);
                cent = new Punto((p1.x + p2.x) / 2, (p1.y + p2.y) / 2);
                c = new Cluster(cent, al); // cambiar constructor
                c.maxDiametro();
                pq.add(c);
            }
        }
        // Saco el cluster menor
        cMenor = pq.poll();

        // Eliminar los cluster que se unieron a cluster menor
        removercluster(cMenor.listaP);

        // Agrego cMenor al arraylist de clusters
        C.add(cMenor);

    }

    public void porPromedioUmbral(float umbral) {
        // Iteracion Inicial donde se realizan el todo contra todos
        pq = new PriorityQueue<Cluster>();
        for (int i = 0; i < C.size(); i++) {
            for (int k = i + 1; k < C.size(); k++) {
                p1 = C.get(i).centroide;
                p2 = C.get(k).centroide;
                al = new ArrayList<Punto>();

                al.addAll(C.get(i).listaP);
                al.addAll(C.get(k).listaP);

                cent = new Punto((p1.x + p2.x) / 2, (p1.y + p2.y) / 2);
                c = new Cluster(cent, al); // cambiar constructor
                c.promedio();
                pq.add(c);
            }
        }
        // Saco el cluster menor
        cMenor = pq.poll();

        // Eliminar los cluster que se unieron a cluster menor
        removercluster(cMenor.listaP);

        // Agrego cMenor al arraylist de clusters
        C.add(cMenor);

    }

    public void puntoCercanoKclusters(int kc) {
        //++kc;
        // Iteracion Inicial donde se realizan el todo contra todos
        while (C.size() > kc) {
            pq = new PriorityQueue<Cluster>();
            for (int i = 0; i < C.size(); i++) {
                for (int k = i + 1; k < C.size(); k++) {
                    p1 = C.get(i).centroide;
                    p2 = C.get(k).centroide;
                    al = new ArrayList<Punto>();

                    al.addAll(C.get(i).listaP);
                    al.addAll(C.get(k).listaP);

                    dist = p1.distancia(p2);
                    cent = new Punto((p1.x + p2.x) / 2, (p1.y + p2.y) / 2);
                    c = new Cluster(cent, dist, al); // cambiar constructor
                    pq.add(c);
                }
            }
            // Saco el cluster menor
            cMenor = pq.poll();

            // Eliminar los cluster que se unieron a cluster menor
            removercluster(cMenor.listaP);

            // Agrego cMenor al arraylist de clusters
            C.add(cMenor);
        }
    }

    public void porRadioKclusters(int kc) {
        // Iteracion Inicial donde se realizan el todo contra todos
        pq = new PriorityQueue<Cluster>();
        for (int i = 0; i < C.size(); i++) {
            for (int k = i + 1; k < C.size(); k++) {
                p1 = C.get(i).centroide;
                p2 = C.get(k).centroide;
                al = new ArrayList<Punto>();

                al.addAll(C.get(i).listaP);
                al.addAll(C.get(k).listaP);

                cent = new Punto((p1.x + p2.x) / 2, (p1.y + p2.y) / 2);
                c = new Cluster(cent, al); // cambiar constructor
                c.maxRadio();
                pq.add(c);
            }
        }
        // Saco el cluster menor
        cMenor = pq.poll();

        // Eliminar los cluster que se unieron a cluster menor
        removercluster(cMenor.listaP);

        // Agrego cMenor al arraylist de clusters
        C.add(cMenor);

    }

    public void porDiametroKclusters(int kc) {
        // Iteracion Inicial donde se realizan el todo contra todos
        pq = new PriorityQueue<Cluster>();
        for (int i = 0; i < C.size(); i++) {
            for (int k = i + 1; k < C.size(); k++) {
                p1 = C.get(i).centroide;
                p2 = C.get(k).centroide;
                al = new ArrayList<Punto>();

                al.addAll(C.get(i).listaP);
                al.addAll(C.get(k).listaP);
                cent = new Punto((p1.x + p2.x) / 2, (p1.y + p2.y) / 2);
                c = new Cluster(cent, al); // cambiar constructor
                c.maxDiametro();
                pq.add(c);
            }
        }
        // Saco el cluster menor
        cMenor = pq.poll();

        // Eliminar los cluster que se unieron a cluster menor
        removercluster(cMenor.listaP);

        // Agrego cMenor al arraylist de clusters
        C.add(cMenor);

    }

    public void porPromedioKclusters(int kc) {
        // Iteracion Inicial donde se realizan el todo contra todos
        pq = new PriorityQueue<Cluster>();
        for (int i = 0; i < C.size(); i++) {
            for (int k = i + 1; k < C.size(); k++) {
                p1 = C.get(i).centroide;
                p2 = C.get(k).centroide;
                al = new ArrayList<Punto>();

                al.addAll(C.get(i).listaP);
                al.addAll(C.get(k).listaP);

                cent = new Punto((p1.x + p2.x) / 2, (p1.y + p2.y) / 2);
                c = new Cluster(cent, al); // cambiar constructor
                c.promedio();
                pq.add(c);
            }
        }
        // Saco el cluster menor
        cMenor = pq.poll();

        // Eliminar los cluster que se unieron a cluster menor
        removercluster(cMenor.listaP);

        // Agrego cMenor al arraylist de clusters
        C.add(cMenor);

    }

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
            java.util.logging.Logger.getLogger(InterfazCluster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazCluster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazCluster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazCluster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                InterfazCluster dialog = new InterfazCluster(new javax.swing.JFrame(), true);
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