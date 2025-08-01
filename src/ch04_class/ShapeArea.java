package ch04_class;

public class ShapeArea {
        public void area(int radius) {
                final double PI = 3.141593;
                double area = PI * (radius * radius) ;
                System.out.println("원의 넓이 = " + area );
        }
        public void area(int width, int height ) {
                int area = (width * height);
                System.out.println("사각형의 넓이 = " + area);
        }
        public void are(int bottom, int top, int height) {
                int are = (bottom * top) * height / 2 ;
                System.out.println("사다리꼴의 넓이 = " + are);


        }

}
