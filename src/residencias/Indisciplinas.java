/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package residencias;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author danflovier
 */
public class Indisciplinas extends javax.swing.JFrame {
    Connection con;
    final private MySQL db;
    
    public Indisciplinas() {
        initComponents();
        
        // Get the screen resolution of the device
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        
        // Set size of the JFrame
        this.setSize(screenWidth / 2 + 500, screenHeight - 200);
        
        // Set default close operation
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        
        // Set a background color to the JFrame
        this.getContentPane().setBackground(new Color(255,255,255));
        
        // Center the JFrame
        this.setLocationRelativeTo(null);
        
        // Delete border from the textArea
        scrollPane_motivo.setBorder(null);
        scrollPane_message.setBorder(null);
        
       db = new MySQL();
       initMatricula();
       editForm();
       disableForm(); 
    }
    
    public void initMatricula(){
        con = db.MySQLConnection();
        String query = "{call getAlumnos()}";
        ResultSet result;
        try {
            CallableStatement st = con.prepareCall(query);
            result = st.executeQuery();
            while(result.next()){
                matricula.addItem(result.getString("Matricula"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Alumnos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void editForm(){
        field_name.setEditable(false);
        field_year.setEditable(false);
        field_month.setEditable(false);
        field_day.setEditable(false);
    }
    
    public void disableForm(){
        field_from.setEnabled(false);
        field_to.setEnabled(false);
        field_subject.setEnabled(false);
        text_message.setEnabled(false);
        field_password.setEnabled(false);
        button_send.setEnabled(false);
    }
    
    public void clearForm(){
        matricula.setSelectedIndex(0);
        field_name.setText("");
        field_day.setText("");
        field_month.setText("");
        field_year.setText("");
        text_motivo.setText("");
        field_from.setText("");
        field_to.setText("");
        field_subject.setText("");
        text_message.setText("");
        field_password.setText("");
        button_send.setText("");
        field_from.setEnabled(false);
        field_to.setEnabled(false);
        field_subject.setEnabled(false);
        text_message.setEnabled(false);
        field_password.setEnabled(false);
        button_send.setEnabled(false);
    }
    
    public String getCorreoTutor(String matricula){
        String correo = "";
        Connection connect = db.MySQLConnection();
        String query = "{call getCorreoTutor(?)}";
        ResultSet result;
        
        try {
            CallableStatement call = connect.prepareCall(query);
            call.setString(1, matricula);
            result = call.executeQuery();
            while(result.next()){
                correo = result.getString("Correo institucional");
            }
        } 
        catch (SQLException ex){
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return correo;
    }
    
    public String getNombreAlumno(String matricula){
        Connection con = db.MySQLConnection();
        String query = "{call getAlumno(?)}";
        ResultSet result;
        String nombre_alumno = "";
            
        try { 
            CallableStatement call = con.prepareCall(query);
            call.setString(1, matricula);
            result = call.executeQuery();
            
            while(result.next()){
                nombre_alumno = result.getString("Nombre");
            }
                
            }catch (SQLException ex){
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this,"La matrícula del alumno no existe. Intente de nuevo.","ERROR",JOptionPane.INFORMATION_MESSAGE);    
            }
        return nombre_alumno;
    }
     
    public void setDiaActual(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
           Date today = new Date();
           String date_str = dateFormat.format(today);
           String[] date;
           date = date_str.split("-");
           
           String year = date[0]; 
           String month = date[1];
           String day = date[2];
           
           field_year.setText(year);
           field_month.setText(month);
           field_day.setText(day);
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_to = new javax.swing.JLabel();
        label_date = new javax.swing.JLabel();
        label_password = new javax.swing.JLabel();
        label_indscipline = new javax.swing.JLabel();
        label_message = new javax.swing.JLabel();
        label_logo = new javax.swing.JLabel();
        label_subject = new javax.swing.JLabel();
        label_mensaje = new javax.swing.JLabel();
        label_confirmation = new javax.swing.JLabel();
        label_indisciplina = new javax.swing.JLabel();
        label_from = new javax.swing.JLabel();
        label_day = new javax.swing.JLabel();
        label_name1 = new javax.swing.JLabel();
        label_motivo = new javax.swing.JLabel();
        label_matricula = new javax.swing.JLabel();
        label_mes = new javax.swing.JLabel();
        label_anio = new javax.swing.JLabel();
        label_line3 = new javax.swing.JLabel();
        label_line2 = new javax.swing.JLabel();
        label_line1 = new javax.swing.JLabel();
        label_line = new javax.swing.JLabel();
        field_name = new javax.swing.JTextField();
        field_day = new javax.swing.JTextField();
        field_month = new javax.swing.JTextField();
        field_year = new javax.swing.JTextField();
        field_from = new javax.swing.JTextField();
        field_to = new javax.swing.JTextField();
        field_subject = new javax.swing.JTextField();
        field_password = new javax.swing.JPasswordField();
        scrollPane_motivo = new javax.swing.JScrollPane();
        text_motivo = new javax.swing.JTextArea();
        scrollPane_message = new javax.swing.JScrollPane();
        text_message = new javax.swing.JTextArea();
        registrar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        button_send = new javax.swing.JButton();
        back = new javax.swing.JButton();
        matricula = new javax.swing.JComboBox<>();
        Menu = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        log_out = new javax.swing.JMenuItem();
        about = new javax.swing.JMenu();
        about_csf = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Residencias Santa Fe | Correo");
        setBackground(new java.awt.Color(33, 150, 243));
        setIconImage(new ImageIcon(getClass().getResource("/img/icon.png")).getImage());
        setMaximumSize(null);
        setResizable(false);
        setSize(new java.awt.Dimension(1500, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_to.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_to.setForeground(new java.awt.Color(76, 76, 76));
        label_to.setText("PARA");
        getContentPane().add(label_to, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 280, -1, -1));

        label_date.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_date.setForeground(new java.awt.Color(76, 76, 76));
        label_date.setText("FECHA");
        getContentPane().add(label_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, -1, -1));

        label_password.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_password.setForeground(new java.awt.Color(76, 76, 76));
        label_password.setText("CONTRASEÑA");
        getContentPane().add(label_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 690, 130, -1));

        label_indscipline.setFont(new java.awt.Font("Segoe UI", 1, 72)); // NOI18N
        label_indscipline.setForeground(new java.awt.Color(76, 76, 76));
        label_indscipline.setText("INDISCIPLINA");
        getContentPane().add(label_indscipline, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        label_message.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_message.setForeground(new java.awt.Color(76, 76, 76));
        label_message.setText("MENSAJE");
        getContentPane().add(label_message, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 380, -1, -1));

        label_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo5.png"))); // NOI18N
        getContentPane().add(label_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 730, 180, 70));

        label_subject.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_subject.setForeground(new java.awt.Color(76, 76, 76));
        label_subject.setText("ASUNTO");
        getContentPane().add(label_subject, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 330, -1, -1));

        label_mensaje.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        label_mensaje.setForeground(new java.awt.Color(76, 76, 76));
        label_mensaje.setText("MENSAJE");
        getContentPane().add(label_mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 160, 200, -1));

        label_confirmation.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        label_confirmation.setForeground(new java.awt.Color(76, 76, 76));
        label_confirmation.setText("CONFIRMACIÓN");
        getContentPane().add(label_confirmation, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 610, 200, -1));

        label_indisciplina.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        label_indisciplina.setForeground(new java.awt.Color(76, 76, 76));
        label_indisciplina.setText("INDISCIPLINA");
        getContentPane().add(label_indisciplina, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 200, -1));

        label_from.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_from.setForeground(new java.awt.Color(76, 76, 76));
        label_from.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_from.setText("DE");
        getContentPane().add(label_from, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 230, 40, -1));

        label_day.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_day.setForeground(new java.awt.Color(76, 76, 76));
        label_day.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_day.setText("DD");
        getContentPane().add(label_day, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 100, -1));

        label_name1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_name1.setForeground(new java.awt.Color(76, 76, 76));
        label_name1.setText("NOMBRE");
        getContentPane().add(label_name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, -1));

        label_motivo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_motivo.setForeground(new java.awt.Color(76, 76, 76));
        label_motivo.setText("MOTIVO");
        getContentPane().add(label_motivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, -1, -1));

        label_matricula.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_matricula.setForeground(new java.awt.Color(76, 76, 76));
        label_matricula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_matricula.setText("MATRÍCULA");
        getContentPane().add(label_matricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 120, -1));

        label_mes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_mes.setForeground(new java.awt.Color(76, 76, 76));
        label_mes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_mes.setText("MM");
        getContentPane().add(label_mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 110, -1));

        label_anio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_anio.setForeground(new java.awt.Color(76, 76, 76));
        label_anio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_anio.setText("AAAA");
        getContentPane().add(label_anio, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 100, -1));

        label_line3.setBackground(new java.awt.Color(250, 197, 28));
        label_line3.setForeground(new java.awt.Color(3, 169, 244));
        label_line3.setOpaque(true);
        getContentPane().add(label_line3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 200, 10));

        label_line2.setBackground(new java.awt.Color(250, 197, 28));
        label_line2.setForeground(new java.awt.Color(3, 169, 244));
        label_line2.setOpaque(true);
        getContentPane().add(label_line2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 200, 200, 10));

        label_line1.setBackground(new java.awt.Color(250, 197, 28));
        label_line1.setForeground(new java.awt.Color(3, 169, 244));
        label_line1.setOpaque(true);
        getContentPane().add(label_line1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 550, 10));

        label_line.setBackground(new java.awt.Color(250, 197, 28));
        label_line.setForeground(new java.awt.Color(3, 169, 244));
        label_line.setOpaque(true);
        getContentPane().add(label_line, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 650, 200, 10));

        field_name.setBackground(new java.awt.Color(223, 223, 223));
        field_name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        field_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field_name.setToolTipText("");
        field_name.setBorder(null);
        field_name.setDoubleBuffered(true);
        getContentPane().add(field_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 330, 30));

        field_day.setBackground(new java.awt.Color(223, 223, 223));
        field_day.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        field_day.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field_day.setToolTipText("");
        field_day.setBorder(null);
        field_day.setDoubleBuffered(true);
        getContentPane().add(field_day, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 100, 30));

        field_month.setBackground(new java.awt.Color(223, 223, 223));
        field_month.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        field_month.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field_month.setToolTipText("");
        field_month.setBorder(null);
        field_month.setDoubleBuffered(true);
        getContentPane().add(field_month, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 110, 30));

        field_year.setBackground(new java.awt.Color(223, 223, 223));
        field_year.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        field_year.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field_year.setToolTipText("");
        field_year.setBorder(null);
        field_year.setDoubleBuffered(true);
        getContentPane().add(field_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, 100, 30));

        field_from.setBackground(new java.awt.Color(223, 223, 223));
        field_from.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        field_from.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field_from.setToolTipText("");
        field_from.setBorder(null);
        field_from.setDoubleBuffered(true);
        getContentPane().add(field_from, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 230, 330, 30));

        field_to.setBackground(new java.awt.Color(223, 223, 223));
        field_to.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        field_to.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field_to.setToolTipText("");
        field_to.setBorder(null);
        field_to.setDoubleBuffered(true);
        getContentPane().add(field_to, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 280, 330, 30));

        field_subject.setBackground(new java.awt.Color(223, 223, 223));
        field_subject.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        field_subject.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field_subject.setToolTipText("");
        field_subject.setBorder(null);
        field_subject.setDoubleBuffered(true);
        getContentPane().add(field_subject, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 330, 560, 30));

        field_password.setBackground(new java.awt.Color(223, 223, 223));
        field_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field_password.setBorder(null);
        getContentPane().add(field_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 690, 190, 30));

        text_motivo.setBackground(new java.awt.Color(223, 223, 223));
        text_motivo.setColumns(20);
        text_motivo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        text_motivo.setRows(5);
        text_motivo.setBorder(null);
        text_motivo.setCaretColor(new java.awt.Color(223, 223, 223));
        scrollPane_motivo.setViewportView(text_motivo);

        getContentPane().add(scrollPane_motivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 330, 140));

        text_message.setBackground(new java.awt.Color(223, 223, 223));
        text_message.setColumns(20);
        text_message.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        text_message.setRows(5);
        text_message.setBorder(null);
        text_message.setCaretColor(new java.awt.Color(223, 223, 223));
        scrollPane_message.setViewportView(text_message);

        getContentPane().add(scrollPane_message, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 380, 560, 220));

        registrar.setBackground(new java.awt.Color(255, 255, 255));
        registrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/registrar.png"))); // NOI18N
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        getContentPane().add(registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 630, 40, 40));

        cancelar.setBackground(new java.awt.Color(255, 255, 255));
        cancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 630, 40, 40));

        button_send.setBackground(java.awt.Color.white);
        button_send.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        button_send.setForeground(new java.awt.Color(76, 76, 76));
        button_send.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/send.png"))); // NOI18N
        button_send.setText("ENVIAR");
        button_send.setBorder(null);
        button_send.setBorderPainted(false);
        button_send.setContentAreaFilled(false);
        button_send.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        button_send.setMaximumSize(new java.awt.Dimension(129, 65));
        button_send.setMinimumSize(new java.awt.Dimension(129, 65));
        button_send.setOpaque(true);
        button_send.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                isEmailCursorEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                isEmailCursorExited(evt);
            }
        });
        button_send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_sendActionPerformed(evt);
            }
        });
        getContentPane().add(button_send, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 740, 190, 60));

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
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 640, 130, 40));

        matricula.setBackground(new java.awt.Color(204, 204, 204));
        matricula.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        matricula.setForeground(new java.awt.Color(76, 76, 76));
        matricula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        matricula.setBorder(null);
        matricula.setFocusable(false);
        matricula.setLightWeightPopupEnabled(false);
        matricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matriculaActionPerformed(evt);
            }
        });
        getContentPane().add(matricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 240, 30));

        Menu.setBackground(new java.awt.Color(255, 255, 255));
        Menu.setBorder(null);
        Menu.setBorderPainted(false);
        Menu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        file.setText("File");
        file.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        log_out.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        log_out.setText("Cerrar sesión");
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

    private void button_sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_sendActionPerformed
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
            
            // Try to send email if allthe fields of data are filled
            //if (server.getSelectedItem() != "Seleccionar" && field_from.getText() != null && field_to.getText() != null && field_subject.getText() != null && text_message != null && field_password != null){
            if ((!field_from.getText().equals("")) && (!field_to.getText().equals("")) && (!field_subject.getText().equals("")) && (!text_motivo.getText().equals("")) && (field_password.getPassword().length != 0)){
                
                try {
                    InternetAddress fromAddress = new InternetAddress(field_from.getText());
                    InternetAddress toAddress = new InternetAddress(field_to.getText());

                    Message message = new MimeMessage(session);
                    message.setFrom(fromAddress);
                    message.setRecipient(Message.RecipientType.TO, toAddress);
                    message.setSubject(field_subject.getText());
                    message.setText(text_message.getText());
                    
                    String email = field_from.getText();
                    String username = email.replace("@gmail.com","");
                    
                    // Send the message
                    Transport.send(message, username, new String(field_password.getPassword()));
                    JOptionPane.showMessageDialog(this,"Mensaje enviado con éxito.","ÉXITO",JOptionPane.INFORMATION_MESSAGE);
                    
                    clearForm();
                    
                } 
                catch (MessagingException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(this,"Lo sentimos, el mensaje no ha sido enviado. Intente de nuevo.","ERROR",JOptionPane.INFORMATION_MESSAGE);
                }
            }
            else{
                JOptionPane.showMessageDialog(this,"Llena los campos correctamente.","ERROR",JOptionPane.INFORMATION_MESSAGE);
            }
    }//GEN-LAST:event_button_sendActionPerformed

    private void isEmailCursorEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_isEmailCursorEntered
        button_send.setBackground(new Color(231,231,231));
        //button_send.setForeground(new Color(220,220,220));
    }//GEN-LAST:event_isEmailCursorEntered

    private void isEmailCursorExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_isEmailCursorExited
        button_send.setBackground(new Color(255,255,255));
        //button_send.setForeground(new Color(76,76,76));
    }//GEN-LAST:event_isEmailCursorExited

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        
        if (!matricula.getSelectedItem().equals("Seleccionar")&& !field_name.getText().equals("") && !field_day.getText().equals("") && !field_month.getText().equals("") && !field_year.getText().equals("") && !text_motivo.getText().equals("")){
            field_from.setEditable(false);
            field_to.setEditable(false);
            field_subject.setEditable(false);
            text_message.setEditable(false);
            field_password.setEnabled(true);
            button_send.setEnabled(true);
        
            field_from.setText("residencias.csf2017@gmail.com");
            
            String correo_tutor = getCorreoTutor(matricula.getSelectedItem().toString());
            field_to.setText(correo_tutor);
            //field_to.setText("danflovier@gmail.com");
            field_subject.setText("Residencias CSF | Caso de Indisciplina del alumno");
        
            String day = field_day.getText();
            String month = field_month.getText();
            String year = field_year.getText();
            String date = (new StringBuilder()).append(day).append("/").append(month).append("/").append(year).toString();  
            text_message.setText("Estimado tutor: \n\nSe informa por este medio que el día " + date 
                                + " el alumno " + field_name.getText() 
                                + " ha sido sancionado por el siguiente motivo:\n" + text_motivo.getText()
                                + "\n\nSi tiene alguna duda o aclaración, favor de comunicarse con el Departamento Administrativo de Residencias CSF.\n\nSaludos cordiales.");
        }
        else{
            JOptionPane.showMessageDialog(this,"Llena los campos correctamente.","ERROR",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_registrarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        clearForm();
    }//GEN-LAST:event_cancelarActionPerformed

    private void log_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_outActionPerformed
        new Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_log_outActionPerformed

    private void about_csfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_about_csfActionPerformed
        new ResidenciasCSF().setVisible(true);
    }//GEN-LAST:event_about_csfActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new MenuExpediente().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void matriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matriculaActionPerformed
       if (!matricula.getSelectedItem().equals("Seleccionar")){
           String nombre_alumno = getNombreAlumno(matricula.getSelectedItem().toString());
           field_name.setText(nombre_alumno);
           setDiaActual();
       }
    }//GEN-LAST:event_matriculaActionPerformed

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
            java.util.logging.Logger.getLogger(Indisciplinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Indisciplinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Indisciplinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Indisciplinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Indisciplinas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenu about;
    private javax.swing.JMenuItem about_csf;
    private javax.swing.JButton back;
    private javax.swing.JButton button_send;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField field_day;
    private javax.swing.JTextField field_from;
    private javax.swing.JTextField field_month;
    private javax.swing.JTextField field_name;
    private javax.swing.JPasswordField field_password;
    private javax.swing.JTextField field_subject;
    private javax.swing.JTextField field_to;
    private javax.swing.JTextField field_year;
    private javax.swing.JMenu file;
    private javax.swing.JLabel label_anio;
    private javax.swing.JLabel label_confirmation;
    private javax.swing.JLabel label_date;
    private javax.swing.JLabel label_day;
    private javax.swing.JLabel label_from;
    private javax.swing.JLabel label_indisciplina;
    private javax.swing.JLabel label_indscipline;
    private javax.swing.JLabel label_line;
    private javax.swing.JLabel label_line1;
    private javax.swing.JLabel label_line2;
    private javax.swing.JLabel label_line3;
    private javax.swing.JLabel label_logo;
    private javax.swing.JLabel label_matricula;
    private javax.swing.JLabel label_mensaje;
    private javax.swing.JLabel label_mes;
    private javax.swing.JLabel label_message;
    private javax.swing.JLabel label_motivo;
    private javax.swing.JLabel label_name1;
    private javax.swing.JLabel label_password;
    private javax.swing.JLabel label_subject;
    private javax.swing.JLabel label_to;
    private javax.swing.JMenuItem log_out;
    private javax.swing.JComboBox<String> matricula;
    private javax.swing.JButton registrar;
    private javax.swing.JScrollPane scrollPane_message;
    private javax.swing.JScrollPane scrollPane_motivo;
    private javax.swing.JTextArea text_message;
    private javax.swing.JTextArea text_motivo;
    // End of variables declaration//GEN-END:variables
}
