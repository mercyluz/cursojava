import javax.swing.JOptionPane;
public class ejercicio9 {

    public static void main(String[] args) {
     
        String mensajeNombre = "ingrese su mombre";
        String nombre = JOptionPane.showInputDialog(mensajeNombre);
        JOptionPane.showMessageDialog(null, "Hola " + nombre);
    }
}