public class complex{
    private double real;
    private double imaginary;

    public complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    
    }

    public complex() {
        this(0,0);
    }

    public complex add(complex other) {
        return new complex(this.real + other.real,this.imaginary + other.imaginary);
    }

    public complex subtract(complex other) {
        return new complex(this.real - other.real,this.imaginary - other.imaginary);
    }
    
   // @overide
    public String toString() {
        return "(" + real + "," + imaginary + ")";

    }

    public static void main(String[] args) {
        complex c1 = new complex(3,4);
        complex c2 = new complex(1,2);

        complex sum = c1.add(c2);
        complex difference = c1.subtract(c2);

        System.out.println("sum" + sum);
        System.out.println("difference" + difference);

    }
}