import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by andriusbaltrunas on 7/24/2018.
 */

public class TestEqualsAndHashCodeExample {

    private EqualsAndHashCodeExample example;

    @Before
    public void beforeMethod(){
        example = new EqualsAndHashCodeExample(10, "foo", "bar");
    }

    @Test
    public void testEqualsAndHashCode(){
        EqualsAndHashCodeExample testExample = new EqualsAndHashCodeExample(10, "foo", "testBar");
        Assert.assertTrue(testExample.equals(example));
    }
}