package shapes;

public class Circle {
    private double radius;


    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return 3.14 * Math.pow(this.radius, 2);
    }

    public double getCircumference(){
        return 2 * 3.14 * this.radius;
    }
}
