/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package residencias;

import java.awt.Color;
import java.awt.Font;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author danflovier
 */
public class Login extends javax.swing.JFrame {
    
    final private MySQL db; 
    public Login() {
        initComponents();
        
        //Menu.setBackground(new Color(33,150,243));
        // Set a background color to the JFrame
        this.getContentPane().setBackground(new Color(33,150,243));
        
        // Initialize the object of the MySQL class
        db = new MySQL();
        //db.MySQLConnection("root","root","residencias");
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button_fpassword = new javax.swing.JButton();
        button_login = new javax.swing.JButton();
        field_password = new javax.swing.JPasswordField();
        field_username = new javax.swing.JTextField();
        label_image = new javax.swing.JLabel();
        label_username = new javax.swing.JLabel();
        label_login = new javax.swing.JLabel();
        label_password = new javax.swing.JLabel();
        label_residencias = new javax.swing.JLabel();
        background_white1 = new javax.swing.JLabel();
        background_blue = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        file_exit = new javax.swing.JMenuItem();
        about = new javax.swing.JMenu();
        about_rcsf = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Residencias Santa Fe | Login");
        setBackground(new java.awt.Color(33, 150, 243));
        setIconImage(new ImageIcon(getClass().getResource("/img/icon.png")).getImage());
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        button_fpassword.setBackground(new java.awt.Color(26, 188, 156));
        button_fpassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        button_fpassword.setForeground(new java.awt.Color(76, 76, 76));
        button_fpassword.setText("OLVIDÓ SU CONTRASEÑA?");
        button_fpassword.setBorder(null);
        button_fpassword.setBorderPainted(false);
        button_fpassword.setContentAreaFilled(false);
        button_fpassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fPasswordMouseIsEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fPasswordIsExited(evt);
            }
        });
        button_fpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_fpasswordActionPerformed(evt);
            }
        });
        getContentPane().add(button_fpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 480, 180, 20));

        button_login.setBackground(new java.awt.Color(26, 188, 156));
        button_login.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        button_login.setForeground(new java.awt.Color(255, 255, 255));
        button_login.setText("INICIAR");
        button_login.setBorder(null);
        button_login.setBorderPainted(false);
        button_login.setContentAreaFilled(false);
        button_login.setOpaque(true);
        button_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoginIsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoginIsMouseExited(evt);
            }
        });
        button_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_loginActionPerformed(evt);
            }
        });
        getContentPane().add(button_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, 230, 50));

        field_password.setBackground(new java.awt.Color(223, 223, 223));
        field_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field_password.setBorder(null);
        field_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                passMouseIsEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                passMouseIsExited(evt);
            }
        });
        getContentPane().add(field_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 230, 30));

        field_username.setBackground(new java.awt.Color(223, 223, 223));
        field_username.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        field_username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field_username.setToolTipText("");
        field_username.setBorder(null);
        field_username.setDoubleBuffered(true);
        field_username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userIsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userIsMouseExited(evt);
            }
        });
        getContentPane().add(field_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 230, 30));

        label_image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        getContentPane().add(label_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 160, 160));

        label_username.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_username.setForeground(new java.awt.Color(76, 76, 76));
        label_username.setText("USERNAME");
        getContentPane().add(label_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, -1, -1));

        label_login.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        label_login.setForeground(new java.awt.Color(76, 76, 76));
        label_login.setText("USER LOGIN");
        getContentPane().add(label_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, -1, -1));

        label_password.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_password.setForeground(new java.awt.Color(76, 76, 76));
        label_password.setText("CONTRASEÑA");
        getContentPane().add(label_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, -1, -1));

        label_residencias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_residencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo3.png"))); // NOI18N
        getContentPane().add(label_residencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 600, 180, 70));

        background_white1.setBackground(new java.awt.Color(255, 255, 255));
        background_white1.setForeground(new java.awt.Color(3, 169, 244));
        background_white1.setOpaque(true);
        getContentPane().add(background_white1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 620, 450));

        background_blue.setBackground(new java.awt.Color(3, 169, 244));
        background_blue.setForeground(new java.awt.Color(33, 150, 243));
        background_blue.setOpaque(true);
        getContentPane().add(background_blue, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 510, 700));

        Menu.setBackground(new java.awt.Color(255, 255, 255));
        Menu.setBorderPainted(false);
        Menu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        file.setText("File");
        file.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        file_exit.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        file_exit.setText("Salir");
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

    private void button_fpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_fpasswordActionPerformed

       // TODO add your handling code here:
    }//GEN-LAST:event_button_fpasswordActionPerformed

    private void button_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_loginActionPerformed
        Connection connect = db.MySQLConnection();
        String query = "{call login(?,?)}";
        ResultSet result;
        String admin = field_username.getText();
        String pass = String.copyValueOf(field_password.getPassword());
        try {
            CallableStatement call = connect.prepareCall(query);
            call.setString(1, admin);
            call.setString(2, pass);
            result = call.executeQuery();
            if(result.next())
            {
                new Menu().setVisible(true);
                this.setVisible(false);
            }
            else{
                JOptionPane.showMessageDialog(null, "Usuario o contraseña inválido", "Error de autenticación", NORMAL);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_button_loginActionPerformed

    private void LoginIsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginIsMouseEntered
        button_login.setBackground(new Color(0,168,133));
    }//GEN-LAST:event_LoginIsMouseEntered

    private void LoginIsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginIsMouseExited
        button_login.setBackground(new Color(26,182,156));
    }//GEN-LAST:event_LoginIsMouseExited

    private void userIsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userIsMouseEntered
        field_username.setBackground(new Color(203,201,201));
    }//GEN-LAST:event_userIsMouseEntered

    private void userIsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userIsMouseExited
        field_username.setBackground(new Color(223,223,223));
    }//GEN-LAST:event_userIsMouseExited

    private void passMouseIsExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passMouseIsExited
        field_password.setBackground(new Color(223,223,223));
    }//GEN-LAST:event_passMouseIsExited

    private void passMouseIsEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passMouseIsEntered
        field_password.setBackground(new Color(203,201,201));
    }//GEN-LAST:event_passMouseIsEntered

    private void fPasswordMouseIsEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fPasswordMouseIsEntered
        button_fpassword.setForeground(new Color(33,150,243));
    }//GEN-LAST:event_fPasswordMouseIsEntered

    private void fPasswordIsExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fPasswordIsExited
        button_fpassword.setForeground(new Color(76,76,76));
    }//GEN-LAST:event_fPasswordIsExited

    private void about_rcsfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_about_rcsfActionPerformed
       new ResidenciasCSF().setVisible(true);
    }//GEN-LAST:event_about_rcsfActionPerformed

    private void file_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_file_exitActionPerformed
        System.exit(0);
        
        //new menu().setVisible(true);
        //this.setVisible(false);
    }//GEN-LAST:event_file_exitActionPerformed

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
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenu about;
    private javax.swing.JMenuItem about_rcsf;
    private javax.swing.JLabel background_blue;
    private javax.swing.JLabel background_white1;
    private javax.swing.JButton button_fpassword;
    private javax.swing.JButton button_login;
    private javax.swing.JPasswordField field_password;
    private javax.swing.JTextField field_username;
    private javax.swing.JMenu file;
    private javax.swing.JMenuItem file_exit;
    private javax.swing.JLabel label_image;
    private javax.swing.JLabel label_login;
    private javax.swing.JLabel label_password;
    private javax.swing.JLabel label_residencias;
    private javax.swing.JLabel label_username;
    // End of variables declaration//GEN-END:variables
}
