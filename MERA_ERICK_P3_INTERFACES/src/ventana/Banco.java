
package ventana;

import dominio.Ahorro;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Banco extends javax.swing.JFrame {
ArrayList<Ahorro> productos = new ArrayList<>();
    ButtonGroup grupo = new ButtonGroup();
    DefaultTableModel model;
    Ahorro caja;
   
    public Banco() {
        initComponents();
         model = new DefaultTableModel();
         
        model.addColumn("CODIGO");
        model.addColumn("NOMBRES");
        model.addColumn("SALDO");
        
        this.jTable1.setModel(model);
        
        grupo.add(btnDEPOSITAR);
        grupo.add(btnRETIRAR);
        grupo.add(btnELIMINAR);
        
          btnDEPOSITAR.setEnabled(true);
          btnRETIRAR.setEnabled(true);
          btnELIMINAR.setEnabled(true);
        
        bloqueo();
        

    }
    void bloqueo(){
            btnDEPOSITAR.setEnabled(false);
            btnRETIRAR.setEnabled(false);
            btnELIMINAR.setEnabled(false);
            
            btnPROCESAR.setEnabled(false);
            txtVALOR.setEnabled(false);
            
            txtCODIGO.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCODIGO = new javax.swing.JTextField();
        txtNOMBRES = new javax.swing.JTextField();
        txtSALDOINICIAL = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnDEPOSITAR = new javax.swing.JRadioButton();
        btnRETIRAR = new javax.swing.JRadioButton();
        btnELIMINAR = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        txtVALOR = new javax.swing.JTextField();
        btnPROCESAR = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        TotalBanco = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtSaldo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CAJA AHORRO ESPE");

        jLabel2.setText("CODIGO");

        jLabel3.setText("NOMBRES");

        jLabel4.setText("SALDO INICIAL");

        txtNOMBRES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNOMBRESActionPerformed(evt);
            }
        });

        txtSALDOINICIAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSALDOINICIALActionPerformed(evt);
            }
        });

        jButton1.setText("INSERTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnDEPOSITAR.setText("DEPOSITAR");
        btnDEPOSITAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDEPOSITARActionPerformed(evt);
            }
        });

        btnRETIRAR.setText("RETIRAR");
        btnRETIRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRETIRARActionPerformed(evt);
            }
        });

        btnELIMINAR.setText("ELIMINAR");
        btnELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnELIMINARActionPerformed(evt);
            }
        });

        jLabel5.setText("VALOR");

        txtVALOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVALORActionPerformed(evt);
            }
        });

        btnPROCESAR.setText("PROCESAR");
        btnPROCESAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPROCESARActionPerformed(evt);
            }
        });

        jLabel6.setText("TOT: BANCO");

        jLabel7.setText("Nombre: ");

        jLabel8.setText("Saldo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnDEPOSITAR)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel5))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRETIRAR)
                                    .addComponent(btnELIMINAR))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnPROCESAR)
                                    .addComponent(txtVALOR, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(TotalBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtCODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtNOMBRES, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSALDOINICIAL))
                        .addGap(52, 52, 52)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNOMBRES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSALDOINICIAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDEPOSITAR)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRETIRAR)
                    .addComponent(txtVALOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPROCESAR)
                        .addComponent(TotalBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnELIMINAR))
                .addGap(18, 58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         double Saldo = Double.parseDouble(txtSALDOINICIAL.getText());
        caja= new Ahorro(txtNOMBRES.getText(),Saldo);
        productos.add(caja);
        String Cad = String.valueOf(caja.getCuenta());
        String Cad1 = String.valueOf(caja.getCuenta() + 1);
        String[] info= new String[3];
        info[0] = Cad;
        info[1] = txtNOMBRES.getText();
        info[2] = txtSALDOINICIAL.getText();
        model.addRow(info);
        
        txtNOMBRES.setText("");
        txtSALDOINICIAL.setText("");
        txtCODIGO.setText(Cad1);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNOMBRESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNOMBRESActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNOMBRESActionPerformed

    private void txtSALDOINICIALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSALDOINICIALActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSALDOINICIALActionPerformed

    private void btnDEPOSITARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDEPOSITARActionPerformed
        // TODO add your handling code here:
         btnPROCESAR.setEnabled(true);
         txtVALOR.setEnabled(true);
    }//GEN-LAST:event_btnDEPOSITARActionPerformed

    private void btnRETIRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRETIRARActionPerformed
        // TODO add your handling code here:
         btnPROCESAR.setEnabled(true);
         txtVALOR.setEnabled(true);
      
    }//GEN-LAST:event_btnRETIRARActionPerformed

    private void btnELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnELIMINARActionPerformed
        // TODO add your handling code here:
          int fila = jTable1.getSelectedRow();
        if(fila>=0){
            model.removeRow(fila);
        }
    }//GEN-LAST:event_btnELIMINARActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        btnDEPOSITAR.setEnabled(true);
        btnRETIRAR.setEnabled(true);
        btnELIMINAR.setEnabled(true);
        int seleccionar = jTable1.rowAtPoint(evt.getPoint());
        
         txtNombre.setText(String.valueOf(jTable1.getValueAt(seleccionar, 1)));
         txtSaldo.setText(String.valueOf(jTable1.getValueAt(seleccionar, 2)));
    }//GEN-LAST:event_jTable1MouseClicked

    private void txtVALORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVALORActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtVALORActionPerformed

    private void btnPROCESARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPROCESARActionPerformed
        // TODO add your handling code here:
         int saldo = Integer.parseInt(txtSaldo.getText());
       int valor1 = Integer.parseInt(txtVALOR.getText());
       
       if(btnDEPOSITAR.isEnabled()){
           int operacion = saldo+valor1;
           TotalBanco.setText(String.valueOf(operacion));
       }else{
           int operacion = saldo - valor1;
           TotalBanco.setText(String.valueOf(operacion));
       }
    }//GEN-LAST:event_btnPROCESARActionPerformed

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
            java.util.logging.Logger.getLogger(Banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Banco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TotalBanco;
    private javax.swing.JRadioButton btnDEPOSITAR;
    private javax.swing.JRadioButton btnELIMINAR;
    private javax.swing.JButton btnPROCESAR;
    private javax.swing.JRadioButton btnRETIRAR;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCODIGO;
    private javax.swing.JTextField txtNOMBRES;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSALDOINICIAL;
    private javax.swing.JTextField txtSaldo;
    private javax.swing.JTextField txtVALOR;
    // End of variables declaration//GEN-END:variables
}
