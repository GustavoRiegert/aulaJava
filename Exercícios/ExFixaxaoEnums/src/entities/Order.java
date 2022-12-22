package entities;

import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Order {

    private static final SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public static final SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
    private Date moment;
    private OrderStatus status;

    Client client;
    List<OrderItem> items;


    public Order() {
    }

    public Order(Client client, Date moment, OrderStatus status, List<OrderItem> item) {
        this.client = client;
        this.moment = moment;
        this.status = status;
        this.items = item;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addItem(OrderItem item){
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public double sum(){
        double  sum = 0;
        for(OrderItem item: items){
            sum += item.subTotal();
        }

        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        connect(sb, "Order moment: " + sdf1.format(getMoment()) + "\n");
        connect(sb,"Order status: " + getStatus() + "\n");
        connect(sb, "Client: " + client.getName() + " (" + sdf2.format(client.getBirthDate()) + ") - " +
                client.getEmail() + "\n");
        connect(sb,"Order items:" + "\n");
        for (OrderItem orderItem: items){
            connect(sb,orderItem.getProduct().getName() + ", ");
            connect(sb,"$" + String.format("%.2f",orderItem.getProduct().getPrice()) + ", ");
            connect(sb,"Quantity: " + orderItem.getQuantity() + ": ");
            connect(sb, "Subtotal: " + String.format("%.2f", orderItem.subTotal()));
            sb.append("\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", sum()));

        return sb.toString();
    }

    public static void connect(StringBuilder atual, String add){

        atual.append(add);
    }


}
