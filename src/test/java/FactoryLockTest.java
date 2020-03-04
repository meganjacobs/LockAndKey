import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FactoryLockTest {



    @Before
    public void setUp() {
        System.out.println("FactoryLockTest Running...");
    }

    @Test
    public void testLock() {
        FactoryLock factoryLock = new FactoryLock(10);

        Assert.assertTrue(factoryLock.isLocked());
        Assert.assertTrue(factoryLock.unlock(10));
        Assert.assertFalse("expecting object to change to factoryLock ", factoryLock.isLocked());

        factoryLock.lock();

        Assert.assertTrue("expected object to be locked", factoryLock.isLocked());
        Assert.assertFalse("incorrect keyValue passed", factoryLock.unlock(1));
        Assert.assertTrue("action factoryLock method on object",factoryLock.isLocked());
    }

    @After
    public void tearDown() {
        System.out.println("FactoryLockTest Complete");
    }
}