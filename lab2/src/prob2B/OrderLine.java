package prob2B;

public class OrderLine {
    private Order order;
    private double price;

    public OrderLine(Order order, double price) {
        this.order = order;
        this.price = price;
    }

    public Order getOrder() {
        return order;
    }

    @Override
    public String toString() {
        return "OrderLine{" +
                "order=" + order +
                '}';
    }
}
