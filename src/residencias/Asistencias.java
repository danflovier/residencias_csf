/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package residencias;

import java.awt.Color;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author danflovier
 */
public class Asistencias extends javax.swing.JFrame {
     private static final int BOOLEAN_COLUMN = 2;
     final private MySQL db;
     
    public Asistencias() {
        initComponents();
        
        db = new MySQL();
        
        // Set a background color to the JFrame
        this.getContentPane().setBackground(new Color(255,255,255));
        
        //Set the students in the database on the table
        initAlumnos(); 
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_login = new javax.swing.JLabel();
        label_residencias = new javax.swing.JLabel();
        label_logo = new javax.swing.JLabel();
        label_line = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_alumnos = new javax.swing.JTable();
        registrar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        back = new javax.swing.JButton();
        Menu = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        log_out = new javax.swing.JMenuItem();
        about = new javax.swing.JMenu();
        about_csf = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Residencias Santa Fe | Alumnos");
        setBackground(new java.awt.Color(33, 150, 243));
        setIconImage(new ImageIcon(getClass().getResource("/img/icon.png")).getImage());
        setResizable(false);
        setSize(new java.awt.Dimension(1500, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_login.setFont(new java.awt.Font("Segoe UI", 1, 72)); // NOI18N
        label_login.setForeground(new java.awt.Color(76, 76, 76));
        label_login.setText("ASISTENCIAS");
        getContentPane().add(label_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        label_residencias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_residencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo5.png"))); // NOI18N
        getContentPane().add(label_residencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(1800, 910, 180, 70));

        label_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo5.png"))); // NOI18N
        getContentPane().add(label_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 650, 180, 70));

        label_line.setBackground(new java.awt.Color(250, 197, 28));
        label_line.setForeground(new java.awt.Color(3, 169, 244));
        label_line.setOpaque(true);
        getContentPane().add(label_line, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 500, 10));

        tabla_alumnos.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        tabla_alumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MATRÍCULA", "NOMBRE", "ASISTENCIA", "MOTIVO AUSENCIA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla_alumnos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 530, 340));

        registrar.setBackground(new java.awt.Color(255, 255, 255));
        registrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar.png"))); // NOI18N
        registrar.setText("GUARDAR");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        getContentPane().add(registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 580, 130, 40));

        cancelar.setBackground(new java.awt.Color(255, 255, 255));
        cancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        cancelar.setText("CANCELAR");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 580, 120, 40));

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
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 680, 130, 40));

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

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        registrar.setEnabled(false);
        back.setEnabled(false);
        cancelar.setEnabled(false);
        int registros = tabla_alumnos.getRowCount();
        for(int i = 0; i < registros; i++)
        {
            String asistencia;
            Object box = tabla_alumnos.getValueAt(i, 2);
            if(box == null)
                asistencia = "false";
            else
            {
                asistencia = box.toString();
            }
            Object motivo = tabla_alumnos.getValueAt(i, 3);
            if(asistencia == "false")
                if(motivo != null)
                    registraAusencia((String) tabla_alumnos.getValueAt(i, 0), motivo.toString(), true, tabla_alumnos.getValueAt(i, 1).toString());
                else
                    registraAusencia((String) tabla_alumnos.getValueAt(i, 0), "", false, tabla_alumnos.getValueAt(i, 1).toString());
        }
        back.setEnabled(true);
    }//GEN-LAST:event_registrarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        int registros = tabla_alumnos.getRowCount();
        for(int i = 0; i < registros; i++)
        {
            tabla_alumnos.setValueAt(false, i, 2);
        }
    }//GEN-LAST:event_cancelarActionPerformed

    private void log_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_outActionPerformed
        new Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_log_outActionPerformed

    private void about_csfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_about_csfActionPerformed
        new ResidenciasCSF().setVisible(true);
    }//GEN-LAST:event_about_csfActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new MenuAlumnos().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void registraAusencia(String matricula, String motivo, boolean justificada, String nombre)
    {
        Connection connect = db.MySQLConnection();
        String query = "{call agregarAusencia(?,?)}";
        try 
        {
            CallableStatement call = connect.prepareCall(query);
            call.setString(1, motivo);
            call.setString(2, matricula);
            call.executeQuery();
        } 
        catch (SQLException ex)
        {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(!justificada)
            enviaCorreoATutor(matricula, nombre);
    }
    
    private void enviaCorreoATutor(String matricula, String nombre)
    {
        Properties props = new Properties();
            // Hostname
            //props.put("mail.smtp.host", server.getSelectedItem());
            props.put("mail.smtp.host", "smtp.gmail.com");
            
            // Protocol
            props.put("mail.transport.protocol", "smtp");
            
            // TTLS
            props.put("mail.smtp.starttls.enable", "true");
            
            // Authorize
            props.put("mail.smtp.auth", "true");
            
            // SMTP Port
            props.put("mail.smtp.port", "465");
            
            // SSL Port
            props.put("mail.smtp.socketFactory.port", "465");
            props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
            
            // Start session from the properties
            Session session = Session.getDefaultInstance(props);
            
            String correoTo = getCorreoDeTutor(matricula);
            
            try 
            {
                InternetAddress fromAddress = new InternetAddress("residencias.csf2017@gmail.com");
                InternetAddress toAddress;
                if(correoTo != "")
                {
                    toAddress = new InternetAddress(correoTo);
                }
                else
                {
                    JOptionPane.showMessageDialog(this,"No se pudo mandar correo al tutor de " + matricula,"ERROR",JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
                    
                Message message = new MimeMessage(session);
                message.setFrom(fromAddress);
                message.setRecipient(Message.RecipientType.TO, toAddress);
                Date date = new Date();
                message.setSubject("FALTA INJUSTIFICADA: " + matricula);
                message.setText("Estimado tutor: \n\nSe informa por este medio que el día de hoy (" + date.toString() + ")"
                                + " el alumno " + nombre 
                                + " ha adquirido una falta sin justificación alguna!\n"
                                + "\n\nSi tiene alguna duda o aclaración, favor de comunicarse con el Departamento Administrativo de Residencias CSF.\n\nSaludos cordiales.");
                
                String username = "residencias.csf2017";

                // Send the message
                Transport.send(message, username, "Residencias2017");
                JOptionPane.showMessageDialog(this,"Mensaje enviado con éxito\nal alumno " + nombre,"ÉXITO",JOptionPane.INFORMATION_MESSAGE);

                registrar.setEnabled(false);
            } 
            catch (MessagingException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this,"Lo sentimos, el mensaje no ha sido enviado. Intente de nuevo.","ERROR",JOptionPane.INFORMATION_MESSAGE);
            }
    }
    
    private String getCorreoDeTutor(String matricula)
    {
        String correo = "";
        Connection connect = db.MySQLConnection();
        String query = "{call getCorreoTutor(?)}";
        ResultSet result;
        try 
        {
            CallableStatement call = connect.prepareCall(query);
            call.setString(1, matricula);
            result = call.executeQuery();
            while(result.next())
            {
                correo = result.getString("Correo institucional");
            }
        } 
        catch (SQLException ex)
        {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return correo;
    }
    
    private void initAlumnos()
    {
        Connection connect = db.MySQLConnection();
        String query = "{call getAlumnos()}";
        ResultSet result;
        DefaultTableModel modelo = (DefaultTableModel)tabla_alumnos.getModel();
        tabla_alumnos.setModel(modelo);
        String [] datosAlumno = new String[4];
        try 
        {
            CallableStatement call = connect.prepareCall(query);
            result = call.executeQuery();
            while(result.next())
            {
                datosAlumno[0] = result.getString("Matricula");
                datosAlumno[1] = result.getString("Nombre");
                datosAlumno[2] = null;
                datosAlumno[3] = null;
                modelo.addRow(datosAlumno);
                tabla_alumnos.setModel(modelo);
            }
            
        } 
        catch (SQLException ex)
        {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
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
            java.util.logging.Logger.getLogger(Asistencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Asistencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Asistencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Asistencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Asistencias().setVisible(true);
            }
        });
    }
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenu about;
    private javax.swing.JMenuItem about_csf;
    private javax.swing.JButton back;
    private javax.swing.JButton cancelar;
    private javax.swing.JMenu file;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_line;
    private javax.swing.JLabel label_login;
    private javax.swing.JLabel label_logo;
    private javax.swing.JLabel label_residencias;
    private javax.swing.JMenuItem log_out;
    private javax.swing.JButton registrar;
    private javax.swing.JTable tabla_alumnos;
    // End of variables declaration//GEN-END:variables
}
