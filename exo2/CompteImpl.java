package client;
public class CompteImpl implements Compte {

    int id;

    @Override
    public boolean depot(int montant) {
        return false;
    }

    @Override
    public boolean retrait(int montant) {
        return false;
    }

    @Override
    public int getSolde() {
        return 0;
    }
}
