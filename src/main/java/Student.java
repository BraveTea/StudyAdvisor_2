public class Student {

    private String name;
    private int[] marks;
    private static int numberOfStudents;
    private int studentNum;


    public Student(String name) {
        this.name = name;
        marks = new int[8];
        numberOfStudents++;
        studentNum = numberOfStudents;
    }

    public void setMark(int subjectNum, int mark) {
        marks[subjectNum] = mark;
    }

    public int[] getMarks() {
        return marks;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public static int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String toString(){
        String representation = "\nName: " + name + "\nMarks: " ;
        for (int mark : marks){
            representation += " " + mark;
        }
        return representation;
    }
}
