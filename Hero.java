import java.util.Scanner;

class Information {
    String name;
    int age, skill;
    float speed;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Hero Name:");
        name = sc.nextLine();
        System.out.println("Enter The Age and Skill:");
        age = sc.nextInt();
        skill = sc.nextInt();
        System.out.println("Enter Speed:");
        speed = sc.nextFloat();
        // Do not close the scanner here; let the calling code handle it
        sc.close();
    }

    public void details() {
        System.out.println("The Name of the Hero is: " + name);
        System.out.println("Age: " + age + " Skill: " + skill);
        System.out.println("Speed: " + speed);
    }
}

public class Hero {
    public static void main(String[] args) {
        Information Batman = new Information();
        Batman.input();
        Batman.details();
        
        // Close the scanner after all input is taken
        Scanner sc = new Scanner(System.in);
        sc.close();
    }
}
