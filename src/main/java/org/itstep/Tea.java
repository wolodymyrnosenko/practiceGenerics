package org.itstep;

// FIXME: реализовать интерфейс Comparable<Tea>. Метод compareTo() должен производить сравнение по цене
public class Tea implements Comparable<Tea>{
//    private final String name;
//    private final double price;
    private String name;
    private double price;

    public Tea(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public double getPrice(){
        return price;
    }

    @Override
    public String toString() {
        return "Чай: " + name + " Цена: " + price;
    }

    @Override
    public int compareTo(Tea o) {
        return (int)(this.getPrice()-o.getPrice());
    }
}
