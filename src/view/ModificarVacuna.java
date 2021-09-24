/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
 * ModificarVacuna.java
 *
 * Created on 13-oct-2011, 4:34:08
 */
package view;

import controller.VacunaAnualController;
import controller.VacunaRefuerzoController;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.VacunaAnual;
import model.VacunaRefuerzo;

/**
 *
 * @author admin
 */
public class ModificarVacuna extends javax.swing.JDialog {

    /**
     * Creates new form ModificarVacuna
     */
    public ModificarVacuna(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public ModificarVacuna(java.awt.Frame parent, boolean modal, int id, VacunaRefuerzo v) {
        super(parent, modal);
        try {
            initComponents();
            this.jTextField1.setText(v.getNombreVacuna());
            this.jDateChooser1.setDate(v.getFechaColocacion());
            this.setVacunaRefuerzo1(v);
            this.setTitle("Actualizar Vacuna");
            this.jLabel4.setVisible(false);
            this.jLabel11.setVisible(false);

        } catch (Exception ex) {
            Logger.getLogger(AltaVisitas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ModificarVacuna(java.awt.Frame parent, boolean modal, int id, VacunaAnual v) {
        super(parent, modal);
        try {
            initComponents();
            this.jTextField1.setText(v.getNombreVacuna());
            this.jDateChooser1.setDate(v.getFechaColocacion());
            this.setVacunaAnual1(v);
            this.setTitle("Actualizar");
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

        vacunaRefuerzo1 = new model.VacunaRefuerzo();
        vacunaAnual1 = new model.VacunaAnual();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser("dd/MM/yyyy","##-##-####",'-');
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modificar Vacuna");
        setResizable(false);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagenes/close_16.png"))); // NOI18N
        jButton2.setText("Atras");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagenes/disk.png"))); // NOI18N
        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Fecha de colocacion:");

        jLabel1.setText("Nombre de la vacuna:");

        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("Ingrese nombre de la vacuna!");

        jLabel11.setForeground(new java.awt.Color(204, 0, 0));
        jLabel11.setText("Fecha inválida");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//                vacuna1.setMascota(this.mascota1);

        if (this.jTextField1.getText().trim().equalsIgnoreCase("")) {
            this.jLabel4.setVisible(true);
            jTextField1.requestFocusInWindow();
        } else {
            if (this.fechaValida() == false) {
                this.jLabel11.setVisible(true);
                this.jDateChooser1.requestFocusInWindow();
            } else {
                try {
                    if (ABMVacunas.flag == "1") {
                        vacunaRefuerzo1.setNombreVacuna(jTextField1.getText());
                        vacunaRefuerzo1.setFechaColocacion(jDateChooser1.getDate());
                        VacunaRefuerzoController.getInstance().actualizar(vacunaRefuerzo1);
                    } else {
                        vacunaAnual1.setNombreVacuna(jTextField1.getText());
                        vacunaAnual1.setFechaColocacion(jDateChooser1.getDate());
                        VacunaAnualController.getInstance().actualizar(vacunaAnual1);
                    }
                } catch (Exception ex) {
                    Logger.getLogger(ModificarVacuna.class.getName()).log(Level.SEVERE, null, ex);
                }
                //JOptionPane.showMessageDialog(this, "La vacuna se actualizo exitosamente", "Actualizar", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            }
        }
}//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                ModificarVacuna dialog = new ModificarVacuna(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private model.VacunaAnual vacunaAnual1;
    private model.VacunaRefuerzo vacunaRefuerzo1;
    // End of variables declaration//GEN-END:variables

    public VacunaRefuerzo getVacunaRefuerzo1() {
        return vacunaRefuerzo1;
    }

    public void setVacunaRefuerzo1(VacunaRefuerzo vacunaRefuerzo1) {
        this.vacunaRefuerzo1 = vacunaRefuerzo1;
    }

    public VacunaAnual getVacunaAnual1() {
        return vacunaAnual1;
    }

    public void setVacunaAnual1(VacunaAnual vacunaAnual1) {
        this.vacunaAnual1 = vacunaAnual1;
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
