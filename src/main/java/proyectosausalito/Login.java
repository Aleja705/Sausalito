/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectosausalito;

import java.awt.Color;

/**
 *
 * @author Lenovo
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        ingreso = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Entrar = new javax.swing.JButton();
        Mostrar = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txUsuario = new javax.swing.JTextField();
        TxtPassword = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ingreso.setBackground(new java.awt.Color(255, 255, 255));
        ingreso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        ingreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\Iconos proyecto\\icons8-carta-20.png")); // NOI18N
        ingreso.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Iconos proyecto\\icons8-candado-20.png")); // NOI18N
        ingreso.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, 30));

        Entrar.setText("Entrar");
        Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarActionPerformed(evt);
            }
        });
        ingreso.add(Entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 540, 220, 40));

        Mostrar.setBackground(new java.awt.Color(255, 255, 255));
        Mostrar.setForeground(new java.awt.Color(0, 0, 0));
        Mostrar.setText("Mostrar contraseña");
        Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarActionPerformed(evt);
            }
        });
        ingreso.add(Mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, -1));
        ingreso.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Inicio de sesión");
        ingreso.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 130, 40));

        txUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txUsuario.setForeground(new java.awt.Color(0, 0, 0));
        txUsuario.setBorder(new javax.swing.border.MatteBorder(null));
        txUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txUsuarioMousePressed(evt);
            }
        });
        txUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txUsuarioActionPerformed(evt);
            }
        });
        ingreso.add(txUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 310, 40));

        TxtPassword.setBackground(new java.awt.Color(153, 153, 153));
        TxtPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TxtPasswordMousePressed(evt);
            }
        });
        TxtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPasswordActionPerformed(evt);
            }
        });
        ingreso.add(TxtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 310, 50));

        jLabel5.setForeground(new java.awt.Color(58, 179, 28));
        jLabel5.setText("Olvido su contraseña");
        ingreso.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\sau.jpg")); // NOI18N
        ingreso.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 250, 240));

        jPanel3.add(ingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 410, 680));

        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarActionPerformed

       
    }//GEN-LAST:event_EntrarActionPerformed

    private void MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarActionPerformed
        

    }//GEN-LAST:event_MostrarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txUsuarioMousePressed
        if (txUsuario.getText().equals("Ingrese su usuario")) {
            txUsuario.setText("");
            txUsuario.setForeground(Color.black);  
        }
        if (String.valueOf(TxtPassword.getPassword()).isEmpty()) {
            TxtPassword.setText("");
            TxtPassword.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txUsuarioMousePressed

    private void txUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txUsuarioActionPerformed

    private void TxtPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtPasswordMousePressed
        if (String.valueOf(TxtPassword.getPassword()).equals("")) {
            TxtPassword.setText("");
            TxtPassword.setForeground(Color.black);
        }
        if (txUsuario.getText().isEmpty()) {
            txUsuario.setText("Ingrese su usuario");
            txUsuario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_TxtPasswordMousePressed

    private void TxtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Entrar;
    private javax.swing.JCheckBox Mostrar;
    private javax.swing.JPasswordField TxtPassword;
    private javax.swing.JPanel ingreso;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txUsuario;
    // End of variables declaration//GEN-END:variables
}
