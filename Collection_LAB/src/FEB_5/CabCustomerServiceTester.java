package FEB_5;
import java.util.*;

class CabCustomer {
    private int custId;
    private String customerName;
    private String pickupLocation;
    private String dropLocation;
    private int distance;
    private String phone;

    public CabCustomer() {}

    public CabCustomer(int custId, String customerName, String pickupLocation, String dropLocation, int distance, String phone) {
        this.custId = custId;
        this.customerName = customerName;
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
        this.distance = distance;
        this.phone = phone;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public String getDropLocation() {
        return dropLocation;
    }

    public void setDropLocation(String dropLocation) {
        this.dropLocation = dropLocation;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}



class CabCustomerService {
    private ArrayList<CabCustomer> customers = new ArrayList<>();

    public void addCabCustomer(CabCustomer customer) {
        customers.add(customer);
    }

    public boolean isFirstCustomer(CabCustomer customer) {
        for (CabCustomer existingCustomer : customers) {
            if (existingCustomer.getPhone().equals(customer.getPhone())) {
                return false;
            }
        }
        return true;
    }

    public double calculateBill(CabCustomer customer) {
        if (isFirstCustomer(customer)) {
            return 0;
        }
        if (customer.getDistance() <= 4) {
            return 80;
        }
        return 80 + 6 * customer.getDistance();
    }

    public String printBill(CabCustomer customer) {
        double bill = calculateBill(customer);
        return customer.getCustomerName() + " Please pay your bill of Rs." + bill;
    }
}

public class CabCustomerServiceTester {
    public static void main(String[] args) {
        CabCustomerService service = new CabCustomerService();

        CabCustomer customer1 = new CabCustomer(1, "JOHN", "LocationA", "LocationB", 3, "1234567890");
        CabCustomer customer2 = new CabCustomer(2, "SMITH", "LocationC", "LocationD", 6, "0987654321");

        service.addCabCustomer(customer1);
        service.addCabCustomer(customer2);

        System.out.println(service.printBill(customer1));
        System.out.println(service.printBill(customer2));
    }
}