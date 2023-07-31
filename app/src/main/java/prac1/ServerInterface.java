package prac1;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Stack;

interface ServerInterface extends Remote {
    public static final String SERVICE_URL = "//localhost/simple";
    /** Adds two numbers together */
    int sum(int a, int b) throws RemoteException;

    /** Pushes a value onto the server's array */
    void push(int val) throws RemoteException;

    /** Returns the server's array */
    Stack<Integer> get() throws RemoteException;
}
