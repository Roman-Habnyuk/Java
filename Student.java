public class Student {
    private String firstName;
    private String lastName;
    private String birthdate; // Можна використовувати LocalDate для дати
    private int rank;

    // Конструктор
    public Student(String firstName, String lastName, String birthdate, int rank) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.rank = rank;
    }

    // Геттери та сеттери
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    // Метод toString() для зручного виведення інформації про студента
    @Override
    public String toString() {
        return firstName + " " + lastName + ", " + birthdate + ", " + rank;
    }
}
