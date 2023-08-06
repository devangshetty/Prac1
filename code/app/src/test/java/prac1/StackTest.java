package prac1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import java.util.Stack;

public class StackTest {
    public StackTest() {}

    @BeforeAll
    public static void setup() {
        try {
            Server server = new Server();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    void testSum() {
        Client client = new Client();
        client.push(3);
        client.push(10);
        client.push(4);

        Stack<Integer> stack = client.get();

        assertEquals(stack.pop(), 4);
        assertEquals(stack.pop(), 10);
        assertEquals(stack.pop(), 3);
    }
}
