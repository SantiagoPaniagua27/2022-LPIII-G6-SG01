/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ejercicio02compradepasajes;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.time.LocalDate;
import javax.swing.JOptionPane;

//Parte del codigo con las funcionalidades, validaciones, impresiones y eliminacion de datos
//Parte del codigo con las funcionalidades, validaciones, impresiones y eliminacion de datos
public class Ejercicio02CompraDePasajes extends javax.swing.JFrame {
    private String getOpcionales = "";
    private String pisoSeleccionado = "1er Piso";
    int xMouse, yMouse;
    private static final String[] Destinos = new String[]{"Abancay","Arequipa","Camaná","Nazca","Ilo"
            ,"Mancora","Tacna","Lima","Trujillo","Piura","Puno","Tumbes","Cuzco"};
    private String[] TiposDeViaje = new String[]{"Economico", "Standard", "VIP"};
    public Ejercicio02CompraDePasajes() {
        initComponents();
        this.jCheckBoxPrimerServicio.setText("Audifonos");
        this.jCheckBoxSegundoServicio.setText("Manta");
        this.jCheckBoxTercerServicio.setText("Revistas");
        this.jCheckBoxPrimerServicio.addItemListener(new ManejadorCheckboxes());
        this.jCheckBoxSegundoServicio.addItemListener(new ManejadorCheckboxes());
        this.jCheckBoxTercerServicio.addItemListener(new ManejadorCheckboxes());
        this.buttonGroupBotonesParaPiso = new ButtonGroup();
        
        this.jRadioButtonPrimerPiso.addItemListener(new ItemListener() {
        public void itemStateChanged(ItemEvent e) {
            if (Ejercicio02CompraDePasajes.this.jRadioButtonPrimerPiso.isSelected()) {
                Ejercicio02CompraDePasajes.this.pisoSeleccionado = "1er Piso";
            }
        }
        });
        this.jRadioButtonSegundoPiso.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (Ejercicio02CompraDePasajes.this.jRadioButtonSegundoPiso.isSelected()) {
                    Ejercicio02CompraDePasajes.this.pisoSeleccionado = "2do Piso";
                }

            }
        });
        
        this.buttonGroupBotonesParaPiso.add(this.jRadioButtonPrimerPiso);
        this.buttonGroupBotonesParaPiso.add(this.jRadioButtonSegundoPiso);
        String[] lista2 = Destinos;
        int validador2 = lista2.length;
        for(int validador3 = 0; validador3 < validador2; ++validador3) {
            String i = lista2[validador3];
            this.jComboBoxLugaresOrigen.addItem(i);
            this.jComboBoxLugaresDestino.addItem(i);
        }
        
        this.jListTipoServicio.setListData(this.TiposDeViaje);
        this.jComboBoxLugaresOrigen.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                try {
                    if (Ejercicio02CompraDePasajes.this.jComboBoxLugaresDestino.getSelectedIndex() == Ejercicio02CompraDePasajes.this.jComboBoxLugaresOrigen.getSelectedIndex()) {
                        JOptionPane.showMessageDialog((Component)null, "El origen y el destino son iguales, cambie de origen.");
                        Ejercicio02CompraDePasajes.this.jComboBoxLugaresOrigen.setSelectedIndex(0);
                        Ejercicio02CompraDePasajes.this.jComboBoxLugaresDestino.setSelectedIndex(1);
                    }
                } catch (Exception validador3) {
                    JOptionPane.showMessageDialog((Component)null, "Error desconocido..." + validador3);
                }

            }
        });
        this.jComboBoxLugaresDestino.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                try {
                    if (Ejercicio02CompraDePasajes.this.jComboBoxLugaresDestino.getSelectedIndex() == Ejercicio02CompraDePasajes.this.jComboBoxLugaresOrigen.getSelectedIndex()) {
                        JOptionPane.showMessageDialog((Component)null, "El destino y el origen son iguales, cambie de destino");
                        Ejercicio02CompraDePasajes.this.jComboBoxLugaresOrigen.setSelectedIndex(0);
                        Ejercicio02CompraDePasajes.this.jComboBoxLugaresDestino.setSelectedIndex(1);
                    }
                } catch (Exception validador3) {
                    JOptionPane.showMessageDialog((Component)null, "Error desconocido..." + validador3);
                }

            }
        });
        
        this.jButtonLimpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Ejercicio02CompraDePasajes.this.jTextFieldNombres.setText("Ingrese nombres y apellidos del pasajero");
                jTextFieldNombres.setForeground(Color.gray);
                Ejercicio02CompraDePasajes.this.jTextFieldDNI.setText("Ingrese el DNI del pasajero (Solo los 8 primeros)");
                jTextFieldDNI.setForeground(Color.gray);
                Ejercicio02CompraDePasajes.this.jTextFieldFecha.setText("Ingrese la fecha del boleto");
                jTextFieldFecha.setForeground(Color.gray);
                Ejercicio02CompraDePasajes.this.jCheckBoxPrimerServicio.setSelected(false);
                Ejercicio02CompraDePasajes.this.jCheckBoxSegundoServicio.setSelected(false);
                Ejercicio02CompraDePasajes.this.jCheckBoxTercerServicio.setSelected(false);
                Ejercicio02CompraDePasajes.this.jRadioButtonPrimerPiso.setSelected(true);
                Ejercicio02CompraDePasajes.this.jRadioButtonSegundoPiso.setSelected(false);
                Ejercicio02CompraDePasajes.this.jComboBoxLugaresOrigen.setSelectedIndex(0);
                Ejercicio02CompraDePasajes.this.jComboBoxLugaresDestino.setSelectedIndex(1);
                Ejercicio02CompraDePasajes.this.jListTipoServicio.setSelectedIndex(0);
            }
        });
        
        this.jButtonIngresar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    if (Ejercicio02CompraDePasajes.this.jTextFieldFecha.getText().length() == 10 && Ejercicio02CompraDePasajes.this.jTextFieldNombres.getText().length() != 0 
                        && Ejercicio02CompraDePasajes.this.jTextFieldDNI.getText().length() == 8 && Ejercicio02CompraDePasajes.validarFecha(LocalDate.now(),
                        Ejercicio02CompraDePasajes.this.jTextFieldFecha.getText()) && Ejercicio02CompraDePasajes.validarDNI(Ejercicio02CompraDePasajes.this.jTextFieldDNI.getText())) {
                        
                        String validador11 = Ejercicio02CompraDePasajes.this.jTextFieldNombres.getText();
                        JOptionPane.showMessageDialog((Component)null, "BOLETA N°01\nPasajero: " + validador11 
                            + "\nDocumento de Identidad: " + Ejercicio02CompraDePasajes.this.jTextFieldDNI.getText() 
                            + "\nFecha de Viaje: " + Ejercicio02CompraDePasajes.this.jTextFieldFecha.getText() 
                            + "\nOpcionales:\n" + Ejercicio02CompraDePasajes.this.getOpcionales
                            + "\nPiso del bus: " + Ejercicio02CompraDePasajes.this.pisoSeleccionado 
                            + "\nOrigen: " + Ejercicio02CompraDePasajes.this.jComboBoxLugaresOrigen.getSelectedItem() 
                            + "\nDestino: " + Ejercicio02CompraDePasajes.this.jComboBoxLugaresDestino.getSelectedItem()
                            + "\nTipo de servicio: " + (String)Ejercicio02CompraDePasajes.this.jListTipoServicio.getSelectedValue()); 
                        Ejercicio02CompraDePasajes.this.dispose();
                        
                        
                    } else {
                        JOptionPane.showMessageDialog((Component)null, "Datos Incorrectos");
                    }
                } catch (Exception validador3) {
                    JOptionPane.showMessageDialog((Component)null, "El formato de la fecha ingresada esta incorrecto.");
                }

            }
        });

        this.jComboBoxLugaresOrigen.setSelectedIndex(0);
        this.jComboBoxLugaresDestino.setSelectedIndex(1);
        this.jListTipoServicio.setSelectedIndex(0);
        this.jRadioButtonPrimerPiso.setSelected(true);
        this.setContentPane(this.Background);
    }
    
    private class ManejadorCheckboxes implements ItemListener {
        private ManejadorCheckboxes() {
        }

        public void itemStateChanged(ItemEvent e) {
            Ejercicio02CompraDePasajes.this.getOpcionales = "";
            JCheckBox[] lista1 = new JCheckBox[]{Ejercicio02CompraDePasajes.this.jCheckBoxPrimerServicio, Ejercicio02CompraDePasajes.this.jCheckBoxSegundoServicio
                    , Ejercicio02CompraDePasajes.this.jCheckBoxTercerServicio};
            JCheckBox[] validador3 = lista1;
            int validador14 = lista1.length;
            
            for(int validador15 = 0; validador15 < validador14; ++validador15) {
                JCheckBox jCheckBox = validador3[validador15];
                if (jCheckBox.isSelected()) {
                    Ejercicio02CompraDePasajes validador10 = Ejercicio02CompraDePasajes.this;
                    validador10.getOpcionales = validador10.getOpcionales + " - ";
                    validador10 = Ejercicio02CompraDePasajes.this;
                    String validador11 = validador10.getOpcionales;
                    validador10.getOpcionales = validador11 + jCheckBox.getText();
                }
            }

        }
    }
    
    private static boolean validarFecha(LocalDate FechaPresente, String Recibido) {
        LocalDate fechaIndicada = LocalDate.parse(Recibido);
        return fechaIndicada.compareTo(FechaPresente) > 0;
    }
    
    private static boolean validarDNI(String supuestoNumero) {
        try {
            int dni = Integer.parseInt(supuestoNumero);
            return true;
        } catch (Exception validador2) {
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupBotonesParaPiso = new javax.swing.ButtonGroup();
        Background = new javax.swing.JPanel();
        jPanelBarraDeVentana = new javax.swing.JPanel();
        jPanelExitBoton = new javax.swing.JPanel();
        jLabelExitBoton = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanelLeft = new javax.swing.JPanel();
        jLabelLogoDeEmpresa = new javax.swing.JLabel();
        jPanelHeader = new javax.swing.JPanel();
        NombreDeLaEmpresa = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelNombres = new javax.swing.JLabel();
        JLabelDNI = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jLabelServicios = new javax.swing.JLabel();
        jLabelPisoAsiento = new javax.swing.JLabel();
        jLabelOrigen = new javax.swing.JLabel();
        jLabelTipoBoleta = new javax.swing.JLabel();
        jTextFieldNombres = new javax.swing.JTextField();
        jTextFieldDNI = new javax.swing.JTextField();
        jSeparatorDNI = new javax.swing.JSeparator();
        jTextFieldFecha = new javax.swing.JTextField();
        jSeparatorFecha = new javax.swing.JSeparator();
        jLabelDestino = new javax.swing.JLabel();
        jSeparatorNombres = new javax.swing.JSeparator();
        jSeparatorDelEncabezado1 = new javax.swing.JSeparator();
        jCheckBoxPrimerServicio = new javax.swing.JCheckBox();
        jCheckBoxSegundoServicio = new javax.swing.JCheckBox();
        jCheckBoxTercerServicio = new javax.swing.JCheckBox();
        jRadioButtonSegundoPiso = new javax.swing.JRadioButton();
        jRadioButtonPrimerPiso = new javax.swing.JRadioButton();
        jComboBoxLugaresOrigen = new javax.swing.JComboBox<>();
        jComboBoxLugaresDestino = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListTipoServicio = new javax.swing.JList<>();
        jButtonLimpiar = new javax.swing.JButton();
        jButtonIngresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Background.setForeground(new java.awt.Color(255, 51, 153));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelBarraDeVentana.setBackground(new java.awt.Color(255, 255, 255));
        jPanelBarraDeVentana.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelBarraDeVentana.setForeground(new java.awt.Color(204, 204, 204));
        jPanelBarraDeVentana.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanelBarraDeVentanaMouseDragged(evt);
            }
        });
        jPanelBarraDeVentana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelBarraDeVentanaMousePressed(evt);
            }
        });

        jPanelExitBoton.setBackground(new java.awt.Color(255, 255, 255));
        jPanelExitBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelExitBotonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelExitBotonMouseEntered(evt);
            }
        });

        jLabelExitBoton.setBackground(new java.awt.Color(255, 51, 51));
        jLabelExitBoton.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabelExitBoton.setForeground(new java.awt.Color(255, 51, 51));
        jLabelExitBoton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelExitBoton.setText("X");
        jLabelExitBoton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabelExitBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelExitBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelExitBotonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelExitBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelExitBotonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelExitBotonLayout = new javax.swing.GroupLayout(jPanelExitBoton);
        jPanelExitBoton.setLayout(jPanelExitBotonLayout);
        jPanelExitBotonLayout.setHorizontalGroup(
            jPanelExitBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
            .addGroup(jPanelExitBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabelExitBoton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
        );
        jPanelExitBotonLayout.setVerticalGroup(
            jPanelExitBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanelExitBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabelExitBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Programa abierto para el llenado boletas");

        javax.swing.GroupLayout jPanelBarraDeVentanaLayout = new javax.swing.GroupLayout(jPanelBarraDeVentana);
        jPanelBarraDeVentana.setLayout(jPanelBarraDeVentanaLayout);
        jPanelBarraDeVentanaLayout.setHorizontalGroup(
            jPanelBarraDeVentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBarraDeVentanaLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelExitBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelBarraDeVentanaLayout.setVerticalGroup(
            jPanelBarraDeVentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBarraDeVentanaLayout.createSequentialGroup()
                .addGroup(jPanelBarraDeVentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelExitBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanelBarraDeVentanaLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        Background.add(jPanelBarraDeVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        jPanelLeft.setBackground(new java.awt.Color(255, 215, 32));
        jPanelLeft.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabelLogoDeEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelLogoDeEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/LogoEmpresa.png"))); // NOI18N
        jLabelLogoDeEmpresa.setAlignmentY(0.0F);
        jLabelLogoDeEmpresa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelLogoDeEmpresa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelLogoDeEmpresa.setMaximumSize(new java.awt.Dimension(250, 250));
        jLabelLogoDeEmpresa.setMinimumSize(new java.awt.Dimension(200, 200));
        jLabelLogoDeEmpresa.setName(""); // NOI18N
        jLabelLogoDeEmpresa.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanelLeftLayout = new javax.swing.GroupLayout(jPanelLeft);
        jPanelLeft.setLayout(jPanelLeftLayout);
        jPanelLeftLayout.setHorizontalGroup(
            jPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLeftLayout.createSequentialGroup()
                .addComponent(jLabelLogoDeEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelLeftLayout.setVerticalGroup(
            jPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLeftLayout.createSequentialGroup()
                .addComponent(jLabelLogoDeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Background.add(jPanelLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 250, 620));

        jPanelHeader.setBackground(new java.awt.Color(235, 235, 235));
        jPanelHeader.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        NombreDeLaEmpresa.setFont(new java.awt.Font("Roboto Medium", 1, 26)); // NOI18N
        NombreDeLaEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NombreDeLaEmpresa.setText("Empresa de Transportes Balde RRama");
        NombreDeLaEmpresa.setToolTipText("");

        jLabelTitulo.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabelTitulo.setText("Ingresas datos para el boleto :");

        javax.swing.GroupLayout jPanelHeaderLayout = new javax.swing.GroupLayout(jPanelHeader);
        jPanelHeader.setLayout(jPanelHeaderLayout);
        jPanelHeaderLayout.setHorizontalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NombreDeLaEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(NombreDeLaEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        Background.add(jPanelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 560, 130));

        jLabelNombres.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabelNombres.setText("Nombres y Apellidos :");
        Background.add(jLabelNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 190, -1));

        JLabelDNI.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        JLabelDNI.setText("Documento de Identidad :");
        Background.add(JLabelDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 200, -1));

        jLabelFecha.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabelFecha.setText("Fecha ( Formato : yyyy-mm-dd) :");
        Background.add(jLabelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 180, -1));

        jLabelServicios.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabelServicios.setText("Servicios opcionales :");
        Background.add(jLabelServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, -1, 20));

        jLabelPisoAsiento.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabelPisoAsiento.setText("Piso del asiento :");
        Background.add(jLabelPisoAsiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, -1, 20));

        jLabelOrigen.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabelOrigen.setText("Lugar de Origen :");
        Background.add(jLabelOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 130, -1));

        jLabelTipoBoleta.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabelTipoBoleta.setText("Tipo de Servicio :");
        Background.add(jLabelTipoBoleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 520, -1, 20));

        jTextFieldNombres.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jTextFieldNombres.setForeground(new java.awt.Color(204, 204, 204));
        jTextFieldNombres.setText("Ingrese nombres y apellidos del pasajero");
        jTextFieldNombres.setBorder(null);
        jTextFieldNombres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextFieldNombresMousePressed(evt);
            }
        });
        jTextFieldNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombresActionPerformed(evt);
            }
        });
        jTextFieldNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombresKeyTyped(evt);
            }
        });
        Background.add(jTextFieldNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 320, -1));

        jTextFieldDNI.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jTextFieldDNI.setForeground(new java.awt.Color(204, 204, 204));
        jTextFieldDNI.setText("Ingrese el DNI del pasajero (Solo los 8 primeros)");
        jTextFieldDNI.setBorder(null);
        jTextFieldDNI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextFieldDNIMousePressed(evt);
            }
        });
        jTextFieldDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDNIActionPerformed(evt);
            }
        });
        jTextFieldDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDNIKeyTyped(evt);
            }
        });
        Background.add(jTextFieldDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 320, -1));

        jSeparatorDNI.setForeground(new java.awt.Color(0, 0, 0));
        jSeparatorDNI.setToolTipText("");
        jSeparatorDNI.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSeparatorDNI.setFocusCycleRoot(true);
        jSeparatorDNI.setMaximumSize(new java.awt.Dimension(327679, 327679));
        jSeparatorDNI.setName(""); // NOI18N
        Background.add(jSeparatorDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 330, 10));

        jTextFieldFecha.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jTextFieldFecha.setForeground(new java.awt.Color(204, 204, 204));
        jTextFieldFecha.setText("Ingrese la fecha del boleto");
        jTextFieldFecha.setToolTipText("");
        jTextFieldFecha.setBorder(null);
        jTextFieldFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextFieldFechaMousePressed(evt);
            }
        });
        jTextFieldFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFechaActionPerformed(evt);
            }
        });
        jTextFieldFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldFechaKeyTyped(evt);
            }
        });
        Background.add(jTextFieldFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 320, -1));

        jSeparatorFecha.setForeground(new java.awt.Color(0, 0, 0));
        jSeparatorFecha.setToolTipText("");
        jSeparatorFecha.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSeparatorFecha.setFocusCycleRoot(true);
        jSeparatorFecha.setMaximumSize(new java.awt.Dimension(327679, 327679));
        jSeparatorFecha.setName(""); // NOI18N
        Background.add(jSeparatorFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 330, 10));

        jLabelDestino.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabelDestino.setText("Lugar de Destino :");
        Background.add(jLabelDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 440, 140, -1));

        jSeparatorNombres.setForeground(new java.awt.Color(0, 0, 0));
        Background.add(jSeparatorNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 330, 10));

        jSeparatorDelEncabezado1.setForeground(new java.awt.Color(0, 0, 0));
        Background.add(jSeparatorDelEncabezado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 159, 550, 10));

        jCheckBoxPrimerServicio.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jCheckBoxPrimerServicio.setText("Audífonos");
        jCheckBoxPrimerServicio.setActionCommand("Audifonos");
        jCheckBoxPrimerServicio.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jCheckBoxPrimerServicioMouseMoved(evt);
            }
        });
        jCheckBoxPrimerServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxPrimerServicioActionPerformed(evt);
            }
        });
        Background.add(jCheckBoxPrimerServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, 90, -1));

        jCheckBoxSegundoServicio.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jCheckBoxSegundoServicio.setText("Mantas");
        jCheckBoxSegundoServicio.setToolTipText("");
        jCheckBoxSegundoServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSegundoServicioActionPerformed(evt);
            }
        });
        Background.add(jCheckBoxSegundoServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, 90, -1));

        jCheckBoxTercerServicio.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jCheckBoxTercerServicio.setText("Revistas");
        jCheckBoxTercerServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxTercerServicioActionPerformed(evt);
            }
        });
        Background.add(jCheckBoxTercerServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 370, 90, -1));

        jRadioButtonSegundoPiso.setFont(new java.awt.Font("Roboto Black", 1, 13)); // NOI18N
        jRadioButtonSegundoPiso.setText("2° Piso");
        Background.add(jRadioButtonSegundoPiso, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, 80, 20));

        jRadioButtonPrimerPiso.setFont(new java.awt.Font("Roboto Black", 1, 13)); // NOI18N
        jRadioButtonPrimerPiso.setText("1° Piso");
        Background.add(jRadioButtonPrimerPiso, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 80, -1));

        jComboBoxLugaresOrigen.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        Background.add(jComboBoxLugaresOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, 120, 30));

        jComboBoxLugaresDestino.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jComboBoxLugaresDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxLugaresDestinoActionPerformed(evt);
            }
        });
        Background.add(jComboBoxLugaresDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, 130, 30));

        jListTipoServicio.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Economico", "Standard", "VIP" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListTipoServicio.setAutoscrolls(false);
        jScrollPane1.setViewportView(jListTipoServicio);

        Background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 550, 120, 70));

        jButtonLimpiar.setBackground(new java.awt.Color(255, 51, 102));
        jButtonLimpiar.setFont(new java.awt.Font("Roboto Condensed", 1, 16)); // NOI18N
        jButtonLimpiar.setText("Limpiar datos");
        jButtonLimpiar.setActionCommand("");
        jButtonLimpiar.setBorder(null);
        jButtonLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonLimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonLimpiarMouseExited(evt);
            }
        });
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });
        Background.add(jButtonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 560, 140, 50));

        jButtonIngresar.setBackground(new java.awt.Color(0, 232, 86));
        jButtonIngresar.setFont(new java.awt.Font("Roboto Condensed", 1, 16)); // NOI18N
        jButtonIngresar.setText("Ingresar datos");
        jButtonIngresar.setBorder(null);
        jButtonIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonIngresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonIngresarMouseExited(evt);
            }
        });
        jButtonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresarActionPerformed(evt);
            }
        });
        Background.add(jButtonIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 560, 140, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombresActionPerformed

    private void jTextFieldDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDNIActionPerformed

    private void jTextFieldDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDNIKeyTyped
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Solo ingrese numeros");
        }
    }//GEN-LAST:event_jTextFieldDNIKeyTyped

    private void jTextFieldFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFechaActionPerformed

    private void jTextFieldFechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldFechaKeyTyped
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Solo ingrese numeros (Formato : dd-mm-aaaa)");
        }
    }//GEN-LAST:event_jTextFieldFechaKeyTyped

    private void jPanelBarraDeVentanaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarraDeVentanaMousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_jPanelBarraDeVentanaMousePressed

    private void jPanelBarraDeVentanaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarraDeVentanaMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanelBarraDeVentanaMouseDragged

    private void jLabelExitBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitBotonMouseClicked
        System.exit(0);

    }//GEN-LAST:event_jLabelExitBotonMouseClicked

    private void jLabelExitBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitBotonMouseEntered
        jPanelExitBoton.setBackground(Color.red);
        jLabelExitBoton.setForeground(Color.white);
        
    }//GEN-LAST:event_jLabelExitBotonMouseEntered

    private void jPanelExitBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelExitBotonMouseEntered

    }//GEN-LAST:event_jPanelExitBotonMouseEntered

    private void jPanelExitBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelExitBotonMouseClicked
        
        
    }//GEN-LAST:event_jPanelExitBotonMouseClicked

    private void jLabelExitBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitBotonMouseExited
        jPanelExitBoton.setBackground(Color.white);
        jLabelExitBoton.setForeground(Color.red);
    }//GEN-LAST:event_jLabelExitBotonMouseExited

    private void jTextFieldNombresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldNombresMousePressed
        if (jTextFieldNombres.getText().equals("Ingrese nombres y apellidos del pasajero")){
            jTextFieldNombres.setText("");
            jTextFieldNombres.setForeground(Color.black);
        }
        if (String.valueOf(jTextFieldDNI.getText()).isEmpty()){
            jTextFieldDNI.setText("Ingrese el DNI del pasajero (Solo los 8 primeros)"); 
            jTextFieldDNI.setForeground(Color.gray);
        }
        
        if (String.valueOf(jTextFieldFecha.getText()).isEmpty()){
            jTextFieldFecha.setText("Ingrese la fecha del boleto");
            jTextFieldFecha.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jTextFieldNombresMousePressed

    private void jTextFieldDNIMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldDNIMousePressed
        if (String.valueOf(jTextFieldDNI.getText()).equals("Ingrese el DNI del pasajero (Solo los 8 primeros)")) {
            jTextFieldDNI.setText("");
            jTextFieldDNI.setForeground(Color.black);
        }
        
        if (String.valueOf(jTextFieldNombres.getText()).isEmpty()){
            jTextFieldNombres.setText("Ingrese nombres y apellidos del pasajero");
            jTextFieldNombres.setForeground(Color.gray);
        }
        
        if (String.valueOf(jTextFieldFecha.getText()).isEmpty()){
            jTextFieldFecha.setText("Ingrese la fecha del boleto");
            jTextFieldFecha.setForeground(Color.gray);
        }

    }//GEN-LAST:event_jTextFieldDNIMousePressed

    private void jTextFieldFechaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldFechaMousePressed

        
        if (jTextFieldFecha.getText().equals("Ingrese la fecha del boleto")){
            jTextFieldFecha.setText("");
            jTextFieldFecha.setForeground(Color.black);
        }
        if (String.valueOf(jTextFieldDNI.getText()).isEmpty()){
            jTextFieldDNI.setText("Ingrese el DNI del pasajero (Solo los 8 primeros)");
            jTextFieldDNI.setForeground(Color.gray);
        }
        
        if (String.valueOf(jTextFieldNombres.getText()).isEmpty()){
            jTextFieldNombres.setText("Ingrese nombres y apellidos del pasajero");
            jTextFieldNombres.setForeground(Color.gray);
        }
        
  
    }//GEN-LAST:event_jTextFieldFechaMousePressed

    private void jCheckBoxPrimerServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxPrimerServicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxPrimerServicioActionPerformed

    private void jCheckBoxSegundoServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxSegundoServicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxSegundoServicioActionPerformed

    private void jCheckBoxTercerServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxTercerServicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxTercerServicioActionPerformed

    private void jComboBoxLugaresDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxLugaresDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxLugaresDestinoActionPerformed

    private void jTextFieldNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombresKeyTyped
        char validar=evt.getKeyChar();
        
        if(Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "No puede ingresar numeros");
        }
    }//GEN-LAST:event_jTextFieldNombresKeyTyped

    private void jCheckBoxPrimerServicioMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxPrimerServicioMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxPrimerServicioMouseMoved

    private void jButtonLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLimpiarMouseEntered
        jButtonLimpiar.setBackground(new Color(255,145,172));
    }//GEN-LAST:event_jButtonLimpiarMouseEntered

    private void jButtonLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLimpiarMouseExited
        jButtonLimpiar.setBackground(new Color(255,51,102));
    }//GEN-LAST:event_jButtonLimpiarMouseExited

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jButtonIngresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonIngresarMouseEntered
        jButtonIngresar.setBackground(new Color(107,246,158));
        
    }//GEN-LAST:event_jButtonIngresarMouseEntered

    private void jButtonIngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonIngresarMouseExited
        jButtonIngresar.setBackground(new Color(0,232,86));
    }//GEN-LAST:event_jButtonIngresarMouseExited

    private void jButtonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonIngresarActionPerformed

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
            java.util.logging.Logger.getLogger(Ejercicio02CompraDePasajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio02CompraDePasajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio02CompraDePasajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio02CompraDePasajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Ejercicio02CompraDePasajes().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel JLabelDNI;
    private javax.swing.JLabel NombreDeLaEmpresa;
    private javax.swing.ButtonGroup buttonGroupBotonesParaPiso;
    private javax.swing.JButton jButtonIngresar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JCheckBox jCheckBoxPrimerServicio;
    private javax.swing.JCheckBox jCheckBoxSegundoServicio;
    private javax.swing.JCheckBox jCheckBoxTercerServicio;
    private javax.swing.JComboBox<String> jComboBoxLugaresDestino;
    private javax.swing.JComboBox<String> jComboBoxLugaresOrigen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelDestino;
    private javax.swing.JLabel jLabelExitBoton;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelLogoDeEmpresa;
    private javax.swing.JLabel jLabelNombres;
    private javax.swing.JLabel jLabelOrigen;
    private javax.swing.JLabel jLabelPisoAsiento;
    private javax.swing.JLabel jLabelServicios;
    private javax.swing.JLabel jLabelTipoBoleta;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JList<String> jListTipoServicio;
    private javax.swing.JPanel jPanelBarraDeVentana;
    private javax.swing.JPanel jPanelExitBoton;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JPanel jPanelLeft;
    private javax.swing.JRadioButton jRadioButtonPrimerPiso;
    private javax.swing.JRadioButton jRadioButtonSegundoPiso;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparatorDNI;
    private javax.swing.JSeparator jSeparatorDelEncabezado1;
    private javax.swing.JSeparator jSeparatorFecha;
    private javax.swing.JSeparator jSeparatorNombres;
    private javax.swing.JTextField jTextFieldDNI;
    private javax.swing.JTextField jTextFieldFecha;
    private javax.swing.JTextField jTextFieldNombres;
    // End of variables declaration//GEN-END:variables
}
