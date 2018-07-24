import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by andriusbaltrunas on 7/24/2018.
 */
public class TestToStringExample {

    private ToStringExample example;

    @Before
    public void beforeMethod(){
        example = new ToStringExample(10, "foo", "bar");
    }

    @Test
    public void testToString(){
        Assert.assertEquals("ToStringExample(age=10, name=foo)", example.toString());
    }
}