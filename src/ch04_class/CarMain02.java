package ch04_class;

public class CarMain02 {
    public static void main(String[] args) {
        Car02 kia = new Car02("대한민국", "쏘렌토", 30000000,"에어백", "블랙");
            kia.display();

       Car02 honda = new Car02("일본", "쏘렌토",40000000,"에어백 + 썬팅", "흰색");
            honda.display();

       Car02 bmw = new Car02("독일", "bmw5", 80000000, "풀옵션", "블랙");
            bmw.display();
    }
}
