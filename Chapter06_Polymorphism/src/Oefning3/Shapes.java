package Oefning3;

    public class Shapes
    {
         private int lengthOfRectangle;
         private int breadthOfRectangle;
         private int radius;
         private int sideOfSquare;
         private float pi ;
         Shapes()
         {}

        public Shapes(int length, int breadth)
        {
        this.lengthOfRectangle = length;
        this.breadthOfRectangle = breadth;
         }
        public Shapes( int sideOfSquare)
        {
         this.sideOfSquare = sideOfSquare;
        }
        public Shapes(int radius, float pi )
        {
            this.radius = radius;
            this.pi = pi;
        }


        public int getLengthOfRectangle() {
            return lengthOfRectangle;
        }

        public void setLengthOfRectangle(int lengthOfRectangle) {
            this.lengthOfRectangle = lengthOfRectangle;
        }

        public int getBreadthOfRectangle() {
            return breadthOfRectangle;
        }

        public void setBreadthOfRectangle(int breadthOfRectangle) {
            this.breadthOfRectangle = breadthOfRectangle;
        }

        public int getRadius() {
            return radius;
        }

        public void setRadius(int radius) {
            this.radius = radius;
        }

        public float getPi() {
            return pi;
        }

        public int getSideOfSquare() {
            return sideOfSquare;
        }

        public void setSideOfSquare(int sideOfSquare) {
            this.sideOfSquare = sideOfSquare;
        }
        public int area()
       {
           return this.lengthOfRectangle * this.breadthOfRectangle;
       }
       public int perimeter()
       {
           return 2*(this.lengthOfRectangle + this.breadthOfRectangle);
       }


    }
