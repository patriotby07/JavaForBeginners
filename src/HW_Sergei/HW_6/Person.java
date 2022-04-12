package HW_Sergei.HW_6;


public class Person {

    String name;
    int age;
    String gender;

   public Person(String name, int age, String gender) {
       this.name = name;
       this.age = age;
       this.gender = gender;
    }

    void getPerson () {
        if (this.gender.equals("female")) {
            System.out.println("Mrs. " + this.name);
        }else if (gender.equals("male")) {
            System.out.println("Mr." + this.name);
        }else {
            System.out.println("EROR");
        }
    }
}
