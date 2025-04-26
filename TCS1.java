import java.util.*;

public class TCS1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player[] objs = new Player[4];
        
        for (int i = 0; i < 4; i++) {
            int it = sc.nextInt();
            sc.nextLine();
            String n = sc.nextLine();
            int r = sc.nextInt();
            sc.nextLine();
            String p = sc.nextLine();
            String m = sc.nextLine();
            objs[i] = new Player(it, n, r, p, m);
        }
        
        String player = sc.nextLine();
        String match = sc.nextLine();
        
        sc.close();

        int ans = lowestRuns(objs, player);
        if (ans == 0) {
            System.out.println("No such player");
        } else {
            System.out.println(ans);
        }
        
        Player[] p = findPlayers(objs, match);
        if (p == null) {
            System.out.println("No Player with given matchType");
        } else {
            for (int i = p.length - 1; i >= 0; i--) {
                System.out.println(p[i].getId());
            }
        }
        
    }
    
    public static int lowestRuns(Player[] p, String val) {
        int lessRuns = Integer.MAX_VALUE;
        for (int i = 0; i < p.length; i++) {
            if (p[i].getPlayer().equalsIgnoreCase(val)) {
                if (p[i].getRuns() < lessRuns) {
                    lessRuns = p[i].getRuns();
                }
            }
        }
        if (lessRuns == Integer.MAX_VALUE) {
            return 0;
        } else {
            return lessRuns;
        }
    }
    
    public static Player[] findPlayers(Player[] objs, String val) {
        ArrayList<Player> filterp = new ArrayList<>();
        for (Player p : objs) {
            if (p.getMatch().equalsIgnoreCase(val)) {
                filterp.add(p);
            }
        }
        if (filterp.isEmpty()) {
            return null;
        }
        filterp.sort(new Comparator<Player>() {
            @Override
            public int compare(Player p1, Player p2) {
                return Integer.compare(p1.getId(), p2.getId());
            }
        });
        return filterp.toArray(new Player[0]);
    }
}

class Player {
    private int id;
    private String name;
    private int runs;
    private String player;
    private String match;
    
    public Player(int id, String name, int runs, String player, String match) {
        this.id = id;
        this.name = name;
        this.runs = runs;
        this.player = player;
        this.match = match;
    }
    
    public int getId() {
        return id;
    }
    
    public String getMatch() {
        return match;
    }
    
    public int getRuns() {
        return runs;
    }
    
    public String getPlayer() {
        return player;
    }

    public String getName() {
        return name;
    }

}
