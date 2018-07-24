import junit.framework.TestCase;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by andriusbaltrunas on 7/24/2018.
 */
public class TestStudentWithRequiredConstructor {

    private StudentWithRequiredConstructor student;

    @Before
    public void beforeMethod(){
        if(student == null){
            student = new StudentWithRequiredConstructor(11, "fooName", "fooSurname");
        }
    }

    @Test
    public void testRequiredConstructor(){
        assertNotNull(student);
        assertEquals(11, student.getId());
        assertEquals("fooName", student.getName());
        assertEquals("fooSurname", student.getSurname());
    }

}