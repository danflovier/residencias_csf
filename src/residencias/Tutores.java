/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package residencias;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author danflovier
 */
public class Tutores extends javax.swing.JFrame {
    
    public Tutores() {
        initComponents();
        
        // Set a background color to the JFrame
        this.getContentPane().setBackground(new Color(255,255,255));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_id = new javax.swing.JLabel();
        label_login = new javax.swing.JLabel();
        label_residencias = new javax.swing.JLabel();
        label_nombre = new javax.swing.JLabel();
        label_contrasena = new javax.swing.JLabel();
        label_direccion = new javax.swing.JLabel();
        label_telefono = new javax.swing.JLabel();
        label_correo = new javax.swing.JLabel();
        label_buscar = new javax.swing.JLabel();
        label_logo = new javax.swing.JLabel();
        label_line = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        buscar_tutor = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        direccion = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        correo_electronico = new javax.swing.JTextField();
        contrasena = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_tutores = new javax.swing.JTable();
        buscar2 = new javax.swing.JButton();
        mostrar_todos = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        registrar = new javax.swing.JButton();
        buscar1 = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        imprimir = new javax.swing.JButton();
        back = new javax.swing.JButton();
        Menu = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        log_out = new javax.swing.JMenuItem();
        about = new javax.swing.JMenu();
        about_csf = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Residencias Santa Fe | Tutores");
        setBackground(new java.awt.Color(33, 150, 243));
        setIconImage(new ImageIcon(getClass().getResource("/img/icon.png")).getImage());
        setPreferredSize(new java.awt.Dimension(1500, 800));
        setResizable(false);
        setSize(new java.awt.Dimension(1500, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_id.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_id.setForeground(new java.awt.Color(76, 76, 76));
        label_id.setText("ID");
        getContentPane().add(label_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        label_login.setFont(new java.awt.Font("Segoe UI", 1, 72)); // NOI18N
        label_login.setForeground(new java.awt.Color(76, 76, 76));
        label_login.setText("TUTORES");
        getContentPane().add(label_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        label_residencias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_residencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo5.png"))); // NOI18N
        getContentPane().add(label_residencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(1800, 910, 180, 70));

        label_nombre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_nombre.setForeground(new java.awt.Color(76, 76, 76));
        label_nombre.setText("NOMBRE COMPLETO");
        getContentPane().add(label_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        label_contrasena.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_contrasena.setForeground(new java.awt.Color(76, 76, 76));
        label_contrasena.setText("CONTRASEÑA");
        getContentPane().add(label_contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 460, 190, -1));

        label_direccion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_direccion.setForeground(new java.awt.Color(76, 76, 76));
        label_direccion.setText("DIRECCIÓN");
        getContentPane().add(label_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 300, -1));

        label_telefono.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_telefono.setForeground(new java.awt.Color(76, 76, 76));
        label_telefono.setText("TELÉFONO");
        getContentPane().add(label_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 240, -1));

        label_correo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_correo.setForeground(new java.awt.Color(76, 76, 76));
        label_correo.setText("CORREO ELECTRÓNICO");
        getContentPane().add(label_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 370, -1));

        label_buscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_buscar.setForeground(new java.awt.Color(76, 76, 76));
        label_buscar.setText("BUSCAR TUTOR:");
        getContentPane().add(label_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 150, -1, -1));

        label_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo5.png"))); // NOI18N
        getContentPane().add(label_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 650, 180, 70));

        label_line.setBackground(new java.awt.Color(250, 197, 28));
        label_line.setForeground(new java.awt.Color(3, 169, 244));
        label_line.setOpaque(true);
        getContentPane().add(label_line, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 500, 10));

        id.setBackground(new java.awt.Color(223, 223, 223));
        id.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        id.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        id.setToolTipText("");
        id.setBorder(null);
        id.setDoubleBuffered(true);
        id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iduserIsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iduserIsMouseExited(evt);
            }
        });
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 200, 30));

        buscar_tutor.setBackground(new java.awt.Color(223, 223, 223));
        buscar_tutor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buscar_tutor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        buscar_tutor.setToolTipText("");
        buscar_tutor.setBorder(null);
        buscar_tutor.setDoubleBuffered(true);
        getContentPane().add(buscar_tutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 190, 200, 30));

        nombre.setBackground(new java.awt.Color(223, 223, 223));
        nombre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nombre.setToolTipText("");
        nombre.setBorder(null);
        nombre.setDoubleBuffered(true);
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 580, 30));

        direccion.setBackground(new java.awt.Color(223, 223, 223));
        direccion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        direccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        direccion.setToolTipText("");
        direccion.setBorder(null);
        direccion.setDoubleBuffered(true);
        direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionActionPerformed(evt);
            }
        });
        getContentPane().add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 300, 30));

        telefono.setBackground(new java.awt.Color(223, 223, 223));
        telefono.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        telefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        telefono.setToolTipText("");
        telefono.setBorder(null);
        telefono.setDoubleBuffered(true);
        getContentPane().add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, 240, 30));

        correo_electronico.setBackground(new java.awt.Color(223, 223, 223));
        correo_electronico.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        correo_electronico.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        correo_electronico.setToolTipText("");
        correo_electronico.setBorder(null);
        correo_electronico.setDoubleBuffered(true);
        getContentPane().add(correo_electronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, 370, 30));

        contrasena.setBackground(new java.awt.Color(223, 223, 223));
        contrasena.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contrasena.setBorder(null);
        contrasena.setEnabled(false);
        getContentPane().add(contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 490, 190, 30));

        tabla_tutores.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        tabla_tutores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "DIRECCION", "TELEFONO", "CORREO ELECTRONICO", "CONTRASEÑA"
            }
        ));
        jScrollPane1.setViewportView(tabla_tutores);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 240, 690, 310));

        buscar2.setBackground(new java.awt.Color(255, 255, 255));
        buscar2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buscar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        buscar2.setText("BUSCAR");
        buscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar2ActionPerformed(evt);
            }
        });
        getContentPane().add(buscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 190, 140, 30));

        mostrar_todos.setBackground(new java.awt.Color(255, 255, 255));
        mostrar_todos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mostrar_todos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lista.png"))); // NOI18N
        mostrar_todos.setText("MOSTRAR");
        mostrar_todos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrar_todosActionPerformed(evt);
            }
        });
        getContentPane().add(mostrar_todos, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 570, 180, 60));

        eliminar.setBackground(new java.awt.Color(255, 255, 255));
        eliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        eliminar.setText("ELIMINAR");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 570, 180, 60));

        registrar.setBackground(new java.awt.Color(255, 255, 255));
        registrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/registrar.png"))); // NOI18N
        registrar.setText("REGISTRAR");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        getContentPane().add(registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 590, 130, 40));

        buscar1.setBackground(new java.awt.Color(255, 255, 255));
        buscar1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        buscar1.setText("BUSCAR");
        buscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar1ActionPerformed(evt);
            }
        });
        getContentPane().add(buscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 590, 120, 40));

        cancelar.setBackground(new java.awt.Color(255, 255, 255));
        cancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        cancelar.setText("CANCELAR");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 590, 140, 40));

        modificar.setBackground(new java.awt.Color(255, 255, 255));
        modificar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/modificar.png"))); // NOI18N
        modificar.setText("MODIFICAR");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        getContentPane().add(modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 590, 130, 40));

        imprimir.setBackground(new java.awt.Color(255, 255, 255));
        imprimir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        imprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imprimir.png"))); // NOI18N
        imprimir.setText("IMPRIMIR");
        imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirActionPerformed(evt);
            }
        });
        getContentPane().add(imprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 570, 180, 60));

        back.setBackground(java.awt.Color.white);
        back.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        back.setForeground(new java.awt.Color(76, 76, 76));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back-button.png"))); // NOI18N
        back.setText("REGRESAR");
        back.setBorder(null);
        back.setBorderPainted(false);
        back.setContentAreaFilled(false);
        back.setMaximumSize(new java.awt.Dimension(129, 65));
        back.setMinimumSize(new java.awt.Dimension(129, 65));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backisEmailCursorEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backisEmailCursorExited(evt);
            }
        });
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 670, 130, 40));

        Menu.setBackground(new java.awt.Color(255, 255, 255));
        Menu.setBorder(null);
        Menu.setBorderPainted(false);
        Menu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        file.setText("File");
        file.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        log_out.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        log_out.setText("Cerrar sesión");
        log_out.setBorderPainted(true);
        log_out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_outActionPerformed(evt);
            }
        });
        file.add(log_out);

        Menu.add(file);

        about.setText("About...");
        about.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        about_csf.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        about_csf.setText("Residencias CSF");
        about_csf.setBorderPainted(true);
        about_csf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                about_csfActionPerformed(evt);
            }
        });
        about.add(about_csf);

        Menu.add(about);

        setJMenuBar(Menu);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionActionPerformed

    private void iduserIsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iduserIsMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_iduserIsMouseEntered

    private void iduserIsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iduserIsMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_iduserIsMouseExited

    private void buscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscar2ActionPerformed

    private void mostrar_todosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrar_todosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mostrar_todosActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registrarActionPerformed

    private void buscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscar1ActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarActionPerformed

    private void log_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_outActionPerformed
        new Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_log_outActionPerformed

    private void about_csfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_about_csfActionPerformed
        new ResidenciasCSF().setVisible(true);
    }//GEN-LAST:event_about_csfActionPerformed

    private void imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imprimirActionPerformed

    private void backisEmailCursorEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backisEmailCursorEntered
        back.setBackground(new Color(231,231,231));
        //button_send.setForeground(new Color(220,220,220));
    }//GEN-LAST:event_backisEmailCursorEntered

    private void backisEmailCursorExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backisEmailCursorExited
        back.setBackground(new Color(255,255,255));
        //button_send.setForeground(new Color(76,76,76));
    }//GEN-LAST:event_backisEmailCursorExited

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new MenuAlumnos().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(Tutores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tutores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tutores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tutores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tutores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenu about;
    private javax.swing.JMenuItem about_csf;
    private javax.swing.JButton back;
    private javax.swing.JButton buscar1;
    private javax.swing.JButton buscar2;
    private javax.swing.JTextField buscar_tutor;
    private javax.swing.JButton cancelar;
    private javax.swing.JPasswordField contrasena;
    private javax.swing.JTextField correo_electronico;
    private javax.swing.JTextField direccion;
    private javax.swing.JButton eliminar;
    private javax.swing.JMenu file;
    private javax.swing.JTextField id;
    private javax.swing.JButton imprimir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_buscar;
    private javax.swing.JLabel label_contrasena;
    private javax.swing.JLabel label_correo;
    private javax.swing.JLabel label_direccion;
    private javax.swing.JLabel label_id;
    private javax.swing.JLabel label_line;
    private javax.swing.JLabel label_login;
    private javax.swing.JLabel label_logo;
    private javax.swing.JLabel label_nombre;
    private javax.swing.JLabel label_residencias;
    private javax.swing.JLabel label_telefono;
    private javax.swing.JMenuItem log_out;
    private javax.swing.JButton modificar;
    private javax.swing.JButton mostrar_todos;
    private javax.swing.JTextField nombre;
    private javax.swing.JButton registrar;
    private javax.swing.JTable tabla_tutores;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
