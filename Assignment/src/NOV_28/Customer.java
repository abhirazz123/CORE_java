package NOV_28;

public class Customer {
	 private int customerId;
	 private String customerName;
	 private String customerAddress;
	 private Order order;
	 
	 public Customer(int customerId, String customerName, String customerAddress, Order order) {
		 this.customerId = customerId;
		 this.customerName = customerName;
		 this.customerAddress = customerAddress;
		 this.order = order;
		 
	 }

	@Override
	public String toString() {
		return "Customer Id: " + customerId + ", \nCustomer Name: " + customerName + ", \nCustomer Address: "
				+ customerAddress + ", \norder Details => " +order.toString()  ;
	}
	 
	 
}
