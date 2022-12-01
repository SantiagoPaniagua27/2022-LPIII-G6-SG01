package ejercicio2;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;


public class Ejercicio2 extends javax.swing.JFrame {
    int fila;
     DefaultTableModel tablemodel;

    public Ejercicio2() {
        initComponents();
   
        try {
            tablemodel = mostrardatos();
        } catch (SQLException ex) {
            Logger.getLogger(Ejercicio2.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTextAddress.setText(tablemodel.getValueAt(fila, 0).toString());
        jTextFirstName.setText(tablemodel.getValueAt(fila, 1).toString());
        jTextLastName.setText(tablemodel.getValueAt(fila, 2).toString());
        jTextEmail.setText(tablemodel.getValueAt(fila, 3).toString());
        jTextPhoneNumber.setText(tablemodel.getValueAt(fila, 3).toString());
    }
    

    private void BtnMostrarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        try {
            mostrar("agenda");
        } catch (SQLException ex) {
            Logger.getLogger(Ejercicio_2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Ejercicio_2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                          
 
    public static DefaultTableModel mostrardatos() throws SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
        rowSet.setUrl("jdbc:mysql://localhost:3307/ejercicio_1");
        rowSet.setUsername("root");
        rowSet.setPassword("root");
        DefaultTableModel modelotable;
        
        Statement stm = con.createStatement();
        modelotable = new DefaultTableModel(null, new String[]{"ID","Nombre","Apellidos","Email","Telefono"});
        String list[] = new String[5];
        rowSet.setCommand("select * from agenda");
        rowSet.execute();
        while (rowSet.next()) {
               list [0]=rowSet.getString("idAddress");
               list [1]=rowSet.getString("firstName");
               list [2]=rowSet.getString("lastName");
               list [3]=rowSet.getString("email");
               list [4]=rowSet.getString("phoneNumber");
            modelotable.addRow(list);
        }
        return modelotable;
    }

    /////Interface Rowsset/////
    public void mostrar(String tabla) throws SQLException, ClassNotFoundException {
        //Variables        
        String sql = jTextSQL.getText();

        //Conexion
        Class.forName("com.mysql.cj.jdbc.Driver");
        JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
        rowSet.setUrl("jdbc:mysql://localhost:3307/ejercicio_1");
        rowSet.setUsername("root");
        rowSet.setPassword("root");

        if (jTextSQL.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese una sentencia SQL");
        } else {
            rowSet.setCommand(sql);
            rowSet.execute();
        }

        System.out.println("sql");
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("idAddress");
        model.addColumn("firstName");
        model.addColumn("lastName");
        model.addColumn("email");
        model.addColumn("phoneNumber");
        
        TMostrar.setModel(model);

        String[] datos = new String[5];

        try {

            while (rowSet.next()) {
                datos[0] = rowSet.getString(1);
                datos[1] = rowSet.getString(2);
                datos[2] = rowSet.getString(3);
                datos[3] = rowSet.getString(4);
                datos[4] = rowSet.getString(5);
                
                model.addRow(datos);
            }

        } catch (SQLException e) {
          
                model.addRow(datos);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error " + e.toString());
        }

    }

    public void filtrar(String tabla) throws SQLException, ClassNotFoundException {
        //Variables        
        String sql = "SELECT * FROM cursos WHERE " + jTextFiltrar.getText();

        //Conexion
        Class.forName("com.mysql.cj.jdbc.Driver");
        JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
        rowSet.setUrl("jdbc:mysql://localhost:3307/ejercicio_1");
        rowSet.setUsername("root");
        rowSet.setPassword("root");

        if (jTextFiltrar.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese una sentencia SQL");
        } else {
            rowSet.setCommand(sql);
            rowSet.execute();
        }

        System.out.println("sql");
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("IdCurso");
        model.addColumn("Descripcion");
        model.addColumn("Credito");
        TMostrar.setModel(model);

        String[] datos = new String[3];

        try {

            while (rowSet.next()) {
                datos[0] = rowSet.getString(1);
                datos[1] = rowSet.getString(2);
                datos[2] = rowSet.getString(3);
                model.addRow(datos);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error " + e.toString());
        }

    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBtnPrevious = new javax.swing.JButton();
        jBtnNext = new javax.swing.JButton();
        jTextIndice = new javax.swing.JTextField();
        jTextIndiceTotal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextBuscador = new javax.swing.JTextField();
        jBtnFind = new javax.swing.JButton();
        jBtnBrowse = new javax.swing.JButton();
        jBtnInsert = new javax.swing.JButton();
        jTextAddress = new javax.swing.JTextField();
        jTextFirstName = new javax.swing.JTextField();
        jTextLastName = new javax.swing.JTextField();
        jTextEmail = new javax.swing.JTextField();
        jTextPhoneNumber = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBtnPrevious.setText("Previous");

        jBtnNext.setText("Next");

        jTextIndice.setText("2");

        jTextIndiceTotal.setText("5");

        jLabel1.setText("of");

        jLabel2.setText("Address ID:");

        jLabel3.setText("First Name");

        jLabel4.setText("Last Name");

        jLabel5.setText("Email");

        jLabel6.setText("Phone Number");

        jLabel7.setText("Find an entry by last name");

        jLabel8.setText("Last Name:");

        jTextBuscador.setText("Zavala");

        jBtnFind.setText("Find");

        jBtnBrowse.setText("Browse All Entries");

        jBtnInsert.setText("Insert New Entry");

        jTextLastName.setText("Zavala");

        jTextEmail.setText("jaely_10@hotmail.com");

        jTextPhoneNumber.setText("957398844");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jBtnPrevious)
                            .addGap(31, 31, 31)
                            .addComponent(jTextIndice, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(16, 16, 16)
                            .addComponent(jTextIndiceTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jBtnNext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jBtnBrowse)
                            .addGap(18, 18, 18)
                            .addComponent(jBtnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(18, 18, 18)
                            .addComponent(jTextBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBtnFind))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnPrevious)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextIndiceTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(jTextIndice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBtnNext))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jLabel7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtnFind))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel8)))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnBrowse)
                    .addComponent(jBtnInsert))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnBrowse;
    private javax.swing.JButton jBtnFind;
    private javax.swing.JButton jBtnInsert;
    private javax.swing.JButton jBtnNext;
    private javax.swing.JButton jBtnPrevious;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextAddress;
    private javax.swing.JTextField jTextBuscador;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextFirstName;
    private javax.swing.JTextField jTextIndice;
    private javax.swing.JTextField jTextIndiceTotal;
    private javax.swing.JTextField jTextLastName;
    private javax.swing.JTextField jTextPhoneNumber;
    // End of variables declaration//GEN-END:variables
}
