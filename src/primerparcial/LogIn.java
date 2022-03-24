/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package primerparcial;

import java.awt.Color;
import javax.swing.JOptionPane;


/**
 *
 * @author ER21018
 */
public class LogIn extends javax.swing.JFrame {
    
    
    
    int xMouse, yMouse;
    
    
    public LogIn() {
        initComponents();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        favicon = new javax.swing.JLabel();
        fmocc = new javax.swing.JLabel();
        iniciosesion = new javax.swing.JLabel();
        ingresar = new javax.swing.JButton();
        toppanel = new javax.swing.JPanel();
        paxit = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        tienda = new javax.swing.JLabel();
        contraseñatxt = new javax.swing.JLabel();
        usuariotxt = new javax.swing.JLabel();
        ingpass = new javax.swing.JPasswordField();
        ingusuario = new javax.swing.JTextField();
        citylogo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        favicon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        favicon.setIcon(new javax.swing.ImageIcon("C:\\Users\\OscarAntonio\\Desktop\\favicon.png")); // NOI18N

        fmocc.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        fmocc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fmocc.setText("FMOcc");

        iniciosesion.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        iniciosesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iniciosesion.setText("INICIAR SESIÓN");

        ingresar.setBackground(new java.awt.Color(0, 255, 51));
        ingresar.setText("INGRESAR");
        ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ingresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ingresarMouseExited(evt);
            }
        });

        toppanel.setBackground(new java.awt.Color(255, 255, 255));
        toppanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                toppanelMouseDragged(evt);
            }
        });
        toppanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                toppanelMousePressed(evt);
            }
        });

        paxit.setBackground(new java.awt.Color(255, 255, 255));

        exit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        exit.setText("X");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout paxitLayout = new javax.swing.GroupLayout(paxit);
        paxit.setLayout(paxitLayout);
        paxitLayout.setHorizontalGroup(
            paxitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paxitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        paxitLayout.setVerticalGroup(
            paxitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout toppanelLayout = new javax.swing.GroupLayout(toppanel);
        toppanel.setLayout(toppanelLayout);
        toppanelLayout.setHorizontalGroup(
            toppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toppanelLayout.createSequentialGroup()
                .addComponent(paxit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        toppanelLayout.setVerticalGroup(
            toppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paxit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tienda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tienda.setIcon(new javax.swing.ImageIcon("C:\\Users\\OscarAntonio\\Desktop\\tienda3.png")); // NOI18N

        contraseñatxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        contraseñatxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contraseñatxt.setText("CONTRASEÑA");

        usuariotxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        usuariotxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usuariotxt.setText("USUARIO");

        ingpass.setForeground(new java.awt.Color(153, 153, 153));
        ingpass.setText("*************");
        ingpass.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ingpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ingpassMousePressed(evt);
            }
        });

        ingusuario.setForeground(new java.awt.Color(153, 153, 153));
        ingusuario.setText("Ingrese su nombre de Usuario");
        ingusuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ingusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ingusuarioMousePressed(evt);
            }
        });
        ingusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingusuarioActionPerformed(evt);
            }
        });

        citylogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        citylogo.setIcon(new javax.swing.ImageIcon("C:\\Users\\OscarAntonio\\Desktop\\logo.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toppanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(contraseñatxt)
                                .addComponent(ingpass, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ingusuario, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                .addComponent(usuariotxt)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(favicon, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(fmocc))
                                .addComponent(iniciosesion)
                                .addComponent(jSeparator1))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(citylogo)
                .addComponent(tienda, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(171, 171, 171))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(toppanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(favicon)
                            .addComponent(fmocc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(iniciosesion, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(usuariotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(ingusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(contraseñatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ingpass, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(citylogo))
                        .addGap(18, 18, 18)
                        .addComponent(ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(tienda)))
                .addContainerGap(156, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingusuarioActionPerformed

    private void toppanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toppanelMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_toppanelMousePressed

    private void toppanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toppanelMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_toppanelMouseDragged

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        paxit.setBackground(Color.red);
        exit.setForeground(Color.blue);
        
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        paxit.setBackground(Color.white);
        exit.setForeground(Color.blue);
    }//GEN-LAST:event_exitMouseExited

    private void ingresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarMouseEntered
        ingresar.setBackground(Color.cyan);
        ingresar.setForeground(Color.black);
    }//GEN-LAST:event_ingresarMouseEntered

    private void ingresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarMouseExited
        ingresar.setBackground(Color.green);
        ingresar.setForeground(Color.black);
    }//GEN-LAST:event_ingresarMouseExited

    private void ingusuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingusuarioMousePressed
        ingusuario.setText("");
        ingusuario.setForeground(Color.black);
        ingpass.setText("*************");
        ingpass.setForeground(Color.gray);
    }//GEN-LAST:event_ingusuarioMousePressed

    private void ingpassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingpassMousePressed
        ingusuario.setText("Ingrese su nombre de Usuario");
        ingusuario.setForeground(Color.black);
        ingpass.setText("");
        ingpass.setForeground(Color.gray);
    }//GEN-LAST:event_ingpassMousePressed
   
    
    private void ingresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarMouseClicked
       JOptionPane.showMessageDialog(this, "Inició Sesión como:\nUsuario: ");
       
    }//GEN-LAST:event_ingresarMouseClicked

    /**
     * 
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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new LogIn().setVisible(true);
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel citylogo;
    private javax.swing.JLabel contraseñatxt;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel favicon;
    private javax.swing.JLabel fmocc;
    private javax.swing.JPasswordField ingpass;
    private javax.swing.JButton ingresar;
    private javax.swing.JTextField ingusuario;
    private javax.swing.JLabel iniciosesion;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel paxit;
    private javax.swing.JLabel tienda;
    private javax.swing.JPanel toppanel;
    private javax.swing.JLabel usuariotxt;
    // End of variables declaration//GEN-END:variables
}
