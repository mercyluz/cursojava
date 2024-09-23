import java.util.Random;
public class ejercicio14

 {
    public static void main(String[] args) {
        
  
   String contrasena ="";
   String c= "abcdefghiAbcdefgh$%&/)=?¿@#";
   Random random =new Random();

 for (int i=0; i<8;i++) {
 int indice=random.nextInt(c.length());
 contrasena += c.charAt(indice);
 }
 System.out.println("contraseña  " + contrasena);
 }
}