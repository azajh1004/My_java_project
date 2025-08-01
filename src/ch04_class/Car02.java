package ch04_class;

public class Car02 {

    private String product;
    private String model;
    private int price;
    private String option;
    private String color;


    public Car02(String product, String model, int price,String option, String color) {
        this.product = product;
        this.model = model;
        this.price = price;
        this.option = option;
        this.color = color;
    }

    public void display() {
        System.out.println("생산국: " + this.product);
        System.out.println("제품: " + this.model);
        System.out.println("가격: " + this.price);
        System.out.println("추가: " + this.option);
        System.out.println("색상: " + this.color);

    }
}




