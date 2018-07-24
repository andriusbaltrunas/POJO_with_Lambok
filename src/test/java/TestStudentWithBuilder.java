import org.junit.Assert;
import org.junit.Test;

/**
 * Created by andriusbaltrunas on 7/24/2018.
 */
public class TestStudentWithBuilder {

    @Test
    public void testBuilder() {
        StudentWithBuilder builder = StudentWithBuilder.builder().id(55).name("fooName").surname("fooSurname").build();
        Assert.assertNotNull(builder);
        Assert.assertEquals(55, builder.getId());
        Assert.assertEquals("fooName", builder.getName());
        Assert.assertEquals("fooSurname", builder.getSurname());
    }
}