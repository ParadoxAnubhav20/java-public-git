

class Bicycle {
    protected int speed, gear;

    public Bicycle(int s, int g) {
        this.speed = s;
        this.gear = g;
    }
    @Override
    public String toString() {
        return ("No of Gears: " + this.gear + " Speed of Bicycle: " + this.speed);
    }

    public static void main(String[] args) {
        Bicycle b = new Bicycle(35, 2);
        MountainBike m = new MountainBike(40, 3, 5);
        System.out.println(b.toString());
        System.out.println(m.toString());
    }
}

class MountainBike extends Bicycle {
    private int seatHeight;

    public MountainBike(int s, int g, int h) {
        super(s, g);
        this.seatHeight = h;
    }
    @Override
    public String toString() {
        return (super.toString() + " Seat Height: " + this.seatHeight);
    }
}
