package lab24.task1;

public class Tester {
    public static void main(String[] args) {
        ComplexAbstractFactory factory = new ConcreteFactory();
        Complex number1 = factory.createComplex();
        Complex number2 = factory.CreateComplex(10, 25);
        System.out.println(number1);
        System.out.println(number2);
    }
}
