import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;

public class RunnableLockTest {

    @Before
    public void setUp() {
        System.out.println("RunnableLockTest Running...");
    }

    @After
    public void tearDown() {
        System.out.println("RunnableLockTest Complete:");
    }
}