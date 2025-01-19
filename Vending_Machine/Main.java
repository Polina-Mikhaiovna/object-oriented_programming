import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Water("Water 0.5", 50, 11, 0.5));
        products.add(new Water("Water 0.7", 70, 4, 0.7));

        WatersVendingMachine WVM = new WatersVendingMachine(products);
        System.out.println(WVM.getProduct("Water 0.7", 0.7));

        products.add(new HotDrinks("Americano", 0.2, 150, 0.2, 75));
        products.add(new HotDrinks("Cappuccino", 0.3, 250, 0.3, 70));

        HotDrinksVendingMachine HDVM = new HotDrinksVendingMachine(products);
        System.out.println(HDVM.getProduct("Americano", 75));



        // Вывод информации о каждом продукте
//        for (Product product : products) {
//            System.out.println(product.getDescription());
//        }

//        VendingMachine vM = new VendingMachine(3, 0);
//        List<Product> productsList= vM.initProducts();
//
//        for (String namesOfProd : productsList.){
//            System.out.println(namesOfProd);
//
//        }
//
//        System.out.println(vM.getProduct("Water", products));
    }
}
