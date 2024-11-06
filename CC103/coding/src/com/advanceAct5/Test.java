import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MultiplicationTableTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(System.out);
    }

    @Test
    public void testPrintMultiplicationTable() {
        MultiplicationTable.printMultiplicationTable(3, 3);
        String expectedOutput = "   1   2   3\n" +
                                "   2   4   6\n" +
                                "   3   6   9\n";
        assertEquals(expectedOutput, outputStreamCaptor.toString().trim());
    }
}
