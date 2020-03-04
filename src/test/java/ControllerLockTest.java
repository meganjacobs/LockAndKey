import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;

public class ControllerLockTest {

    @Before
    public void setUp() {
        System.out.println("ControllerLock Running...");
    }

    @After
    public void tearDown() {
        System.out.println("ControllerLockTest Complete:");
    }
}