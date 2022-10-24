
// Fin de App Prueba Label
// Archivo “LabelFrame.java”
// Componentes Jlabel con texto e iconos.
import java.awt.FlowLayout; // especifica cómo se van a ordenar los componentes
import javax.swing.JFrame; // proporciona las características básicas de una ventana
import javax.swing.JLabel; // muestra texto e imágenes
import javax.swing.SwingConstants; // constantes comunes utilizadas con Swing
import javax.swing.Icon; // interfaz utilizada para manipular imágees
import javax.swing.ImageIcon; // carga las imágenes

public class LabelFrame extends JFrame {
    private JLabel etiqueta1; // JLabel sólo con texto
    private JLabel etiqueta2; // JLabel construida con texto y un icono
    private JLabel etiqueta3; // JLabel con texto adicional e icono 15
    // El constructor de LabelFrame agrega objetos JLabel a JFrame

    public LabelFrame() {
        // Constructor de JLabel con un argumento String
        super("Prueba de JLabel");
        setLayout(new FlowLayout()); // establece el esquema del marco
        // Constructor de JLabel con un argumento String
        etiqueta1 = new JLabel("Etiqueta con texto");
        etiqueta1.setToolTipText("Esta es etiqueta1");
        add(etiqueta1); // agrega etiqueta1 a JFrame
        // Constructor de JLabel con argumentos de cadena, Icono y alineación
        etiqueta1.setText("Etiqueta con icono y texto en la parte inferior");
        Icon insecto = new ImageIcon(getClass().getResource("insecto1.png"));


        etiqueta2 = new JLabel(null, insecto, SwingConstants.LEFT);
        etiqueta2.setToolTipText("hola");

        add(etiqueta2); // agrega etiqueta2 a JFrame

        //si se hace click sobre insecto se muestra el mensaje "hola"
        


        etiqueta3 = new JLabel(); // constructor de JLabel sin argumentos
        etiqueta3.setHorizontalTextPosition(SwingConstants.CENTER);
        etiqueta3.setVerticalTextPosition(SwingConstants.BOTTOM);
        etiqueta3.setToolTipText("Esta es etiqueta3");
        add(etiqueta3); // agrega etiqueta3 a JFrame
    }
} // fin de la clase LabelFrame