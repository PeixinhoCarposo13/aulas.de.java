package modelServices;

import modelEntities.carRental;
import modelEntities.invoice;

public class rentalService {
  private Double pricePerHour;
  private Double pricePerDay;

  private taxService taxService;

  public rentalService(Double pricePerHour, Double pricePerDay, taxService taxService) {
    this.pricePerHour = pricePerHour;
    this.pricePerDay = pricePerDay;
    this.taxService = taxService;
  }

  public Double getPricePerHour() {
    return pricePerHour;
  }

  public void setPricePerHour(Double pricePerHour) {
    this.pricePerHour = pricePerHour;
  }

  public Double getPricePerDay() {
    return pricePerDay;
  }

  public void setPricePerDay(Double pricePerDay) {
    this.pricePerDay = pricePerDay;
  }

  public taxService getTaxService() {
    return taxService;
  }

  public void setTaxService(taxService taxService) {
    this.taxService = taxService;
  }

  public void processInvoice(carRental carRental) {
    long t1 = java.time.Duration.between(carRental.getStartDate(), carRental.getEndDate()).toMinutes();
    double hours = t1 / 60.0;
    double basicPayment;
    if (hours <= 12.0) {
      basicPayment = pricePerHour * Math.ceil(hours);
    } else {
      basicPayment = pricePerDay * Math.ceil(hours / 24.0);
    }
    double tax = taxService.tax(basicPayment);
    carRental.setInvoice(new invoice(basicPayment, tax));
  }
}
