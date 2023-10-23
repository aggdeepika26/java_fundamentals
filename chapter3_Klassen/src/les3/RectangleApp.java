package les3;

public class RectangleApp {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10,5);
        System.out.println("rect1 :");
        System.out.println("Height  "+ rectangle.getHeight());
        System.out.println("Width   "+ rectangle.getWidth());

        Rectangle rectangle2 = new Rectangle(1,2,3,4);
        System.out.println("rect2 :");
        System.out.println("Height  "+ rectangle2.getHeight());
        System.out.println("Width   "+ rectangle2.getWidth());
        System.out.println("x  "+ rectangle2.getX());
        System.out.println("Y   "+ rectangle2.getY());

        rectangle.setHeight(12);
        rectangle.setWidth(-14);

        Rectangle rectangle3 = new Rectangle(rectangle);
        System.out.println("rect3 :");
        System.out.println("Height  "+ rectangle3.getHeight());
        System.out.println("Width   "+ rectangle3.getWidth());
        System.out.println("x  "+ rectangle3.getX());
        System.out.println("Y   "+ rectangle3.getY());


    }





}
