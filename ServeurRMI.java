import java.rmi.*;
import java.rmi.server.*;

public class ServeurRMI extends UnicastRemoteObject implements InterfaceRMI {
    public ServeurRMI() throws RemoteException {
        super();
    }

    public String convertirChaine(String chaine) throws RemoteException {
        return chaine.toUpperCase();
    }

    public static void main(String[] args) {
        try {
            Naming.rebind("rmi://localhost:1099/ConversionService", new ServeurRMI());
            System.out.println("Serveur RMI est prêt.");
        } catch (Exception e) {
            System.out.println("Erreur du serveur : " + e);
        }
    }
}
