import java.rmi.*;

public class ClientRMI {
    public static void main(String[] args) {
        try {
            InterfaceRMI service = (InterfaceRMI) Naming.lookup("rmi://localhost:1099/ConversionService");
            System.out.println(service.convertirChaine("Bonjour le monde!"));
        } catch (Exception e) {
            System.out.println("Erreur du client : " + e);
        }
    }
}
