class Student {
    int id;
    String name;
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

public class StudentData {
    public static void main(String[] args) {
        Student s1 = new Student(134, "Keshav");
        s1.display();
    }
}