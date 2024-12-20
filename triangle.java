public class triangle {
    private int a;
    private int b;
    private int c;

    public triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isTriangle() {
        return (a >= 0 && b >= 0 && c >= 0) && ((a+b)> c && (a+c) > b && (b+c) > a);
     
        }
    

    public double getArea() {
        if(!isTriangle()) return 0;
        double s = (a+b+c) / 2.0;
        return Math.sqrt(s *(s-a) * (s-b) * (s-c));
    }


    public static void main(String[] args) {
        triangle angle = new triangle(2,3,6);
        System.out.println("area of triangle is " + angle.getArea());
    } 
}