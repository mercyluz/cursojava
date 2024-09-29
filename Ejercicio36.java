import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
 
public class Ejercicio36 {
    public static void main(String[] args) {
         
        List<String> colores;
        colores = new ArrayList<String>();
         
        colores.add("verde");
        colores.add("rojo");
        colores.add("rojo");
        colores.add("amarillo");
        colores.add("azul");
        colores.add("azul");
        colores.add("azul");
        colores.add("blanco");
         
        System.out.printf("Colores%n");
        for (String s : colores) {
            System.out.println(s);
        }
         
        Set<String> hashSet = new HashSet<String>(colores);
        colores.clear();
        colores.addAll(hashSet);
 
        System.out.printf("%n%nColores sin repetición%n");
        for (String s : colores) {
            System.out.println(s);
        }
 
    }
     
}
