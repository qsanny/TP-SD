
import java.rmi.*;

public interface ObjectFactory extends Remote {
 public Compte getCompte(int id) throws java.rmi.RemoteException;
}
