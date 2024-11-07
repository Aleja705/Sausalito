
package proyectosausalito;


public class secciones extends javax.swing.JFrame {


    public secciones() {
        initComponents();
        iniMesas();
    }

    private void iniMesas(){
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Boton_Ventas = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        Boton_Mesas = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        Boton_Menu = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        Boton_Usuarios = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        Boton_Mobiliario = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        Boton_Gastos = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(58, 179, 28));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Boton_Ventas.setBackground(new java.awt.Color(47, 143, 23));
        Boton_Ventas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ventas");
        Boton_Ventas.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 60, 26));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/venta.png"))); // NOI18N
        Boton_Ventas.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 6, 26, 28));

        jPanel3.add(Boton_Ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 210, 40));

        Boton_Mesas.setBackground(new java.awt.Color(58, 179, 28));
        Boton_Mesas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton_MesasMouseClicked(evt);
            }
        });
        Boton_Mesas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Mesas");
        Boton_Mesas.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 26));
        Boton_Mesas.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 0, -1, 40));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Mesas.png"))); // NOI18N
        Boton_Mesas.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 26, 28));

        jPanel3.add(Boton_Mesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 240, 40));

        Boton_Menu.setBackground(new java.awt.Color(58, 179, 28));
        Boton_Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Menú");
        Boton_Menu.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 44, 26));
        Boton_Menu.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 0, -1, 42));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu.png"))); // NOI18N
        Boton_Menu.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 8, 26, 28));

        jPanel3.add(Boton_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 200, -1));

        Boton_Usuarios.setBackground(new java.awt.Color(58, 179, 28));
        Boton_Usuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Usuarios");
        Boton_Usuarios.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 62, 26));
        Boton_Usuarios.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 0, -1, 40));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N
        Boton_Usuarios.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 26, 40));

        jPanel3.add(Boton_Usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 200, -1));

        Boton_Mobiliario.setBackground(new java.awt.Color(58, 179, 28));
        Boton_Mobiliario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Mobiliario");
        Boton_Mobiliario.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 80, 26));
        Boton_Mobiliario.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, 40));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mobiliario.png"))); // NOI18N
        Boton_Mobiliario.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 26, 28));

        jPanel3.add(Boton_Mobiliario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 200, -1));

        Boton_Gastos.setBackground(new java.awt.Color(58, 179, 28));
        Boton_Gastos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Gastos");
        Boton_Gastos.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 62, 26));
        Boton_Gastos.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, 40));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gastos.png"))); // NOI18N
        Boton_Gastos.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 26, 28));

        jPanel3.add(Boton_Gastos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 200, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("RESTAURANTE");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 150, 40));

        jPanel13.setBackground(new java.awt.Color(47, 143, 23));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Juan Rodriguez");
        jPanel13.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 6, -1, 26));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        jPanel13.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 26, 52));

        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Administrador");
        jPanel13.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 100, 20));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/perfil.png"))); // NOI18N
        jPanel13.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 26, 52));

        jPanel3.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 240, 60));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_MesasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_MesasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton_MesasMouseClicked

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
            java.util.logging.Logger.getLogger(secciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(secciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(secciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(secciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new secciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Boton_Gastos;
    private javax.swing.JPanel Boton_Menu;
    private javax.swing.JPanel Boton_Mesas;
    private javax.swing.JPanel Boton_Mobiliario;
    private javax.swing.JPanel Boton_Usuarios;
    private javax.swing.JPanel Boton_Ventas;
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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
