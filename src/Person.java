public abstract class Person {
    private String name;
    private String surname;
    private int yearOfBirth;

    public Person(String n, String s, int y) {
        name = n;
        surname = s;
        yearOfBirth = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String toString() {
        return getName() + " " + getSurname();
    }
}
