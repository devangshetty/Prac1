package prac1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

public class BasicTest {
    public BasicTest() {}

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
        assertEquals(client.sum(2, 3), 5);
        assertEquals(client.sum(-1, 5), 4);
        assertNotEquals(client.sum(6, 6), 13);
    }
}
