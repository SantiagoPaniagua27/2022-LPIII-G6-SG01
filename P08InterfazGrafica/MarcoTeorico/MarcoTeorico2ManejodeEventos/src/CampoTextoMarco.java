
// Archivo "CampoTextoMarco.java"
// Los componentes JTextField y JPasswordField.
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import javax.swing.JLabel; // muestra texto e imágenes

public class CampoTextoMarco extends JFrame {
    private final JTextField campoTexto1; // campo de texto con tamaño fijo
    private final JTextField campoTexto2; // campo de texto con texto
    private final JTextField campoTexto3; // campo de texto con texto y tamaño
    private final JPasswordField campoContrasenia; // campo de contraseña con texto
    private JLabel Etiqueta1; // campo de texto con texto y tamaño
    private JLabel Etiqueta2; // campo de texto con texto y tamaño
    private JLabel Etiqueta3; // campo de texto con texto y tamaño
    private JLabel Etiqueta4; // campo de texto con texto y tamaño
    // El constructor de CampoTextoMarco agrega objetos JTextField a JFrame

    public CampoTextoMarco() {
        super("Prueba de JTextField y JPasswordField");
        setLayout(new FlowLayout());

        //Etiqueta
        Etiqueta1 = new JLabel("Etiqueta 4");
        add(Etiqueta1);
        Etiqueta1.setText("Etiqueta ingrese el nombre: ");
        //Fin etiqueta


        // construye campo de texto con 10 columnas
        campoTexto1 = new JTextField(10);
        add(campoTexto1); // agrega campoTexto1 a JFrame
        //indicar al usuario que ingrese el nombre
        campoTexto1.setText("Ingrese el nombreeee");

        //Etiqueta
        Etiqueta2 = new JLabel("Etiqueta 5");
        add(Etiqueta2);
        Etiqueta2.setText("Etiqueta escriba el texto aqui: ");
        //Fin etiqueta

        // construye campo de texto con texto predeterminado
        campoTexto2 = new JTextField("Escriba el texto aqui");
        add(campoTexto2); // agrega campoTexto2 a JFrame

        //Etiqueta
        Etiqueta3 = new JLabel("Etiqueta 4");
        add(Etiqueta3);
        Etiqueta3.setText("Etiqueta texto no editable: ");
        //Fin etiqueta

        // construye campo de texto con texto predeterminado y 21 columnas
        campoTexto3 = new JTextField("Campo de texto no editable", 21);
        campoTexto3.setEditable(false); // deshabilita la edición
        add(campoTexto3); // agrega campoTexto3 a JFrame

        //Etiqueta
        Etiqueta4 = new JLabel("Etiqueta 4");
        add(Etiqueta4);
        Etiqueta4.setText("Etiqueta contraseña: ");
        //Fin etiqueta

        // construye campo de contraseña con texto predeterminado
        campoContrasenia = new JPasswordField("Texto oculto");
        add(campoContrasenia); // agrega campoContrasenia a JFrame
        // registra los manejadores de eventos
        ManejadorCampoTexto manejador = new ManejadorCampoTexto();
        campoTexto1.addActionListener(manejador);
        campoTexto2.addActionListener(manejador);
        campoTexto3.addActionListener(manejador);
        campoContrasenia.addActionListener(manejador);
      
    }

    // clase interna privada para el manejo de eventos
    private class ManejadorCampoTexto implements ActionListener {
        // procesa los eventos de campo de texto
        @Override
        public void actionPerformed(ActionEvent evento) {
            String cadena = "";
            // el usuario oprimió Intro en el objeto JTextField campoTexto1
            if (evento.getSource() == campoTexto1){
                //al hacer click sobre Etiqueta1 se muestra el texto ingresado en campoTexto1
                Etiqueta1.setText(campoTexto1.getText());
                cadena = String.format("campoTexto1: %s", evento.getActionCommand());
                
            } else if (evento.getSource() == campoTexto2)
                cadena = String.format( Etiqueta2.getText());
            // el usuario oprimió Intro en el objeto JTextField campoTexto3
            else if (evento.getSource() == campoTexto3)
                cadena = String.format( Etiqueta3.getText());

            // el usuario oprimió Intro en el objeto JTextField campoContrasenia
            else if (evento.getSource() == campoContrasenia)
                cadena = String.format( Etiqueta4.getText());
            // muestra el contenido del objeto JTextField
            JOptionPane.showMessageDialog(null, cadena);
        }
    } // fin de la clase privada interna ManejadorCampoTexto
} // fin de la clase CampoTextoMarco
