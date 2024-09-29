import javax.swing.JOptionPane;
public class Ejercicio11{

    public static void main(String[] args) {
     int opcion=0;
     double num1, exponente;
     double resultado;
     do{
     opcion=Integer.parseInt(JOptionPane.showInputDialog("1 raiz cuadrada"+"\n"+"2 potencia\n"+ 
     "3 Valor Absoluto\n" + "4 Salir\n"+ "ingresa una option\n"));
     
     switch(opcion)
     {
        case 1:
        num1=Double.parseDouble(JOptionPane.showInputDialog("ingrese el primer valor"));
    
        resultado=Math.sqrt(num1);
        JOptionPane.showMessageDialog(null, "La raiz cuadrada es:" + resultado);
       break;
        case 2:
        num1=Double.parseDouble(JOptionPane.showInputDialog("ingrese el valor de la base"));
        exponente=Double.parseDouble(JOptionPane.showInputDialog("ingrese el valor del exponente"));
        resultado=Math.pow(num1,exponente);
        JOptionPane.showMessageDialog(null, "El resultado es:" + resultado);
        break;
        case 3:
        num1=Double.parseDouble(JOptionPane.showInputDialog("ingrese el primer valor"));
      
        resultado=Math.abs(num1);
        JOptionPane.showMessageDialog(null, "El valor absoluto es:" + resultado);
        break;
        
        case 4:
       JOptionPane.showMessageDialog(null,"El programa ha finalizado"); 
     } 
    }while(opcion!=4);
    }
    }
