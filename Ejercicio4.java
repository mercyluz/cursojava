public class Ejercicio4 {

    public static void main(String[] args) {
        
       int a = 5;
       int b = 12;
       System.out.println("el valor de a antes " + a);
       System.out.println("el valor de b antes " + b);

       a=a^b;
       b=a^b;
       a=a^b;
       int resta;
       System.out.println("el valor de a despues "+ a);
       System.out.println("el valor de b despues " + b);
           }
}