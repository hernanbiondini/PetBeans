/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AltaNota.java
 *
 * Created on 04-oct-2012, 14:12:01
 */
package view;

import controller.NotaController;
import java.awt.Color;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Nota;

/**
 *
 * @author admin
 */
public class AltaNota extends javax.swing.JDialog {

    /**
     * Creates new form AltaNota
     */
    public AltaNota(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.jLabel4.setVisible(false);
        this.jLabel13.setVisible(false);
        this.jDateChooser1.setDate(new Date());
    }

    public AltaNota(java.awt.Frame parent, boolean modal, Nota n) {
        super(parent, modal);
        try {
            initComponents();
            this.jDateChooser1.setDate(n.getFechaNota());
            this.jTextField1.setText(n.getTitulo());
            this.jTextArea1.setText(n.getDescripcion());
            this.setNota1(n);
            this.jButton1.setText("Actualizar");
            this.setTitle("Actualizar Nota");
            this.setActualiza(true);
            this.jLabel4.setVisible(false);
            this.jLabel13.setVisible(false);
        } catch (Exception ex) {
            Logger.getLogger(AltaVisitas.class.getName()).log(Level.SEVERE, null, ex);
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

        nota1 = new model.Nota();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser("dd/MM/yyyy","##-##-####",'-');
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 300));

        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("Ingrese el titulo de la nota!");
        jLabel4.setName("jLabel4"); // NOI18N

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagenes/close_16.png"))); // NOI18N
        jButton2.setText("Cerrar");
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField1.setName("jTextField1"); // NOI18N

        jLabel1.setText("Titulo:");
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel2.setText("Fecha:");
        jLabel2.setName("jLabel2"); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagenes/disk.png"))); // NOI18N
        jButton1.setText("Guardar");
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setName("jTextArea1"); // NOI18N
        jScrollPane1.setViewportView(jTextArea1);

        jLabel3.setText("Descripcion:");
        jLabel3.setName("jLabel3"); // NOI18N

        jDateChooser1.setName("jDateChooser1");

        jLabel13.setForeground(new java.awt.Color(204, 0, 0));
        jLabel13.setText("Fecha inválida");
        jLabel13.setName("jLabel13");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel4)
                                .addGap(116, 116, 116))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(jLabel13)
                                        .addGap(73, 73, 73))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField1)
                                        .addComponent(jScrollPane1))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    this.dispose();
}//GEN-LAST:event_jButton2ActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    if (this.jTextField1.getText().trim().equalsIgnoreCase("")) {
        this.jLabel4.setVisible(true);
        jTextField1.requestFocusInWindow();
    } else {
        if (this.fechaValida() == false) {
            this.jLabel13.setVisible(true);
            this.jDateChooser1.requestFocusInWindow();
        } else {
            if (this.actualiza) {
                try {
                    nota1.setFechaNota(jDateChooser1.getDate());
                    nota1.setTitulo(this.jTextField1.getText());
                    nota1.setDescripcion(this.jTextArea1.getText());
                    NotaController.getInstance().actualizar(nota1);
                    //JOptionPane.showMessageDialog(this, "La nota se actualizo exitosamente", "Actualizar", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                try {
                    nota1.setFechaNota(jDateChooser1.getDate());
                    nota1.setTitulo(this.jTextField1.getText());
                    nota1.setDescripcion(this.jTextArea1.getText());
                    NotaController.getInstance().guardar(nota1);
                    // JOptionPane.showMessageDialog(this, "La nota se creo exitosamente", "Guardar", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                } finally {
                    this.jTextField1.setText("");
                    this.jTextArea1.setText("");
                    this.jLabel4.setVisible(false);
                    this.jLabel13.setVisible(false);
                }
            }




        }
    }
}//GEN-LAST:event_jButton1ActionPerformed
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;


                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AltaNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the dialog
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                AltaNota dialog = new AltaNota(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private model.Nota nota1;
    // End of variables declaration//GEN-END:variables
    private boolean actualiza;

    public boolean isActualiza() {
        return actualiza;
    }

    public void setActualiza(boolean actualiza) {
        this.actualiza = actualiza;
    }

    public Nota getNota1() {
        return nota1;
    }

    public void setNota1(Nota nota1) {
        this.nota1 = nota1;
    }

    public boolean fechaValida() {
        if (this.jLabel13.getText().trim().equalsIgnoreCase("")) {

            return true;
        } else {
            if (Color.RED == this.jDateChooser1.getDateEditor().getUiComponent().getForeground()) {
                return false;
            } else {
                return true;
            }

        }

    }
}
