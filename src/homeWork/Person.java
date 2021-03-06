package homeWork;

/** Необходимо создать класс Person с полями: имя, возраст, пол. Класс должен иметь метод - getName, метод возвращает имя
 * с префиксом “Mr. ” если пол указан как мужской и префикс “Mrs. ” если женский.
 */
public class Person {

    String name;
    int age;
    String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        if (this.gender.equals("male")){
            return "Mr. " + this.name;
        }else if (this.gender.equals("female")){
            return "Mrs. " + this.name;
        }else
            return "Eror";
    }
}
