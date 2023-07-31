package prac1;

import java.rmi.registry.LocateRegistry;
import java.rmi.Naming;


public class Server {
    public Server() {
        try {
            ServerImplementation impl = new ServerImplementation();
            LocateRegistry.createRegistry(1099);
            Naming.rebind(ServerInterface.SERVICE_URL, impl);
            System.out.println("Server listening on " + ServerInterface.SERVICE_URL);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
