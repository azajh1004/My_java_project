package ch1_variable_operator;

public class PlusMinus02 {
    public static void main(String[] args) {
        int x = 3, y = 5, z;
        z = x++ + --y;

        System.out.println("x :"+ x);//x = x + 1 = 3 + 1 = 4
        System.out.println("y :"+ y);//y = 5 - 1 = 4
        System.out.println("z :"+ z);//z = 7



    }
}
