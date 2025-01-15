package prob2A;

public class GradeReport {
    private Student student;

    public GradeReport(Student studentInput) {
        this.student = studentInput;
    }

    public Student getStudent() {
        return student;
    }

    @Override
    public String toString() {
        return "GradeReport{" +
                "student=" + student.getName() +
                '}';
    }
}
