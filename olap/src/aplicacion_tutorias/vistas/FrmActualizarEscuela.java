/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion_tutorias.vistas;

/**
 *
 * @author Luis Salgado
 */
public class FrmActualizarEscuela extends javax.swing.JFrame {

    /**
     * Creates new form FrmActualizarEscuela
     */
    public FrmActualizarEscuela() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblCodigoBuscar3 = new javax.swing.JLabel();
        txtCodigoBuscar3 = new javax.swing.JTextField();
        btnBuscar3 = new javax.swing.JButton();
        btnActualizar3 = new javax.swing.JButton();
        btnRegresar3 = new javax.swing.JButton();
        btnSalir3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        lblCodigoModalidad3 = new javax.swing.JLabel();
        lblNombre3 = new javax.swing.JLabel();
        llblDescripcion = new javax.swing.JLabel();
        lblEstado3 = new javax.swing.JLabel();
        txtEstado3 = new javax.swing.JTextField();
        txtDescripcion3 = new javax.swing.JTextField();
        txtNombre3 = new javax.swing.JTextField();
        txtCodigoModalidad3 = new javax.swing.JTextField();
        lblCodigoModalidad4 = new javax.swing.JLabel();
        txtCodigoBuscar4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 153, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 102, 255))); // NOI18N

        jLabel4.setBackground(new java.awt.Color(153, 0, 153));
        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 153));
        jLabel4.setText("Actualizar Escuela.");

        lblCodigoBuscar3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblCodigoBuscar3.setText("Codigo");

        btnBuscar3.setFont(new java.awt.Font("Simplified Arabic Fixed", 3, 18)); // NOI18N
        btnBuscar3.setForeground(new java.awt.Color(51, 51, 255));
        btnBuscar3.setText("Buscar");

        btnActualizar3.setFont(new java.awt.Font("Simplified Arabic Fixed", 3, 18)); // NOI18N
        btnActualizar3.setForeground(new java.awt.Color(51, 51, 255));
        btnActualizar3.setText("Actualizar");

        btnRegresar3.setFont(new java.awt.Font("Simplified Arabic Fixed", 3, 18)); // NOI18N
        btnRegresar3.setForeground(new java.awt.Color(51, 51, 255));
        btnRegresar3.setText("Regresar");

        btnSalir3.setFont(new java.awt.Font("Simplified Arabic Fixed", 3, 18)); // NOI18N
        btnSalir3.setForeground(new java.awt.Color(51, 51, 255));
        btnSalir3.setText("Salir");

        jLabel10.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("Datos");

        lblCodigoModalidad3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblCodigoModalidad3.setText("Codigo");

        lblNombre3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblNombre3.setText("Nombre");

        llblDescripcion.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        llblDescripcion.setText("Descripcion");

        lblEstado3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblEstado3.setText("Estado");

        lblCodigoModalidad4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblCodigoModalidad4.setText("Codigo Facultad");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCodigoModalidad3)
                            .addComponent(lblCodigoModalidad4)
                            .addComponent(lblNombre3)
                            .addComponent(llblDescripcion)
                            .addComponent(lblEstado3))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtEstado3, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addComponent(txtCodigoModalidad3)
                            .addComponent(txtNombre3)
                            .addComponent(txtCodigoBuscar3)
                            .addComponent(txtCodigoBuscar4))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnActualizar3)
                            .addComponent(btnRegresar3)
                            .addComponent(btnSalir3)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(lblCodigoBuscar3)
                        .addGap(31, 31, 31)
                        .addComponent(txtDescripcion3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(jLabel10)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 158, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(155, 155, 155))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoBuscar3)
                    .addComponent(txtDescripcion3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar3))
                .addGap(27, 27, 27)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoModalidad3)
                    .addComponent(txtNombre3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoModalidad4)
                    .addComponent(txtCodigoModalidad3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre3)
                            .addComponent(txtEstado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(btnRegresar3)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(llblDescripcion)
                            .addComponent(txtCodigoBuscar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCodigoBuscar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(107, 107, 107))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblEstado3)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnSalir3)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 924, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 309, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 486, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

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
            java.util.logging.Logger.getLogger(FrmActualizarEscuela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmActualizarEscuela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmActualizarEscuela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmActualizarEscuela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmActualizarEscuela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar3;
    private javax.swing.JButton btnBuscar3;
    private javax.swing.JButton btnRegresar3;
    private javax.swing.JButton btnSalir3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCodigoBuscar3;
    private javax.swing.JLabel lblCodigoModalidad3;
    private javax.swing.JLabel lblCodigoModalidad4;
    private javax.swing.JLabel lblEstado3;
    private javax.swing.JLabel lblNombre3;
    private javax.swing.JLabel llblDescripcion;
    private javax.swing.JTextField txtCodigoBuscar3;
    private javax.swing.JTextField txtCodigoBuscar4;
    private javax.swing.JTextField txtCodigoModalidad3;
    private javax.swing.JTextField txtDescripcion3;
    private javax.swing.JTextField txtEstado3;
    private javax.swing.JTextField txtNombre3;
    // End of variables declaration//GEN-END:variables
}
