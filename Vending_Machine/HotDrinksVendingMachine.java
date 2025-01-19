import java.util.List;
import java.util.Objects;

public class HotDrinksVendingMachine implements VendingMachine{
    private final List<Product> products;

    public HotDrinksVendingMachine(List<Product> products) {
        this.products = products;
    }

    public HotDrinks getProduct(String name, double temperature) {
            for (Product product : products) {
                if(Objects.equals(product.getName(), name)){
                    return (HotDrinks) product;
                }
            }
            return null;
        }

    @Override
    public Product getProduct(String name) {
        for (Product product : products) {
            if(Objects.equals(product.getName(), name)){
                return product;
            }
        }
        return null;
    }
}
