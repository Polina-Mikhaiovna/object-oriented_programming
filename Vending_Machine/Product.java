package Vending_Machine;

import java.util.*;
import java.util.Objects;

public abstract class Product {
    private String name; // поле класса, область видимости весь класс
    private double prise;
    private int count;

    // конструктор. Он тоже является методом
    public Product(String name, double prise, int count) {
        this.name = name;
        this.count = count;
        this.prise = prise;
    }

    public String getName() {
        return name;
    }

    public double getPrise() {
        return prise;
    }

    public int getCount() {
        return count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public abstract String getDescription();

    @Override
    public String toString() {
        return "Product{" + "name='" + name + '\'' + ", prise='" + prise +  "', count='" + count + '\'' +'}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}
