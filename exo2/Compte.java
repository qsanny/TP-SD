package client;
import java.rmi.Remote;

public interface Compte extends Remote {   

    public boolean depot(int montant);
    public boolean retrait(int montant);
    public int getSolde();
}
