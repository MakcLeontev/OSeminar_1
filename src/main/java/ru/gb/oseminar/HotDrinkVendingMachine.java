package ru.gb.oseminar;

import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine {
    private final List<Product> products;

    public HotDrinkVendingMachine(List<Product> products) {
        this.products = products;
    }

    @Override
    public Product getProduct(String name){
        for(Product product: products){
            if(product.getName().equalsIgnoreCase(name)){
                return product;
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }

    public HotDrink getProduct(String name, int volume, int temp) throws IllegalStateException {
        for(Product product: products){
            if(product instanceof HotDrink){
                if(product.getName().equalsIgnoreCase(name) && ((HotDrink) product).getTemp() == temp && ((HotDrink) product).getVolume() == volume){
                    return (HotDrink) product;
                }
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }
}
