
import java.rmi.Naming;


public class Client {
    public static void main(String[] args) {
        try{
            BagOfTasks bot=(BagOfTasks) Naming.lookup("mybagoftask");
            
       
        }
            catch (Exception e){
            System.err.println("Erreur :"+e);
        }
    }
}
