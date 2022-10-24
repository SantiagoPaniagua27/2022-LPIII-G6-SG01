
// Fig. 12.36: MarcoDemoTeclas.java
// Manejo de eventos de teclas.
import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MarcoDemoTeclas extends JFrame implements KeyListener {
    private String linea1 = ""; // primera línea del área de texto
    private String linea2 = ""; // segunda línea del área de texto
    private String linea3 = ""; // tercera línea del área de texto
    private JTextArea areaTexto; // área de texto para mostrar la salida
    public String comparador = "";
    // constructor de MarcoDemoTeclas

    public MarcoDemoTeclas() {
        super("Demostracion de los eventos de pulsacion de teclas");

        areaTexto = new JTextArea(10, 15); // establece el objeto JTextArea
        areaTexto.setText("Oprima cualquier tecla en el teclado...");
        areaTexto.setEnabled(false);
        areaTexto.setDisabledTextColor(Color.BLACK);
        add(areaTexto); // agrega el área de texto a JFrame
        addKeyListener(this); // permite al marco procesar los eventos de teclas
    }

    // maneja el evento de oprimir cualquier tecla
    @Override
    public void keyPressed(KeyEvent evento) {
        linea1 = String.format("Tecla oprimida: %s",KeyEvent.getKeyText(evento.getKeyCode())); // muestra la tecla oprimida
        System.out.println(KeyEvent.getKeyText(evento.getKeyCode()));
        String letra=KeyEvent.getKeyText(evento.getKeyCode());

        if (evento.isActionKey()==false) {
            //si la tecla presionada es la tecla R cambiar el color de fondo a rojo
            if (letra.equals("R")) {
                areaTexto.setBackground(Color.red);
            }
            if(letra.equals("V")){
                areaTexto.setBackground(Color.GREEN);
            }
        }

        if (evento.isActionKey()) {
            //si presiono la direecional derecha cambiar el color de fondo a azul
            if (letra.equals("Right")) {
                areaTexto.setBackground(Color.BLUE);
            }
            if (letra.equals("Left")){
                areaTexto.setBackground(Color.YELLOW);
            }
            if (letra.equals("F1")){
                areaTexto.setBackground(Color.PINK);
            }
        }

        //si presiono la tecla shift cambiar el color de fondo a blanco
        if (evento.isActionKey()==false) {
            if (letra.equals("Shift")){
                System.out.println("esto "+letra);
                areaTexto.setBackground(Color.orange);
                if (letra.equals("/")){
                    areaTexto.setBackground(Color.gray);
                    System.out.println("esto "+letra);
                }
            }
        }




        establecerLineas2y3(evento); // establece las líneas de salida dos y tres
    }

    // maneja el evento de liberar cualquier tecla
    @Override
    public void keyReleased(KeyEvent evento) {
        linea1 = String.format("Tecla liberada: %s",
                KeyEvent.getKeyText(evento.getKeyCode())); // muestra la tecla liberada
        establecerLineas2y3(evento); // establece las líneas de salida dos y tres
    }

    // maneja el evento de oprimir una tecla de acción
    @Override
    public void keyTyped(KeyEvent evento) {
        linea1 = String.format("Tecla oprimida: %s", evento.getKeyChar());
        establecerLineas2y3(evento); // establece las líneas de salida dos y tres
    }

    // establece las líneas de salida dos y tres
    private void establecerLineas2y3(KeyEvent evento) {
        linea2 = String.format("Esta tecla %s es una tecla de accion",
                (evento.isActionKey() ? "" : "no"));




        String temp = KeyEvent.getModifiersExText(evento.getModifiersEx());
        linea3 = String.format("Teclas modificadoras oprimidas: %s",
                (temp.equals("") ? "ninguna" : temp)); // imprime modificadoras
        areaTexto.setText(String.format("%s\n%s\n%s\n", linea1, linea2, linea3)); //
        // imprime tres líneas de texto
    }
} // fin de la clase MarcoDemoTeclas