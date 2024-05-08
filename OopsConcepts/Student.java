public class Student {
    String name;
    int age;

    public void printDetails(String name) {
        System.out.println(name);
    }

    public void printDetails(String name, int age) {
        System.out.println(name);
        System.out.println(age);
    }

    public void add(int a, int b) {
        System.out.println("First add");
        System.out.println(a+b);
    }

    public void add(int a, long b) {
        System.out.println("Second add");
        System.out.println(a+b);
    }
}
