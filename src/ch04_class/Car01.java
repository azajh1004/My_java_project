package ch04_class;

public class Car01 {
        String Bland;
        String product;
        int price;
        String option;
        String color;

        String expected(int cost) {
                String Expected_cost = "";
                if (cost <= 30000000) {
                        Expected_cost = " Buy yes ";
                } else {
                        Expected_cost = " Buy no ";
                }

        String color = black ;

                String message = product + price + " 만원은 " + Expected_cost;

                return message;


        }
}

