
// Archivo "MarcoRastreadorRaton.java"
// Manejo de eventos de ratón.
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.Icon; // interfaz utilizada para manipular imágees
import javax.swing.ImageIcon; // carga las imágenes
import javax.swing.SwingConstants; // constantes comunes utilizadas con Swing
import java.awt.FlowLayout; // especifica cómo se van a ordenar los componentes

public class MarcoRastreadorRaton extends JFrame {
    private final JPanel panelRaton; // panel en el que ocurrirán los eventos de ratón
    private final JLabel barraEstado; // muestra información de los eventos
    public JLabel etiqueta1; // JLabel sólo con texto
    public JLabel etiqueta2; // JLabel construida con texto y un icono

    // El constructor de MarcoRastreadorRaton establece la GUI y
    // registra los manejadores de eventos de ratón



    public MarcoRastreadorRaton() {
        super("Demostracion de los eventos de raton");
        panelRaton = new JPanel();
        panelRaton.setBackground(Color.WHITE);
        add(panelRaton, BorderLayout.CENTER); // agrega el panel a JFrame

        barraEstado = new JLabel("Raton fuera de JPanel");
        add(barraEstado, BorderLayout.SOUTH); // agrega etiqueta a JFrame

        // crea y registra un componente de escucha para los eventos de ratón y de su
        // movimiento
        ManejadorRaton manejador = new ManejadorRaton();
        panelRaton.addMouseListener(manejador);
        panelRaton.addMouseMotionListener(manejador);

        
        
        //imprimir la magen "ImagenNumero1.png" en el panelRaton 


        Icon imagen1 = new ImageIcon(getClass().getResource("ImagenNumero1.png"));
        etiqueta1 = new JLabel("Imagen 1", imagen1, SwingConstants.LEFT);
        etiqueta1.setHorizontalTextPosition(SwingConstants.CENTER);
        etiqueta1.setVerticalTextPosition(SwingConstants.BOTTOM);
        etiqueta1.setToolTipText("Imagen 1");
        add(etiqueta1, BorderLayout.NORTH);

        //imprimir la magen "ImagenNumero1.png" en el panelRaton a la derecha de la imagen1
        Icon imagen2 = new ImageIcon(getClass().getResource("ImagenNumero2.png"));
        etiqueta2 = new JLabel("Imagen 2", imagen2, SwingConstants.LEFT);
        etiqueta2.setHorizontalTextPosition(SwingConstants.CENTER);
        etiqueta2.setVerticalTextPosition(SwingConstants.BOTTOM);
        etiqueta2.setToolTipText("Imagen 2");
        add(etiqueta2, BorderLayout.EAST);
        

        


    

        JButton boton1 = new JButton("imagen1");
        boton1 = new JButton("imagen1");
        // al hacer click sobre el boton mostrara la ImagenNumero1.png
        JButton boton2 = new JButton("imagen2");
        boton2 = new JButton("imagen2");


    }



    private class ManejadorRaton implements MouseListener, MouseMotionListener {
        // Los manejadores de eventos de MouseListener
        // manejan el evento cuando se suelta el ratón justo después de oprimir el botón
        @Override
        public void mouseClicked(MouseEvent evento) {
            barraEstado.setText(String.format("Se hizo clic en [%d, %d]", evento.getX(),
                    evento.getY()));



        }

        // maneja evento cuando se oprime el ratón
        @Override
        public void mousePressed(MouseEvent evento) {
            barraEstado.setText(String.format("Se oprimio en [%d, %d]", evento.getX(),
                    evento.getY()));
        }

        // maneja evento cuando se suelta el botón del ratón
        @Override
        public void mouseReleased(MouseEvent evento) {
            barraEstado.setText(String.format("Se solto en [%d, %d]", evento.getX(),
                    evento.getY()));
        }

        // maneja evento cuando el ratón entra al área
        @Override
        public void mouseEntered(MouseEvent evento) {
            barraEstado.setText(String.format("Raton entro en [%d, %d]", evento.getX(),
                    evento.getY()));
            panelRaton.setBackground(Color.RED);
        }

        // maneja evento cuando el ratón sale del área
        @Override
        public void mouseExited(MouseEvent evento) {
            barraEstado.setText("Raton fuera de JPanel");
            panelRaton.setBackground(Color.BLUE);
        }

        // Los manejadores de eventos de MouseMotionListener manejan
        // el evento cuando el usuario arrastra el ratón con el botón oprimido
        @Override
        public void mouseDragged(MouseEvent evento) {
            barraEstado.setText(String.format("Se arrastro en [%d, %d]", evento.getX(),
                    evento.getY()));
        }

        // maneja evento cuando el usuario mueve el ratón
        @Override
        public void mouseMoved(MouseEvent evento) {
            barraEstado.setText(String.format("Se movio en [%d, %d]", evento.getX(),
                    evento.getY()));
        }
    } // fin de la clase interna ManejadorRaton
} // fin de la clase MarcoRastreadorRaton