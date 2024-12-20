 public class Rectangle {
   private double width;
   private double length;
 

public Rectangle(double width, double length){
    this.width = width;
    this.length = length;
}

public double calperimeter() {
    return 2 * (length + width);

}

public double calcArea() {
    return length * width;

}

public static void main(String[] args) {
    Rectangle rect = new Rectangle(12,13);
    System.out.println("paremiter equal to " + rect.calperimeter());
    System.out.println("Area equal to " + rect.calcArea());
    
}}