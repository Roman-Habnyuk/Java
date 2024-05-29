import java.time.LocalDate;
import java.time.Period;

public class Student {
    private String firstName;
    private String lastName;
    private LocalDate birthdate;
    private int rank;

    // Конструктор
    public Student(String firstName, String lastName, LocalDate birthdate, int rank) {
        this.firstName = firstName;
        this.lastName = lastName;
        setBirthdate(birthdate); // Використовуємо сеттер для перевірки віку
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

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        if (calculateAge(birthdate) < 15) {
            throw new IllegalArgumentException("Студент повинен бути не молодший 15 років");
        }
        this.birthdate = birthdate;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    // Метод для розрахунку віку
    private int calculateAge(LocalDate birthdate) {
        return Period.between(birthdate, LocalDate.now()).getYears();
    }

    // Метод toString() для зручного виведення інформації про студента
    @Override
    public String toString() {
        return firstName + " " + lastName + ", " + birthdate + ", " + rank;
    }
}
