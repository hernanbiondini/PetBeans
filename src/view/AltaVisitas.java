/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AltaVisitas.java
 *
 * Created on 05-oct-2011, 21:25:14
 */
package view;

import controller.MascotaController;
import controller.VisitaController;
import java.awt.Color;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Visita;

/**
 *
 * @author admin
 */
public class AltaVisitas extends javax.swing.JDialog {

    /**
     * Creates new form AltaVisitas
     */
    public AltaVisitas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.jDateChooser1.setDate(new Date());
        this.jLabel29.setVisible(false);
    }

    public AltaVisitas(java.awt.Frame parent, boolean modal, int id) {
        super(parent, modal);
        try {
            initComponents();
            this.mascota1.setIdMascota(id);
            MascotaController.getInstance().llenarObjeto(this.mascota1);
            this.jLabel29.setVisible(false);
            this.jDateChooser1.setDate(new Date());
        } catch (Exception ex) {
            Logger.getLogger(AltaVisitas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

//    Constructor para actualizar
    public AltaVisitas(java.awt.Frame parent, boolean modal, int id, Visita v) {
        super(parent, modal);
        try {
            initComponents();
            this.jDateChooser1.setDate(v.getFecha());
            this.jComboBox1.setSelectedItem(v.getAspectogeneral());
            this.jComboBox2.setSelectedItem(v.getGangliosLinfaticos());
            this.jComboBox3.setSelectedItem(v.getRespiratorio());
            this.jComboBox4.setSelectedItem(v.getCirculatorio());
            this.jComboBox5.setSelectedItem(v.getMusculoEsqueletico());
            this.jComboBox6.setSelectedItem(v.getDigestivo());
            this.jComboBox7.setSelectedItem(v.getOjos());
            this.jComboBox8.setSelectedItem(v.getPiel());
            this.jComboBox9.setSelectedItem(v.getMucosas());
            this.jComboBox10.setSelectedItem(v.getOidos());
            this.jComboBox11.setSelectedItem(v.getGenitoUrinario());
            this.jComboBox12.setSelectedItem(v.getSistemaNervioso());
            this.jComboBox13.setSelectedItem(v.getTipoPeso());
            this.jTextField1.setText(v.getPeso());
            this.jTextField5.setText(v.getTemperatura());
            this.jTextField6.setText(v.getFr());
            this.jTextField7.setText(v.getFc());
            this.jTextField8.setText(v.getHidratacion());
            this.jTextField9.setText(v.getAntecedentesMedicos());
            this.jTextField11.setText(v.getAntecedentesQuirurgicos());
            this.jTextField12.setText(v.getAntecedentesTraumatologicos());
            this.jTextField13.setText(v.getDesparasitaciones());
            this.jTextArea4.setText(v.getAnormalidades());
            this.jTextArea6.setText(v.getTratamiento());
            this.jTextArea7.setText(v.getMotivoConsulta());
            this.jTextArea8.setText(v.getAntecedentesEnfermedad());
            this.jTextArea9.setText(v.getAmbientales());
            this.jTextArea10.setText(v.getDiagnostico());
            this.jTextArea11.setText(v.getObservaciones());
            this.setVisita1(v);
            this.jButton1.setText("Actualizar datos");
            this.setTitle("Actualizar Visita");
            this.setActualiza(true);
            this.jLabel29.setVisible(false);
        } catch (Exception ex) {
            Logger.getLogger(AltaVisitas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //    Constructor para visualizar
    public AltaVisitas(java.awt.Frame parent, boolean modal, int id, Visita v, boolean visu) {
        super(parent, modal);
        try {
            initComponents();
            this.jDateChooser1.setDate(v.getFecha());
            this.jComboBox1.setSelectedItem(v.getAspectogeneral());
            this.jComboBox2.setSelectedItem(v.getGangliosLinfaticos());
            this.jComboBox3.setSelectedItem(v.getRespiratorio());
            this.jComboBox4.setSelectedItem(v.getCirculatorio());
            this.jComboBox5.setSelectedItem(v.getMusculoEsqueletico());
            this.jComboBox6.setSelectedItem(v.getDigestivo());
            this.jComboBox7.setSelectedItem(v.getOjos());
            this.jComboBox8.setSelectedItem(v.getPiel());
            this.jComboBox9.setSelectedItem(v.getMucosas());
            this.jComboBox10.setSelectedItem(v.getOidos());
            this.jComboBox11.setSelectedItem(v.getGenitoUrinario());
            this.jComboBox12.setSelectedItem(v.getSistemaNervioso());
            this.jComboBox13.setSelectedItem(v.getTipoPeso());
            this.jTextField1.setText(v.getPeso());
            this.jTextField5.setText(v.getTemperatura());
            this.jTextField6.setText(v.getFr());
            this.jTextField7.setText(v.getFc());
            this.jTextField8.setText(v.getHidratacion());
            this.jTextField9.setText(v.getAntecedentesMedicos());
            this.jTextField11.setText(v.getAntecedentesQuirurgicos());
            this.jTextField12.setText(v.getAntecedentesTraumatologicos());
            this.jTextField13.setText(v.getDesparasitaciones());
            this.jTextArea4.setText(v.getAnormalidades());
            this.jTextArea6.setText(v.getTratamiento());
            this.jTextArea7.setText(v.getMotivoConsulta());
            this.jTextArea8.setText(v.getAntecedentesEnfermedad());
            this.jTextArea9.setText(v.getAmbientales());
            this.jTextArea10.setText(v.getDiagnostico());
            this.jTextArea11.setText(v.getObservaciones());
            this.setVisita1(v);
            this.jButton1.setVisible(false);
            this.setTitle("Visualizar visita");
            this.setActualiza(true);
            this.jDateChooser1.setEnabled(false);
            this.jComboBox1.setEnabled(false);
            this.jComboBox2.setEnabled(false);
            this.jComboBox3.setEnabled(false);
            this.jComboBox4.setEnabled(false);
            this.jComboBox5.setEnabled(false);
            this.jComboBox6.setEnabled(false);
            this.jComboBox7.setEnabled(false);
            this.jComboBox8.setEnabled(false);
            this.jComboBox9.setEnabled(false);
            this.jComboBox10.setEnabled(false);
            this.jComboBox11.setEnabled(false);
            this.jComboBox12.setEnabled(false);
            this.jComboBox13.setEnabled(false);
            this.jTextField1.setEnabled(false);
            this.jTextField5.setEnabled(false);
            this.jTextField6.setEnabled(false);
            this.jTextField7.setEnabled(false);
            this.jTextField8.setEnabled(false);
            this.jTextField9.setEnabled(false);
            this.jTextField11.setEnabled(false);
            this.jTextField12.setEnabled(false);
            this.jTextField13.setEnabled(false);
            this.jTextArea4.setEnabled(false);
            this.jTextArea6.setEnabled(false);
            this.jTextArea7.setEnabled(false);
            this.jTextArea8.setEnabled(false);
            this.jTextArea9.setEnabled(false);
            this.jTextArea10.setEnabled(false);
            this.jTextArea11.setEnabled(false);

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

        visita1 = new model.Visita();
        mascota1 = new model.Mascota();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanelNuevaAnamnesis = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox();
        jComboBox6 = new javax.swing.JComboBox();
        jComboBox7 = new javax.swing.JComboBox();
        jComboBox8 = new javax.swing.JComboBox();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jComboBox9 = new javax.swing.JComboBox();
        jComboBox10 = new javax.swing.JComboBox();
        jComboBox11 = new javax.swing.JComboBox();
        jComboBox12 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBox13 = new javax.swing.JComboBox();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser("dd/MM/yyyy","##-##-####",'-');
        jLabel4 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextArea10 = new javax.swing.JTextArea();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jLabel41 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTextArea11 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jLabel33 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextArea9 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cargar Visita");
        setResizable(false);

        jTabbedPane1.setMinimumSize(new java.awt.Dimension(807, 654));

        jPanelNuevaAnamnesis.setBorder(javax.swing.BorderFactory.createTitledBorder("Visita"));
        jPanelNuevaAnamnesis.setAutoscrolls(true);
        jPanelNuevaAnamnesis.setInheritsPopupMenu(true);
        jPanelNuevaAnamnesis.setMaximumSize(new java.awt.Dimension(1024, 900));
        jPanelNuevaAnamnesis.setMinimumSize(new java.awt.Dimension(1024, 900));
        jPanelNuevaAnamnesis.setPreferredSize(new java.awt.Dimension(800, 650));
        jPanelNuevaAnamnesis.setRequestFocusEnabled(false);

        jLabel9.setText("Temperatura:");

        jLabel10.setText("F.C:");

        jLabel11.setText("F.R:");

        jLabel12.setText("Hidrat.:");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, visita1, org.jdesktop.beansbinding.ELProperty.create("${temperatura}"), jTextField5, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, visita1, org.jdesktop.beansbinding.ELProperty.create("${fr}"), jTextField6, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel14.setText("ºC");

        jLabel15.setText("/min.");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, visita1, org.jdesktop.beansbinding.ELProperty.create("${fc}"), jTextField7, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, visita1, org.jdesktop.beansbinding.ELProperty.create("${hidratacion}"), jTextField8, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel16.setText("Aspecto general");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Normal", "Anormal" }));

        jLabel17.setText("Ganglios linfáticos");

        jLabel18.setText("Respiratorio");

        jLabel19.setText("Circulatorio");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Normal", "Anormal" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Normal", "Anormal" }));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Normal", "Anormal" }));

        jLabel20.setText("Piel");

        jLabel21.setText("Ojos");

        jLabel22.setText("Digestivo");

        jLabel23.setText("Músculo-esquelético");

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Normal", "Anormal" }));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Normal", "Anormal" }));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Normal", "Anormal" }));

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Normal", "Anormal" }));

        jLabel24.setText("Mucosas");

        jLabel25.setText("Oidos");

        jLabel26.setText("Genito-urinario");

        jLabel27.setText("Sistema nervioso");

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Normal", "Anormal" }));

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Normal", "Anormal" }));

        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Normal", "Anormal" }));

        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Normal", "Anormal" }));

        jLabel1.setText("Peso:");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, visita1, org.jdesktop.beansbinding.ELProperty.create("${peso}"), jTextField1, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel2.setText("Tipo:");

        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Real", "Estimado" }));

        jLabel28.setText("Descripción de anormalidades:");

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, visita1, org.jdesktop.beansbinding.ELProperty.create("${anormalidades}"), jTextArea4, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jScrollPane6.setViewportView(jTextArea4);

        jLabel3.setText("Kg");

        jLabel4.setText("Fecha");

        jLabel29.setForeground(new java.awt.Color(204, 0, 0));
        jLabel29.setText("Fecha inválida");

        javax.swing.GroupLayout jPanelNuevaAnamnesisLayout = new javax.swing.GroupLayout(jPanelNuevaAnamnesis);
        jPanelNuevaAnamnesis.setLayout(jPanelNuevaAnamnesisLayout);
        jPanelNuevaAnamnesisLayout.setHorizontalGroup(
            jPanelNuevaAnamnesisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNuevaAnamnesisLayout.createSequentialGroup()
                .addGroup(jPanelNuevaAnamnesisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelNuevaAnamnesisLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanelNuevaAnamnesisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelNuevaAnamnesisLayout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addGap(61, 61, 61))
                            .addGroup(jPanelNuevaAnamnesisLayout.createSequentialGroup()
                                .addGroup(jPanelNuevaAnamnesisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelNuevaAnamnesisLayout.createSequentialGroup()
                                        .addGroup(jPanelNuevaAnamnesisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel19)
                                            .addComponent(jLabel18)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel16))
                                        .addGap(39, 39, 39)
                                        .addGroup(jPanelNuevaAnamnesisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanelNuevaAnamnesisLayout.createSequentialGroup()
                                        .addGroup(jPanelNuevaAnamnesisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addGroup(jPanelNuevaAnamnesisLayout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addGroup(jPanelNuevaAnamnesisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel1)
                                                    .addComponent(jLabel11))))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanelNuevaAnamnesisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanelNuevaAnamnesisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel3))))
                                .addGroup(jPanelNuevaAnamnesisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelNuevaAnamnesisLayout.createSequentialGroup()
                                        .addGap(55, 55, 55)
                                        .addGroup(jPanelNuevaAnamnesisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel20)
                                            .addComponent(jLabel21)
                                            .addComponent(jLabel22)
                                            .addComponent(jLabel23))
                                        .addGap(43, 43, 43)
                                        .addGroup(jPanelNuevaAnamnesisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanelNuevaAnamnesisLayout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addGroup(jPanelNuevaAnamnesisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanelNuevaAnamnesisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(55, 55, 55)
                                .addGroup(jPanelNuevaAnamnesisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelNuevaAnamnesisLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel13))
                                    .addGroup(jPanelNuevaAnamnesisLayout.createSequentialGroup()
                                        .addGroup(jPanelNuevaAnamnesisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanelNuevaAnamnesisLayout.createSequentialGroup()
                                                .addGroup(jPanelNuevaAnamnesisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel24)
                                                    .addComponent(jLabel25)
                                                    .addComponent(jLabel26)
                                                    .addComponent(jLabel27))
                                                .addGap(19, 19, 19)
                                                .addGroup(jPanelNuevaAnamnesisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanelNuevaAnamnesisLayout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanelNuevaAnamnesisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(227, 227, 227))
        );
        jPanelNuevaAnamnesisLayout.setVerticalGroup(
            jPanelNuevaAnamnesisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNuevaAnamnesisLayout.createSequentialGroup()
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelNuevaAnamnesisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanelNuevaAnamnesisLayout.createSequentialGroup()
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(jPanelNuevaAnamnesisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelNuevaAnamnesisLayout.createSequentialGroup()
                                .addGroup(jPanelNuevaAnamnesisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanelNuevaAnamnesisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelNuevaAnamnesisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addGroup(jPanelNuevaAnamnesisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel14)))
                                .addGap(12, 12, 12)
                                .addGroup(jPanelNuevaAnamnesisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNuevaAnamnesisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel15))))
                            .addGroup(jPanelNuevaAnamnesisLayout.createSequentialGroup()
                                .addGroup(jPanelNuevaAnamnesisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelNuevaAnamnesisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(jPanelNuevaAnamnesisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel13))))
                .addGap(52, 52, 52)
                .addGroup(jPanelNuevaAnamnesisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanelNuevaAnamnesisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanelNuevaAnamnesisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanelNuevaAnamnesisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jLabel28)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelNuevaAnamnesis, javax.swing.GroupLayout.PREFERRED_SIZE, 808, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelNuevaAnamnesis, javax.swing.GroupLayout.PREFERRED_SIZE, 604, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Estado", jPanel1);

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel40.setText("Diagnóstico/s:");

        jTextArea10.setColumns(20);
        jTextArea10.setRows(5);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, visita1, org.jdesktop.beansbinding.ELProperty.create("${diagnostico}"), jTextArea10, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jScrollPane12.setViewportView(jTextArea10);

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel30.setText("Tratamiento:");

        jTextArea6.setColumns(20);
        jTextArea6.setRows(5);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, visita1, org.jdesktop.beansbinding.ELProperty.create("${tratamiento}"), jTextArea6, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jScrollPane9.setViewportView(jTextArea6);

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel41.setText("Observaciones:");

        jTextArea11.setColumns(20);
        jTextArea11.setRows(5);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, visita1, org.jdesktop.beansbinding.ELProperty.create("${observaciones}"), jTextArea11, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jScrollPane13.setViewportView(jTextArea11);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane12)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40)
                            .addComponent(jLabel30)
                            .addComponent(jLabel41))
                        .addGap(0, 702, Short.MAX_VALUE))
                    .addComponent(jScrollPane9)
                    .addComponent(jScrollPane13))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel30)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel41)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Diagnóstico", jPanel4);

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel32.setText(" Motivo de la consulta:");

        jTextArea7.setColumns(20);
        jTextArea7.setRows(5);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, visita1, org.jdesktop.beansbinding.ELProperty.create("${motivoConsulta}"), jTextArea7, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jScrollPane7.setViewportView(jTextArea7);

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel33.setText("Antecedentes de la enfermedad actual:");

        jTextArea8.setColumns(20);
        jTextArea8.setRows(5);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, visita1, org.jdesktop.beansbinding.ELProperty.create("${antecedentesEnfermedad}"), jTextArea8, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jScrollPane10.setViewportView(jTextArea8);

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel34.setText("Otros antecedentes:");

        jLabel35.setText("Médicos:");

        jLabel36.setText("Quirúrgicos:");

        jLabel37.setText("Tramatológicos:");

        jLabel38.setText("Desparacitaciones:");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, visita1, org.jdesktop.beansbinding.ELProperty.create("${desparasitaciones}"), jTextField13, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, visita1, org.jdesktop.beansbinding.ELProperty.create("${antecedentesTraumatologicos}"), jTextField12, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, visita1, org.jdesktop.beansbinding.ELProperty.create("${antecedentesQuirurgicos}"), jTextField11, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, visita1, org.jdesktop.beansbinding.ELProperty.create("${antecedentesMedicos}"), jTextField9, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel39.setText("Ambientales y otros:");

        jTextArea9.setColumns(20);
        jTextArea9.setRows(5);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, visita1, org.jdesktop.beansbinding.ELProperty.create("${ambientales}"), jTextArea9, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jScrollPane11.setViewportView(jTextArea9);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
                    .addComponent(jLabel39)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel37)
                            .addComponent(jLabel38)
                            .addComponent(jLabel35)
                            .addComponent(jLabel36))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
                            .addComponent(jTextField13, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
                            .addComponent(jTextField12, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE))))
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel32)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        jTabbedPane1.addTab("Anamnesis", jPanel2);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(49, 49, 49))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            if (this.fechaValida() == false) {
                this.jLabel29.setVisible(true);
                this.jDateChooser1.requestFocusInWindow();
            } else {
                if (this.actualiza) {

                    visita1.setMascota(this.mascota1);
                    visita1.setFecha(jDateChooser1.getDate());
                    visita1.setAspectogeneral(this.jComboBox1.getSelectedItem().toString());
                    visita1.setGangliosLinfaticos(this.jComboBox2.getSelectedItem().toString());
                    visita1.setRespiratorio(this.jComboBox3.getSelectedItem().toString());
                    visita1.setCirculatorio(this.jComboBox4.getSelectedItem().toString());
                    visita1.setPiel(this.jComboBox8.getSelectedItem().toString());
                    visita1.setOjos(this.jComboBox7.getSelectedItem().toString());
                    visita1.setDigestivo(this.jComboBox6.getSelectedItem().toString());
                    visita1.setMusculoEsqueletico(this.jComboBox5.getSelectedItem().toString());
                    visita1.setMucosas(this.jComboBox9.getSelectedItem().toString());
                    visita1.setOidos(this.jComboBox10.getSelectedItem().toString());
                    visita1.setGenitoUrinario(this.jComboBox11.getSelectedItem().toString());
                    visita1.setSistemaNervioso(this.jComboBox12.getSelectedItem().toString());
                    visita1.setTipoPeso(this.jComboBox13.getSelectedItem().toString());
                    visita1.setPeso(this.jTextField1.getText());
                    visita1.setTemperatura(this.jTextField5.getText());
                    visita1.setFr(this.jTextField6.getText());
                    visita1.setFc(this.jTextField7.getText());
                    visita1.setHidratacion(this.jTextField8.getText());
                    visita1.setAntecedentesMedicos(this.jTextField9.getText());
                    visita1.setAntecedentesQuirurgicos(this.jTextField11.getText());
                    visita1.setAntecedentesTraumatologicos(this.jTextField12.getText());
                    visita1.setDesparasitaciones(this.jTextField13.getText());
                    visita1.setAnormalidades(this.jTextArea4.getText());
                    visita1.setTemperatura(this.jTextArea6.getText());
                    visita1.setMotivoConsulta(this.jTextArea7.getText());
                    visita1.setAntecedentesEnfermedad(this.jTextArea8.getText());
                    visita1.setAmbientales(this.jTextArea9.getText());
                    visita1.setDiagnostico(this.jTextArea10.getText());
                    visita1.setObservaciones(this.jTextArea11.getText());
                    VisitaController.getInstance().actualizar(visita1);
                    //JOptionPane.showMessageDialog(this, "La visita se actualizo exitosamente", "Actualizar", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                } else {

                    visita1.setMascota(this.mascota1);
                    visita1.setFecha(jDateChooser1.getDate());
                    visita1.setAspectogeneral(this.jComboBox1.getSelectedItem().toString());
                    visita1.setGangliosLinfaticos(this.jComboBox2.getSelectedItem().toString());
                    visita1.setRespiratorio(this.jComboBox3.getSelectedItem().toString());
                    visita1.setCirculatorio(this.jComboBox4.getSelectedItem().toString());
                    visita1.setPiel(this.jComboBox8.getSelectedItem().toString());
                    visita1.setOjos(this.jComboBox7.getSelectedItem().toString());
                    visita1.setDigestivo(this.jComboBox6.getSelectedItem().toString());
                    visita1.setMusculoEsqueletico(this.jComboBox5.getSelectedItem().toString());
                    visita1.setMucosas(this.jComboBox9.getSelectedItem().toString());
                    visita1.setOidos(this.jComboBox10.getSelectedItem().toString());
                    visita1.setGenitoUrinario(this.jComboBox11.getSelectedItem().toString());
                    visita1.setSistemaNervioso(this.jComboBox12.getSelectedItem().toString());
                    visita1.setTipoPeso(this.jComboBox13.getSelectedItem().toString());
                    VisitaController.getInstance().guardar(visita1);
                    // JOptionPane.showMessageDialog(this, "La visita se creo exitosamente", "Guardar", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            this.jTextField1.setText("");
            this.jLabel11.setVisible(false);
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
                AltaVisitas dialog = new AltaVisitas(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox jComboBox10;
    private javax.swing.JComboBox jComboBox11;
    private javax.swing.JComboBox jComboBox12;
    private javax.swing.JComboBox jComboBox13;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JComboBox jComboBox8;
    private javax.swing.JComboBox jComboBox9;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelNuevaAnamnesis;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea10;
    private javax.swing.JTextArea jTextArea11;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JTextArea jTextArea9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private model.Mascota mascota1;
    private model.Visita visita1;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
    private boolean actualiza;

    public boolean isActualiza() {
        return actualiza;
    }

    public void setActualiza(boolean actualiza) {
        this.actualiza = actualiza;
    }

    public Visita getVisita1() {
        return visita1;
    }

    public void setVisita1(Visita visita1) {
        this.visita1 = visita1;
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
