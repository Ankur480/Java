package circle;

class Circle {
    double radius;
    double area;
    Circle(double r){ 
        this.radius = r;
        this.area = Math.PI * radius * radius;
    }
    public void display()
    {
        System.out.println("Area = "+area);
    }
}
public class Circle1 {

    public static void main(String[] args) {
        Circle c = new Circle(2);
        c.display();
    }
    
}
