import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hotel[] obj = new Hotel[4];

        for (int i = 0; i < 4; i++) {
            int h = sc.nextInt();
            sc.nextLine();
            String hn = sc.nextLine();
            String d = sc.next();
            int n = sc.nextInt();
            sc.nextLine();
            String w = sc.next();
            double t = sc.nextDouble();
            sc.nextLine();
            obj[i] = new Hotel(h, hn, d, n, w, t);
        }

        String month = sc.next();
        String wifi = sc.next();

        sc.close();

        System.out.println("Total rooms booked in " + month + ": " + noOfRooms(obj, month));
        Hotel hotelWithWifi = searchWifi(obj, wifi);
        if (hotelWithWifi != null) {
            System.out.println("Hotel with second highest bill having wifi: " + hotelWithWifi.getHotelName());
        } else {
            System.out.println("No hotel found with the specified criteria.");
        }
    }

    static int noOfRooms(Hotel[] arr, String m) {
        int sum = 0;
        for (Hotel h : arr) {
            String month = h.getDate().substring(3, 6);
            if (m.equalsIgnoreCase(month)) {
                sum += h.getRooms();
            }
        }
        return sum;
    }

    static Hotel searchWifi(Hotel[] arr, String s) {
        Hotel obj = null;
        double highestBill = -1;
        double secondBill = -1;

        for (Hotel h : arr) {
            if (h.getBill() > highestBill) {
                secondBill = highestBill;
                highestBill = h.getBill();
            } else if (h.getBill() > secondBill) {
                secondBill = h.getBill();
                obj = h;
            }
        }

        return obj;
    }

    static class Hotel {
        private int hotelID;
        private String hotelName;
        private String dateOfBooking;
        private int noOfRoomsBooked;
        private String wifiFacility;
        private double totalBill;

        Hotel(int h, String s, String d, int n, String w, double t) {
            hotelID = h;
            hotelName = s;
            dateOfBooking = d;
            noOfRoomsBooked = n;
            wifiFacility = w;
            totalBill = t;
        }

        public void setHotelID(int h) {
            hotelID = h;
        }

        public void setHotelName(String h) {
            hotelName = h;
        }

        public void setDate(String d) {
            dateOfBooking = d;
        }

        public void setNoOfRooms(int n) {
            noOfRoomsBooked = n;
        }

        public void setWifi(String w) {
            wifiFacility = w;
        }

        public void setBill(double b) {
            totalBill = b;
        }

        public int getHotelID() {
            return hotelID;
        }

        public String getHotelName() {
            return hotelName;
        }

        public String getDate() {
            return dateOfBooking;
        }

        public int getRooms() {
            return noOfRoomsBooked;
        }

        public String getWifiFacility() {
            return wifiFacility;
        }

        public double getBill() {
            return totalBill;
        }
    }
}
