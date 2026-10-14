package application;

import java.util.Locale;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import modelEntities.carRental;
import modelEntities.vehicle;
import modelServices.rentalService;
import modelServices.brazilTaxService;

public class carRent {
    public static void main(String[] args) throws Exception {
        // Here i use locale so i can put . instead of , in the numbers
        Locale.setDefault(Locale.US);

        // Here i inicialize the scanner to read the data from the user
        Scanner sc = new Scanner(System.in);

        // Here i inicialize the formatter to format the date and time
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Enter rental data");
        // here i get car model from the user
        System.out.println("Car model: ");
        String carModel = sc.nextLine();
        // here i get start date from the user
        System.out.println("Pickup (dd/MM/yyyy hh:mm): ");
        LocalDateTime startDate = LocalDateTime.parse(sc.nextLine(), fmt);
        // here i get end date from the user
        System.out.println("Return (dd/MM/yyyy hh:mm): ");
        LocalDateTime endDate = LocalDateTime.parse(sc.nextLine(), fmt);

        carRental cr = new carRental(startDate, endDate, new vehicle(carModel));

        // Here i get price per hour from the user
        System.out.println("Enter price per hour: ");
        double pricePerHour = sc.nextDouble();
        // Here i get price per day from the user
        System.out.println("Enter price per day: ");
        double pricePerDay = sc.nextDouble();

        sc.nextLine(); // consume the newline character

        rentalService rtService = new rentalService(pricePerHour, pricePerDay, new brazilTaxService());
        rtService.processInvoice(cr);

        System.out.println("INVOICE:");
        System.out.println("Basic payment: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
        System.out.println("Tax: " + String.format("%.2f", cr.getInvoice().getTax()));
        System.out.println("Total payment: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));

        sc.close();
    }
}
