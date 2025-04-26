public class ApexLegend {
    public String name, type, realName;
    public int age, kills;

    public ApexLegend(String n, String t, String r, int a, int k) {
        name = n;
        type = t;
        realName = r;
        age = a;
        kills = k;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Real Name: " + realName);
        System.out.println("Age: " + age);
        System.out.println("Kills: " + kills);
    }

    public void levelUp(int years) {
        age += years;
        System.out.println(name + " has leveled up. New age: " + age);
    }

    public void increaseKills(int numKills) {
        kills += numKills;
        System.out.println(name + " has gained " + numKills + " kills. Total kills: " + kills);
    }

    public static void main(String[] args) {
        ApexLegend wraith = new ApexLegend("Wraith", "Skirmisher", "Renee Blasey", 32, 5000);
        ApexLegend bloodhound = new ApexLegend("Bloodhound", "Tracker", "Unknown", 35, 4500);
        ApexLegend lifeline = new ApexLegend("Lifeline", "Combat Medic", "Ajay Che", 28, 3000);
        ApexLegend octane = new ApexLegend("Octane", "Stim Junkie", "Octavio Silva", 24, 4000);
        ApexLegend mirage = new ApexLegend("Mirage", "Holographic Trickster", "Elliott Witt", 30, 3500);

        System.out.println("=== Legends Details ===");
        wraith.display();
        bloodhound.display();
        lifeline.display();
        octane.display();
        mirage.display();

        System.out.println("\n=== Leveling Up ===");
        wraith.levelUp(1);
        bloodhound.levelUp(2);

        System.out.println("\n=== Gaining Kills ===");
        wraith.increaseKills(200);
        bloodhound.increaseKills(300);
    }
}
