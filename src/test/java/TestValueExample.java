import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by andriusbaltrunas on 7/24/2018.
 */
public class TestValueExample {

    private ValueExample valueExample;

    @Before
    public void before(){
        valueExample = new ValueExample(12, "foo", "bar");
    }

    @Test
    public void testValue(){
        ValueExample first = valueExample.withSurname("testFoo");
        Assert.assertNotEquals(valueExample.getSurname(), first.getSurname());
        ValueExample second = valueExample.withSurname("bar");
        Assert.assertEquals(valueExample.getSurname(), second.getSurname());
    }
}