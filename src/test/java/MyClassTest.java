import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyClassTest {

    @Test
    public void calculateKey() {
        MyClass myClass = new MyClass();

        myClass.setId(2);
        myClass.setSecret(5);
        myClass.setName("Megan");

        Assert.assertEquals(myClass.calculateKey().intValue(),10);
    }
}