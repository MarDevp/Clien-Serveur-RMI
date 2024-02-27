import java.rmi.*;

public interface InterfaceRMI extends Remote {
    String convertirChaine(String chaine) throws RemoteException;
}
