import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudyAdvisorTest {

    @Test
    void receivesPositiveStudyAdvice() {
        Student s1 = new Student("Sander");
        for (int i = 0; i < 8; i++){
            s1.setMark(i, i + 3);
        }
        assertAll(() -> assertTrue(StudyAdvisor.receivesPositiveStudyAdvice(s1)),
                () -> assertFalse(StudyAdvisor.receivesPositiveStudyAdvice(s1)));
    }

}