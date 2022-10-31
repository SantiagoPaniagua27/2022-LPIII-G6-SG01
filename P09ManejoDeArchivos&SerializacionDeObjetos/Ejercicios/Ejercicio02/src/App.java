
//Clase App
//Clase App
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.awt.FlowLayout;
import javax.swing.JFrame;

public class App extends JFrame {
	private javax.swing.JPanel Background;
	private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
	public static final int LEFT = 0;

	public App() {
        initComponents();
        setLayout(new FlowLayout());
    }

	private void initComponents() {
        Background = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
		int LineasDelTexto = 0; 
		int PalabrasDelTexto = 0;
		int CaracteresDelTexto = 0;
		String NombreDelArchivo = "leer.txt"; 
		File archivo = new File(NombreDelArchivo); 
        BufferedReader br = null;
        try {
			br = new BufferedReader(new FileReader(archivo));
			String str;
			try {
				while ((str = br.readLine()) != null) {
					LineasDelTexto++;
					String[] words = str.split(" ");
					for (String word : words) {
						PalabrasDelTexto++; 
						for (int i = 0; i < word.length(); i++) {
							char c =  word.charAt(i);
							if(Character.isLetterOrDigit(c)) {
								CaracteresDelTexto++;
							}
						}
					}
				}
			} catch (IOException e) {
				System.out.println("Error al leer el archivo");
			}
		} catch (FileNotFoundException e) {
			System.out.println("El archivo no existe");
		}
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        Background.setLayout(new java.awt.FlowLayout());
        jLabel1.setText("File: " + NombreDelArchivo);
		add(jLabel1);
		add(new javax.swing.JLabel(" "));
		jLabel1.setHorizontalAlignment(0);

        jLabel2.setText("Lines = " + LineasDelTexto);
		add(jLabel2);
		jLabel2.setHorizontalAlignment(0);
		add(new javax.swing.JLabel(" "));

        jLabel3.setText("Word = \n" + PalabrasDelTexto);
        jLabel3.setBounds(20, 20, 100, 100);
		add(jLabel3);
		add(new javax.swing.JLabel(" "));
		jLabel3.setHorizontalAlignment(0);

        jLabel4.setText("Chars = " + CaracteresDelTexto);
        jLabel4.setBounds(20, 20, 100, 100);
		add(jLabel4);
		jLabel3.setHorizontalAlignment(0);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        pack();	
    }
    public static void main(String args[]) {
		try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);

            }
        });
    }                  
}

