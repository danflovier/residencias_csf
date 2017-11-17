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
public class Alumnos extends javax.swing.JFrame {
    
    public Alumnos() {
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

        label_matricula = new javax.swing.JLabel();
        label_login = new javax.swing.JLabel();
        label_sexo = new javax.swing.JLabel();
        label_nombre = new javax.swing.JLabel();
        label_dia = new javax.swing.JLabel();
        label_mes = new javax.swing.JLabel();
        label_anio = new javax.swing.JLabel();
        label_edad = new javax.swing.JLabel();
        label_estado = new javax.swing.JLabel();
        label_carrera = new javax.swing.JLabel();
        label_deporte = new javax.swing.JLabel();
        label_direccion = new javax.swing.JLabel();
        label_telefono = new javax.swing.JLabel();
        label_correo = new javax.swing.JLabel();
        label_buscar = new javax.swing.JLabel();
        label_logo = new javax.swing.JLabel();
        label_line = new javax.swing.JLabel();
        matricula = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        dia = new javax.swing.JTextField();
        mes = new javax.swing.JTextField();
        anio = new javax.swing.JTextField();
        edad = new javax.swing.JTextField();
        direccion = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        correo_institucional = new javax.swing.JTextField();
        buscar_alumno = new javax.swing.JTextField();
        sexo = new javax.swing.JComboBox<>();
        estado = new javax.swing.JComboBox<>();
        deporte = new javax.swing.JComboBox<>();
        carrera = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_alumnos = new javax.swing.JTable();
        imprimir = new javax.swing.JButton();
        buscar2 = new javax.swing.JButton();
        mostrar_todos = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        registrar = new javax.swing.JButton();
        buscar1 = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        modificar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Residencias Santa Fe | Alumnos");
        setBackground(new java.awt.Color(33, 150, 243));
        setIconImage(new ImageIcon(getClass().getResource("/img/icon.png")).getImage());
        setPreferredSize(new java.awt.Dimension(1500, 800));
        setResizable(false);
        setSize(new java.awt.Dimension(1500, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_matricula.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_matricula.setForeground(new java.awt.Color(76, 76, 76));
        label_matricula.setText("MATRÍCULA");
        getContentPane().add(label_matricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        label_login.setFont(new java.awt.Font("Segoe UI", 1, 72)); // NOI18N
        label_login.setForeground(new java.awt.Color(76, 76, 76));
        label_login.setText("ALUMNOS");
        getContentPane().add(label_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        label_sexo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_sexo.setForeground(new java.awt.Color(76, 76, 76));
        label_sexo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_sexo.setText("SEXO");
        getContentPane().add(label_sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 140, -1));

        label_nombre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_nombre.setForeground(new java.awt.Color(76, 76, 76));
        label_nombre.setText("NOMBRE COMPLETO");
        getContentPane().add(label_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        label_dia.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_dia.setForeground(new java.awt.Color(76, 76, 76));
        label_dia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_dia.setText("DD");
        getContentPane().add(label_dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 80, -1));

        label_mes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_mes.setForeground(new java.awt.Color(76, 76, 76));
        label_mes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_mes.setText("MM");
        getContentPane().add(label_mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 80, -1));

        label_anio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_anio.setForeground(new java.awt.Color(76, 76, 76));
        label_anio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_anio.setText("AAAA");
        getContentPane().add(label_anio, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 320, 70, -1));

        label_edad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_edad.setForeground(new java.awt.Color(76, 76, 76));
        label_edad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_edad.setText("EDAD");
        getContentPane().add(label_edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 80, -1));

        label_estado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_estado.setForeground(new java.awt.Color(76, 76, 76));
        label_estado.setText("ESTADO");
        getContentPane().add(label_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 170, -1));

        label_carrera.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_carrera.setForeground(new java.awt.Color(76, 76, 76));
        label_carrera.setText("CARRERA");
        getContentPane().add(label_carrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, 260, -1));

        label_deporte.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_deporte.setForeground(new java.awt.Color(76, 76, 76));
        label_deporte.setText("ACTIVIDAD / DEPORTE");
        getContentPane().add(label_deporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, 290, -1));

        label_direccion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_direccion.setForeground(new java.awt.Color(76, 76, 76));
        label_direccion.setText("DIRECCIÓN");
        getContentPane().add(label_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, 380, -1));

        label_telefono.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_telefono.setForeground(new java.awt.Color(76, 76, 76));
        label_telefono.setText("TELÉFONO");
        getContentPane().add(label_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 570, 240, -1));

        label_correo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_correo.setForeground(new java.awt.Color(76, 76, 76));
        label_correo.setText("CORREO INSTITUCIONAL");
        getContentPane().add(label_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 570, 310, -1));

        label_buscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_buscar.setForeground(new java.awt.Color(76, 76, 76));
        label_buscar.setText("BUSCAR ALUMNO:");
        getContentPane().add(label_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 170, -1, -1));

        label_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo5.png"))); // NOI18N
        getContentPane().add(label_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 670, 180, 70));

        label_line.setBackground(new java.awt.Color(250, 197, 28));
        label_line.setForeground(new java.awt.Color(3, 169, 244));
        label_line.setOpaque(true);
        getContentPane().add(label_line, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 500, 10));

        matricula.setBackground(new java.awt.Color(223, 223, 223));
        matricula.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        matricula.setToolTipText("");
        matricula.setBorder(null);
        matricula.setDoubleBuffered(true);
        getContentPane().add(matricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 200, 30));

        nombre.setBackground(new java.awt.Color(223, 223, 223));
        nombre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nombre.setToolTipText("");
        nombre.setBorder(null);
        nombre.setDoubleBuffered(true);
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 580, 30));

        dia.setBackground(new java.awt.Color(223, 223, 223));
        dia.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dia.setToolTipText("");
        dia.setBorder(null);
        dia.setDoubleBuffered(true);
        getContentPane().add(dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 80, 30));

        mes.setBackground(new java.awt.Color(223, 223, 223));
        mes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mes.setToolTipText("");
        mes.setBorder(null);
        mes.setDoubleBuffered(true);
        getContentPane().add(mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 80, 30));

        anio.setBackground(new java.awt.Color(223, 223, 223));
        anio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        anio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        anio.setToolTipText("");
        anio.setBorder(null);
        anio.setDoubleBuffered(true);
        getContentPane().add(anio, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 80, 30));

        edad.setBackground(new java.awt.Color(223, 223, 223));
        edad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        edad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        edad.setToolTipText("");
        edad.setBorder(null);
        edad.setDoubleBuffered(true);
        getContentPane().add(edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 80, 30));

        direccion.setBackground(new java.awt.Color(223, 223, 223));
        direccion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        direccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        direccion.setToolTipText("");
        direccion.setBorder(null);
        direccion.setDoubleBuffered(true);
        getContentPane().add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, 380, 30));

        telefono.setBackground(new java.awt.Color(223, 223, 223));
        telefono.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        telefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        telefono.setToolTipText("");
        telefono.setBorder(null);
        telefono.setDoubleBuffered(true);
        getContentPane().add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 600, 240, 30));

        correo_institucional.setBackground(new java.awt.Color(223, 223, 223));
        correo_institucional.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        correo_institucional.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        correo_institucional.setToolTipText("");
        correo_institucional.setBorder(null);
        correo_institucional.setDoubleBuffered(true);
        getContentPane().add(correo_institucional, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 600, 310, 30));

        buscar_alumno.setBackground(new java.awt.Color(223, 223, 223));
        buscar_alumno.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buscar_alumno.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        buscar_alumno.setToolTipText("");
        buscar_alumno.setBorder(null);
        buscar_alumno.setDoubleBuffered(true);
        getContentPane().add(buscar_alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 210, 200, 30));

        sexo.setBackground(new java.awt.Color(102, 102, 102));
        sexo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sexo.setForeground(new java.awt.Color(76, 76, 76));
        sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "M", "F" }));
        sexo.setBorder(null);
        sexo.setFocusable(false);
        sexo.setLightWeightPopupEnabled(false);
        getContentPane().add(sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, 140, 30));

        estado.setBackground(new java.awt.Color(102, 102, 102));
        estado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        estado.setForeground(new java.awt.Color(76, 76, 76));
        estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Aguascalientes", "Baja California", "Baja California Sur", "Campeche", "Chiapas", "Chihuahua", "Ciudad de México", "Coahuila", "Colima", "Durango", "Estado de México", "Guanajuato", "Guerrero", "Hidalgo", "Jalisco", "Michoacán", "Morelos", "Nayarit", "Nuevo León", "Oaxaca", "Puebla", "Querétaro", "Quintana Roo", "San Luis Potosí", "Sinaloa", "Sonora", "Tabasco", "Tamaulipas", "Tlaxcala", "Veracruz", "Yucatán", "Zacatecas" }));
        estado.setBorder(null);
        estado.setFocusable(false);
        estado.setLightWeightPopupEnabled(false);
        getContentPane().add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 170, 30));

        deporte.setBackground(new java.awt.Color(102, 102, 102));
        deporte.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        deporte.setForeground(new java.awt.Color(76, 76, 76));
        deporte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----------", "---Deportes---", "Basketball", "Volleyball", "Fútbol", "Soccer", "Fútbol Americano", "Atletismo", "Cheer & dance", "Tennis", "---Actividades---", "Cinematografía", "Dibujo", "Canto", "Teatro", "Literatura", "Fotografía", "Piano", "Guitarra acústica", "Guitarra eléctrica", "Salsa", "Yoga", "Jazz" }));
        deporte.setBorder(null);
        deporte.setFocusable(false);
        deporte.setLightWeightPopupEnabled(false);
        getContentPane().add(deporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 510, 290, 30));

        carrera.setBackground(new java.awt.Color(102, 102, 102));
        carrera.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        carrera.setForeground(new java.awt.Color(76, 76, 76));
        carrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----------", "-Arquitectura-", "LDI", "-Bioingeniería-", "IA", "IBT", "IDS", "IIA", "IQA", "IQP", "-Ingenierías-", "IC", "IID", "IMT", "IFI", "IIS", "IMA", "IME", "-Ciencias sociales-", "LED", "LEF", "LRI", "LTS", "-Negocios-", "LAF", "LAE", "LCPF", "LCDE", "LEM", "LMC", "LIN", "-Tecnologías-", "ISDR", "ITC", "ITI", "ITE", "ITS", "-Comunicación y Música-", "IMI", "LCMD" }));
        carrera.setBorder(null);
        carrera.setFocusable(false);
        carrera.setLightWeightPopupEnabled(false);
        getContentPane().add(carrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 260, 30));

        tabla_alumnos.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        tabla_alumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MATRÍCULA", "NOMBRE", "FECHA NACIMIENTO", "SEXO", "DIRECCION", "ESTADO", "CARRERA", "DEPORTE", "TELÉFONO", "CORREO INSTITUCIONAL"
            }
        ));
        jScrollPane1.setViewportView(tabla_alumnos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 260, 690, 310));

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
        getContentPane().add(imprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 590, 160, 60));

        buscar2.setBackground(new java.awt.Color(255, 255, 255));
        buscar2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buscar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        buscar2.setText("BUSCAR");
        buscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar2ActionPerformed(evt);
            }
        });
        getContentPane().add(buscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 210, 140, 30));

        mostrar_todos.setBackground(new java.awt.Color(255, 255, 255));
        mostrar_todos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mostrar_todos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lista.png"))); // NOI18N
        mostrar_todos.setText("MOSTRAR");
        mostrar_todos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrar_todosActionPerformed(evt);
            }
        });
        getContentPane().add(mostrar_todos, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 590, 180, 60));

        eliminar.setBackground(new java.awt.Color(255, 255, 255));
        eliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        eliminar.setText("ELIMINAR");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 590, 180, 60));

        registrar.setBackground(new java.awt.Color(255, 255, 255));
        registrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/registrar.png"))); // NOI18N
        registrar.setText("REGISTRAR");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        getContentPane().add(registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 660, 130, 40));

        buscar1.setBackground(new java.awt.Color(255, 255, 255));
        buscar1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        buscar1.setText("BUSCAR");
        buscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar1ActionPerformed(evt);
            }
        });
        getContentPane().add(buscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 660, 120, 40));

        cancelar.setBackground(new java.awt.Color(255, 255, 255));
        cancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        cancelar.setText("CANCELAR");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 660, 120, 40));

        modificar1.setBackground(new java.awt.Color(255, 255, 255));
        modificar1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        modificar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/modificar.png"))); // NOI18N
        modificar1.setText("MODIFICAR");
        modificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar1ActionPerformed(evt);
            }
        });
        getContentPane().add(modificar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 660, 130, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_imprimirActionPerformed

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

    private void modificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificar1ActionPerformed

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
            java.util.logging.Logger.getLogger(Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new Alumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anio;
    private javax.swing.JButton buscar1;
    private javax.swing.JButton buscar2;
    private javax.swing.JTextField buscar_alumno;
    private javax.swing.JButton cancelar;
    private javax.swing.JComboBox<String> carrera;
    private javax.swing.JTextField correo_institucional;
    private javax.swing.JComboBox<String> deporte;
    private javax.swing.JTextField dia;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField edad;
    private javax.swing.JButton eliminar;
    private javax.swing.JComboBox<String> estado;
    private javax.swing.JButton imprimir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_anio;
    private javax.swing.JLabel label_buscar;
    private javax.swing.JLabel label_carrera;
    private javax.swing.JLabel label_correo;
    private javax.swing.JLabel label_deporte;
    private javax.swing.JLabel label_dia;
    private javax.swing.JLabel label_direccion;
    private javax.swing.JLabel label_edad;
    private javax.swing.JLabel label_estado;
    private javax.swing.JLabel label_line;
    private javax.swing.JLabel label_login;
    private javax.swing.JLabel label_logo;
    private javax.swing.JLabel label_matricula;
    private javax.swing.JLabel label_mes;
    private javax.swing.JLabel label_nombre;
    private javax.swing.JLabel label_sexo;
    private javax.swing.JLabel label_telefono;
    private javax.swing.JTextField matricula;
    private javax.swing.JTextField mes;
    private javax.swing.JButton modificar1;
    private javax.swing.JButton mostrar_todos;
    private javax.swing.JTextField nombre;
    private javax.swing.JButton registrar;
    private javax.swing.JComboBox<String> sexo;
    private javax.swing.JTable tabla_alumnos;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}