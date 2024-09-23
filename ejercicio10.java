import javax.swing.JOptionPane;
public class ejercicio10 {

    public static void main(String[] args) {
     int opcion=0;
     double num1, num2;
     double resultado;
     do{
     opcion=Integer.parseInt(JOptionPane.showInputDialog("1 sumar"+"\n"+"2 Restar\n"+ 
     "3 Multiplicar\n"+ "4 Dividir\n" + "5 Salir\n"+ "ingresa una option\n"));
     
     switch(opcion)
     {
        case 1:
        num1=Double.parseDouble(JOptionPane.showInputDialog("ingrese el primer valor"));
        num2=Double.parseDouble(JOptionPane.showInputDialog("ingrese el segundo valor"));
        resultado=num1+num2;
        JOptionPane.showMessageDialog(null, "El resultado es:" + resultado);
       break;
        case 2:
        num1=Double.parseDouble(JOptionPane.showInputDialog("ingrese el primer valor"));
        num2=Double.parseDouble(JOptionPane.showInputDialog("ingrese el segundo valor"));
        resultado=num1-num2;
        JOptionPane.showMessageDialog(null, "El resultado es:" + resultado);
        break;
        case 3:
        num1=Double.parseDouble(JOptionPane.showInputDialog("ingrese el primer valor"));
        num2=Double.parseDouble(JOptionPane.showInputDialog("ingrese el segundo valor"));
        resultado=num1*num2;
        JOptionPane.showMessageDialog(null, "El resultado es:" + resultado);
        break;
        case 4:
        num1=Double.parseDouble(JOptionPane.showInputDialog("ingrese el primer valor"));
        num2=Double.parseDouble(JOptionPane.showInputDialog("ingrese el segundo valor"));
        resultado=num1/num2;
        JOptionPane.showMessageDialog(null, "El resultado es:" + resultado);
       break;
        case 5:
       JOptionPane.showMessageDialog(null,"El programa ha finalizado"); 
     } 
    }while(opcion!=5);
    }
    }
