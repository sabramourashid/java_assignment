public class employee {
    private String fname;
    private String lname;
    private int salary;

    public employee (String fname, String lname, int salary) {
        this.fname = fname;
        this.lname = lname;
        this.salary = salary;
        if (salary <= 0) {
            salary = salary;
            salary = 0;
        }

    }

    public int yrlySalary() {
        return salary * 12;
    }

    public int raisedFund() {
        return salary * 12 + (10/100 * salary);
    }

public static void main(String[] args) {
    employee no1 = new employee("chaby","rashid",10000);
    employee no2 = new employee("sabra", "amour",15000);
    System.out.println("before raised salary, salary annually was  " +no1.yrlySalary());
    System.out.println("before raised salary, salary annually was  " +no2.yrlySalary());
    System.out.println("the current salary annually is " + no1.raisedFund());
    System.out.println("the current salary annually is " + no2.raisedFund());
}
}
