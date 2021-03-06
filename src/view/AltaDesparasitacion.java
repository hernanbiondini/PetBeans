/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AltaDesparasitacion.java
 *
 * Created on 15-sep-2012, 12:41:39
 */
package view;

import controller.DesparasitacionController;
import controller.MascotaController;
import java.awt.Color;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Desparasitacion;

/**
 *
 * @author admin
 */
public class AltaDesparasitacion extends javax.swing.JDialog {

    /**
     * Creates new form AltaDesparasitacion
     */
    public AltaDesparasitacion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public AltaDesparasitacion(java.awt.Frame parent, boolean modal, int id) throws Exception {
        super(parent, modal);
        this.setIde(id);
        initComponents();
        this.mascota1.setIdMascota(id);
        MascotaController.getInstance().llenarObjeto(this.mascota1);
        this.jLabel4.setVisible(false);
        this.jLabel11.setVisible(false);
        this.jDateChooser1.setDate(new Date());

    }

    public AltaDesparasitacion(java.awt.Frame parent, boolean modal, int id, Desparasitacion d) {
        super(parent, modal);
        try {
            initComponents();
            this.jDateChooser1.setDate(d.getFechaColocacion());
            this.jTextField1.setText(d.getNombreDesparasitante());
            this.setDesparasitacion1(d);
            this.jButton1.setText("Actualizar");
            this.setTitle("Actualizar Desparasitacion");
            this.setActualiza(true);
            this.jLabel4.setVisible(false);
            this.jLabel11.setVisible(false);
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        mascota1 = new model.Mascota();
        desparasitacion1 = new model.Desparasitacion();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser("dd/MM/yyyy","##-##-####",'-');
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cargar desparacitación");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagenes/disk.png"))); // NOI18N
        jButton1.setText("Guardar");
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagenes/close_16.png"))); // NOI18N
        jButton2.setText("Atras");
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField1.setName("jTextField1"); // NOI18N

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, desparasitacion1, org.jdesktop.beansbinding.ELProperty.create("${nombreDesparasitante}"), jTextField1, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel1.setText("Nombre del desparasitante:");
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel2.setText("Fecha de colocacion:");
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("Ingrese nombre del desparasitante!");
        jLabel4.setName("jLabel4"); // NOI18N

        jDateChooser1.setName("jDateChooser1");

        jLabel11.setForeground(new java.awt.Color(204, 0, 0));
        jLabel11.setText("Fecha inválida");
        jLabel11.setName("jLabel11");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1)
                        .addGap(56, 56, 56))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11)))
                        .addContainerGap(109, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addGap(45, 45, 45))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(30, 30, 30))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    if (this.jTextField1.getText().trim().equalsIgnoreCase("")) {
        this.jLabel4.setVisible(true);
        jTextField1.requestFocusInWindow();
    } else {
        if (this.fechaValida() == false) {
            this.jLabel11.setVisible(true);
            this.jDateChooser1.requestFocusInWindow();
        } else {
            if (this.actualiza) {
                try {
                    desparasitacion1.setMascota(this.mascota1);
                    desparasitacion1.setFechaColocacion(jDateChooser1.getDate());
                    desparasitacion1.setProximaColocacion(DesparasitacionController.getInstance().calcularProximaColocacion(desparasitacion1.getFechaColocacion()));
                    desparasitacion1.setNombreDesparasitante(this.jTextField1.getText());
                    DesparasitacionController.getInstance().actualizar(desparasitacion1);
                    //JOptionPane.showMessageDialog(this, "La desparasitacion se actualizo exitosamente", "Actualizar", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                try {
                    desparasitacion1.setMascota(this.mascota1);
                    desparasitacion1.setNombreDesparasitante(jTextField1.getText());
                    desparasitacion1.setFechaColocacion(jDateChooser1.getDate());
                    desparasitacion1.setProximaColocacion(DesparasitacionController.getInstance().calcularProximaColocacion(desparasitacion1.getFechaColocacion()));
                    DesparasitacionController.getInstance().guardar(desparasitacion1);
                    //JOptionPane.showMessageDialog(this, "La desparasitacion se creo exitosamente", "Guardar", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                } finally {
                    this.jTextField1.setText("");
                    this.jLabel4.setVisible(false);
                    this.jLabel11.setVisible(false);
                }
            }
        }
    }
}//GEN-LAST:event_jButton1ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    this.dispose();
}//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(AltaDesparasitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaDesparasitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaDesparasitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaDesparasitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the dialog
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                AltaDesparasitacion dialog = new AltaDesparasitacion(new javax.swing.JFrame(), true);
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
    private model.Desparasitacion desparasitacion1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private model.Mascota mascota1;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
    private int ide;

    public int getIde() {
        return ide;
    }

    public void setIde(int ide) {
        this.ide = ide;
    }
    private boolean actualiza;

    public boolean isActualiza() {
        return actualiza;
    }

    public void setActualiza(boolean actualiza) {
        this.actualiza = actualiza;
    }

    public Desparasitacion getDesparasitacion1() {
        return desparasitacion1;
    }

    public void setDesparasitacion1(Desparasitacion desparasitacion1) {
        this.desparasitacion1 = desparasitacion1;
    }

    public boolean fechaValida() {
        if (this.jLabel11.getText().trim().equalsIgnoreCase("")) {

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
