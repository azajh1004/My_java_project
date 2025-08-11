package ch06_abstract_interface.myshape;

public class Triangle extends Shape {
    private  double width;
    private  double height;

    public Triangle(String linecolor, String fillcolor, double width , double height ){
        super(linecolor, fillcolor);
        this.width = width;
        this.height = height;


    }
    // implement : 구체화(구형)
    @Override // super 클래스의 추상매소드를 오버라이딩 했습니다.
    public double calcArea() {
        return this.width * this.height / 2.0;
    }

    @Override
    public double calcPerimeter() {
        return 20.0;
    }

    @Override
    public void display() {
        super.area = this.calcArea();
        super.perimeter = this.calcPerimeter();
        System.out.println("삼각형 정보");
        System.out.println("면적 : " + super.area);
        System.out.println("둘레 : " + super.perimeter);

    }
}
