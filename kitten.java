public class kitten {
    private String name;
    private String owner;
    private int age;

    public kitten (String name, int age, String owner) {
        this.name = name;
        this.owner = owner;
        this.age = age;
        if (age >= 0) {
           // return age;
        }
    
    }

    public int kittensAge() {
        return age;
    }
    public int haveBirthday(){
        //int age; 
         int age = int age + 1;
         return age;
    }
    public String toString() {
        System.out.println(name + "is" + age + "and belongs to" + owner);
        return owner;
    }

    public static void main(String[] args) {
        kitten kitty = new kitten("hellokitty",3,"3");
        //toString();
    }


}