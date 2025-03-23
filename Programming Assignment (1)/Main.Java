public class Main {

    // Convert from feet to meters
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    // Convert from meters to feet
    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }
    
    public static void main(String[] args) {
        // Table for feet to meters
        System.out.printf("%-10s%-10s\n", "Feet", "Meters");
        for (int foot = 1; foot <= 10; foot++) {
            double meter = footToMeter(foot);
            System.out.printf("%-10d%-10.3f\n", foot, meter);
            
        }

        // Table for meters to feet
        System.out.printf("\n%-10s%-10s\n", "Meters", "Feet");
        for (int meter = 20; meter <= 65; meter += 5) {
            double foot = meterToFoot(meter);
            System.out.printf("%-10d%-10.3f\n", meter, foot);
        }
    }
}