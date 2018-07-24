import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by andriusbaltrunas on 7/24/2018.
 */
public class TestStudentWithNotNull{

    @Test(expected = NullPointerException.class)
    public void testStudentWithNull(){
        StudentWithNotNull st = new StudentWithNotNull(null);
    }

    @Test
    public void testWithNotNull(){
        StudentWithNotNull st = new StudentWithNotNull(new Student("fooName", 30));
        Assert.assertEquals(30, st.getId());
    }
}