package coffee.order;

import java.util.*;

public class CoffeeOrderBoard {
    private final Queue<Order> orders;

    public CoffeeOrderBoard() {

        this.orders = new LinkedList<>();
    }

    public void add(String customerName) {
        Order newOrder = new Order(customerName);
        orders.add(newOrder);
    }

    public Order deliver() {
        return orders.poll();
    }

    public void deliver(int orderNumber) {
        for (Order order : orders) {
            if (order.getOrderNumber() == orderNumber) {
                orders.remove(order);
                break;
            }
        }
    }

    public void draw() {
        System.out.println("=============\nNum | Name");
        for (Order order : orders) {
            System.out.println(" " + order.getOrderNumber() + "  | " + order.getCustomerName());
        }
    }
}
