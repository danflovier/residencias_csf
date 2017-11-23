/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package residencias;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author danflovier
 */
public class HistorialMedico extends javax.swing.JFrame {
    Connection con;
    final private MySQL db;
    
    public HistorialMedico() {
        initComponents();
        
        // Set a background color to the JFrame
        this.getContentPane().setBackground(new Color(255,255,255));  
        

        db = new MySQL(); 
    }
    
    String imgPath = null;
    
    public ImageIcon ResizeImage(String ImagePath, byte[] pic){
        ImageIcon MyImage = null;
        if (ImagePath != null){
            MyImage = new ImageIcon(ImagePath);
        }
        else{
            MyImage = new ImageIcon(pic);
        }
        
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(documento.getWidth(),documento.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
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
        label_buscar = new javax.swing.JLabel();
        label_logo = new javax.swing.JLabel();
        label_line = new javax.swing.JLabel();
        documento = new javax.swing.JLabel();
        buscar_perfil = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_perfil = new javax.swing.JTable();
        registrar = new javax.swing.JButton();
        buscar1 = new javax.swing.JButton();
        buscar2 = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        mostrar_todos = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        agregar = new javax.swing.JButton();
        back = new javax.swing.JButton();
        matricula = new javax.swing.JComboBox<>();
        label_buscar1 = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        log_out = new javax.swing.JMenuItem();
        about = new javax.swing.JMenu();
        about_csf = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Residencias Santa Fe | Historial Médico");
        setBackground(new java.awt.Color(33, 150, 243));
        setIconImage(new ImageIcon(getClass().getResource("/img/icon.png")).getImage());
        setPreferredSize(new java.awt.Dimension(1500, 1000));
        setResizable(false);
        setSize(new java.awt.Dimension(1500, 1000));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_login.setFont(new java.awt.Font("Segoe UI", 1, 72)); // NOI18N
        label_login.setForeground(new java.awt.Color(76, 76, 76));
        label_login.setText("HISTORIAL MÉDICO");
        getContentPane().add(label_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        label_buscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_buscar.setForeground(new java.awt.Color(76, 76, 76));
        label_buscar.setText("MATRÍCULA DEL ALUMNO:");
        getContentPane().add(label_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        label_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo5.png"))); // NOI18N
        getContentPane().add(label_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 840, 180, 70));

        label_line.setBackground(new java.awt.Color(84, 172, 210));
        label_line.setForeground(new java.awt.Color(3, 169, 244));
        label_line.setOpaque(true);
        getContentPane().add(label_line, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 790, 10));

        documento.setBackground(new java.awt.Color(201, 226, 253));
        documento.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        documento.setForeground(new java.awt.Color(76, 76, 76));
        documento.setOpaque(true);
        getContentPane().add(documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 440, 600));

        buscar_perfil.setBackground(new java.awt.Color(223, 223, 223));
        buscar_perfil.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buscar_perfil.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        buscar_perfil.setToolTipText("");
        buscar_perfil.setBorder(null);
        buscar_perfil.setDoubleBuffered(true);
        getContentPane().add(buscar_perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 220, 200, 30));

        tabla_perfil.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        tabla_perfil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "PERFIL PSICOLOGICO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla_perfil);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 270, 580, 510));

        registrar.setBackground(new java.awt.Color(255, 255, 255));
        registrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/registrar.png"))); // NOI18N
        registrar.setText("AGREGAR");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        getContentPane().add(registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 140, 40));

        buscar1.setBackground(new java.awt.Color(255, 255, 255));
        buscar1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        buscar1.setText("BUSCAR");
        buscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar1ActionPerformed(evt);
            }
        });
        getContentPane().add(buscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 160, 30));

        buscar2.setBackground(new java.awt.Color(255, 255, 255));
        buscar2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buscar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        buscar2.setText("BUSCAR");
        buscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar2ActionPerformed(evt);
            }
        });
        getContentPane().add(buscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 220, 140, 30));

        cancelar.setBackground(new java.awt.Color(255, 255, 255));
        cancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        cancelar.setText("ELIMINAR");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, 140, 40));

        mostrar_todos.setBackground(new java.awt.Color(255, 255, 255));
        mostrar_todos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mostrar_todos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lista.png"))); // NOI18N
        mostrar_todos.setText("MOSTRAR");
        mostrar_todos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrar_todosActionPerformed(evt);
            }
        });
        getContentPane().add(mostrar_todos, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 800, 180, 60));

        modificar.setBackground(new java.awt.Color(255, 255, 255));
        modificar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/modificar.png"))); // NOI18N
        modificar.setText("EDITAR");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        getContentPane().add(modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, 140, 40));

        eliminar.setBackground(new java.awt.Color(255, 255, 255));
        eliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        eliminar.setText("ELIMINAR");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 800, 180, 60));

        agregar.setBackground(java.awt.Color.white);
        agregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        agregar.setForeground(new java.awt.Color(76, 76, 76));
        agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/upload.png"))); // NOI18N
        agregar.setText("SUBIR DOCUMENTO");
        agregar.setBorder(null);
        agregar.setBorderPainted(false);
        agregar.setContentAreaFilled(false);
        agregar.setMaximumSize(new java.awt.Dimension(129, 65));
        agregar.setMinimumSize(new java.awt.Dimension(129, 65));
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        getContentPane().add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 880, 180, 40));

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
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 880, 120, 40));

        matricula.setBackground(new java.awt.Color(204, 204, 204));
        matricula.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        matricula.setForeground(new java.awt.Color(76, 76, 76));
        matricula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "1", "2", "3", "4", "5", "6", "7", "8" }));
        matricula.setBorder(null);
        matricula.setFocusable(false);
        matricula.setLightWeightPopupEnabled(false);
        getContentPane().add(matricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 240, 30));

        label_buscar1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_buscar1.setForeground(new java.awt.Color(76, 76, 76));
        label_buscar1.setText("BUSCAR PERFIL:");
        getContentPane().add(label_buscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 180, -1, -1));

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
        con = db.MySQLConnection();
        if (imgPath != null){
            
                PreparedStatement ps;
            try {
                ps = con.prepareStatement("INSERT INTO tbl_images(The_image) VALUES(?)");
                InputStream img = new FileInputStream(new File(imgPath));
                ps.setBlob(1,img);
                
                if (ps.executeUpdate() == 1){
                    JOptionPane.showMessageDialog(null, "Imagen insertada");
                }
              } catch (SQLException ex) {
                Logger.getLogger(HistorialMedico.class.getName()).log(Level.SEVERE, null, ex);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(HistorialMedico.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        else{
           JOptionPane.showMessageDialog(null, "Imagen NO seleccionada"); 
        }
        
        imgPath = null;
    }//GEN-LAST:event_registrarActionPerformed

    private void buscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar1ActionPerformed
        con = db.MySQLConnection();
        int id = Integer.parseInt(matricula.getSelectedItem().toString());
        String SelectQuery = "SELECT * FROM tbl_images WHERE id = "+id;
        
        Statement st;
        ResultSet rs;
        
        if(!matricula.getSelectedItem().toString().equals("Seleccionar")){
            try {
                st = con.createStatement();
                rs = st.executeQuery(SelectQuery);
        
                if(rs.next()){
                    documento.setIcon(ResizeImage(null, rs.getBytes("The_image")));
                    File image = new File("perfiles/" + "PP" + matricula.getSelectedItem() + ".png");
                    FileOutputStream fos = new FileOutputStream(image);
                    fos.write(rs.getBytes("The_image"));
                    fos.close();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Perfil NO encontrado");  
                }
            } 
            catch (SQLException ex) {
                Logger.getLogger(HistorialMedico.class.getName()).log(Level.SEVERE, null, ex);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(HistorialMedico.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(HistorialMedico.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_buscar1ActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        con = db.MySQLConnection();
        int id = Integer.parseInt(matricula.getSelectedItem().toString());
        String DeleteQuery = "DELETE FROM tbl_images WHERE id = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(DeleteQuery);
            ps.setInt(1, id);
            if(ps.executeUpdate() == 1)
            {
                JOptionPane.showMessageDialog(null, "Perfil eliminado");
            }
            else{
                JOptionPane.showMessageDialog(null, "No existe el ID del perfil");
            }
        } catch (SQLException ex) {
            Logger.getLogger(HistorialMedico.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        documento.setIcon(null);
    }//GEN-LAST:event_cancelarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        con = db.MySQLConnection();
        if(imgPath != null){
            try {
                InputStream  img = new FileInputStream(imgPath);
                String UpdateQuery = "UPDATE tbl_images SET The_image = ? WHERE id = ?";
                int id = Integer.parseInt(matricula.getSelectedItem().toString());
                PreparedStatement ps = con.prepareStatement(UpdateQuery);
                ps.setBlob(1, img);
                ps.setInt(2, id);
                if(ps.executeUpdate() == 1){
                    JOptionPane.showMessageDialog(null, "Perfil actualizado");
                }else{
                    JOptionPane.showMessageDialog(null, "No existe el ID del perfil.");
                }
            } catch (Exception ex) {
                Logger.getLogger(HistorialMedico.class.getName()).log(Level.SEVERE, null, ex);
            }            
        }else{
            JOptionPane.showMessageDialog(null, "Perfil no seleccionado");
        }
        
        imgPath = null;
                  
    }//GEN-LAST:event_modificarActionPerformed

    private void log_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_outActionPerformed
        new Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_log_outActionPerformed

    private void about_csfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_about_csfActionPerformed
        new ResidenciasCSF().setVisible(true);
    }//GEN-LAST:event_about_csfActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images","jpg","gif","png");
        file.addChoosableFileFilter(filter);
        
        int result = file.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION){
            File selectedFile = file.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            documento.setIcon(ResizeImage(path,null));
            imgPath = path;
        }
        else if (result == JFileChooser.CANCEL_OPTION){
            System.out.println("Imagen NO seleccionada");
        }
    }//GEN-LAST:event_agregarActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new MenuExpediente().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void mostrar_todosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrar_todosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mostrar_todosActionPerformed

    private void buscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscar2ActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarActionPerformed

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
            java.util.logging.Logger.getLogger(HistorialMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HistorialMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HistorialMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HistorialMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new HistorialMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenu about;
    private javax.swing.JMenuItem about_csf;
    private javax.swing.JButton agregar;
    private javax.swing.JButton back;
    private javax.swing.JButton buscar1;
    private javax.swing.JButton buscar2;
    private javax.swing.JTextField buscar_perfil;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel documento;
    private javax.swing.JButton eliminar;
    private javax.swing.JMenu file;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_buscar;
    private javax.swing.JLabel label_buscar1;
    private javax.swing.JLabel label_line;
    private javax.swing.JLabel label_login;
    private javax.swing.JLabel label_logo;
    private javax.swing.JMenuItem log_out;
    private javax.swing.JComboBox<String> matricula;
    private javax.swing.JButton modificar;
    private javax.swing.JButton mostrar_todos;
    private javax.swing.JButton registrar;
    private javax.swing.JTable tabla_perfil;
    // End of variables declaration//GEN-END:variables
}
