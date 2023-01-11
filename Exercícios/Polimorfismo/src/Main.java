import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static entities.UsedProduct.sdf;


public class Main {

    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int aux = sc.nextInt();

        for (int i = 1; i <= aux; i++){
            System.out.println("Product #" + i + " data:");
            createProduct(list);
        }

        showPriceTags(list);

        sc.close();
    }

    private static List createProduct(List<Product> list) throws ParseException {

        System.out.print("Common, used or imported (c/u/i)? ");
        char type = sc.next().charAt(0);
        sc.nextLine();

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        if (type == 'i'){
            System.out.print("Customs fee: ");
            double customsFee = sc.nextDouble();

            list.add(new ImportedProduct(name, price, customsFee));
        } else if (type == 'u') {
            sc.nextLine();
            System.out.print("Manufacture date(DD/MM/YYYY): ");
            Date manufactureDate = sdf.parse(sc.nextLine());

            list.add(new UsedProduct(name, price, manufactureDate));
        } else {
            list.add(new Product(name, price));
        }

        return list;
    }

    private static void showPriceTags(List<Product> list) {

        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product product: list) {
            System.out.println(product.priceTag());
        }
    }


}