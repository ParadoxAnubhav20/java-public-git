public class ObjectToString {
    private int val;
    private String name;

    public ObjectToString(int v, String s) {
        val = v;
        name = s;
    }

    @Override
    public String toString() {
        return val + " " + name;
    }

    public static void main(String[] args) {
        ObjectToString obj1 = new ObjectToString(5, "Hello");
        ObjectToString obj2 = new ObjectToString(10, "World");
        ObjectToString obj3 = new ObjectToString(15, "Java");

        System.out.println(obj1.toString());
        System.out.println(obj2);
        System.out.println(obj3);
    }
}
