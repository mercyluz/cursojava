import java.util.Random;
public class Ejercicio14{
    public static void main(String[] args) {
        
  
    String contrasena ="";
    String c= "abcdefghiAbcdefgh$%&/)=?¿@#";
    Random random =new Random();
    int indice;
      
    for (int i=0; i<8;i++) {
    indice=random.nextInt(c.length());
    contrasena += c.charAt(indice);
 }
    System.out.println("contraseña  " + contrasena);
 }
}