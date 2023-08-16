import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;


public class StudentTest {

    private final double deltaValue = 0.000001;
    private Student emptyStudent;

    private Student actualStudent;

    private ArrayList<Integer> emptyArrayList;
    @Before
    public void setup() {
        actualStudent = new Student("Jeremy", 45089);
        emptyArrayList = new ArrayList<>();
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
        assertNotNull(actualStudent.getGrades());
        assertEquals(actualStudent.getGrades(), emptyArrayList);
    }

    @Test
    public void testStudentAddGrade() {
        actualStudent.addGrade(50);
        actualStudent.addGrade(75);
        actualStudent.addGrade(100);

        ArrayList<Integer> expectedGrades = new ArrayList<>(Arrays.asList(50,75,100));

        assertEquals(actualStudent.getGrades(), expectedGrades);
    }

    @Test
    public void testStudentGetGradeAverage() {
        actualStudent.addGrade(50);
        actualStudent.addGrade(75);
        actualStudent.addGrade(100);

        assertEquals(actualStudent.getGradeAverage(), 75, deltaValue);
    }
}
