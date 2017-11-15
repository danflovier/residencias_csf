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
public class HistorialAcademico extends javax.swing.JFrame {
    
    public HistorialAcademico() {
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
        label_buscar = new javax.swing.JLabel();
        label_logo = new javax.swing.JLabel();
        label_line = new javax.swing.JLabel();
        label_semestre = new javax.swing.JLabel();
        label_promedio_actual = new javax.swing.JLabel();
        label_id_expediente = new javax.swing.JLabel();
        label_promedio_acumulado = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        id_expediente = new javax.swing.JTextField();
        padecimientos = new javax.swing.JTextField();
        buscar_historial = new javax.swing.JTextField();
        padecimientos1 = new javax.swing.JTextField();
        sangre = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_historial = new javax.swing.JTable();
        imprimir = new javax.swing.JButton();
        registrar = new javax.swing.JButton();
        buscar1 = new javax.swing.JButton();
        buscar2 = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        mostrar_todos = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        modificar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Residencias Santa Fe | Historial Médico");
        setBackground(new java.awt.Color(33, 150, 243));
        setIconImage(new ImageIcon(getClass().getResource("/img/icon.png")).getImage());
        setPreferredSize(new java.awt.Dimension(1240, 680));
        setResizable(false);
        setSize(new java.awt.Dimension(1240, 680));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_id.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_id.setForeground(new java.awt.Color(76, 76, 76));
        label_id.setText("ID");
        getContentPane().add(label_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        label_login.setFont(new java.awt.Font("Segoe UI", 1, 72)); // NOI18N
        label_login.setForeground(new java.awt.Color(76, 76, 76));
        label_login.setText("HISTORIAL ACADÉMICO");
        getContentPane().add(label_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        label_buscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_buscar.setForeground(new java.awt.Color(76, 76, 76));
        label_buscar.setText("BUSCAR HISTORIAL:");
        getContentPane().add(label_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, -1, -1));

        label_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo5.png"))); // NOI18N
        getContentPane().add(label_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 550, 180, 70));

        label_line.setBackground(new java.awt.Color(233, 30, 99));
        label_line.setForeground(new java.awt.Color(3, 169, 244));
        label_line.setOpaque(true);
        getContentPane().add(label_line, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 890, 10));

        label_semestre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_semestre.setForeground(new java.awt.Color(76, 76, 76));
        label_semestre.setText("SEMESTRE ACTUAL");
        getContentPane().add(label_semestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 220, -1));

        label_promedio_actual.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_promedio_actual.setForeground(new java.awt.Color(76, 76, 76));
        label_promedio_actual.setText("PROMEDIO ACTUAL");
        getContentPane().add(label_promedio_actual, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 220, -1));

        label_id_expediente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_id_expediente.setForeground(new java.awt.Color(76, 76, 76));
        label_id_expediente.setText("ID EXPEDIENTE");
        getContentPane().add(label_id_expediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, -1, -1));

        label_promedio_acumulado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_promedio_acumulado.setForeground(new java.awt.Color(76, 76, 76));
        label_promedio_acumulado.setText("PROMEDIO ACUMULADO");
        getContentPane().add(label_promedio_acumulado, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 230, -1));

        id.setBackground(new java.awt.Color(223, 223, 223));
        id.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
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
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 200, 30));

        id_expediente.setBackground(new java.awt.Color(223, 223, 223));
        id_expediente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        id_expediente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id_expediente.setToolTipText("");
        id_expediente.setBorder(null);
        id_expediente.setDoubleBuffered(true);
        id_expediente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                id_expedienteuserIsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                id_expedienteuserIsMouseExited(evt);
            }
        });
        id_expediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_expedienteActionPerformed(evt);
            }
        });
        getContentPane().add(id_expediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 200, 30));

        padecimientos.setBackground(new java.awt.Color(223, 223, 223));
        padecimientos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        padecimientos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        padecimientos.setToolTipText("");
        padecimientos.setBorder(null);
        padecimientos.setDoubleBuffered(true);
        padecimientos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                padecimientosuserIsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                padecimientosuserIsMouseExited(evt);
            }
        });
        padecimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                padecimientosActionPerformed(evt);
            }
        });
        getContentPane().add(padecimientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 220, 30));

        buscar_historial.setBackground(new java.awt.Color(223, 223, 223));
        buscar_historial.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buscar_historial.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        buscar_historial.setToolTipText("");
        buscar_historial.setBorder(null);
        buscar_historial.setDoubleBuffered(true);
        buscar_historial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buscar_historialuserIsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buscar_historialuserIsMouseExited(evt);
            }
        });
        buscar_historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_historialActionPerformed(evt);
            }
        });
        getContentPane().add(buscar_historial, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, 200, 30));

        padecimientos1.setBackground(new java.awt.Color(223, 223, 223));
        padecimientos1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        padecimientos1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        padecimientos1.setToolTipText("");
        padecimientos1.setBorder(null);
        padecimientos1.setDoubleBuffered(true);
        padecimientos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                padecimientos1userIsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                padecimientos1userIsMouseExited(evt);
            }
        });
        padecimientos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                padecimientos1ActionPerformed(evt);
            }
        });
        getContentPane().add(padecimientos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 220, 30));

        sangre.setBackground(new java.awt.Color(102, 102, 102));
        sangre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sangre.setForeground(new java.awt.Color(76, 76, 76));
        sangre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "1", "2", "3", "4", "5", "6", "7", "8", "9", "9+" }));
        sangre.setBorder(null);
        sangre.setFocusable(false);
        sangre.setLightWeightPopupEnabled(false);
        getContentPane().add(sangre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 220, 30));

        tabla_historial.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        tabla_historial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "SEMESTRE ACTUAL", "PROMEDIO ACTUAL", "PROMEDIO ACUMULADO"
            }
        ));
        jScrollPane1.setViewportView(tabla_historial);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 360, 310));

        imprimir.setBackground(new java.awt.Color(255, 255, 255));
        imprimir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        imprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imprimir.png"))); // NOI18N
        imprimir.setText("IMPRIMIR");
        imprimir.setBorder(null);
        imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirActionPerformed(evt);
            }
        });
        getContentPane().add(imprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 460, 180, 60));

        registrar.setBackground(new java.awt.Color(255, 255, 255));
        registrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/registrar.png"))); // NOI18N
        registrar.setText("REGISTRAR");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        getContentPane().add(registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 130, 40));

        buscar1.setBackground(new java.awt.Color(255, 255, 255));
        buscar1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        buscar1.setText("BUSCAR");
        buscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar1ActionPerformed(evt);
            }
        });
        getContentPane().add(buscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 130, 40));

        buscar2.setBackground(new java.awt.Color(255, 255, 255));
        buscar2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buscar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        buscar2.setText("BUSCAR");
        buscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar2ActionPerformed(evt);
            }
        });
        getContentPane().add(buscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 210, 140, 30));

        cancelar.setBackground(new java.awt.Color(255, 255, 255));
        cancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        cancelar.setText("CANCELAR");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 130, 40));

        mostrar_todos.setBackground(new java.awt.Color(255, 255, 255));
        mostrar_todos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mostrar_todos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lista.png"))); // NOI18N
        mostrar_todos.setText("MOSTRAR");
        mostrar_todos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrar_todosActionPerformed(evt);
            }
        });
        getContentPane().add(mostrar_todos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 300, 180, 60));

        eliminar.setBackground(new java.awt.Color(255, 255, 255));
        eliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        eliminar.setText("ELIMINAR");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 380, 180, 60));

        modificar1.setBackground(new java.awt.Color(255, 255, 255));
        modificar1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        modificar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/modificar.png"))); // NOI18N
        modificar1.setText("MODIFICAR");
        modificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar1ActionPerformed(evt);
            }
        });
        getContentPane().add(modificar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, 130, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buscar_historialuserIsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscar_historialuserIsMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_buscar_historialuserIsMouseEntered

    private void buscar_historialuserIsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscar_historialuserIsMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_buscar_historialuserIsMouseExited

    private void buscar_historialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_historialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscar_historialActionPerformed

    private void padecimientosuserIsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_padecimientosuserIsMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_padecimientosuserIsMouseEntered

    private void padecimientosuserIsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_padecimientosuserIsMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_padecimientosuserIsMouseExited

    private void padecimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_padecimientosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_padecimientosActionPerformed

    private void imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_imprimirActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registrarActionPerformed

    private void buscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscar1ActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelarActionPerformed

    private void buscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscar2ActionPerformed

    private void mostrar_todosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrar_todosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mostrar_todosActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void iduserIsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iduserIsMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_iduserIsMouseExited

    private void iduserIsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iduserIsMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_iduserIsMouseEntered

    private void id_expedienteuserIsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id_expedienteuserIsMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_id_expedienteuserIsMouseEntered

    private void id_expedienteuserIsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id_expedienteuserIsMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_id_expedienteuserIsMouseExited

    private void id_expedienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_expedienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_expedienteActionPerformed

    private void modificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificar1ActionPerformed

    private void padecimientos1userIsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_padecimientos1userIsMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_padecimientos1userIsMouseEntered

    private void padecimientos1userIsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_padecimientos1userIsMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_padecimientos1userIsMouseExited

    private void padecimientos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_padecimientos1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_padecimientos1ActionPerformed

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
            java.util.logging.Logger.getLogger(HistorialAcademico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HistorialAcademico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HistorialAcademico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HistorialAcademico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HistorialAcademico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar1;
    private javax.swing.JButton buscar2;
    private javax.swing.JTextField buscar_historial;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton eliminar;
    private javax.swing.JTextField id;
    private javax.swing.JTextField id_expediente;
    private javax.swing.JButton imprimir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_buscar;
    private javax.swing.JLabel label_id;
    private javax.swing.JLabel label_id_expediente;
    private javax.swing.JLabel label_line;
    private javax.swing.JLabel label_login;
    private javax.swing.JLabel label_logo;
    private javax.swing.JLabel label_promedio_actual;
    private javax.swing.JLabel label_promedio_acumulado;
    private javax.swing.JLabel label_semestre;
    private javax.swing.JButton modificar1;
    private javax.swing.JButton mostrar_todos;
    private javax.swing.JTextField padecimientos;
    private javax.swing.JTextField padecimientos1;
    private javax.swing.JButton registrar;
    private javax.swing.JComboBox<String> sangre;
    private javax.swing.JTable tabla_historial;
    // End of variables declaration//GEN-END:variables
}
