import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LockTest {



    @Before
    public void setUp() {
        System.out.println("LockTest Running...");
    }

    @Test
    public void testLock() {
        Lock lock = new Lock(10);

        Assert.assertTrue(lock.isLocked());
        Assert.assertTrue(lock.unlock(10));
        Assert.assertFalse("expecting object to change to lock ", lock.isLocked());

        lock.lock();

        Assert.assertTrue("expected object to be locked", lock.isLocked());
        Assert.assertFalse("incorrect keyValue passed", lock.unlock(1));
        Assert.assertTrue("action lock method on object",lock.isLocked());
    }

    @After
    public void tearDown() {
        System.out.println("LockTest Complete");
    }
}