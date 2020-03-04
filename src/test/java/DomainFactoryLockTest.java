import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DomainFactoryLockTest {

    @Before
    public void setUp() {
        System.out.println("DomainFactoryLockTest Running...");
    }

    @Test
    public void calculateKey() {
        DomainLock domainLock = new DomainLock();

        domainLock.setId(2);
        domainLock.setSecret(5);
        domainLock.setName("My Secret");

        Assert.assertEquals(domainLock.calculateKey().intValue(),10);
        // Assert.assertSame("Equal Identity exists",domainLock.setId(2),);
    }

    @After
    public void tearDown() {
        System.out.println("DomainFactoryLockTest Complete: ");
    }
}