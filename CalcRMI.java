import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalcRMI extends UnicastRemoteObject implements Calculadora {

    protected CalcRMI() throws RemoteException {
        super();
    }

    @Override
    public float divide(float num1, float num2) throws RemoteException {
        return num1/num2;
    }

    @Override
    public float multiply(float num1, float num2) throws RemoteException {
        return num1*num2;    
    }

    @Override
    public float add(float num1, float num2) throws RemoteException {
        return num1+num2;
    }

    @Override
    public float substract(float num1, float num2) throws RemoteException {
        return num1-num2;
    }
    
}
