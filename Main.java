import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product water = new Product("Water", 15.5,50);
        Product milkyWay = new Product("Milky Way", 48.99, 40);

        List<Product> products = new ArrayList<>();
        products.add(water);
        products.add(milkyWay);

        VendingMachine vM = new VendingMachine();
        List<String> productsList= vM.initProducts(products);

        for (String namesOfProd : productsList){
            System.out.println(namesOfProd);

        }

        System.out.println(vM.getProduct("Water", products));
    }
}
