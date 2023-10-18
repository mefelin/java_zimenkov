package prac10;

class Task1 {
    private String firstName;
    private String lastName;
    private String major;
    private int year;
    private String group;

    // Конструктор класса Student
    public Task1(String firstName, String lastName, String major, int year, String group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.year = year;
        this.group = group;
    }

    // Геттеры и сеттеры для каждой переменной экземпляра

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

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", major='" + major + '\'' +
                ", year=" + year +
                ", group='" + group + '\'' +
                '}';
    }

    public static void main(String[] args) {
        // Создаем объекты студентов
        Task1 student1 = new Task1("Иван", "Иванов", "Информатика", 2, "Группа A");
        Task1 student2 = new Task1("Мария", "Петрова", "Математика", 3, "Группа B");

        // Используем геттеры для получения информации о студентах
        System.out.println("Имя студента 1: " + student1.getFirstName());
        System.out.println("Специальность студента 2: " + student2.getMajor());

        // Используем сеттеры для изменения информации о студентах
        student1.setYear(3);
        student2.setGroup("Группа C");

        // Выводим информацию о студентах
        System.out.println(student1);
        System.out.println(student2);
    }
}
