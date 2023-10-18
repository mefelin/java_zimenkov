package prac9;

import java.util.ArrayList;
import java.util.List;

class Person {
    private String name;
    private double score;

    public Person(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }
}

public class Task3 {
    public static void main(String[] args) {
        List<Person> list1 = new ArrayList<>();
        list1.add(new Person("Alice", 3.8));
        list1.add(new Person("Bob", 3.5));
        list1.add(new Person("Charlie", 4.0));

        List<Person> list2 = new ArrayList<>();
        list2.add(new Person("David", 3.2));
        list2.add(new Person("Eve", 3.9));

        List<Person> mergedList = mergeSort(list1, list2);

        System.out.println("Merged and sorted list:");
        for (Person person : mergedList) {
            System.out.println(person.getName() + ": " + person.getScore());
        }
    }

    public static List<Person> mergeSort(List<Person> list1, List<Person> list2) {
        List<Person> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i).getScore() > list2.get(j).getScore()) {
                result.add(list1.get(i));
                i++;
            } else {
                result.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) {
            result.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            result.add(list2.get(j));
            j++;
        }

        return result;
    }
}
