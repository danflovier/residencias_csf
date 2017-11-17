/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package residencias;

import java.awt.Color;
import java.awt.Component;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;

/**
 *
 * @author danflovier
 */
public class Asistencias extends javax.swing.JFrame {
     private static final int BOOLEAN_COLUMN = 2;
     
    public Asistencias() {
        initComponents();
        
        // Set a background color to the JFrame
        this.getContentPane().setBackground(new Color(255,255,255));
        
        //this.add( new Asistencias() );
        
        DefaultTableModel model;
        model = (DefaultTableModel)tabla_alumnos.getModel();
        model.addTableModelListener(new CheckBoxModelListener());
        
        
     /*   tabla_alumnos.setDefaultRenderer(Object.class, new TableCellRenderer(){
            private DefaultTableCellRenderer DEFAULT_RENDERER =  new DefaultTableCellRenderer();

            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = DEFAULT_RENDERER.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                String s = table.getColumnName(2);
                //System.out.print(s);
                if(isSelected){
                    if(column==0 && row >=0)
                    c.setBackground(Color.YELLOW);
                }
                else
                    c.setBackground(Color.WHITE);

       //Add below code here
                return c;
            }

        });*/
        
     /*
        for(int i=0;i<model.getRowCount();i++){
            System.out.println("ASISTENCIA: " + model.getValueAt(i,2));
            if ((Boolean)model.getValueAt(i,2) == false){  
                System.out.println("ENTRÉ");
      
                break;
            }
     
        }*/
        
        //tabla_alumnos.getModel().addTableModelListener(new CheckBoxModelListener());
        
        
        
    }
    public class CheckTableModelListener extends DefaultTableCellRenderer {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            c.setBackground(row % 2 == 0 ? Color.BLACK : Color.WHITE);
            
            return c;
        }
    }
    
    public class CheckBoxModelListener implements TableModelListener {
        int row;
        int column;
        DefaultTableModel model;
        String columnName;
        
        public void tableChanged(TableModelEvent e) {
            row = e.getFirstRow();
            column = e.getColumn();
          
            
            //if (column == BOOLEAN_COLUMN) {
                model = (DefaultTableModel) e.getSource();
                columnName = model.getColumnName(column);
                Boolean checked = (Boolean) model.getValueAt(row, column);
                if (checked) {
                    System.out.println(model.getValueAt(row, 1) + ": " + true);
                    
                    /*
                    tabla_alumnos.setDefaultRenderer(Object.class, new TableCellRenderer(){
                    private DefaultTableCellRenderer DEFAULT_RENDERER =  new DefaultTableCellRenderer();

                    @Override
                    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                            Component c = DEFAULT_RENDERER.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                            String s = table.getColumnName(2);
                            //System.out.print(s);
                            c.setForeground(Color.BLACK);
                            c.setBackground(Color.GREEN);
                            //Add below code here
                            return c;
                        }
                    });*/
                    
                } else {
                    System.out.println(model.getValueAt(row, 1) + ": " + false);
                    
                    /*
                    tabla_alumnos.setDefaultRenderer(Object.class, new TableCellRenderer(){
                    private DefaultTableCellRenderer DEFAULT_RENDERER =  new DefaultTableCellRenderer();
                    @Override
                    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                            Component c = DEFAULT_RENDERER.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                            String s = table.getColumnName(2);
                            //System.out.print(s);
                            c.setForeground(Color.BLACK);
                            c.setBackground(Color.RED);
                            //Add below code here
                            return c;
                        }
                    });*/
                }
            //}
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

        label_login = new javax.swing.JLabel();
        label_residencias = new javax.swing.JLabel();
        label_logo = new javax.swing.JLabel();
        label_line = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_alumnos = new javax.swing.JTable();
        registrar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Residencias Santa Fe | Alumnos");
        setBackground(new java.awt.Color(33, 150, 243));
        setIconImage(new ImageIcon(getClass().getResource("/img/icon.png")).getImage());
        setMaximumSize(null);
        setPreferredSize(new java.awt.Dimension(1500, 800));
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
        getContentPane().add(label_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 670, 180, 70));

        label_line.setBackground(new java.awt.Color(250, 197, 28));
        label_line.setForeground(new java.awt.Color(3, 169, 244));
        label_line.setOpaque(true);
        getContentPane().add(label_line, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 500, 10));

        tabla_alumnos.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        tabla_alumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"jojo", "jeje", null, null},
                {"Prueba", "prueba", null, null},
                {"A01023226", "Daniela",  new Boolean(false), null}
            },
            new String [] {
                "MATRÍCULA", "NOMBRE", "ASISTENCIA", "MOTIVO AUSENCIA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
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

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registrarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // TODO add your handling code here:
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
    private javax.swing.JButton cancelar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_line;
    private javax.swing.JLabel label_login;
    private javax.swing.JLabel label_logo;
    private javax.swing.JLabel label_residencias;
    private javax.swing.JButton registrar;
    private javax.swing.JTable tabla_alumnos;
    // End of variables declaration//GEN-END:variables
}