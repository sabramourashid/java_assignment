public class HugeIntegerTest {
    public static void main(String[] args) {
        HugeInteger num1 = new HugeInteger();
        HugeInteger num2 = new HugeInteger();

        num1.input("123456789");
        num2.input("987654321");

        HugeInteger sum = num1.add(num2);

        System.out.println("number 1: " + num1.output());
        System.out.println("number 2: " + num2.output());
        System.out.println("sum: " + sum.output());
        System.out.println("are they equal? " + num1.isEqualTo(num2));
    }
}