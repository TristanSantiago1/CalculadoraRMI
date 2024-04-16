import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Servidor {

    public static void main(String[] args)  {
        int PUERTO = 9000;
        
        String servidor = "localhost";
        //String servidor = "192.168.56.106";

        System.out.println("Inciando servidor en :");
        System.out.println("hostname : " + servidor);
        System.out.println("Puerto : "+ PUERTO);

        try {
            Registry registro = LocateRegistry.createRegistry(PUERTO);
            System.setProperty("java.rmi.server.hostname", servidor);
            registro.rebind("Calculadora", new CalcRMI());

            System.out.println("Serivdor en ejcucion en espera de clientes...");
            
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        

        
    }
    
}
