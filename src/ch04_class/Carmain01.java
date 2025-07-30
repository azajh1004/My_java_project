package ch04_class;

public class Carmain01 {
    public static void main(String[] args) {

        Car01 kia = new Car01() ;
        Car01 honda = new Car01() ;

        kia.Bland = "대한민국";
        kia.product = "kia";
        kia.price = 30000000;
        kia.option = "에어백";
        kia.color = "Black";

        honda.Bland = "일본" ;
        honda.product = "honda" ;
        honda.price = 40000000 ;
        honda.option = "에어백 + 썬팅" ;
        honda.color = "white" ;

        System.out.println("생산국: " + kia.Bland);
        System.out.println("제품: " + kia.product);
        System.out.println("가격: " + kia.price);
        System.out.println("추가: " + kia.option);
        System.out.println("색상: " + kia.color);

        String message = kia.expected(1);
        System.out.println(message);
    }
}

