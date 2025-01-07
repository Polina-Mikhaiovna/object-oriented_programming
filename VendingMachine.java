import java.util.*;

public class VendingMachine {

    public List<String> initProducts(List <Product> products) {
        List<String> catalog = new ArrayList<>();
        for (Product product : products) {
            catalog.add(product.getName());
        }
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
