package ch06_abstract_interface.beveragetest;
//super
public abstract class Beverage {
    private String name;
    private double price;


    public Beverage(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract void drink();

    public abstract void make();

    protected String getName() {
        return name;
    }

    @Override
    public String toString() {
        String message = "이름 : " + this.name + "\n";
        message += "단가 : " + this.price + "원\n";
        return message;
    }
    protected final String getProductName() {
        return this.name + " 제조법\n";
    }
}



