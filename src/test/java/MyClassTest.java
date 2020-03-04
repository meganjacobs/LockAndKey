import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyClassTest {

    @Before
    public void setUp() {
        System.out.println("MyClassTest Running...");
    }

    @Test
    public void calculateKey() {
        MyClass myClass = new MyClass();

        myClass.setId(2);
        myClass.setSecret(5);
        myClass.setName("My Secret");

        Assert.assertEquals(myClass.calculateKey().intValue(),10);
        // Assert.assertSame("Equal Identity exists",myClass.setId(2),);
    }

    @After
    public void tearDown() {
        System.out.println("MyClassTest Complete: ");
    }
}