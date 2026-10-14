package modelEntities;

import java.time.LocalDateTime;

public class carRental {
  private LocalDateTime startDate;
  private LocalDateTime endDate;

  private vehicle vehicle;
  private invoice invoice;

  public carRental(LocalDateTime startDate, LocalDateTime endDate, vehicle vehicle) {
    this.startDate = startDate;
    this.endDate = endDate;
    this.vehicle = vehicle;
  }

  public LocalDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDateTime startDate) {
    this.startDate = startDate;
  }

  public LocalDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDateTime endDate) {
    this.endDate = endDate;
  }

  public vehicle getVehicle() {
    return vehicle;
  }

  public void setVehicle(vehicle vehicle) {
    this.vehicle = vehicle;
  }

  public invoice getInvoice() {
    return invoice;
  }

  public void setInvoice(invoice invoice) {
    this.invoice = invoice;
  }

}
