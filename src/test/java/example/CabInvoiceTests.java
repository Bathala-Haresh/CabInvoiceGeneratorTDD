package example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CabInvoiceTests {

    @Test
    public void givenDistanceAndTime_shouldReturnTotalFare() {
        CabInvoice cabInvoice = new CabInvoice();
        double distance = 10.0;
        int time = 5;
        double fare = cabInvoice.calculateFare(distance, time);
        Assertions.assertEquals(105, fare);
    }

    @Test
    public void givenLessDistanceAndTime_shouldReturnMinimumFare() {
        CabInvoice cabInvoice = new CabInvoice();
        double distance = 0.1;
        int time = 1;
        double result = cabInvoice.calculateFare(distance, time);
        Assertions.assertEquals(5, result);
    }

//    @Test
//    public void givenMultipleRides_shouldReturnTotalAggregate() {
//        CabInvoice cabInvoice = new CabInvoice();
//        Ride[] rides = {
//                new Ride(2.0, 5),
//                new Ride(0.1, 1)
//        };
//        double fare = cabInvoice.calculateFare(rides);
//        Assertions.assertEquals(30, fare);
//    }

    @Test
    public void givenMultipleRides_shouldReturnInvoiceSummary(){
        CabInvoice cabInvoice = new CabInvoice();
        Ride[] rides = {
                new Ride(2.0,5),
                new Ride(0.1,1)
        };
        InvoiceSummary summary = cabInvoice.calculateFare(rides);
        InvoiceSummary expectedinvoiceSummary = new InvoiceSummary(2,30.0);
        Assertions.assertEquals(expectedinvoiceSummary,summary);

    }
}
