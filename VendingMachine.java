import java.util.*;

public class VendingMachine {
    private List<Product> products = new ArrayList<>();
    private double money;

    public VendingMachine(List<Product> products, double money) {
        this.products = initProducts();
        this.money = 0;
    }

    private List<Product> initProducts() {
        List<Product> catalog = new ArrayList<>();
        products.add(new Product("Water", 15.5,50));
        products.add(new Product("Milky Way", 48.99, 40));
        return catalog;
    }

    public Product getProduct(String name, List <Product> products){

        for (Product product : products) {
            if(Objects.equals(product.getName(), name)){
                return product;
            }
        }
        return null;
    }
//
//    }


}
