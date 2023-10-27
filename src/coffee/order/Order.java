package coffee.order;

public class Order{
    private static int previousOrderNumber = 1;
    private final int currentOrderNumber;
    private final String customerName;

    public Order(String customerName) {
        this.customerName = customerName;
        this.currentOrderNumber = previousOrderNumber++;
    }

    public int getOrderNumber() {
        return currentOrderNumber;
    }

    public String getCustomerName() {
        return customerName;
    }
}
