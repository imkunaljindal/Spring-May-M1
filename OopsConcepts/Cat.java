public class Cat extends Animal{
    public int legs = 4;
    public String name = "Kitty";

    public Cat() {
        this("Kitty");
        System.out.println("Cat created");
    }

    public Cat(String name) {
        System.out.println("Hi! My name is "+name);
    }

//    public void run() {
//        System.out.println("Cat is running...");
//    }

    public void sayHello() {
        run(); // cat
        super.run(); // animal
        System.out.print("Meow");
    }
}
