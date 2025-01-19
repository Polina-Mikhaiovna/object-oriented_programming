package Vending_Machine;

import java.util.List;
import java.util.Objects;

public class WatersVendingMachine implements VendingMachine{
    private final List<Product> products;
    private double money;

    public WatersVendingMachine(List<Product> products) {
        this.products = products;
    }

    /** Выводит все свойства экземпляра класса Product по его имени
     */
    @Override
    public Product getProduct(String name) {
        for (Product product : products) {
            if(Objects.equals(product.getName(), name)){
                return product;
            }
        }
        return null;
    }

    public Water getProduct(String name, double volume){
        for (Product product : products) {
            if(Objects.equals(product.getName(), name)){
                return (Water) product;
            }
        }
        return null;
    }
}
