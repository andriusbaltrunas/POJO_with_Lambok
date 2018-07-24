import junit.framework.TestCase;
import lombok.val;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by andriusbaltrunas on 7/24/2018.
 */
public class TestStudentWithCleanup{

    private StudentWithCleanup studentWithCleanup;

    @Before
    public void beforeMethod(){
        studentWithCleanup = new StudentWithCleanup();
    }

    @Test
    public void testStudentWithCleanup(){
        List<Object> students = studentWithCleanup.readFileWithStudents();
        Assert.assertTrue(!students.isEmpty());
        Student st = (Student) students.get(0);
        Assert.assertEquals("Foo", st.getName());
        Assert.assertEquals(20, st.getAge());
    }


}