public class Rectangle {
    private double length;
    private double width;

    //* Constructor is a special method that is called when an object is created
    public Rectangle (){
        this.length = 1;
        width = 15;
        System.out.println("I am a constructor");
    }


    public Rectangle (double l, double w){
        length = l;
        width = w;
        System.out.println("I am a constructor");
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength (){
        return this.length;
    }

    public double getWidth (){
        return this.width;
    }

    public double getArea(){
        return this.width * this.length;
    }
}