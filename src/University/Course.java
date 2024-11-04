package University;

public class Course {
    private String courseName;
    private String instructor;
    int studentsEnrolled;

    public Course(String courseName, String instructor, int studentsEnrolled) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.studentsEnrolled = studentsEnrolled;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public int getStudentsEnrolled() {
        return studentsEnrolled;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public void setStudentsEnrolled(int studentsEnrolled) {
        this.studentsEnrolled = studentsEnrolled;
    }

    @Override
    public String toString() {
        return "Course{" +
                "Course name = " + courseName +
                ", Instructor = " + instructor +
                ", Students enrolled = " + studentsEnrolled +
                '}';
    }
}
