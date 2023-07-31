package prac1;

import java.rmi.Naming;
import java.util.Stack;

public class Client {
    private ServerInterface exec;

    public Client() {
        try {
            exec = (ServerInterface) Naming.lookup(ServerInterface.SERVICE_URL);    
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public int sum(int a, int b) {
        try {
            return exec.sum(a,b);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public Stack<Integer> get() {
        try {
            return exec.get();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void push(int num) {
        try {
            exec.push(num);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
