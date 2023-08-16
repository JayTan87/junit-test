import org.junit.Before;
import org.junit.Test;

public class CohortTest {

    private Cohort emptyCohort;
    private Cohort actualCohort;

    private Student emptyStudent;
    private Student actualStudent;
    @Before
    public void setup() {
        actualCohort = new Cohort();
        actualStudent = new Student("Jeremy", 45089);
    }

    @Test
    public void testAddStudentToList() {

        actualCohort.addStudent(actualStudent);
    }

}
