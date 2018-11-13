package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input in = new Input();
        Circle cir = new Circle(in.getDouble(1, 50, in.getSc()));

        System.out.format("%nThe radius of your circle is: %.2f%nThe area of your circle is: %.2f%nThe circumference of your circle is: %.2f", cir.getRadius(), cir.getArea(), cir.getCircumference());
    }
}
