package Class;

public class StudentScore extends Class{

    private int score;
    String name;
    protected String studentID;
    public String classroom;

    public StudentScore(){
        score = 0;
        name = " ";
        studentID = " ";
        classroom = " ";
    }

    public StudentScore(int score, String name, String studentID, String classroom){
        super.printClass();
        this.studentID = studentID;
        this.name = name;
        this.score = score;
        this.classroom = classroom;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public void printDetail(){
        System.out.println("Student Class: " + this.classroom);
        System.out.println("Student Name: " + this.name);
        System.out.println("Student StudentID: " + this.studentID);
        System.out.println("Student Score: " + this.score);

    }
}
