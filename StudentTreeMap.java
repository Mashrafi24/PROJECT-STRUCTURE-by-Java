import java.util.*;


public class StudentTreeMap {

    static class Student {
        String name;
        int age;

        Student(String n, int a) {
            name = n;
            age = a;
        }

        public String toString() {
            return name + " (Age: " + age + ")";
        }
    }

    public static void main(String[] args) {

        TreeMap<Integer, Student> students = new TreeMap<>();

        students.put(101, new Student("Mashrafi", 20));
        students.put(102, new Student("Raiyan", 22));

        System.out.println(students);
    }
}
