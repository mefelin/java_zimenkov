package prac9;

public class Task4 implements Comparable<Task4> {
    private String name;
    private int age;

    public Task4(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Task4 otherPerson) {
        // Сравниваем объекты по возрасту
        return this.age - otherPerson.age;
    }

    public static void main(String[] args) {
        Task4 person1 = new Task4("Alice", 25);
        Task4 person2 = new Task4("Bob", 30);

        int result = person1.compareTo(person2);

        if (result < 0) {
            System.out.println(person1.getName() + " младше " + person2.getName());
        } else if (result > 0) {
            System.out.println(person1.getName() + " старше " + person2.getName());
        } else {
            System.out.println(person1.getName() + " и " + person2.getName() + " одного возраста");
        }
    }
}
