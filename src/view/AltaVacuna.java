/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AltaVacuna.java
 *
 * Created on 11-oct-2011, 1:24:16
 */
package view;

import controller.MascotaController;
import controller.VacunaAnualController;
import controller.VacunaRefuerzoController;
import java.awt.Color;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class AltaVacuna extends javax.swing.JDialog {

    /**
     * Creates new form AltaVacuna
     */
    public AltaVacuna(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public AltaVacuna(java.awt.Frame parent, boolean modal, int id) throws Exception {
        super(parent, modal);
        this.setIde(id);
        initComponents();
        System.out.println(id);
        this.mascota1.setIdMascota(id);
        MascotaController.getInstance().llenarObjeto(this.mascota1);
        this.jLabel4.setVisible(false);
        this.jLabel11.setVisible(false);
        this.jDateChooser1.setDate(new Date());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mascota1 = new model.Mascota();
        vacunaAnual1 = new model.VacunaAnual();
        vacunaRefuerzo1 = new model.VacunaRefuerzo();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser("dd/MM/yyyy","##-##-####",'-');
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cargar Vacuna");
        setResizable(false);

        jLabel1.setText("Nombre de la vacuna:");

        jLabel2.setText("Fecha de colocacion:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagenes/disk.png"))); // NOI18N
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagenes/close_16.png"))); // NOI18N
        jButton2.setText("Cerrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Tipo:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Con Refuerzo", "Anual" }));

        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("Ingrese nombre de la vacuna!");

        jLabel11.setForeground(new java.awt.Color(204, 0, 0));
        jLabel11.setText("Fecha inválida");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(9, 9, 9))
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11))
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(24, 24, 24))))
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
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

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
                if (jComboBox1.getSelectedItem() == "Anual") {
                    try {
                        vacunaAnual1.setMascota(this.mascota1);
                        vacunaAnual1.setNombreVacuna(jTextField1.getText());
                        vacunaAnual1.setFechaColocacion(jDateChooser1.getDate());
                        vacunaAnual1.setProximaColocacion(VacunaAnualController.getInstance().calcularProximaColocacion(vacunaAnual1.getFechaColocacion()));
                        VacunaAnualController.getInstance().guardar(vacunaAnual1);
                        //JOptionPane.showMessageDialog(this, "La vacuna anual se creo exitosamente", "Guardar", JOptionPane.INFORMATION_MESSAGE);
                        this.dispose();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    } finally {
                        this.jTextField1.setText("");
                    }
                } else {
                    try {
                        vacunaRefuerzo1.setMascota(this.mascota1);
                        vacunaRefuerzo1.setNombreVacuna(jTextField1.getText());
                        vacunaRefuerzo1.setFechaColocacion(jDateChooser1.getDate());
                        vacunaRefuerzo1.setProxColPrimerRef(VacunaRefuerzoController.getInstance().calcularPrimerRefuerzo(vacunaRefuerzo1.getFechaColocacion()));
                        vacunaRefuerzo1.setProxColSegundoRef(VacunaRefuerzoController.getInstance().calcularSegundoRefuerzo(vacunaRefuerzo1.getFechaColocacion()));
                        vacunaRefuerzo1.setProxColTercerRef(VacunaRefuerzoController.getInstance().calcularTercerRefuerzo(vacunaRefuerzo1.getFechaColocacion()));
                        VacunaRefuerzoController.getInstance().guardar(vacunaRefuerzo1);
                        //JOptionPane.showMessageDialog(this, "La vacuna refuerzo se creo exitosamente", "Guardar", JOptionPane.INFORMATION_MESSAGE);
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
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                AltaVacuna dialog = new AltaVacuna(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private model.Mascota mascota1;
    private model.VacunaAnual vacunaAnual1;
    private model.VacunaRefuerzo vacunaRefuerzo1;
    // End of variables declaration//GEN-END:variables
    private int ide;

    public int getIde() {
        return ide;
    }

    public void setIde(int ide) {
        this.ide = ide;
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