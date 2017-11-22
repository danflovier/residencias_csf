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
public class HistorialMedico extends javax.swing.JFrame {
    
    public HistorialMedico() {
        initComponents();
        
        // Set a background color to the JFrame
        this.getContentPane().setBackground(new Color(255,255,255));  
        
        // Delete border from the textArea
        jScrollPane2.setBorder(null);
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
        label_nombre = new javax.swing.JLabel();
        label_alergias = new javax.swing.JLabel();
        label_buscar = new javax.swing.JLabel();
        label_logo = new javax.swing.JLabel();
        label_line = new javax.swing.JLabel();
        label_sangre = new javax.swing.JLabel();
        label_peso = new javax.swing.JLabel();
        label_antidoping = new javax.swing.JLabel();
        label_padecimientos = new javax.swing.JLabel();
        label_cirugias = new javax.swing.JLabel();
        label_historia = new javax.swing.JLabel();
        label_id_expediente = new javax.swing.JLabel();
        label_altura = new javax.swing.JLabel();
        label_nombre2 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        id_expediente = new javax.swing.JTextField();
        altura = new javax.swing.JTextField();
        peso = new javax.swing.JTextField();
        padecimientos = new javax.swing.JTextField();
        cirugias = new javax.swing.JTextField();
        historia = new javax.swing.JTextField();
        buscar_historial = new javax.swing.JTextField();
        antidoping = new javax.swing.JComboBox<>();
        sangre = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_alumnos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        alergias = new javax.swing.JTextArea();
        registrar = new javax.swing.JButton();
        buscar1 = new javax.swing.JButton();
        buscar2 = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        mostrar_todos = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        imprimir = new javax.swing.JButton();
        back = new javax.swing.JButton();
        Menu = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        log_out = new javax.swing.JMenuItem();
        about = new javax.swing.JMenu();
        about_csf = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Residencias Santa Fe | Historial Médico");
        setBackground(new java.awt.Color(33, 150, 243));
        setIconImage(new ImageIcon(getClass().getResource("/img/icon.png")).getImage());
        setPreferredSize(new java.awt.Dimension(1500, 900));
        setResizable(false);
        setSize(new java.awt.Dimension(1500, 900));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_id.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_id.setForeground(new java.awt.Color(76, 76, 76));
        label_id.setText("ID");
        getContentPane().add(label_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        label_login.setFont(new java.awt.Font("Segoe UI", 1, 72)); // NOI18N
        label_login.setForeground(new java.awt.Color(76, 76, 76));
        label_login.setText("HISTORIAL MÉDICO");
        getContentPane().add(label_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        label_nombre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_nombre.setForeground(new java.awt.Color(76, 76, 76));
        label_nombre.setText(" m");
        getContentPane().add(label_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 70, 30));

        label_alergias.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_alergias.setForeground(new java.awt.Color(76, 76, 76));
        label_alergias.setText("ALERGIAS");
        getContentPane().add(label_alergias, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 360, -1));

        label_buscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_buscar.setForeground(new java.awt.Color(76, 76, 76));
        label_buscar.setText("BUSCAR HISTORIAL:");
        getContentPane().add(label_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 150, -1, -1));

        label_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo5.png"))); // NOI18N
        getContentPane().add(label_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 720, 180, 70));

        label_line.setBackground(new java.awt.Color(84, 172, 210));
        label_line.setForeground(new java.awt.Color(3, 169, 244));
        label_line.setOpaque(true);
        getContentPane().add(label_line, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 750, 10));

        label_sangre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_sangre.setForeground(new java.awt.Color(76, 76, 76));
        label_sangre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_sangre.setText("TIPO SANGRE");
        getContentPane().add(label_sangre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 130, -1));

        label_peso.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_peso.setForeground(new java.awt.Color(76, 76, 76));
        label_peso.setText("PESO");
        getContentPane().add(label_peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 130, -1));

        label_antidoping.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_antidoping.setForeground(new java.awt.Color(76, 76, 76));
        label_antidoping.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_antidoping.setText("ANTIDOPING");
        getContentPane().add(label_antidoping, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 130, -1));

        label_padecimientos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_padecimientos.setForeground(new java.awt.Color(76, 76, 76));
        label_padecimientos.setText("PADECIMIENTOS");
        getContentPane().add(label_padecimientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 220, -1));

        label_cirugias.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_cirugias.setForeground(new java.awt.Color(76, 76, 76));
        label_cirugias.setText("CIRUGÍAS");
        getContentPane().add(label_cirugias, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, 300, -1));

        label_historia.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_historia.setForeground(new java.awt.Color(76, 76, 76));
        label_historia.setText("HISTORIA CLÍNICA FAMILIAR");
        getContentPane().add(label_historia, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 580, 530, -1));

        label_id_expediente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_id_expediente.setForeground(new java.awt.Color(76, 76, 76));
        label_id_expediente.setText("ID EXPEDIENTE");
        getContentPane().add(label_id_expediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, -1, -1));

        label_altura.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_altura.setForeground(new java.awt.Color(76, 76, 76));
        label_altura.setText("ALTURA");
        getContentPane().add(label_altura, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 130, -1));

        label_nombre2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_nombre2.setForeground(new java.awt.Color(76, 76, 76));
        label_nombre2.setText(" kg");
        getContentPane().add(label_nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 70, 30));

        id.setBackground(new java.awt.Color(223, 223, 223));
        id.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id.setToolTipText("");
        id.setBorder(null);
        id.setDoubleBuffered(true);
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 200, 30));

        id_expediente.setBackground(new java.awt.Color(223, 223, 223));
        id_expediente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        id_expediente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id_expediente.setToolTipText("");
        id_expediente.setBorder(null);
        id_expediente.setDoubleBuffered(true);
        getContentPane().add(id_expediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 200, 30));

        altura.setBackground(new java.awt.Color(223, 223, 223));
        altura.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        altura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        altura.setToolTipText("");
        altura.setBorder(null);
        altura.setDoubleBuffered(true);
        getContentPane().add(altura, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 130, 30));

        peso.setBackground(new java.awt.Color(223, 223, 223));
        peso.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        peso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        peso.setToolTipText("");
        peso.setBorder(null);
        peso.setDoubleBuffered(true);
        getContentPane().add(peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 130, 30));

        padecimientos.setBackground(new java.awt.Color(223, 223, 223));
        padecimientos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        padecimientos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        padecimientos.setToolTipText("");
        padecimientos.setBorder(null);
        padecimientos.setDoubleBuffered(true);
        padecimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                padecimientosActionPerformed(evt);
            }
        });
        getContentPane().add(padecimientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, 220, 30));

        cirugias.setBackground(new java.awt.Color(223, 223, 223));
        cirugias.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cirugias.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cirugias.setToolTipText("");
        cirugias.setBorder(null);
        cirugias.setDoubleBuffered(true);
        cirugias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cirugiasActionPerformed(evt);
            }
        });
        getContentPane().add(cirugias, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 530, 300, 30));

        historia.setBackground(new java.awt.Color(223, 223, 223));
        historia.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        historia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        historia.setToolTipText("");
        historia.setBorder(null);
        historia.setDoubleBuffered(true);
        getContentPane().add(historia, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 610, 530, 30));

        buscar_historial.setBackground(new java.awt.Color(223, 223, 223));
        buscar_historial.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buscar_historial.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        buscar_historial.setToolTipText("");
        buscar_historial.setBorder(null);
        buscar_historial.setDoubleBuffered(true);
        getContentPane().add(buscar_historial, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 190, 200, 30));

        antidoping.setBackground(new java.awt.Color(204, 204, 204));
        antidoping.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        antidoping.setForeground(new java.awt.Color(76, 76, 76));
        antidoping.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Positivo", "Negativo" }));
        antidoping.setBorder(null);
        antidoping.setFocusable(false);
        antidoping.setLightWeightPopupEnabled(false);
        getContentPane().add(antidoping, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 140, 30));

        sangre.setBackground(new java.awt.Color(204, 204, 204));
        sangre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sangre.setForeground(new java.awt.Color(76, 76, 76));
        sangre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "O[+]", "O[-]", "A[+]", "A[-]", "B[+]", "B[-]", "AB[+]", "AB[-]" }));
        sangre.setBorder(null);
        sangre.setFocusable(false);
        sangre.setLightWeightPopupEnabled(false);
        getContentPane().add(sangre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 140, 30));

        tabla_alumnos.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        tabla_alumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ALTURA", "PESO", "TIPO SANGRE", "ALERGIAS", "ANTIDOPING", "PADECIMIENTOS", "CIRUGÍAS", "HISTORIA CLÍNICA FAMILIAR"
            }
        ));
        jScrollPane1.setViewportView(tabla_alumnos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 240, 690, 310));

        alergias.setBackground(new java.awt.Color(223, 223, 223));
        alergias.setColumns(20);
        alergias.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        alergias.setRows(5);
        alergias.setBorder(null);
        alergias.setCaretColor(new java.awt.Color(223, 223, 223));
        jScrollPane2.setViewportView(alergias);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 360, 120));

        registrar.setBackground(new java.awt.Color(255, 255, 255));
        registrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/registrar.png"))); // NOI18N
        registrar.setText("REGISTRAR");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        getContentPane().add(registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 660, 130, 40));

        buscar1.setBackground(new java.awt.Color(255, 255, 255));
        buscar1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        buscar1.setText("BUSCAR");
        buscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar1ActionPerformed(evt);
            }
        });
        getContentPane().add(buscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 660, 120, 40));

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

        cancelar.setBackground(new java.awt.Color(255, 255, 255));
        cancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        cancelar.setText("CANCELAR");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 660, 130, 40));

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

        modificar.setBackground(new java.awt.Color(255, 255, 255));
        modificar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/modificar.png"))); // NOI18N
        modificar.setText("MODIFICAR");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        getContentPane().add(modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 660, 130, 40));

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
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 750, 130, 40));

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

    private void padecimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_padecimientosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_padecimientosActionPerformed

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

    private void cirugiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cirugiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cirugiasActionPerformed

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
        new MenuExpediente().setVisible(true);
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
    private javax.swing.JTextArea alergias;
    private javax.swing.JTextField altura;
    private javax.swing.JComboBox<String> antidoping;
    private javax.swing.JButton back;
    private javax.swing.JButton buscar1;
    private javax.swing.JButton buscar2;
    private javax.swing.JTextField buscar_historial;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField cirugias;
    private javax.swing.JButton eliminar;
    private javax.swing.JMenu file;
    private javax.swing.JTextField historia;
    private javax.swing.JTextField id;
    private javax.swing.JTextField id_expediente;
    private javax.swing.JButton imprimir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label_alergias;
    private javax.swing.JLabel label_altura;
    private javax.swing.JLabel label_antidoping;
    private javax.swing.JLabel label_buscar;
    private javax.swing.JLabel label_cirugias;
    private javax.swing.JLabel label_historia;
    private javax.swing.JLabel label_id;
    private javax.swing.JLabel label_id_expediente;
    private javax.swing.JLabel label_line;
    private javax.swing.JLabel label_login;
    private javax.swing.JLabel label_logo;
    private javax.swing.JLabel label_nombre;
    private javax.swing.JLabel label_nombre2;
    private javax.swing.JLabel label_padecimientos;
    private javax.swing.JLabel label_peso;
    private javax.swing.JLabel label_sangre;
    private javax.swing.JMenuItem log_out;
    private javax.swing.JButton modificar;
    private javax.swing.JButton mostrar_todos;
    private javax.swing.JTextField padecimientos;
    private javax.swing.JTextField peso;
    private javax.swing.JButton registrar;
    private javax.swing.JComboBox<String> sangre;
    private javax.swing.JTable tabla_alumnos;
    // End of variables declaration//GEN-END:variables
}
