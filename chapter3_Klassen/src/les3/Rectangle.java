package les3;

public class Rectangle {
    private int height;
    private int width;
    private int x;
    private int y;
    public Rectangle()
    {
    }

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle(int height, int width, int x, int y) {
        this.height = height;
        this.width = width;
        this.x = x;
        this.y = y;
    }
    public Rectangle (Rectangle rectangle)
    {
        this.height = rectangle.height;
        this.width = rectangle.width;
        this.x = rectangle.x;
        this.y = rectangle.y;
    }





    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setHeight(int height) {
        this.height = height<0 ? -height : height;

    }

    public void setWidth(int width) {
        this.width = width<0 ? -width : width;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void setPosition(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public double getArea()
    {
        return height * width;
    }


    public double getPerimeter()
    {

            return (height+width)*2;

    }

    public void grow(int d) {
        this.height = this.height + Math.abs(d);
        this.width = this.width + Math.abs(d);
    }

}