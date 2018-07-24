import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by andriusbaltrunas on 7/24/2018.
 */
public class TestDataExample {

    private DataExample example;

    @Before
    public void beforeMethod(){
        example = DataExample.create(12, "foo");
    }

    @Test
    public void testDataAnnotation(){
        Assert.assertNotNull(example);
        Assert.assertEquals(12, example.getId());
        Assert.assertEquals("foo", example.getName());
    }

}