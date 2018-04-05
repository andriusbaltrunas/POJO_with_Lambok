import org.junit.Assert;
import org.junit.Test;

/**
 * Created by andriusbaltrunas on 3/28/2018.
 */
public class TestStudent {

    @Test
    public void testStudent(){
        Student st = new Student("Andrius", 147);
        Assert.assertEquals("Andrius", st.getName());
        Assert.assertEquals(147, st.getAge());
        st.setAge(12);
        Assert.assertEquals(12, st.getAge());
    }
}
