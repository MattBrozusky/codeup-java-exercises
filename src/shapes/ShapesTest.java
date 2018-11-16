package shapes;

public class ShapesTest {

    public static void main(String[] args) {

//        Rectangle box1 = new Rectangle(5, 4);
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());

//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());

        Measurable myShape1 = new Square(5);
        Measurable myShape2 = new Rectangle(7, 6);

        System.out.println(myShape1.getArea());
        System.out.println(myShape1.getPerimeter());

        System.out.println(myShape2.getArea());
        System.out.println(myShape2.getPerimeter());

//        System.out.println(((Rectangle) myShape2).getLength());

    }



}
