package NOV_11;

class SIMCard {
    private String simName;
    private String simNumber;

    public SIMCard(String simName, String simNumber) {
        this.simName = simName;
        this.simNumber = simNumber;
    }

    public String getSimName() {
        return simName;
    }

    public void setSimName(String simName) {
        this.simName = simName;
    }

    public String getSimNumber() {
        return simNumber;
    }

    public void setSimNumber(String simNumber) {
        this.simNumber = simNumber;
    }

    public void displayDetails() {
        System.out.println("SIM Name: " + simName + ", SIM Number: " + simNumber);
    }
}

class Mobile {
    private String brand;
    private String model;
    private int releaseYear;
    private SIMCard simCard;

    public Mobile(String brand, String model, int releaseYear, SIMCard simCard) {
        this.brand = brand;
        this.model = model;
        this.releaseYear = releaseYear;
        this.simCard = simCard;
    }

    public Mobile(Mobile other) {
        this.brand = other.brand;
        this.model = other.model;
        this.releaseYear = other.releaseYear;
        this.simCard = new SIMCard(other.simCard.getSimName(), other.simCard.getSimNumber());
    }

    public void changeSim(SIMCard simCard) {
        this.simCard = simCard;
    }

    public void displayDetails() {
        System.out.println("Mobile Brand: " + brand + ", Model: " + model + ", Release Year: " + releaseYear);
        if (simCard != null) {
            simCard.displayDetails();
        } else {
            System.out.println("No SIM Card installed.");
        }
    }
}

public class Main3 {
    public static void main(String[] args) {
        SIMCard sim1 = new SIMCard("VI", "9876543210");
        Mobile mobile1 = new Mobile("Samsung", "A14", 2024, sim1);

        mobile1.displayDetails();

        Mobile mobileCopy = new Mobile(mobile1);
        SIMCard sim2 = new SIMCard("JIO", "8409595228");
        mobileCopy.changeSim(sim2);

        System.out.println("\nOriginal Mobile:");
        mobile1.displayDetails();

        System.out.println("\nCopied Mobile with Changed SIM:");
        mobileCopy.displayDetails();
    }
}
