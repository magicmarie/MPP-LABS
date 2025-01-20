package prob2B;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order("1234", 98.0);
        Order order2 = new Order("5678", 90.9);

        OrderLine line1 = new OrderLine(order1, 89.0);
        OrderLine line2 = new OrderLine(order2, 89.0);


    }
}
