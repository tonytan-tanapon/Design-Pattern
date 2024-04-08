package rmi;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.*;

public class RMIServer extends UnicastRemoteObject implements ServerInterface
{
   private String myString = "";

   // The default constructor
   public RMIServer() throws RemoteException
     {
       super();
     }

   // Implement the methods from the ServerInterface
   public void setString(String s) throws RemoteException
     {
       this.myString = s;
     }

   public String getString() throws RemoteException
     {
       return myString;
     }

   // The main method: instantiate and register an instance of the
   // RMIServer with the rmi registry.
   public static void main(String argv[])
     {
       try
         {
           String name = "RMIServer";
           System.out.println("Registering as: \""+name+"\"");
           RMIServer theServer = new RMIServer();
           Naming.rebind(name,theServer);
           System.out.println(name+" ready...");
        }
      catch(Exception e)
        {
           System.out.println("Exception while registering: "+e);
         }
     }
}