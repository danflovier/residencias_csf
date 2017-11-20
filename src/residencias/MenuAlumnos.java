/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package residencias;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author danflovier
 */
public class MenuAlumnos extends javax.swing.JFrame {
    
    public MenuAlumnos() {
        initComponents();
        
        // Get the screen resolution of the device
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        
        // Set size of the JFrame
        this.setSize(screenWidth / 2 - 200, screenHeight - 450);
        
        // Set default close operation
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        
        // Set a background color to the JFrame
        this.getContentPane().setBackground(new Color(255,255,255));
        
        // Center the JFrame
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_expediente = new javax.swing.JLabel();
        label_logo = new javax.swing.JLabel();
        label_talumnos = new javax.swing.JLabel();
        label_alumnos = new javax.swing.JLabel();
        label_asistencia = new javax.swing.JLabel();
        label_visitas = new javax.swing.JLabel();
        label_tutores = new javax.swing.JLabel();
        label_habitacion = new javax.swing.JLabel();
        alumnos = new javax.swing.JButton();
        asistencia = new javax.swing.JButton();
        visitas = new javax.swing.JButton();
        tutores = new javax.swing.JButton();
        expediente = new javax.swing.JButton();
        habitacion = new javax.swing.JButton();
        Menu = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        file_exit = new javax.swing.JMenuItem();
        about = new javax.swing.JMenu();
        about_rcsf = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Residencias Santa Fe | Menú");
        setBackground(new java.awt.Color(33, 150, 243));
        setIconImage(new ImageIcon(getClass().getResource("/img/icon.png")).getImage());
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_expediente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_expediente.setForeground(new java.awt.Color(76, 76, 76));
        label_expediente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_expediente.setText("EXPEDIENTE");
        getContentPane().add(label_expediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, 140, -1));

        label_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo5.png"))); // NOI18N
        getContentPane().add(label_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 480, 180, 70));

        label_talumnos.setFont(new java.awt.Font("Segoe UI", 1, 72)); // NOI18N
        label_talumnos.setForeground(new java.awt.Color(76, 76, 76));
        label_talumnos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_talumnos.setText("ALUMNOS");
        getContentPane().add(label_talumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 10, 530, -1));

        label_alumnos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_alumnos.setForeground(new java.awt.Color(76, 76, 76));
        label_alumnos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_alumnos.setText("ALUMNOS");
        getContentPane().add(label_alumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 140, -1));

        label_asistencia.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_asistencia.setForeground(new java.awt.Color(76, 76, 76));
        label_asistencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_asistencia.setText("ASISTENCIA");
        getContentPane().add(label_asistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 140, -1));

        label_visitas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_visitas.setForeground(new java.awt.Color(76, 76, 76));
        label_visitas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_visitas.setText("VISITAS");
        getContentPane().add(label_visitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 140, -1));

        label_tutores.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_tutores.setForeground(new java.awt.Color(76, 76, 76));
        label_tutores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_tutores.setText("TUTORES");
        getContentPane().add(label_tutores, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 140, -1));

        label_habitacion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_habitacion.setForeground(new java.awt.Color(76, 76, 76));
        label_habitacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_habitacion.setText("HABITACIÓN");
        getContentPane().add(label_habitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, 140, -1));

        alumnos.setBackground(new java.awt.Color(255, 255, 255));
        alumnos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1_alumno.png"))); // NOI18N
        alumnos.setBorder(null);
        alumnos.setBorderPainted(false);
        alumnos.setContentAreaFilled(false);
        alumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alumnosActionPerformed(evt);
            }
        });
        getContentPane().add(alumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 140, 130));

        asistencia.setBackground(new java.awt.Color(255, 255, 255));
        asistencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2_lista.png"))); // NOI18N
        asistencia.setBorder(null);
        asistencia.setBorderPainted(false);
        asistencia.setContentAreaFilled(false);
        asistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asistenciaActionPerformed(evt);
            }
        });
        getContentPane().add(asistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 140, 130));

        visitas.setBackground(new java.awt.Color(255, 255, 255));
        visitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/3_visita.png"))); // NOI18N
        visitas.setBorder(null);
        visitas.setBorderPainted(false);
        visitas.setContentAreaFilled(false);
        visitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visitasActionPerformed(evt);
            }
        });
        getContentPane().add(visitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 140, 130));

        tutores.setBackground(new java.awt.Color(255, 255, 255));
        tutores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/4_tutor.png"))); // NOI18N
        tutores.setBorder(null);
        tutores.setBorderPainted(false);
        tutores.setContentAreaFilled(false);
        tutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tutoresActionPerformed(evt);
            }
        });
        getContentPane().add(tutores, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 140, 130));

        expediente.setBackground(new java.awt.Color(255, 255, 255));
        expediente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/5_expediente.png"))); // NOI18N
        expediente.setBorder(null);
        expediente.setBorderPainted(false);
        expediente.setContentAreaFilled(false);
        expediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expedienteActionPerformed(evt);
            }
        });
        getContentPane().add(expediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 140, 130));

        habitacion.setBackground(new java.awt.Color(255, 255, 255));
        habitacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/6_cuarto.png"))); // NOI18N
        habitacion.setBorder(null);
        habitacion.setBorderPainted(false);
        habitacion.setContentAreaFilled(false);
        habitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                habitacionActionPerformed(evt);
            }
        });
        getContentPane().add(habitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 140, 130));

        Menu.setBackground(new java.awt.Color(255, 255, 255));
        Menu.setBorderPainted(false);
        Menu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        file.setText("File");
        file.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        file_exit.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        file_exit.setText("Cerrar sesión");
        file_exit.setBorderPainted(true);
        file_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                file_exitActionPerformed(evt);
            }
        });
        file.add(file_exit);

        Menu.add(file);

        about.setText("About...");
        about.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        about_rcsf.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        about_rcsf.setText("Residencias CSF");
        about_rcsf.setBorderPainted(true);
        about_rcsf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                about_rcsfActionPerformed(evt);
            }
        });
        about.add(about_rcsf);

        Menu.add(about);

        setJMenuBar(Menu);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void about_rcsfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_about_rcsfActionPerformed
       new ResidenciasCSF().setVisible(true);
    }//GEN-LAST:event_about_rcsfActionPerformed

    private void file_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_file_exitActionPerformed
        new Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_file_exitActionPerformed

    private void habitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_habitacionActionPerformed

    }//GEN-LAST:event_habitacionActionPerformed

    private void alumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alumnosActionPerformed
        new Alumnos().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_alumnosActionPerformed

    private void asistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asistenciaActionPerformed
        new Asistencias().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_asistenciaActionPerformed

    private void visitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visitasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_visitasActionPerformed

    private void tutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tutoresActionPerformed
        new Tutores().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_tutoresActionPerformed

    private void expedienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expedienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_expedienteActionPerformed

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
            java.util.logging.Logger.getLogger(MenuAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAlumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenu about;
    private javax.swing.JMenuItem about_rcsf;
    private javax.swing.JButton alumnos;
    private javax.swing.JButton asistencia;
    private javax.swing.JButton expediente;
    private javax.swing.JMenu file;
    private javax.swing.JMenuItem file_exit;
    private javax.swing.JButton habitacion;
    private javax.swing.JLabel label_alumnos;
    private javax.swing.JLabel label_asistencia;
    private javax.swing.JLabel label_expediente;
    private javax.swing.JLabel label_habitacion;
    private javax.swing.JLabel label_logo;
    private javax.swing.JLabel label_talumnos;
    private javax.swing.JLabel label_tutores;
    private javax.swing.JLabel label_visitas;
    private javax.swing.JButton tutores;
    private javax.swing.JButton visitas;
    // End of variables declaration//GEN-END:variables
}
