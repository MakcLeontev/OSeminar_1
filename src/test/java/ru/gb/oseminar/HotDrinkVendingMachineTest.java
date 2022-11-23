package ru.gb.oseminar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HotDrinkVendingMachineTest {

    @Test
    void getProductText() {
        List<Product> products = new ArrayList<>();
        products.add(new HotDrink("americano",20.0,200,70));
        products.add(new HotDrink("americano",20.0,100,70));
        HotDrinkVendingMachine hotDrinkVendingMachine = new HotDrinkVendingMachine(products);
        HotDrink expected = new HotDrink("americano",20.0,200,70);

        HotDrink actual = hotDrinkVendingMachine.getProduct("americano",200,70);

        Assertions.assertEquals(expected, actual);
    }
}