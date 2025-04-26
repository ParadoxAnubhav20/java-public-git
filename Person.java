public class Person {
    private int age;
    private String name;
    
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
    
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    
    public static void main(String[] args) {
        Person p = new Person(22, "Anubhav");
        p.display();
    }
}
