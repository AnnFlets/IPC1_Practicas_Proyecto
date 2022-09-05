/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

/**
 *
 * @author Ana
 */
public class FrmMenu extends javax.swing.JFrame {

    /**
     * Creates new form FrmMenu
     */
    public FrmMenu() {
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

        menuBarMenu = new javax.swing.JMenuBar();
        menuNuevo = new javax.swing.JMenu();
        menuItemCrearProducto = new javax.swing.JMenuItem();
        menuOperaciones = new javax.swing.JMenu();
        menuItemEntradasSalidas = new javax.swing.JMenuItem();
        menuHistorial = new javax.swing.JMenu();
        menuItemHistorialProductos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuNuevo.setText("Nuevo");

        menuItemCrearProducto.setText("Crear producto");
        menuNuevo.add(menuItemCrearProducto);

        menuBarMenu.add(menuNuevo);

        menuOperaciones.setText("Operaciones");

        menuItemEntradasSalidas.setText("Entradas y salidas");
        menuOperaciones.add(menuItemEntradasSalidas);

        menuBarMenu.add(menuOperaciones);

        menuHistorial.setText("Historial");

        menuItemHistorialProductos.setText("Historial productos");
        menuHistorial.add(menuItemHistorialProductos);

        menuBarMenu.add(menuHistorial);

        setJMenuBar(menuBarMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar menuBarMenu;
    private javax.swing.JMenu menuHistorial;
    public javax.swing.JMenuItem menuItemCrearProducto;
    public javax.swing.JMenuItem menuItemEntradasSalidas;
    public javax.swing.JMenuItem menuItemHistorialProductos;
    private javax.swing.JMenu menuNuevo;
    private javax.swing.JMenu menuOperaciones;
    // End of variables declaration//GEN-END:variables
}