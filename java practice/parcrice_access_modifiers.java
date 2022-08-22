    //problem 1
    class cylinder{
        private int radius;
        private int height;
        private double  pi=Math.PI;

        public cylinder(int radius , int height){
            this.radius=radius;
            this.height=height;
        }

        public void setRadius(int r)
        {
             radius=r;
        }
        public int getRadius()
        {
            return radius;
        }

        public void setHeight(int h)
        {
            height =h;
        }

        public int getHeight()
        {
            return height;
        }

        public double surfaceArea()
        {
            return 2*pi*radius*height+2*pi*radius*radius;
        }

        public double volume()
        {
            return pi*radius*radius*height; 
        }
    }

    //problem 2
    class rectangle{
        int length;
        int breadth;

        public rectangle()
        {
            length=4;
            breadth=5;
        }

        public rectangle(int length ,int breadth)
        {
            this.length=length;
            this.breadth=breadth;
        }

        public int getLength()
        {
            return length;
        }
        public int getBreadth()
        {
            return breadth;
        }
    }

    //problem 3
    class sphere{
        int radius;

        public sphere(int radius)
        {
            this.radius=radius;
        }

        public int getRadius()
        {
            return radius;
        }

        public double surfaceAreaSphere()
        {
            return 4*Math.PI*radius*radius;
        }

        public double volume()
        {
            return (4/3)*Math.PI*radius*radius*radius;
        }
    }
    public class parcrice_access_modifiers {

    public static void main(String[] args)
    {
        //rectangle myrectangle=new rectangle(10,11);
        //cylinder mycylinder=new cylinder(12,9);
        sphere mySphere=new sphere(5);
        /*mycylinder.setRadius(9);
        System.out.println(mycylinder.getRadius());

        mycylinder.setHeight(12);
        System.out.println(mycylinder.getHeight());
        */
       /* System.out.println(mycylinder.surfaceArea());

        System.out.println(mycylinder.volume());

        System.out.println(myrectangle.getBreadth());
        System.out.println(myrectangle.getLength());
        */
        System.out.println(mySphere.getRadius());
        System.out.println(mySphere.surfaceAreaSphere());
        System.out.println(mySphere.volume());
    }
    
}
