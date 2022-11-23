package ru.gb.oseminar;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product>products = new ArrayList<>();
        HotDrink hd1 = new HotDrink("americano",20.0,200,70);
        products.add(hd1);
        HotDrink hd2 = new HotDrink("americano",20.0,100,70);
        products.add(hd2);
        HotDrink hd3 = new HotDrink("cappuccino",20.0,200,80);
        products.add(hd3);
        HotDrink hd4 = new HotDrink("cappuccino",20.0,300,80);
        products.add(hd4);
        HotDrink hd5 = new HotDrink("latte",20.0,300,85);
        products.add(hd5);
        HotDrinkVendingMachine hotDrinkVendingMachine = new HotDrinkVendingMachine(products);
        System.out.println(hotDrinkVendingMachine.getProduct("americano",100,70));
    }
}
