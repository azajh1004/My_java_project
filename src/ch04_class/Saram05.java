package ch04_class;

public class Saram05 {
    private String city;
    private String name;
    private double height;
    private double weight;
    private String hobby;

    public Saram05(String city, String name, int height, int weight, String hobby) {
        this.city = city;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.hobby = hobby;
        
        
    }

    public void display() {
        System.out.println("도시 : " + this.city);
        System.out.println("이름 : " + this.name);
        System.out.println("키 : " + this.height);
        System.out.println("몸무게 : " + this.weight);
        System.out.println("취미 : " + this.hobby);
        System.out.println("혈액형 : " + this.hobby);
    }
} 
