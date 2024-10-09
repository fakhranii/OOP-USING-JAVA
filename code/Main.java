
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

    // Car c1 = new Car();
    // c1.setMaker("Toyota");
    // c1.setModel(2020); 
    // System.out.println(c1.getMaker());
    // System.out.println(c1.getModel());

    // Rectangle r3 = new Rectangle(20,25);
    // System.out.println(r3.getLength());
    // System.out.println(r3.getWidth());

    Employee e1 = new Employee();
    e1.print_emp_data();
}
}
