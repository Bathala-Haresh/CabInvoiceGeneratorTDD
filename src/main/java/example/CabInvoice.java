package example;

public class CabInvoice {
    private static final double costPerKilometer = 10;
    private static final int costPerMinute = 1;
    private static double minimumFare = 5;

    public double calculateFare(double distance, int time) {
        double totalFare = distance * costPerKilometer + time * costPerMinute;
        return Math.max(totalFare, minimumFare);
    }

    public InvoiceSummary calculateFare(Ride[] rides) {
        double totalFare = 0;
        for (Ride ride : rides) {
            totalFare += this.calculateFare(ride.distance, ride.time);
        }
        System.out.print(new InvoiceSummary(rides.length,totalFare));
        return new InvoiceSummary(rides.length,totalFare);
    }
}
