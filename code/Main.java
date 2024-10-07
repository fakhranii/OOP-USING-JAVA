
public class Main {
public static void main(String[] args) {
    Rectangle r1 = new Rectangle(); 
    r1.setLength(1);
    r1.setWidth(2);


    Rectangle r2 = new Rectangle(); 
    r2.setLength(1);
    r2.setWidth(2);
    r2.getArea();
    r2.getLength();

    Car c1 = new Car();
    c1.setMaker("Toyota");
    c1.setModel(2020); 
    System.out.println(c1.getMaker());
    System.out.println(c1.getModel());
}
}
