// Commission.java
public class Commission extends Hourly {

    private double totalSales;
    private double commissionRate;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate) {

        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
        this.totalSales = 0.0;

    }

    public void addSales(double totalSales) {

        this.totalSales += totalSales;

    }


    public double pay() {

        double hourlyPayment = super.pay();
        double commissionPayment = totalSales * commissionRate;
        totalSales = 0.0;

        return hourlyPayment + commissionPayment;

    }


    public String toString() {

        String baseString = super.toString();
        return baseString + "\nTotal Sales: $" + totalSales;

    }
}

