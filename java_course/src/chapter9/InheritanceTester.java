package chapter9;

public class InheritanceTester {
    public static void main(String[] args) {

        Mother mother = new Mother();
        mother.setName("Jane");
        mother.setAge(40);
        System.out.println(mother.getGender());
        System.out.println(mother.getName());
        System.out.println(mother.getAge());
    }
}