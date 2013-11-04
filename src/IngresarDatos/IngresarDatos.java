
package IngresarDatos;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class IngresarDatos extends javax.swing.JDialog {
private int contarClicks=0;
    public IngresarDatos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jButtonGuardarCoordenada.setEnabled(false);
        jTextX.setEditable(false);
        jTextY.setEditable(false);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonGuardar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextId = new javax.swing.JTextField();
        jButtonIdConjunto = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextX = new javax.swing.JTextField();
        jTextY = new javax.swing.JTextField();
        jButtonGuardarCoordenada = new javax.swing.JButton();
        JscrollPanelTabla = new javax.swing.JScrollPane();
        jTableCoordenadas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("ID del conjunto");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 33, -1, -1));
        jPanel2.add(jTextId, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 30, 97, -1));

        jButtonIdConjunto.setText("Insertar Id");
        jButtonIdConjunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIdConjuntoActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonIdConjunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 68, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -9, 219, 100));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Coordenada x:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 22, -1, -1));

        jLabel3.setText("Coordenada y:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 60, -1, -1));

        jTextX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextXActionPerformed(evt);
            }
        });
        jPanel3.add(jTextX, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 19, 97, -1));
        jPanel3.add(jTextY, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 57, 98, -1));

        jButtonGuardarCoordenada.setText("Guardar Coordenada");
        jButtonGuardarCoordenada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarCoordenadaActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonGuardarCoordenada, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 95, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 97, 219, -1));

        getContentPane().add(jPanel1);

        jTableCoordenadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Coordenada x", "Coordenada y"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JscrollPanelTabla.setViewportView(jTableCoordenadas);

        getContentPane().add(JscrollPanelTabla);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
       //Se debe llamar la funcion de inserccion (Carlos)
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonIdConjuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIdConjuntoActionPerformed
     float id;
        //Me controla que solo me un guarde un id de algun conjunto 
        try{
            
            id=Float.parseFloat(jTextId.getText());
           if(jTextId.getText().isEmpty()== false)
           {
                jTextId.setEditable(false);
                jTextX.setEditable(true);
                jTextY.setEditable(true);
                jButtonGuardarCoordenada.setEnabled(true);
           }
        }
                catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(this, "Ingresa por favor valores numéricos positivos");
        }
       
       
    }//GEN-LAST:event_jButtonIdConjuntoActionPerformed

    private void jTextXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextXActionPerformed
 
    }//GEN-LAST:event_jTextXActionPerformed

    private void jButtonGuardarCoordenadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarCoordenadaActionPerformed
        float coorx, coory;
        contarClicks++;
       
        //Control de ingreso para los valores en los jtextfield para las coordenadas x y y
        try{
            
            coorx=Float.parseFloat(jTextX.getText());
            coory=Float.parseFloat(jTextY.getText());

            if(coorx<0 || coorx>999 ||coory<0 || coory>999)
            {
                JOptionPane.showMessageDialog(this, "Debes ingesar un valor válido (entre 0 y 999)");
            }
            else
            {//Poner los datos ingresados en la JTableCoordenadas, primero solo un dato :)
                if(contarClicks<=1)
                {
                   jTableCoordenadas.setValueAt(coorx, 0, 0);
                   jTableCoordenadas.setValueAt(coory, 0, 1);
                }
                //para más de un dato
                else if(contarClicks<=4){
                    
                    jTableCoordenadas.setValueAt(coorx, contarClicks-1, 0);
                    jTableCoordenadas.setValueAt(coory, contarClicks-1, 1);
                }
                //Se agrega dinámicamente después de 4 puntos, igual si quieren lo puedo cambiar pa q solo se agrege dinámicamente y ahorrarme
                else if(contarClicks>4)
                    {
                    DefaultTableModel tableModel1 = (DefaultTableModel) jTableCoordenadas.getModel();
                    tableModel1.addRow(new Object[] {coorx, coory});
                    }                  
                }
                
                          
            }
        
                catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(this, "Ingresa por favor valores numéricos");
        }
       
    }//GEN-LAST:event_jButtonGuardarCoordenadaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IngresarDatos dialog = new IngresarDatos(new javax.swing.JFrame(), true);
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
    private javax.swing.JScrollPane JscrollPanelTabla;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonGuardarCoordenada;
    private javax.swing.JButton jButtonIdConjunto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTable jTableCoordenadas;
    private javax.swing.JTextField jTextId;
    private javax.swing.JTextField jTextX;
    private javax.swing.JTextField jTextY;
    // End of variables declaration//GEN-END:variables
}
