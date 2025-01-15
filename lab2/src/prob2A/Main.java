package prob2A;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Mariam");
        Student s2 = new Student("Natukunda");

        System.out.println(s1.toString() + "Student 1");
        GradeReport g1 = new GradeReport(s2);

        System.out.println(g1.toString() + "grade report");

    }
}
