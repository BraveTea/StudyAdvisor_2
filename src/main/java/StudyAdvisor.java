public class StudyAdvisor {

    public static boolean receivesPositiveStudyAdvice(Student student){
        int numberOfMarks6OrHigher = 0;
        for (int mark : student.getMarks()){
            if (mark >= 6){
                numberOfMarks6OrHigher++;
            }
        }
        return numberOfMarks6OrHigher >= 4;
    }
}
