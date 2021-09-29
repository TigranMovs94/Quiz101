public class Teacher extends Person {
    private int salary;

    public Teacher(String n, String s, int y) {
        super(n, s, y);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
