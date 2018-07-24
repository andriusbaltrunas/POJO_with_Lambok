import org.junit.Assert;
import org.junit.Test;

/**
 * Created by andriusbaltrunas on 7/24/2018.
 */
public class TestConstructorsExample {

    private ConstructorsExample constructorsExample;

    @Test
    public void testRequiredConstructor() {
        constructorsExample = ConstructorsExample.create(50);
        Assert.assertNotNull(constructorsExample);
        Assert.assertEquals(50, constructorsExample.getId());
        Assert.assertNull(constructorsExample.getName());
    }

    @Test
    public void testNonArgumentConstructor() {
        constructorsExample = new ConstructorsExample();
        Assert.assertNotNull(constructorsExample);
        Assert.assertEquals(0, constructorsExample.getId());
        Assert.assertNull(constructorsExample.getName());
    }

    @Test
    public void testAllArgumentConstructor() {
        constructorsExample = new ConstructorsExample("foo", 10);
        Assert.assertNotNull(constructorsExample);
        Assert.assertEquals("foo", constructorsExample.getName());
        Assert.assertEquals(10, constructorsExample.getId());
    }
}