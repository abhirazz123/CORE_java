package Day_16;

public class InventoryItem {
    private String itemName;
    private double pricePerUnit;
    private int quantityInStock;

   
    public InventoryItem(String itemName, double pricePerUnit, int quantityInStock) {
        setItemName(itemName);
        setPricePerUnit(pricePerUnit);
        setQuantityInStock(quantityInStock);
    }

    
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        if (itemName == null || itemName.trim().isEmpty()) {
            System.out.println("Error: Invalid item name.");
            this.itemName = "Unknown";
        } else {
            this.itemName = itemName;
        }
    }

   
    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        if (pricePerUnit < 0) {
            System.out.println("Error: Invalid price.");
            this.pricePerUnit = 0.0;
        } else {
            this.pricePerUnit = pricePerUnit;
        }
    }


    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        if (quantityInStock < 0) {
            System.out.println("Error: Invalid quantity.");
            this.quantityInStock = 0;
        } else {
            this.quantityInStock = quantityInStock;
        }
    }

  
    public double calculateTotalValue() {
        return pricePerUnit * quantityInStock;
    }
}
