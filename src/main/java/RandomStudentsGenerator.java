import java.util.Random;

public class RandomStudentsGenerator {

    public static Student[] generateStudents(int amount) {
        Random generator = new Random();
        Student[] studentList = new Student[amount];
        for (int i = 0; i < amount; i++) {
            studentList[i] = new Student("person_" + i);
            for (int j = 0; j < 8; j++) {
                studentList[i].setMark(j, generator.nextInt(1, 11));
            }
        }
        return studentList;
    }
}
