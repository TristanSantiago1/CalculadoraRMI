import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.swing.JOptionPane;

public class Cliente {


    public static void main(String[] args){
        int PUERTO = 9000;
        String servidor = "localhost";
        //String servidor = "192.168.56.106";

        try{
            Calculadora calc = (Calculadora) Naming.lookup("rmi://"+servidor+":"+PUERTO+"/Calculadora");
            while(true){
                String opt = JOptionPane.showInputDialog(
                    "Calcular\n"+
                        "Suma -> 1\n" +
                        "Resta -> 2\n" +
                        "Multiplicación -> 3\n" +
                        "División -> 4\n\n" +
                        "Cancelar para salir\n"                         
                );
                if(opt == null){
                    break;
                }

                int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer numero"));
                int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el Segundo numero"));
                
                switch (opt) {
                    case "1":
                        JOptionPane.showMessageDialog(null, numero1+"+"+numero2+" = " + calc.add(numero1, numero2));
                        break;
                    case "2":
                        JOptionPane.showMessageDialog(null, numero1+"-"+numero2+" = " + calc.substract(numero1, numero2));
                        break;
                    case "3":
                        JOptionPane.showMessageDialog(null, numero1+" x "+numero2+" = " + calc.multiply(numero1, numero2));
                        break;
                    case "4":
                        JOptionPane.showMessageDialog(null, numero1+"/"+numero2+" = " + calc.divide(numero1, numero2));
                        break;
                    default:
                        break;
                }
            }
        }catch(RemoteException | NotBoundException | MalformedURLException ex){

        }
    }


}
