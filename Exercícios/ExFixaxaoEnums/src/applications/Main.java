package applications;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.util.*;

public class Main {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);

        Client client = InstanceClient();
        Order order = InstanceOrder(client);

        System.out.println("ORDER SUMMARY: ");
        System.out.println(order);
    }

    private static Client InstanceClient() throws ParseException {

        System.out.print("Enter client data: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = Client.sdf.parse(sc.nextLine());

        return new Client(name, email, birthDate);
    }

    private static Order InstanceOrder(Client client) throws ParseException {
        List<OrderItem> orderItems= new ArrayList<>();
        Date moment =new Date(System.currentTimeMillis());

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());
        System.out.print("How many itens to this order? ");
        int items = sc.nextInt();

        for (int i = 1; i <= items; i++){
            System.out.println("Enter #" + i + " item data:");
            orderItems.add(InstanceOrderItem());
        }

        return new Order(client, moment, status, orderItems);
    }

    private static OrderItem InstanceOrderItem() {

        Product product = InstanceProduct();
        Double price = product.getPrice();
        System.out.print("Quantity: ");
        Integer productQuantity = sc.nextInt();

        return new OrderItem(productQuantity, price, product);
    }

    private static Product InstanceProduct() {

        System.out.print("Product name: ");
        String productName = sc.next();
        System.out.print("Product price: ");
        Double productPrice = sc.nextDouble();

        return new Product(productName, productPrice);
    }

}