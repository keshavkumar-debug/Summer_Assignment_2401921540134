class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    double add(double a, double b) {
        return a + b;
    }
}

public class Method_Overloading {

    public static void main(String[] args) {

        Calculator obj = new Calculator();

        System.out.println("Sum of 2 integers: " + obj.add(10, 20));

        System.out.println("Sum of 3 integers: " + obj.add(10, 20, 30));

        System.out.println("Sum of double values: " + obj.add(5.5, 4.5));
    }
}