import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculadora extends Remote{

    public float divide(float num1, float num2) throws RemoteException;

    public float multiply(float num1, float num2) throws RemoteException;

    public float add(float num1, float num2) throws RemoteException;

    public float substract(float num1, float num2) throws RemoteException;
    
} 