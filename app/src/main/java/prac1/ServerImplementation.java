package prac1;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Stack;

public class ServerImplementation extends UnicastRemoteObject implements ServerInterface {
    Stack<Integer> stack = new Stack<Integer>();

    public ServerImplementation() throws RemoteException {
        stack = new Stack<Integer>();
    }

    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public void push(int num) {
        stack.push(num);
    }

    @Override
    public Stack<Integer> get() {
        return stack;
    }


}
