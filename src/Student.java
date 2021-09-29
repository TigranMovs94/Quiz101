public class Student extends Person{
    private int graduationYear;

    public Student(String n, String s, int y) {
        super(n, s, y);
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }
}
