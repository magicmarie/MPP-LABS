package prob2B;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderNumber;
    private List<OrderLine> orderLines;

    public Order(String orderNumber) {
        this.orderNumber = orderNumber;
        this.orderLines = new ArrayList<>();
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void addOrderLine(OrderLine orderLine) {
        orderLines.add(orderLine);
    }
}
