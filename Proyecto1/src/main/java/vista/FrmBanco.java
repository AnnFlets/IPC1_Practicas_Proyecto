/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;


/**
 *
 * @author Ana
 */
public class FrmBanco extends javax.swing.JFrame {

    /**
     * Creates new form FrmBanco
     */
    public FrmBanco() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jopMensaje = new javax.swing.JOptionPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCuiCCl = new javax.swing.JTextField();
        txtNombreCCl = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtApellidoCCl = new javax.swing.JTextField();
        btnCrearCCl = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cmbClienteCCu = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        btnCrearCCu = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientesMC = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtCuiMC = new javax.swing.JTextField();
        btnBuscarCuentasMC = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCuentasAsociadasMC = new javax.swing.JTable();
        jLabel23 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        cmbCuentaD = new javax.swing.JComboBox<>();
        txtMontoD = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnAceptarD = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        cmbCuentaOrigenT = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        cmbCuentaDestinoT = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        txtMontoT = new javax.swing.JTextField();
        btnAceptarT = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        cmbCuentaDebitarPS = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cmbTipoServicioPS = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtMontoPS = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnAceptarPS = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblTransaccionesH = new javax.swing.JTable();
        txtApellidoH = new javax.swing.JTextField();
        txtCuiH = new javax.swing.JTextField();
        txtNombreH = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnMostrarTransaccionesH = new javax.swing.JButton();
        cmbCuentaH = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Banco");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 50)); // NOI18N
        jLabel19.setText("BAMNCO");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setText("DE LA");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, -1, 60));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 70)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(153, 153, 0));
        jLabel21.setText("AMNSIEDAD");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, -1, -1));

        jTabbedPane1.addTab("Inicio", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("CUI");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, -1, -1));
        jPanel2.add(txtCuiCCl, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 290, -1));

        txtNombreCCl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreCClActionPerformed(evt);
            }
        });
        jPanel2.add(txtNombreCCl, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 290, -1));

        jLabel2.setText("Nombre");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, -1, -1));

        jLabel3.setText("Apellido");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, -1, -1));
        jPanel2.add(txtApellidoCCl, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 290, -1));

        btnCrearCCl.setText("CREAR");
        jPanel2.add(btnCrearCCl, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, 110, 40));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel18.setText("CREAR CLIENTE");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, -1));

        jTabbedPane1.addTab("Crear cliente", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.add(cmbClienteCCu, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 360, -1));

        jLabel4.setText("Cliente");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, -1, -1));

        btnCrearCCu.setText("CREAR");
        btnCrearCCu.setEnabled(false);
        jPanel3.add(btnCrearCCu, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 120, 40));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel22.setText("CREAR CUENTA");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, -1, -1));

        jTabbedPane1.addTab("Crear cuenta", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblClientesMC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CUI", "Nombre", "Apellido"
            }
        ));
        jScrollPane1.setViewportView(tblClientesMC);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 780, 200));

        jLabel5.setText("CUI");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, -1, -1));
        jPanel4.add(txtCuiMC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 320, -1));

        btnBuscarCuentasMC.setText("BUSCAR CUENTAS ASOCIADAS");
        btnBuscarCuentasMC.setEnabled(false);
        jPanel4.add(btnBuscarCuentasMC, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 260, 40));

        tblCuentasAsociadasMC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cuentas asociadas"
            }
        ));
        jScrollPane2.setViewportView(tblCuentasAsociadasMC);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 320, 140));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel23.setText("MOSTRAR CLIENTES");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        jTabbedPane1.addTab("Mostrar clientes", jPanel4);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.add(cmbCuentaD, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 340, -1));
        jPanel5.add(txtMontoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 340, -1));

        jLabel6.setText("Cuenta");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, -1, -1));

        jLabel7.setText("Monto");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, -1, -1));

        btnAceptarD.setText("ACEPTAR");
        btnAceptarD.setEnabled(false);
        jPanel5.add(btnAceptarD, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 120, 50));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel24.setText("DEPÓSITO");
        jPanel5.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, -1));

        jTabbedPane1.addTab("Depósito", jPanel5);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setText("Cuenta de origen");
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, -1, -1));

        jPanel6.add(cmbCuentaOrigenT, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 340, -1));

        jLabel16.setText("Cuenta de destino");
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, -1, -1));

        jPanel6.add(cmbCuentaDestinoT, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 340, -1));

        jLabel17.setText("Monto");
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, -1, -1));
        jPanel6.add(txtMontoT, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 340, -1));

        btnAceptarT.setText("ACEPTAR");
        btnAceptarT.setEnabled(false);
        jPanel6.add(btnAceptarT, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, 120, 50));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel25.setText("TRANSFERENCIA");
        jPanel6.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        jTabbedPane1.addTab("Transferencia", jPanel6);

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.add(cmbCuentaDebitarPS, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 360, -1));

        jLabel8.setText("Cuenta a debitar");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, -1, -1));

        cmbTipoServicioPS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Luz eléctrica", "Agua", "Servicio telefónico" }));
        jPanel7.add(cmbTipoServicioPS, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 360, -1));

        jLabel9.setText("Monto");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, -1, -1));
        jPanel7.add(txtMontoPS, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 360, -1));

        jLabel10.setText("Tipo de servicio");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, -1, -1));

        btnAceptarPS.setText("ACEPTAR");
        btnAceptarPS.setEnabled(false);
        jPanel7.add(btnAceptarPS, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, 120, 50));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel26.setText("PAGO DE SERVICIOS");
        jPanel7.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        jTabbedPane1.addTab("Pago de servicios", jPanel7);

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblTransaccionesH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Fecha", "Detalle", "Crédito", "Débito", "Saldo disponible"
            }
        ));
        jScrollPane3.setViewportView(tblTransaccionesH);

        jPanel8.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 800, 260));

        txtApellidoH.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtApellidoH.setEnabled(false);
        jPanel8.add(txtApellidoH, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 230, -1));

        txtCuiH.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtCuiH.setEnabled(false);
        jPanel8.add(txtCuiH, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 230, -1));

        txtNombreH.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNombreH.setEnabled(false);
        jPanel8.add(txtNombreH, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 230, -1));

        jLabel11.setText("CUI");
        jPanel8.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));

        jLabel12.setText("Apellido");
        jPanel8.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, -1, -1));

        jLabel13.setText("Nombre");
        jPanel8.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, -1, -1));

        btnMostrarTransaccionesH.setText("MOSTRAR TRANSACCIONES");
        btnMostrarTransaccionesH.setEnabled(false);
        jPanel8.add(btnMostrarTransaccionesH, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 250, 50));

        jPanel8.add(cmbCuentaH, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 320, -1));

        jLabel14.setText("ID Cuenta");
        jPanel8.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel27.setText("HISTORIAL");
        jPanel8.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        jTabbedPane1.addTab("Historial", jPanel8);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreCClActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreCClActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreCClActionPerformed

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
            java.util.logging.Logger.getLogger(FrmBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmBanco().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAceptarD;
    public javax.swing.JButton btnAceptarPS;
    public javax.swing.JButton btnAceptarT;
    public javax.swing.JButton btnBuscarCuentasMC;
    public javax.swing.JButton btnCrearCCl;
    public javax.swing.JButton btnCrearCCu;
    public javax.swing.JButton btnMostrarTransaccionesH;
    public javax.swing.JComboBox<String> cmbClienteCCu;
    public javax.swing.JComboBox<String> cmbCuentaD;
    public javax.swing.JComboBox<String> cmbCuentaDebitarPS;
    public javax.swing.JComboBox<String> cmbCuentaDestinoT;
    public javax.swing.JComboBox<String> cmbCuentaH;
    public javax.swing.JComboBox<String> cmbCuentaOrigenT;
    public javax.swing.JComboBox<String> cmbTipoServicioPS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JOptionPane jopMensaje;
    public javax.swing.JTable tblClientesMC;
    public javax.swing.JTable tblCuentasAsociadasMC;
    public javax.swing.JTable tblTransaccionesH;
    public javax.swing.JTextField txtApellidoCCl;
    public javax.swing.JTextField txtApellidoH;
    public javax.swing.JTextField txtCuiCCl;
    public javax.swing.JTextField txtCuiH;
    public javax.swing.JTextField txtCuiMC;
    public javax.swing.JTextField txtMontoD;
    public javax.swing.JTextField txtMontoPS;
    public javax.swing.JTextField txtMontoT;
    public javax.swing.JTextField txtNombreCCl;
    public javax.swing.JTextField txtNombreH;
    // End of variables declaration//GEN-END:variables
}
