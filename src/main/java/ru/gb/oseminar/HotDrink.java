package ru.gb.oseminar;

import java.util.Objects;

public class HotDrink extends Product{
    private int temp;
    private int volume;

    public HotDrink(String name, double cost, int volume,int temp) {
        super(name, cost);
        this.temp = temp;
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name='" + super.getName() + '\'' +
                ", cost=" + super.getCost() +
                ", temp=" + this.temp + '\'' +
                ", volume='" + this.volume + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HotDrink hotDrink = (HotDrink) o;
        return temp == hotDrink.temp && volume == hotDrink.volume;
    }

    @Override
    public int hashCode() {
        return Objects.hash(temp, volume);
    }
}
