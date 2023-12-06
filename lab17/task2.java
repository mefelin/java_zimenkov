package lab17;

// Класс модели (Model)
class Employee {
    private String name;
    private String position;
    private double salary;

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

// Класс представления (View)
class EmployeeView {
    public void displayEmployeeDetails(String name, String position, double salary) {
        System.out.println("Employee: " + name + ", Position: " + position + ", Salary: " + salary);
    }
}

// Класс контроллера (Controller)
class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void setEmployeeName(String name) {
        model.setName(name);
    }

    public String getEmployeeName() {
        return model.getName();
    }

    public void setEmployeePosition(String position) {
        model.setPosition(position);
    }

    public String getEmployeePosition() {
        return model.getPosition();
    }

    public void setEmployeeSalary(double salary) {
        model.setSalary(salary);
    }

    public double getEmployeeSalary() {
        return model.getSalary();
    }

    public void updateView() {
        view.displayEmployeeDetails(model.getName(), model.getPosition(), model.getSalary());
    }
}

public class task2 {
    public static void main(String[] args) {
        // Создаем объекты модели, представления и контроллера
        Employee model = new Employee("Ivan Z.", "Software Developer", 50000.0);
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);

        // Обновляем представление
        controller.updateView();

        // Изменяем данные модели через контроллер
        controller.setEmployeeName("Matvey F.");
        controller.setEmployeePosition("QA Engineer");
        controller.setEmployeeSalary(45000.0);

        // Обновляем представление после изменения данных
        controller.updateView();
    }
}
