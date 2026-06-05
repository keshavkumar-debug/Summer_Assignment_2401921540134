
// 1. Interface Program
// Aim

// Write a program to create interface named test.
// In this interface the member function is square.
// Implement this interface in Arithmetic class.
// Create another class called ToTestInt and use the object of Arithmetic class.

// Theory

// An interface in Java is used to achieve abstraction.
// Interface contains abstract methods which must be implemented by another class.

// Program
interface test {
    int square(int x);
}

class Arithmetic implements test {
    public int square(int x) {
        return x * x;
    }
}

public class Week1Assignment {
    public static void main(String[] args) {
        Arithmetic obj = new Arithmetic();
        int result = obj.square(5);
        System.out.println("Square = " + result);
    }
}

// Output:
// Square = 25

// Explanation:
// * Interface test contains method square().
// * Class Arithmetic implements the interface.
// * Object of Arithmetic class is used in ToTestInt.