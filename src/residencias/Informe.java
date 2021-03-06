/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package residencias;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author danflovier
 */
public class Informe extends javax.swing.JFrame {
    final private MySQL db;
    Connection con;
    
    public Informe() {
        initComponents();
        
        // Set a background color to the JFrame
        this.getContentPane().setBackground(new Color(255,255,255));
        
        // Center the JFrame
        this.setLocationRelativeTo(null);
        
        // Enable fields of the JFrame
        nombre.setEditable(false);
        ingreso.setEditable(false);
        vigencia.setEditable(false);
        status.setEditable(false);
        pasados.setEditable(false);
        faltantes.setEditable(false);
        
        field_from.setEnabled(false);
        field_to.setEnabled(false);
        field_subject.setEnabled(false);
        text_message.setEnabled(false);
        field_password.setEnabled(false);
        button_send.setEnabled(false);
        
        scrollPane_message.setBorder(null);
        
        db = new MySQL();
        initMatricula();
        
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
    
    public static long betweenDates(Date firstDate, Date secondDate) throws IOException{
        return ChronoUnit.DAYS.between(firstDate.toInstant(), secondDate.toInstant());
    }
    
    public String getCorreoTutor(String matricula){
        String correo = "";
        Connection con = db.MySQLConnection();
        String query = "{call getCorreoTutor(?)}";
        ResultSet result;
        
        try {
            CallableStatement call = con.prepareCall(query);
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
    
    public String getSalidaAlumno(String matricula){
        Connection con = db.MySQLConnection();
        String query = "{call getAlumno(?)}";
        ResultSet result;
        String fecha_salida = "";
            
        try { 
            CallableStatement call = con.prepareCall(query);
            call.setString(1, matricula);
            result = call.executeQuery();
            
            while(result.next()){
                fecha_salida = result.getString("Salida");
            }
                
            }catch (SQLException ex){
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this,"La matrícula del alumno no existe. Intente de nuevo.","ERROR",JOptionPane.INFORMATION_MESSAGE);    
            }
        return fecha_salida;
    }
    
    public String getIngresoAlumno(String matricula){
        Connection con = db.MySQLConnection();
        String query = "{call getAlumno(?)}";
        ResultSet result;
        String fecha_ingreso = "";
            
        try { 
            CallableStatement call = con.prepareCall(query);
            call.setString(1, matricula);
            result = call.executeQuery();
            
            while(result.next()){
                fecha_ingreso = result.getString("Ingreso");
            }
                
            }catch (SQLException ex){
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this,"La matrícula del alumno no existe. Intente de nuevo.","ERROR",JOptionPane.INFORMATION_MESSAGE);    
            }
        return fecha_ingreso;
    }
    
    public void cleanThermometer(){
        label_expirada.setBackground(new Color(240,240,240));
        label_expirada.setForeground(new Color(204,204,204));
        label_line2.setBackground(new Color(255,255,255));
    
        label_porexpirar.setBackground(new Color(240,240,240));
        label_porexpirar.setForeground(new Color(204,204,204));
        label_line3.setBackground(new Color(255,255,255));
    
        label_vigente.setBackground(new Color(240,240,240));
        label_vigente.setForeground(new Color(204,204,204));
        label_line4.setBackground(new Color(255,255,255));
    
        label_actual.setBackground(new Color(240,240,240));
        label_actual.setForeground(new Color(204,204,204));
        label_line5.setBackground(new Color(255,255,255));
    
        label_inicial.setBackground(new Color(240,240,240));
        label_inicial.setForeground(new Color(204,204,204));
        label_line6.setBackground(new Color(255,255,255));
    }
    
    public void cleanForm(){
        matricula.setSelectedIndex(0);
        nombre.setText("");
        ingreso.setText("");
        vigencia.setText("");
        status.setText("");
        pasados.setText("");
        faltantes.setText("");
        field_from.setText("");
        field_to.setText("");
        field_subject.setText("");
        text_message.setText("");
        field_password.setText("");

        field_from.setEnabled(false);
        field_to.setEnabled(false);
        field_subject.setEnabled(false);
        text_message.setEnabled(false);
        field_password.setEnabled(false);
        button_send.setEnabled(false);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_logo = new javax.swing.JLabel();
        label_tvigencia = new javax.swing.JLabel();
        label_logo2 = new javax.swing.JLabel();
        label_line1 = new javax.swing.JLabel();
        label_line2 = new javax.swing.JLabel();
        label_line3 = new javax.swing.JLabel();
        label_line4 = new javax.swing.JLabel();
        label_line5 = new javax.swing.JLabel();
        label_line6 = new javax.swing.JLabel();
        label_line7 = new javax.swing.JLabel();
        label_expirada = new javax.swing.JLabel();
        label_porexpirar = new javax.swing.JLabel();
        label_vigente = new javax.swing.JLabel();
        label_actual = new javax.swing.JLabel();
        label_inicial = new javax.swing.JLabel();
        label_buscar = new javax.swing.JLabel();
        label_nombre = new javax.swing.JLabel();
        label_faltantes = new javax.swing.JLabel();
        label_vigencia = new javax.swing.JLabel();
        label_status = new javax.swing.JLabel();
        label_ingreso = new javax.swing.JLabel();
        label_pasados = new javax.swing.JLabel();
        label_estancia = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        ingreso = new javax.swing.JTextField();
        vigencia = new javax.swing.JTextField();
        pasados = new javax.swing.JTextField();
        status = new javax.swing.JTextField();
        faltantes = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        back = new javax.swing.JButton();
        label_to = new javax.swing.JLabel();
        label_password = new javax.swing.JLabel();
        label_message = new javax.swing.JLabel();
        label_subject = new javax.swing.JLabel();
        label_mensaje = new javax.swing.JLabel();
        label_confirmation = new javax.swing.JLabel();
        label_from = new javax.swing.JLabel();
        label_line8 = new javax.swing.JLabel();
        label_line = new javax.swing.JLabel();
        field_from = new javax.swing.JTextField();
        field_to = new javax.swing.JTextField();
        field_subject = new javax.swing.JTextField();
        field_password = new javax.swing.JPasswordField();
        scrollPane_message = new javax.swing.JScrollPane();
        text_message = new javax.swing.JTextArea();
        button_send = new javax.swing.JButton();
        matricula = new javax.swing.JComboBox<>();
        cancelar = new javax.swing.JButton();
        Menu = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        log_out = new javax.swing.JMenuItem();
        about = new javax.swing.JMenu();
        about_csf = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Residencias Santa Fe | Informe");
        setBackground(new java.awt.Color(33, 150, 243));
        setIconImage(new ImageIcon(getClass().getResource("/img/icon.png")).getImage());
        setPreferredSize(new java.awt.Dimension(1900, 900));
        setResizable(false);
        setSize(new java.awt.Dimension(1900, 900));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo5.png"))); // NOI18N
        getContentPane().add(label_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1660, 720, 180, 70));

        label_tvigencia.setFont(new java.awt.Font("Segoe UI", 1, 72)); // NOI18N
        label_tvigencia.setForeground(new java.awt.Color(76, 76, 76));
        label_tvigencia.setText("INFORME");
        getContentPane().add(label_tvigencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 350, -1));

        label_logo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_logo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/termometro.png"))); // NOI18N
        getContentPane().add(label_logo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 220, 640));

        label_line1.setBackground(new java.awt.Color(250, 197, 28));
        label_line1.setForeground(new java.awt.Color(3, 169, 244));
        label_line1.setOpaque(true);
        getContentPane().add(label_line1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 410, 10));

        label_line2.setBackground(new java.awt.Color(255, 255, 255));
        label_line2.setForeground(new java.awt.Color(3, 169, 244));
        label_line2.setOpaque(true);
        getContentPane().add(label_line2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 200, 10));

        label_line3.setBackground(new java.awt.Color(255, 255, 255));
        label_line3.setForeground(new java.awt.Color(3, 169, 244));
        label_line3.setOpaque(true);
        getContentPane().add(label_line3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 200, 10));

        label_line4.setBackground(new java.awt.Color(255, 255, 255));
        label_line4.setForeground(new java.awt.Color(3, 169, 244));
        label_line4.setOpaque(true);
        getContentPane().add(label_line4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 200, 10));

        label_line5.setBackground(new java.awt.Color(255, 255, 255));
        label_line5.setForeground(new java.awt.Color(3, 169, 244));
        label_line5.setOpaque(true);
        getContentPane().add(label_line5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, 200, 10));

        label_line6.setBackground(new java.awt.Color(255, 255, 255));
        label_line6.setForeground(new java.awt.Color(3, 169, 244));
        label_line6.setOpaque(true);
        getContentPane().add(label_line6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 610, 200, 10));

        label_line7.setBackground(new java.awt.Color(250, 197, 28));
        label_line7.setForeground(new java.awt.Color(3, 169, 244));
        label_line7.setOpaque(true);
        getContentPane().add(label_line7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 550, 200, 10));

        label_expirada.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        label_expirada.setForeground(new java.awt.Color(204, 204, 204));
        label_expirada.setText("EXPIRADA");
        getContentPane().add(label_expirada, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 200, -1));

        label_porexpirar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        label_porexpirar.setForeground(new java.awt.Color(204, 204, 204));
        label_porexpirar.setText("POR EXPIRAR");
        getContentPane().add(label_porexpirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 200, -1));

        label_vigente.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        label_vigente.setForeground(new java.awt.Color(204, 204, 204));
        label_vigente.setText("VIGENTE ");
        getContentPane().add(label_vigente, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 200, -1));

        label_actual.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        label_actual.setForeground(new java.awt.Color(204, 204, 204));
        label_actual.setText("ACTUAL");
        getContentPane().add(label_actual, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, 200, -1));

        label_inicial.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        label_inicial.setForeground(new java.awt.Color(204, 204, 204));
        label_inicial.setText("INICIAL");
        getContentPane().add(label_inicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 570, 200, -1));

        label_buscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_buscar.setForeground(new java.awt.Color(76, 76, 76));
        label_buscar.setText("BUSCAR ALUMNO:");
        getContentPane().add(label_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, -1, -1));

        label_nombre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_nombre.setForeground(new java.awt.Color(76, 76, 76));
        label_nombre.setText("NOMBRE COMPLETO");
        getContentPane().add(label_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, -1, -1));

        label_faltantes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_faltantes.setForeground(new java.awt.Color(76, 76, 76));
        label_faltantes.setText("DÍAS FALTANTES");
        getContentPane().add(label_faltantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 670, -1, -1));

        label_vigencia.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_vigencia.setForeground(new java.awt.Color(76, 76, 76));
        label_vigencia.setText("VIGENCIA");
        getContentPane().add(label_vigencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 410, -1, -1));

        label_status.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_status.setForeground(new java.awt.Color(76, 76, 76));
        label_status.setText("STATUS");
        getContentPane().add(label_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 570, -1, -1));

        label_ingreso.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_ingreso.setForeground(new java.awt.Color(76, 76, 76));
        label_ingreso.setText("FECHA DE INGRESO");
        getContentPane().add(label_ingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, -1, -1));

        label_pasados.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_pasados.setForeground(new java.awt.Color(76, 76, 76));
        label_pasados.setText("DÍAS PASADOS");
        getContentPane().add(label_pasados, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 620, -1, -1));

        label_estancia.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        label_estancia.setForeground(new java.awt.Color(76, 76, 76));
        label_estancia.setText("ESTANCIA");
        getContentPane().add(label_estancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 510, 200, -1));

        nombre.setBackground(new java.awt.Color(223, 223, 223));
        nombre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombre.setToolTipText("");
        nombre.setBorder(null);
        nombre.setDoubleBuffered(true);
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 440, 30));

        ingreso.setBackground(new java.awt.Color(223, 223, 223));
        ingreso.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ingreso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ingreso.setToolTipText("");
        ingreso.setBorder(null);
        ingreso.setDoubleBuffered(true);
        getContentPane().add(ingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, 210, 30));

        vigencia.setBackground(new java.awt.Color(223, 223, 223));
        vigencia.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        vigencia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        vigencia.setToolTipText("");
        vigencia.setBorder(null);
        vigencia.setDoubleBuffered(true);
        getContentPane().add(vigencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 440, 210, 30));

        pasados.setBackground(new java.awt.Color(223, 223, 223));
        pasados.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pasados.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pasados.setToolTipText("");
        pasados.setBorder(null);
        pasados.setDoubleBuffered(true);
        getContentPane().add(pasados, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 620, 160, 30));

        status.setBackground(new java.awt.Color(223, 223, 223));
        status.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        status.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        status.setToolTipText("");
        status.setBorder(null);
        status.setDoubleBuffered(true);
        getContentPane().add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 570, 160, 30));

        faltantes.setBackground(new java.awt.Color(223, 223, 223));
        faltantes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        faltantes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        faltantes.setToolTipText("");
        faltantes.setBorder(null);
        faltantes.setDoubleBuffered(true);
        getContentPane().add(faltantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 670, 160, 30));

        buscar.setBackground(new java.awt.Color(255, 255, 255));
        buscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        buscar.setText("BUSCAR");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        getContentPane().add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 270, 180, 30));

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
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 750, 140, 40));

        label_to.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_to.setForeground(new java.awt.Color(76, 76, 76));
        label_to.setText("PARA");
        getContentPane().add(label_to, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 270, -1, -1));

        label_password.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_password.setForeground(new java.awt.Color(76, 76, 76));
        label_password.setText("CONTRASEÑA");
        getContentPane().add(label_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 680, 130, -1));

        label_message.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_message.setForeground(new java.awt.Color(76, 76, 76));
        label_message.setText("MENSAJE");
        getContentPane().add(label_message, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 370, -1, -1));

        label_subject.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_subject.setForeground(new java.awt.Color(76, 76, 76));
        label_subject.setText("ASUNTO");
        getContentPane().add(label_subject, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 320, -1, -1));

        label_mensaje.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        label_mensaje.setForeground(new java.awt.Color(76, 76, 76));
        label_mensaje.setText("MENSAJE");
        getContentPane().add(label_mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 150, 200, -1));

        label_confirmation.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        label_confirmation.setForeground(new java.awt.Color(76, 76, 76));
        label_confirmation.setText("CONFIRMACIÓN");
        getContentPane().add(label_confirmation, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 600, 200, -1));

        label_from.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_from.setForeground(new java.awt.Color(76, 76, 76));
        label_from.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_from.setText("DE");
        getContentPane().add(label_from, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 220, 40, -1));

        label_line8.setBackground(new java.awt.Color(250, 197, 28));
        label_line8.setForeground(new java.awt.Color(3, 169, 244));
        label_line8.setOpaque(true);
        getContentPane().add(label_line8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 190, 200, 10));

        label_line.setBackground(new java.awt.Color(250, 197, 28));
        label_line.setForeground(new java.awt.Color(3, 169, 244));
        label_line.setOpaque(true);
        getContentPane().add(label_line, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 640, 200, 10));

        field_from.setBackground(new java.awt.Color(223, 223, 223));
        field_from.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        field_from.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field_from.setToolTipText("");
        field_from.setBorder(null);
        field_from.setDoubleBuffered(true);
        getContentPane().add(field_from, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 220, 330, 30));

        field_to.setBackground(new java.awt.Color(223, 223, 223));
        field_to.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        field_to.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field_to.setToolTipText("");
        field_to.setBorder(null);
        field_to.setDoubleBuffered(true);
        getContentPane().add(field_to, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 270, 330, 30));

        field_subject.setBackground(new java.awt.Color(223, 223, 223));
        field_subject.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        field_subject.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field_subject.setToolTipText("");
        field_subject.setBorder(null);
        field_subject.setDoubleBuffered(true);
        getContentPane().add(field_subject, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 320, 560, 30));

        field_password.setBackground(new java.awt.Color(223, 223, 223));
        field_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field_password.setBorder(null);
        getContentPane().add(field_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 680, 190, 30));

        text_message.setBackground(new java.awt.Color(223, 223, 223));
        text_message.setColumns(20);
        text_message.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        text_message.setRows(5);
        text_message.setBorder(null);
        text_message.setCaretColor(new java.awt.Color(223, 223, 223));
        scrollPane_message.setViewportView(text_message);

        getContentPane().add(scrollPane_message, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 370, 560, 220));

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
                button_sendisEmailCursorEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button_sendisEmailCursorExited(evt);
            }
        });
        button_send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_sendActionPerformed(evt);
            }
        });
        getContentPane().add(button_send, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 730, 190, 60));

        matricula.setBackground(new java.awt.Color(204, 204, 204));
        matricula.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        matricula.setForeground(new java.awt.Color(76, 76, 76));
        matricula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        matricula.setBorder(null);
        matricula.setFocusable(false);
        matricula.setLightWeightPopupEnabled(false);
        getContentPane().add(matricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 240, 30));

        cancelar.setBackground(new java.awt.Color(255, 255, 255));
        cancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        cancelar.setText("CANCELAR");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 750, 140, 40));

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

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        String status_alumno = "";
        SimpleDateFormat format_date = new SimpleDateFormat("yyyy-MM-dd");
        Date admission_date, expiry_date, current_date;
        
        
        if (matricula.getSelectedItem() != "Seleccionar"){
            
            cleanThermometer();
            
            nombre.setEnabled(true);
            ingreso.setEnabled(true);
            vigencia.setEnabled(true);
            status.setEnabled(true);
            pasados.setEnabled(true);
            faltantes.setEnabled(true);
            
            String id_alumno = matricula.getSelectedItem().toString();
            String nombre_alumno = getNombreAlumno(id_alumno);
            String fecha_ingreso = getIngresoAlumno(id_alumno);
            String fecha_salida = getSalidaAlumno(id_alumno);
            
            nombre.setText(nombre_alumno);
            ingreso.setText(fecha_ingreso);
            vigencia.setText(fecha_salida);
            
            String date1 = ingreso.getText();
            String date2 = vigencia.getText();
            
            
            try {
                // Date of admission
                admission_date = format_date.parse(date1);
                
                // Expiry date
                expiry_date = format_date.parse(date2);
                
                // Current date
                LocalDate localDate = LocalDate.now();
                current_date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
                
                // Total number of days of the student's stay
                double days = betweenDates(admission_date, expiry_date);
                
                // Missing days of the student's stay
                long dias_faltantes = betweenDates(current_date, expiry_date);
                
                // Days that have passed since the beginning of the student's stay
                long dias_pasados = betweenDates(admission_date, current_date);
                
                // Sections of the thermometer
                double thermometer_section = days / 5;
                
                
                // Section 1
                if (dias_pasados <= thermometer_section * 1){
                    label_inicial.setForeground(new Color(0,0,0));
                    label_line6.setBackground(Color.GREEN);
                    status.setText("INICIAL");
                }
                
                // Section 2
                if ((dias_pasados > thermometer_section * 1) &&(dias_pasados <= thermometer_section * 2) ){
                    label_actual.setForeground(new Color(0,0,0));
                    label_line5.setBackground(Color.GREEN);
                    status.setText("ACTUAL");
                }
                
                // Section 3
                if ((dias_pasados > thermometer_section * 2) &&(dias_pasados <= thermometer_section * 3) ){
                    label_vigente.setForeground(new Color(0,0,0));
                    label_line4.setBackground(Color.YELLOW);
                    status.setText("VIGENTE");
                }
                
                // Section 4
                if ((dias_pasados > thermometer_section * 3) &&(dias_pasados < thermometer_section * 5) ){
                    label_porexpirar.setForeground(new Color(0,0,0));
                    label_line3.setBackground(Color.ORANGE);
                    status.setText("POR EXPIRAR");
                    status_alumno = ". Por lo cual, solicitamos de su apoyo para estar al pendiente a la fecha de término de la estancia.\n";
                     
                }
                
                // Section 5
                if ((dias_pasados == thermometer_section * 5) && (dias_pasados >= days) ){
                    label_expirada.setForeground(new Color(0,0,0));
                    label_line2.setBackground(Color.RED);
                    status.setText("EXPIRADA");
                    status_alumno = ". Por lo cual, el alumno ya no podrá usar las instalaciones de la estancia.\n";
                }
                
                pasados.setText(String.valueOf(dias_pasados));
                faltantes.setText(String.valueOf(dias_faltantes));
                
                field_from.setEditable(false);
                field_to.setEditable(false);
                field_subject.setEditable(false);
                text_message.setEditable(false);
                field_password.setEnabled(true);
                button_send.setEnabled(true);
        
                field_from.setText("residencias.csf2017@gmail.com");
                String correo_tutor = getCorreoTutor(matricula.getSelectedItem().toString());
                field_to.setText(correo_tutor);
                field_subject.setText("Residencias CSF | Informe semestral de vigencia del alumno");
                
                text_message.setText("Estimado tutor: \n\nSe informa por este medio que el status de la estancia del alumno " + nombre.getText() + " hasta el día " + format_date.format(current_date).toString()
                                + " es: " + status.getText() + status_alumno
                                + "\nSi tiene alguna duda o aclaración, favor de comunicarse con el Departamento Administrativo de Residencias CSF.\n\nSaludos cordiales.");
        
                
            } catch (ParseException e) {
                e.printStackTrace();
            } catch (IOException ex) {
                Logger.getLogger(Informe.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            JOptionPane.showMessageDialog(this,"Alumno no encontrado. Intente de nuevo con una matrícula diferente","ERROR",JOptionPane.INFORMATION_MESSAGE);
        }
      
    }//GEN-LAST:event_buscarActionPerformed

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

    private void button_sendisEmailCursorEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_sendisEmailCursorEntered
        button_send.setBackground(new Color(231,231,231));
    }//GEN-LAST:event_button_sendisEmailCursorEntered

    private void button_sendisEmailCursorExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_sendisEmailCursorExited
        button_send.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_button_sendisEmailCursorExited

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
            if ((!field_from.getText().equals(""))){

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
                    cleanThermometer();
                    cleanForm();
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

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        cleanThermometer();
        cleanForm();
    }//GEN-LAST:event_cancelarActionPerformed

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
            java.util.logging.Logger.getLogger(Informe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Informe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Informe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Informe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Informe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenu about;
    private javax.swing.JMenuItem about_csf;
    private javax.swing.JButton back;
    private javax.swing.JButton buscar;
    private javax.swing.JButton button_send;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField faltantes;
    private javax.swing.JTextField field_from;
    private javax.swing.JPasswordField field_password;
    private javax.swing.JTextField field_subject;
    private javax.swing.JTextField field_to;
    private javax.swing.JMenu file;
    private javax.swing.JTextField ingreso;
    private javax.swing.JLabel label_actual;
    private javax.swing.JLabel label_buscar;
    private javax.swing.JLabel label_confirmation;
    private javax.swing.JLabel label_estancia;
    private javax.swing.JLabel label_expirada;
    private javax.swing.JLabel label_faltantes;
    private javax.swing.JLabel label_from;
    private javax.swing.JLabel label_ingreso;
    private javax.swing.JLabel label_inicial;
    private javax.swing.JLabel label_line;
    private javax.swing.JLabel label_line1;
    private javax.swing.JLabel label_line2;
    private javax.swing.JLabel label_line3;
    private javax.swing.JLabel label_line4;
    private javax.swing.JLabel label_line5;
    private javax.swing.JLabel label_line6;
    private javax.swing.JLabel label_line7;
    private javax.swing.JLabel label_line8;
    private javax.swing.JLabel label_logo;
    private javax.swing.JLabel label_logo2;
    private javax.swing.JLabel label_mensaje;
    private javax.swing.JLabel label_message;
    private javax.swing.JLabel label_nombre;
    private javax.swing.JLabel label_pasados;
    private javax.swing.JLabel label_password;
    private javax.swing.JLabel label_porexpirar;
    private javax.swing.JLabel label_status;
    private javax.swing.JLabel label_subject;
    private javax.swing.JLabel label_to;
    private javax.swing.JLabel label_tvigencia;
    private javax.swing.JLabel label_vigencia;
    private javax.swing.JLabel label_vigente;
    private javax.swing.JMenuItem log_out;
    private javax.swing.JComboBox<String> matricula;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField pasados;
    private javax.swing.JScrollPane scrollPane_message;
    private javax.swing.JTextField status;
    private javax.swing.JTextArea text_message;
    private javax.swing.JTextField vigencia;
    // End of variables declaration//GEN-END:variables
}
