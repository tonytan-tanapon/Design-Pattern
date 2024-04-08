package rmi;
import java.rmi.*;

public interface ServerInterface extends Remote
{

   public String getString() throws RemoteException;
   public void setString(String s) throws RemoteException;

}