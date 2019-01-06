package view;

import controller.VacunaAnualController;
import controller.VacunaRefuerzoController;
import controller.DesparasitacionController;
import controller.NotaController;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import org.jdesktop.observablecollections.ObservableCollections;
import util.BackUp;
import util.EjecutarReporte;
import util.Propiedades;
import util.Vernam;

/**
 *
 * @author admin
 */
public class Inicio extends javax.swing.JFrame {
    public Inicio() throws Exception {
        conf();

        //Se fija si el serial que genera la aplicacion es igual al del archivo de configuracion, si es distinto detiene la ejecucion del programa.
        Propiedades p = new Propiedades();
        p.obtenerPropiedades();
//        if (this.serial.equals(p.generarSerial()) == false) {
//            JOptionPane.showMessageDialog(this, "La clave del sistema es inválida, pongase en contacto con los desarrolladores de PetBeans para que le faciliten una.", "Aviso", JOptionPane.WARNING_MESSAGE);
//            System.exit(0);
//        }

        this.setTitle("Veterinaria Mascotas");
        this.setIconImage(new ImageIcon("d1.png").getImage());
        initComponents();
        this.jPanel1.setVisible(false);
        this.jPanel2.setVisible(false);
        this.ver = false;
        if (fondo.equals("nada")) {
            ((FondoPanel) jPanelFondoInicio).setImagen((String) null);
        } else {
            ((FondoPanel) jPanelFondoInicio).setImagen("imagenes/" + fondo);
        }
        try {
            UIManager.setLookAndFeel(tema);
            SwingUtilities.updateComponentTreeUI(this);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        cont = 0;
        timer = new Timer();
        //le asignamos una tarea al timer
        timer.schedule(new RemindTask(), 15000, 1000 * 3600 * 6);//Se inicia el Timer con la tarea, el tiempo de inicio
        //y el tiempo en que se repite el ciclo
        
        NotaController.getInstance().eliminarNotasVencidas();
        
        this.setLocationRelativeTo(null); 
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        vacunaAnual1 = new model.VacunaAnual();
        vacunasAnuales = ObservableCollections.observableList(VacunaAnualController.getInstance().getAllVacunaAnualDia());
        vacunaRefuerzo1 = new model.VacunaRefuerzo();
        vacunaRefuerzo2 = new model.VacunaRefuerzo();
        vacunaRefuerzo3 = new model.VacunaRefuerzo();
        vacunasRefuerzo1 = ObservableCollections.observableList(VacunaRefuerzoController.getInstance().getAllVacunaRefuerzoDia1());
        vacunasRefuerzo2 = 
        ObservableCollections.observableList(VacunaRefuerzoController.getInstance().getAllVacunaRefuerzoDia2());
        vacunasRefuerzo3 = ObservableCollections.observableList(VacunaRefuerzoController.getInstance().getAllVacunaRefuerzoDia3());
        jPopupMenu1 = new javax.swing.JPopupMenu();
        desparasitacion1 = new model.Desparasitacion();
        desparasitaciones = ObservableCollections.observableList(DesparasitacionController.getInstance().getAllDesparasitacionDia());
        jPanelFondoInicio = new FondoPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Petbeans");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanelFondoInicio.setBackground(new java.awt.Color(153, 153, 153));
        jPanelFondoInicio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanelFondoInicio.setOpaque(false);
        jPanelFondoInicio.setPreferredSize(new java.awt.Dimension(1024, 768));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel1.setText("Bienvenido a Petbeans");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Vacunas anuales");

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, vacunasAnuales, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nombreVacuna} "));
        columnBinding.setColumnName("Vacuna");
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${mascota.nombre}"));
        columnBinding.setColumnName("Mascota");
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${mascota.propietario.nombreDueño} "));
        columnBinding.setColumnName("Propietario");
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, vacunaAnual1, org.jdesktop.beansbinding.ObjectProperty.create(), jTable1, org.jdesktop.beansbinding.BeanProperty.create("selectedElements"));
        bindingGroup.addBinding(binding);

        jScrollPane1.setViewportView(jTable1);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Vacunas con refuerzos");

        jLabel3.setText("Primer refuerzo");

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, vacunasRefuerzo1, jTable2);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nombreVacuna} "));
        columnBinding.setColumnName("Vacuna");
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${mascota.nombre}"));
        columnBinding.setColumnName("Mascota");
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${mascota.propietario.nombreDueño} "));
        columnBinding.setColumnName("Propietario");
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, vacunaRefuerzo1, org.jdesktop.beansbinding.ObjectProperty.create(), jTable2, org.jdesktop.beansbinding.BeanProperty.create("selectedElements"));
        bindingGroup.addBinding(binding);

        jScrollPane2.setViewportView(jTable2);

        jLabel4.setText("Segundo refuerzo");

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, vacunasRefuerzo2, jTable3);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nombreVacuna} "));
        columnBinding.setColumnName("Vacuna");
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${mascota.nombre}"));
        columnBinding.setColumnName("Mascota");
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${mascota.propietario.nombreDueño} "));
        columnBinding.setColumnName("Propietario");
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, vacunaRefuerzo2, org.jdesktop.beansbinding.ObjectProperty.create(), jTable3, org.jdesktop.beansbinding.BeanProperty.create("selectedElements"));
        bindingGroup.addBinding(binding);

        jScrollPane3.setViewportView(jTable3);

        jLabel5.setText("Tercer refuerzo");

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, vacunasRefuerzo3, jTable4);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nombreVacuna} "));
        columnBinding.setColumnName("Vacuna");
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${mascota.nombre}"));
        columnBinding.setColumnName("Mascota");
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${mascota.propietario.nombreDueño}"));
        columnBinding.setColumnName("Propietario");
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, vacunaRefuerzo3, org.jdesktop.beansbinding.ObjectProperty.create(), jTable4, org.jdesktop.beansbinding.BeanProperty.create("selectedElements"));
        bindingGroup.addBinding(binding);

        jScrollPane4.setViewportView(jTable4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(8, 8, 8)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagenes/jeringa.png"))); // NOI18N
        jLabel8.setToolTipText("Vacunas de hoy");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagenes/Perro.png"))); // NOI18N
        jLabel7.setToolTipText("Busqueda de mascotas");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagenes/cliente.png"))); // NOI18N
        jLabel9.setToolTipText("Dueños de mascotas");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagenes/email.png"))); // NOI18N
        jLabel10.setToolTipText("Envio de e-mail");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagenes/desparacitaciones.png"))); // NOI18N
        jLabel11.setToolTipText("Desparacitaciones de hoy");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Desparasitaciones de hoy"));

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, desparasitaciones, jTable5);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nombreDesparasitante}"));
        columnBinding.setColumnName("Desparasitante");
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${mascota.nombre}"));
        columnBinding.setColumnName("Mascota");
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${mascota.propietario.nombreDueño} "));
        columnBinding.setColumnName("Propietario");
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, desparasitacion1, org.jdesktop.beansbinding.ObjectProperty.create(), jTable5, org.jdesktop.beansbinding.BeanProperty.create("selectedElements"));
        bindingGroup.addBinding(binding);

        jScrollPane5.setViewportView(jTable5);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagenes/agenda.png"))); // NOI18N
        jLabel12.setToolTipText("Notas de hoy");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelFondoInicioLayout = new javax.swing.GroupLayout(jPanelFondoInicio);
        jPanelFondoInicio.setLayout(jPanelFondoInicioLayout);
        jPanelFondoInicioLayout.setHorizontalGroup(
            jPanelFondoInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFondoInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFondoInicioLayout.createSequentialGroup()
                        .addGroup(jPanelFondoInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelFondoInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFondoInicioLayout.createSequentialGroup()
                        .addGap(386, 386, 386)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                        .addGap(335, 335, 335))))
        );
        jPanelFondoInicioLayout.setVerticalGroup(
            jPanelFondoInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFondoInicioLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel7)
                .addGap(75, 75, 75)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24))
            .addGroup(jPanelFondoInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFondoInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelFondoInicioLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel12)
                .addGap(81, 81, 81)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(27, 27, 27))
        );

        jMenu1.setText("Archivo");

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagenes/brush_16.png"))); // NOI18N
        jMenu5.setText("Personalización");

        jMenuItem21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagenes/picture.png"))); // NOI18N
        jMenuItem21.setText("Fondo");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem21);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagenes/palette.png"))); // NOI18N
        jMenuItem5.setText("Temas");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem5);

        jMenu1.add(jMenu5);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagenes/db.Schema.16x16.png"))); // NOI18N
        jMenu7.setText(" Base de datos");
        jMenu7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu7ActionPerformed(evt);
            }
        });

        jMenuItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagenes/co.png"))); // NOI18N
        jMenuItem16.setText("Configuración");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem16);

        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagenes/ba.png"))); // NOI18N
        jMenuItem14.setText("Realizar Backup");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem14);

        jMenu1.add(jMenu7);

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Dueños");

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagenes/People.png"))); // NOI18N
        jMenuItem9.setText("Ir a dueños");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuBar1.add(jMenu3);

        jMenu8.setText("Mascotas");

        jMenuItem19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagenes/find.png"))); // NOI18N
        jMenuItem19.setText("Busquedas");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem19);

        jMenuBar1.add(jMenu8);

        jMenu6.setText("Desparasitaciones");
        jMenu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu6ActionPerformed(evt);
            }
        });

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagenes/Pastillas.png"))); // NOI18N
        jMenuItem4.setText("Ver desparasitaciones de hoy");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem4);

        jMenuBar1.add(jMenu6);

        jMenu2.setText("Vacunas");

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagenes/agt_virus-off_3249_32.png"))); // NOI18N
        jMenuItem3.setText("Ver vacunas de hoy");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu10.setText("Notas");

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagenes/agendaIcono2.png"))); // NOI18N
        jMenuItem6.setText("Ir a notas");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem6);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagenes/binoculares.png"))); // NOI18N
        jMenuItem7.setText("Ver notas de hoy");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem7);

        jMenuBar1.add(jMenu10);

        jMenu9.setText("Mail");

        jMenuItem17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagenes/gmail.png"))); // NOI18N
        jMenuItem17.setText("Enviar mail");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem17);

        jMenuItem20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagenes/co.png"))); // NOI18N
        jMenuItem20.setText("Configurar mensaje");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem20);

        jMenuItem18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagenes/cog_edit.png"))); // NOI18N
        jMenuItem18.setText("Configurar mail");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem18);

        jMenuBar1.add(jMenu9);

        jMenu4.setText("Ayuda");

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagenes/JOptionPane_min.png"))); // NOI18N
        jMenuItem2.setText("Acerca de");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondoInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1132, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondoInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Acerca a = new Acerca(this, true);
        a.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        TrabajarConDuenios p = new TrabajarConDuenios();
        p.setLocationRelativeTo(this);
        p.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
    Vernam ver = new Vernam();
    String clave = "luftwaffepanzer6";
    Properties p = new Properties();
    confBackup(p);
    new BackUp().CrearBackup(ver.desencriptar(p.getProperty("Host"), clave), ver.desencriptar(p.getProperty("Puerto"), clave), ver.desencriptar(p.getProperty("Usuario"), clave), ver.desencriptar(p.getProperty("Password"), clave), ver.desencriptar(p.getProperty("Base"), clave), ver.desencriptar(p.getProperty("Backup"), clave), ver.desencriptar(p.getProperty("Pathmysqldump"), clave));
}//GEN-LAST:event_jMenuItem14ActionPerformed

private void jMenu7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu7ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jMenu7ActionPerformed

private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
    Configuracion p = new Configuracion(this, true);
    p.setLocationRelativeTo(this);
    p.setVisible(true);
}//GEN-LAST:event_jMenuItem16ActionPerformed

private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
    view.Mail p = new view.Mail(this, true);
    p.setLocationRelativeTo(this);
    p.setVisible(true);
}//GEN-LAST:event_jMenuItem17ActionPerformed

private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
    MailConf p = new MailConf(this, true);
    p.setLocationRelativeTo(this);
    p.setVisible(true);
}//GEN-LAST:event_jMenuItem18ActionPerformed

private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
    TrabajarConMascotas2 p = new TrabajarConMascotas2(this, false);
    p.setLocationRelativeTo(this);
    p.setVisible(true);
}//GEN-LAST:event_jMenuItem19ActionPerformed

private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
    ConfMens p = new ConfMens(this, true);
    p.setLocationRelativeTo(this);
    p.setVisible(true);
}//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
        try {

            Fondos c = new Fondos(this, true);
            c.setLocationRelativeTo(this);
            c.setVisible(true);
            String fo = "";
            Properties pro = new Properties();
            try {
                pro.load(new FileInputStream("conf.ini"));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            fo = pro.getProperty("Fondo");
            if (fo.equals("nada")) {
                ((FondoPanel) jPanelFondoInicio).setImagen((String) null);
            } else {
                System.out.println("imagenes/" + fo);
                ((FondoPanel) jPanelFondoInicio).setImagen("imagenes/" + fo);
            }
        } catch (IOException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        try {
            Temas c = new Temas(this, true);
            c.setLocationRelativeTo(this);
            c.setVisible(true);
            String te = "";
            Properties pro = new Properties();
            pro.load(new FileInputStream("conf.ini"));
            te = pro.getProperty("Tema");
            UIManager.setLookAndFeel(te);
            SwingUtilities.updateComponentTreeUI(this);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
    System.out.println(ver);
    if (this.ver) {
        System.out.println("f");
        this.jPanel1.setVisible(false);
        this.ver = false;
    } else {
        System.out.println("t");
        this.jPanel1.setVisible(true);
        this.ver = true;
    }
}//GEN-LAST:event_jMenuItem3ActionPerformed

private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
    System.out.println(ver);
    if (this.ver) {
        System.out.println("f");
        this.jPanel1.setVisible(false);
        this.ver = false;
    } else {
        System.out.println("t");
        this.jPanel1.setVisible(true);
        this.ver = true;
    }
}//GEN-LAST:event_jLabel8MouseClicked

private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
    TrabajarConMascotas2 p = new TrabajarConMascotas2(this, false);
    p.setLocationRelativeTo(this);
    p.setVisible(true);
}//GEN-LAST:event_jLabel7MouseClicked

private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        TrabajarConDuenios p = new TrabajarConDuenios();
        p.setLocationRelativeTo(this);
        p.setVisible(true);
}//GEN-LAST:event_jLabel9MouseClicked

private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
    view.Mail p = new view.Mail(this, true);
    p.setLocationRelativeTo(this);
    p.setVisible(true);
}//GEN-LAST:event_jLabel10MouseClicked

private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed

    if (this.ver) {
        this.jPanel2.setVisible(false);
        this.ver = false;
    } else {
        this.jPanel2.setVisible(true);
        this.ver = true;
    }
}//GEN-LAST:event_jMenuItem4ActionPerformed

private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked

    if (this.ver) {
        this.jPanel2.setVisible(false);
        this.ver = false;
    } else {
        this.jPanel2.setVisible(true);
        this.ver = true;
    }
}//GEN-LAST:event_jLabel11MouseClicked

private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
    String rutaReporte = "Reportes/Notas.jrxml";
    int id = 0;
    int id2 = 0;
    String parametro3 = "";
    String parametro4 = "";
    EjecutarReporte er = new EjecutarReporte();
    er.startReport(rutaReporte, id, id2, parametro3, parametro4);
}//GEN-LAST:event_jMenuItem7ActionPerformed

private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
    String rutaReporte = "Reportes/Notas.jrxml";
    int id = 0;
    int id2 = 0;
    String parametro3 = "";
    String parametro4 = "";
    EjecutarReporte er = new EjecutarReporte();
    er.startReport(rutaReporte, id, id2, parametro3, parametro4);
}//GEN-LAST:event_jLabel12MouseClicked

private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
    try {
        ABMNota m = new ABMNota(null, false);
        m.setLocationRelativeTo(this);
        m.setVisible(true);
    } catch (Exception ex) {
        Logger.getLogger(ABMVacunas.class.getName()).log(Level.SEVERE, null, ex);
    }
}//GEN-LAST:event_jMenuItem6ActionPerformed

private void jMenu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu6ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jMenu6ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
       System.exit(0);
    }//GEN-LAST:event_formWindowClosed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    //UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
                    //UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
                    UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
                    try {
                        new Inicio().setVisible(true);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private model.Desparasitacion desparasitacion1;
    private java.util.List desparasitaciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelFondoInicio;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private model.VacunaAnual vacunaAnual1;
    private model.VacunaRefuerzo vacunaRefuerzo1;
    private model.VacunaRefuerzo vacunaRefuerzo2;
    private model.VacunaRefuerzo vacunaRefuerzo3;
    private java.util.List vacunasAnuales;
    private java.util.List vacunasRefuerzo1;
    private java.util.List vacunasRefuerzo2;
    private java.util.List vacunasRefuerzo3;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
    private int cont;
    private Timer timer;
    private boolean ver = false;
    private String fondo = " ";
    private String tema = " ";
    private String serial = " ";

    public Timer getTimer() {
        return timer;
    }

    public void setTimer(Timer timer) {
        this.timer = timer;
    }

    public void refresh() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();
        //Vacunas anuales
        vacunasAnuales = ObservableCollections.observableList(VacunaAnualController.getInstance().getAllVacunaAnualDia());
        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, vacunasAnuales, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nombreVacuna} "));
        columnBinding.setColumnName("Vacuna");
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${mascota.nombre}"));
        columnBinding.setColumnName("Mascota");
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${mascota.propietario.nombreDueño} "));
        columnBinding.setColumnName("Propietario");
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, vacunaAnual1, org.jdesktop.beansbinding.ObjectProperty.create(), jTable1, org.jdesktop.beansbinding.BeanProperty.create("selectedElements"));
        bindingGroup.addBinding(binding);
        //Vacunas primer refuerzo
        vacunasRefuerzo1 = ObservableCollections.observableList(VacunaRefuerzoController.getInstance().getAllVacunaRefuerzoDia1());
        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, vacunasRefuerzo1, jTable2);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nombreVacuna} "));
        columnBinding.setColumnName("Vacuna");
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${mascota.nombre}"));
        columnBinding.setColumnName("Mascota");
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${mascota.propietario.nombreDueño} "));
        columnBinding.setColumnName("Propietario");
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, vacunaRefuerzo1, org.jdesktop.beansbinding.ObjectProperty.create(), jTable2, org.jdesktop.beansbinding.BeanProperty.create("selectedElements"));
        bindingGroup.addBinding(binding);
        //Vacunas segundo refuerzo
        vacunasRefuerzo2 = ObservableCollections.observableList(VacunaRefuerzoController.getInstance().getAllVacunaRefuerzoDia2());
        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, vacunasRefuerzo3, jTable4);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nombreVacuna} "));
        columnBinding.setColumnName("Vacuna");
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${mascota.nombre}"));
        columnBinding.setColumnName("Mascota");
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${mascota.propietario.nombreDueño} "));
        columnBinding.setColumnName("Propietario");
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, vacunaRefuerzo3, org.jdesktop.beansbinding.ObjectProperty.create(), jTable4, org.jdesktop.beansbinding.BeanProperty.create("selectedElements"));
        bindingGroup.addBinding(binding);
        //Vacunas tercer refuerzo
        vacunasRefuerzo3 = ObservableCollections.observableList(VacunaRefuerzoController.getInstance().getAllVacunaRefuerzoDia3());



        bindingGroup.bind();

    }

//Clase interna para la tarea del timer.
    class RemindTask extends TimerTask {
        //En este metodo va la tarea que se ejecuta

        public void run() {
            refresh();
            cont = cont + 1;
            System.out.println(cont);
        }
    }

    public void conf() {
        try {
            Properties p = new Properties();
            p.load(new FileInputStream("conf.ini"));
            fondo = p.getProperty("Fondo");
            tema = p.getProperty("Tema");
            serial = p.getProperty("Serial");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public Properties confBackup(Properties p) {
        try {

            p.load(new FileInputStream("conf.ini"));


            p.getProperty("Usuario");
            p.getProperty("Password");
            p.getProperty("Backup");
            p.getProperty("Host");
            p.getProperty("Puerto");
            p.getProperty("Base");
            p.getProperty("Pathmysqldump");

        } catch (Exception e) {
            System.out.println(e);
        }
        return p;
    }

    
}
