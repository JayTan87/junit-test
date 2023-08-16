import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class StudentTest {

    private final double deltaValue = 0.000001;
    private Student emptyStudent;

    private Student actualStudent;

    @Before
    public void setup() {
        actualStudent = new Student("Jeremy", 45089);
    }

    @Test
    public void testStudentNoArgConstructor() {

        //assert that emptyCoffee is null
        assertNull(emptyStudent);

        //assert that actualCoffee is NOT null
        assertNotNull(actualStudent);
    }

    @Test
    public void testStudentTwoArgConstructor() {
        assertNotNull(actualStudent);
    }

    @Test
    public void testStudentGetters() {
        assertEquals(actualStudent.getName(), "Jeremy");
        assertEquals(actualStudent.getStudentID(), 45089, deltaValue);
    }
}
