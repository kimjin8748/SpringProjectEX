package inhatc.cse.spring.di.multi_xml;

public class StudentInfo {
    private Student student;

    public StudentInfo() {
    }

    public StudentInfo(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
