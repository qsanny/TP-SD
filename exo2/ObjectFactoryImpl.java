
import java.rmi.RemoteException;
import java.util.ArrayList;

public class ObjectFactoryImpl implements ObjectFactory {

    ArrayList<Compte> comptes;

    @Override
    public Compte getCompte(int id) throws RemoteException {
        return new CompteImpl();
    }
    
}
