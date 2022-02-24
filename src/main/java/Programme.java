import java.util.Random;

public class Programme {

    public static void main(String[] args){
        System.out.println("config");

        Random random = new Random();

        Student s1 = new Student("Sander");
        for (int i = 0; i < 8; i++){
            s1.setMark(i, random.nextInt(1, 11));
        }

        System.out.println(s1);

        System.out.println(StudyAdvisor.receivesPositiveStudyAdvice(s1));
        System.out.println("------------------");


    }
}
