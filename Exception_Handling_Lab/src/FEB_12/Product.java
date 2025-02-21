package FEB_12;
public record Product(int pid, String pname) {
    public Product {
        if (pid <= 0) {
            throw new IllegalArgumentException("Product ID must be positive.");
        }
    }
}