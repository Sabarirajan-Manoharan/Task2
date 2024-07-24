package Task2;

public class Person {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

                            //Default age of person 18;
    public Person() {
        this.age = 18;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

                                        //Method to display name and age of person
    public void displayNameAge(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {

        Person per = new Person("Sabarirajan",33); //A person object can be initialized with name and age;
        per.displayNameAge();

        Person per1 = new Person();
        per1.setName("Rahul");
        per1.displayNameAge();

    }
}
