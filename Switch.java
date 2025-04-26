import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter An Integer Between 1 and 8:");
        int input = sc.nextInt();

        switch (input) {
            case 1:
                System.out.println("Batman");
                break;
            case 2:
                System.out.println("Wonder Woman");
                break;
            case 3:
                System.out.println("The Flash");
                break;
            case 4:
                System.out.println("Superman");
                break;
            case 5:
                System.out.println("Aquaman");
                break;
            case 6:
                System.out.println("Green Lantern");
                break;
            case 7:
                System.out.println("Cyborg");
                break;
            case 8:
                System.out.println("Martian Manhunter");
                break;
            default:
                System.out.println("Invalid Value Entered");
        }

        sc.close();
    }
}
