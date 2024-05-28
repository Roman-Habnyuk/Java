public class Main {
    public static void main(String[] args) {
        // Створюємо студентів
        Student student1 = new Student("Ivan", "Ivanov", "2000-01-01", 85);
        Student student2 = new Student("Petr", "Petrov", "2001-02-02", 90);
        Student student3 = new Student("Sergey", "Sidorov", "2002-03-03", 75);
        Student student4 = new Student("Ivan", "Petrov", "2000-04-04", 80);
        Student student5 = new Student("Anna", "Ivanova", "1999-12-12", 88);
        Student student6 = new Student("Elena", "Alexeeva", "2001-11-11", 92);
        Student student7 = new Student("Dmitry", "Dmitriev", "2002-10-10", 78);
        Student student8 = new Student("Olga", "Kuznetsova", "2000-09-09", 81);
        Student student9 = new Student("Alexey", "Smirnov", "2001-08-08", 89);
        Student student10 = new Student("Maria", "Popova", "2002-07-07", 85);

        // Створюємо групу
        Group group = new Group("Group A");

        // Додаємо студентів до групи
        group.addStudent(student1);
        group.addStudent(student2);
        group.addStudent(student3);
        group.addStudent(student4);
        group.addStudent(student5);
        group.addStudent(student6);
        group.addStudent(student7);
        group.addStudent(student8);
        group.addStudent(student9);
        group.addStudent(student10);

        // Виводимо список студентів до сортування
        System.out.println("Список студентів до сортування:");
        System.out.println(group);

        // Сортуємо студентів по прізвищу та імені
        group.sortStudentsByName();
        System.out.println("\nСписок студентів після сортування по прізвищу та імені:");
        System.out.println(group);

        // Сортуємо студентів по середньому балу
        group.sortStudentsByRank();
        System.out.println("\nСписок студентів після сортування по середньому балу:");
        System.out.println(group);
    }
}
