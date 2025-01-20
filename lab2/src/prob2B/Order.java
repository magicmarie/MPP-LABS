package prob2B;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderNumber;
    private List<OrderLine> orderLines;

    public Order(String orderNumber, double price) {
        this.orderNumber = orderNumber;
        this.orderLines = new ArrayList<>();
        addOrderLine(this, price);
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void addOrderLine(Order order, double price) {
        orderLines.add(new OrderLine(order, price));
    }
}
