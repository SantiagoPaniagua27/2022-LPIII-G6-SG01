/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a7s9;

import java.nio.file.Files;
import javax.swing.JOptionPane;
import java.io.IOException;
import javax.swing.JFrame;
import java.nio.file.Path;
import java.nio.file.DirectoryStream;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class DemoJFileChooser extends JFrame {

    private final JTextArea areaSalida;

    public DemoJFileChooser() throws IOException {
        super("Demo de JFileChooser");
        areaSalida = new JTextArea();
        add(new JScrollPane(areaSalida));
        analizarRuta();
    }

    public void analizarRuta() throws IOException {
        Path ruta = obtenerRutaArchivoDirectorio();
        if (ruta != null && Files.exists(ruta)) {
            StringBuilder builder = new StringBuilder();
            builder.append(String.format("%s:%n", ruta.getFileName()));
            builder.append(String.format("%S un directorio%n", Files.isDirectory(ruta) ? " Es: " : " No es "));
            builder.append(String.format("%S una ruta absoluta%n", ruta.isAbsolute() ? " Es: " : " No es "));
            builder.append(String.format("ultima modificacion: %s%n", Files.getLastModifiedTime(ruta)));
            builder.append(String.format("Tamanio: %s%n", Files.size(ruta)));
            builder.append(String.format("Ruta: %s%n", ruta));
            builder.append(String.format("Ruta absoluta: %s%n", ruta.toAbsolutePath()));

            if (Files.isDirectory(ruta)) {
                builder.append(String.format("%nContenido del directorio: %n"));

                DirectoryStream<Path> flujoDirectorio = Files.newDirectoryStream(ruta);

                for (Path p : flujoDirectorio) {
                    builder.append(String.format("%s%n", p));
                }
            }
            areaSalida.setText(builder.toString());
        } else {
            JOptionPane.showMessageDialog(this, ruta.getFileName() + " no existe.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    private Path obtenerRutaArchivoDirectorio() {
        JFileChooser selectorArchivos = new JFileChooser();
        selectorArchivos.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int resultado = selectorArchivos.showOpenDialog(this);
        if (resultado == JFileChooser.CANCEL_OPTION) {
            System.exit(1);
        }
        return selectorArchivos.getSelectedFile().toPath();
    }
}
