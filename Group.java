import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Group {
    private String title;
    private List<Student> students;

    // Конструктор
    public Group(String title) {
        this.title = title;
        this.students = new ArrayList<>();
    }

    // Геттери та сеттери
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    // Додавання студента до групи
    public boolean addStudent(Student student) {
        for (Student s : students) {
            if (s.getFirstName().equals(student.getFirstName()) && s.getLastName().equals(student.getLastName())) {
                return false; // Студент з таким ім'ям та прізвищем вже існує
            }
        }
        students.add(student);
        return true;
    }

    // Сортування студентів по прізвищу та імені
    public void sortStudentsByName() {
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int lastNameComparison = s1.getLastName().compareTo(s2.getLastName());
                if (lastNameComparison != 0) {
                    return lastNameComparison;
                } else {
                    return s1.getFirstName().compareTo(s2.getFirstName());
                }
            }
        });
    }

    // Сортування студентів по середньому балу
    public void sortStudentsByRank() {
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s2.getRank(), s1.getRank()); // Сортуємо за спаданням
            }
        });
    }

    // Метод toString() для зручного виведення інформації про групу
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Group " + title + "\nStudents:");
        for (Student student : students) {
            result.append("\n").append(student);
        }
        return result.toString();
    }
}
