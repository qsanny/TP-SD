import java.rmi.*;

public class ClientHello{
  public static void main(String arg[]){
    try{
     Hello h=(Hello) Naming.lookup("rmi://172.31.18.58:1099/nomdelobjet");
     String messageRecu=h.ditBonjour();
     System.out.println(messageRecu);

    }
    catch (Exception e){
     System.err.println("Erreur :"+e);
    }
  }
}
