/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package residencias;

import java.awt.Color;
import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author danflovier
 */
public class UsoJTable extends javax.swing.JFrame {

    /**
     * Creates new form UsoJTable
     */
    public UsoJTable() {
        initComponents();
        setLocationRelativeTo(null);//Centrar formulario
        inicio();//Método de inicio
    }
    private DefaultTableModel model;//Modelo para tabla
    private int sel;//Variable para obtener fila seleccionada de tabla.
    
    private void inicio(){ 
        //Método para configurar el DefaultTableModel de la tabla.
        //Especificamos el tamaño de cada columna
        jTb.getColumnModel().getColumn(0).setPreferredWidth(100);
        jTb.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTb.getColumnModel().getColumn(2).setPreferredWidth(50);
        jTb.getColumnModel().getColumn(3).setPreferredWidth(100);
        jTb.getColumnModel().getColumn(4).setPreferredWidth(100);
        
        //Indicamos el DefaultTableModel de nuestra tabla
        model = (DefaultTableModel) jTb.getModel();
        //Indicamos el número de filas
        model.setNumRows(0);        
    } 
    
    //Método para agregar datos a la tabla.
    private void agregar(){
        //También mostramos como agregar un JCheckBox a la tabla
        JCheckBox check = new JCheckBox();
        //Comprobamos que los campos de datos no esten vacíos
        if(!edad.getText().isEmpty() || !apellido.getText().isEmpty() ||
                !edad.getText().isEmpty() || !profesion.getText().isEmpty()){ 
            //Utilizamos un boolean para obtener el valor del combo.
            boolean rp = casado.getSelectedItem().toString().equals("Sí");  
            //Utilizamos try para la controlar posibles errores de conversión.
            try {
                //Convertimos en entero lo obtenido del campo edad.
                int edd = Integer.parseInt(edad.getText());
                //agregamos los datos a la tabla utilizando Object[]
                model.addRow(new Object[]{
                    edad.getText(),apellido.getText(),edd, profesion.getText(),rp
                }); 
                limpiar();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Edad debe ser numérico");
            }
            
        }
        //Agregamos el JCheckBox utilizando CellEditor y la clase CellRenderer creado más abajo
        jTb.getColumnModel().getColumn(4).setCellEditor(new DefaultCellEditor(check));
        jTb.getColumnModel().getColumn(4).setCellRenderer(new Render_CheckBox());
    }
    //Método para obtener la fila seleccionada de la tabla
    private void seleccion(){
        if(jTb.getRowCount() > 0 ){
            sel = jTb.getSelectedRow();
        }
    }
    //Método para obtener la fila seleccionada de la tabla.
    private void eliminar(){
        if(sel >= 0){
            model.removeRow(sel);
            sel = -1;
        }
        else{
            JOptionPane.showMessageDialog(null, "Selecciona una fila.");
        }
    }
    
    //Método para limpiar campos después de agregar los datos a la tabla
    private void limpiar(){
        edad.setText(null);
        apellido.setText(null);
        edad.setText(null);
        profesion.setText(null);
        casado.setSelectedIndex(-1);
    }
    //Clase para manejar el TableCellRenderer, que permitirá mostrar el JCheckBox
    class Render_CheckBox extends JCheckBox implements TableCellRenderer {
    //
        private final JComponent component = new JCheckBox();

        /** Constructor de clase */
        public Render_CheckBox() {
            setOpaque(true);
    }
       

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
          
           //Color de fondo de la celda
          ( (JCheckBox) component).setBackground( Color.GREEN);
          return ( (JCheckBox) component);
          
        }
        
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        edad = new javax.swing.JTextField();
        nombre1 = new javax.swing.JTextField();
        profesion = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        casado = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTb = new javax.swing.JTable();
        agregar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        seleccionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        edad.setBackground(new java.awt.Color(223, 223, 223));
        edad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        edad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        edad.setToolTipText("");
        edad.setBorder(null);
        edad.setDoubleBuffered(true);
        edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edadActionPerformed(evt);
            }
        });

        nombre1.setBackground(new java.awt.Color(223, 223, 223));
        nombre1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nombre1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombre1.setToolTipText("");
        nombre1.setBorder(null);
        nombre1.setDoubleBuffered(true);
        nombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre1ActionPerformed(evt);
            }
        });

        profesion.setBackground(new java.awt.Color(223, 223, 223));
        profesion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        profesion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        profesion.setToolTipText("");
        profesion.setBorder(null);
        profesion.setDoubleBuffered(true);
        profesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profesionActionPerformed(evt);
            }
        });

        apellido.setBackground(new java.awt.Color(223, 223, 223));
        apellido.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        apellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        apellido.setToolTipText("");
        apellido.setBorder(null);
        apellido.setDoubleBuffered(true);
        apellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                apellidouserIsMouseExited(evt);
            }
        });
        apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoActionPerformed(evt);
            }
        });

        casado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Sí", "No" }));

        jTb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Edad", "Profesión", "Casado/a"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTb);

        agregar.setText("jButton1");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        eliminar.setText("jButton1");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        seleccionar.setText("jButton1");
        seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profesion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(casado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eliminar)
                            .addComponent(agregar)
                            .addComponent(seleccionar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(77, 77, 77)
                    .addComponent(nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(622, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(profesion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(casado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agregar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seleccionar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(106, 106, 106)
                    .addComponent(nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(301, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edadActionPerformed

    private void nombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre1ActionPerformed

    private void profesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_profesionActionPerformed

    private void apellidouserIsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apellidouserIsMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidouserIsMouseExited

    private void apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
    agregar();
    }//GEN-LAST:event_agregarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
    eliminar();        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarActionPerformed

    private void seleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarActionPerformed
    seleccion();        // TODO add your handling code here:
    }//GEN-LAST:event_seleccionarActionPerformed

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
            java.util.logging.Logger.getLogger(UsoJTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsoJTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsoJTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsoJTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsoJTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JTextField apellido;
    private javax.swing.JComboBox<String> casado;
    private javax.swing.JTextField edad;
    private javax.swing.JButton eliminar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTb;
    private javax.swing.JTextField nombre1;
    private javax.swing.JTextField profesion;
    private javax.swing.JButton seleccionar;
    // End of variables declaration//GEN-END:variables
}