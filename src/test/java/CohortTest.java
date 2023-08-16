import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class CohortTest {

    private Cohort emptyCohort;
    private Cohort actualCohort;

    private final double deltaValue = 0.000001;
    @Before
    public void setup() {
        actualCohort = new Cohort();
    }

    @Test
    public void testCohortConstructors() {
        assertNull(emptyCohort);
        assertNotNull(actualCohort);
    }

    @Test
    public void testCohortAddStudent() {
        Student actualStudent = new Student("Jeremy", 48);
        actualCohort.addStudent(actualStudent);
        assertEquals(Arrays.asList(actualStudent), actualCohort.getStudents());
    }

    @Test
    public void testCohortGetCohortAverage() {
        Student actualStudent = new Student("Jeremy", 48);
        actualStudent.addGrade(50);
        actualStudent.addGrade(75);
        actualStudent.addGrade(100);

        actualCohort.addStudent(actualStudent);

        assertEquals(75, actualCohort.getCohortAverage(), deltaValue);
    }
}
