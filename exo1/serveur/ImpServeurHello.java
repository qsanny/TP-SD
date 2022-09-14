import java.rmi.server.*;
import java.net.*;
import java.rmi.*;

public class ImpServeurHello extends UnicastRemoteObject implements Hello {
public ImpServeurHello() throws RemoteException{super();}
public String ditBonjour() throws RemoteException{return "bonjour a tous. Ici c'est Qadir";}
public static void main(String arg[]){
try{
ImpServeurHello s=new ImpServeurHello();
 String nom="qadir";
 Naming.rebind(nom,s); //enregistrement
 System.out.println("Serveur enregistr");
 }
 catch (Exception e){System.err.println("Erreur :"+e);}
 }
}
